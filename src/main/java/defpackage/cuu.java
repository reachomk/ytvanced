package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cuu */
public final class cuu {
    public static cuu a;
    private static final aaa b = new aaa(20);
    private final cve c;
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private final Map f = new HashMap();
    private boolean g = false;

    public cuu(cve cve) {
        this.c = cve;
    }

    public final synchronized void a(cuv cuv) {
        if (cuv.e) {
            this.d.add(cuv);
            ArrayList arrayList = cuv.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                cvd cvd = (cvd) arrayList.get(i);
                cut cut = (cut) this.f.get(cvd);
                if (cut == null) {
                    cut = (cut) b.a();
                    if (cut == null) {
                        cut = new cut();
                    }
                    cut.b = 1;
                    this.f.put(cvd, cut);
                } else {
                    cut.b++;
                }
            }
            if (this.d.size() == 1) {
                this.c.a();
            }
            this.g = true;
        } else {
            String valueOf = String.valueOf(cuv);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 42);
            stringBuilder.append("Expected added GraphBinding to be active: ");
            stringBuilder.append(valueOf);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final synchronized void b(cuv cuv) {
        if (this.d.remove(cuv)) {
            ArrayList arrayList = cuv.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                cvd cvd = (cvd) arrayList.get(i);
                cut cut = (cut) this.f.get(cvd);
                int i2 = cut.b - 1;
                cut.b = i2;
                if (i2 == 0) {
                    cut cut2 = (cut) this.f.remove(cvd);
                    cut2.a = false;
                    cut2.b = 0;
                    b.a(cut2);
                }
            }
            if (this.d.isEmpty()) {
                this.c.b();
                this.e.clear();
                if (!this.f.isEmpty()) {
                    throw new RuntimeException("Failed to clean up all nodes");
                }
            }
            this.g = true;
        } else {
            throw new RuntimeException("Tried to unregister non-existent binding");
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(long j) {
        int size;
        cvd cvd;
        if (this.g) {
            this.e.clear();
            if (this.d.size() != 0) {
                int size2;
                cvq cvq = new cvq();
                aac aac = new aac();
                size = this.d.size();
                for (int i = 0; i < size; i++) {
                    ArrayList arrayList = ((cuv) this.d.get(i)).c;
                    size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        cvd cvd2 = (cvd) arrayList.get(i2);
                        ArrayList arrayList2 = cvd2.b;
                        int size3 = arrayList2 != null ? arrayList2.size() : 0;
                        if (size3 == 0) {
                            cvq.add(cvd2);
                        } else {
                            aac.put(cvd2, Integer.valueOf(size3));
                        }
                    }
                }
                if (!aac.isEmpty()) {
                    if (cvq.isEmpty()) {
                        throw new cuw("Graph has nodes, but they represent a cycle with no leaf nodes!");
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.addAll(cvq);
                while (!arrayDeque.isEmpty()) {
                    cvd = (cvd) arrayDeque.pollFirst();
                    this.e.add(cvd);
                    for (cvd cvd3 : cvd.d()) {
                        size2 = ((Integer) aac.get(cvd3)).intValue() - 1;
                        aac.put(cvd3, Integer.valueOf(size2));
                        if (size2 == 0) {
                            arrayDeque.addLast(cvd3);
                        } else if (size2 < 0) {
                            throw new cuw("Detected cycle.");
                        }
                    }
                }
                if (this.e.size() == aac.b + cvq.size()) {
                    Collections.reverse(this.e);
                    this.g = false;
                } else {
                    throw new cuw("Had unreachable nodes in graph -- this likely means there was a cycle");
                }
            }
        }
        int size4 = this.e.size();
        int i3 = 0;
        while (i3 < size4) {
            cvd cvd4 = (cvd) this.e.get(i3);
            float a = cvd4.a(j);
            if (j != cvd4.d) {
                cvd4.d = j;
                cvd4.c = a;
                i3++;
            } else {
                throw new RuntimeException("Got a calculate value call multiple times in the same frame. This isn't expected.");
            }
        }
        int size5 = this.e.size();
        for (int i4 = 0; i4 < size5; i4++) {
            cvd cvd5 = (cvd) this.e.get(i4);
            cut cut = (cut) this.f.get(cvd5);
            if (!cut.a) {
                for (cvd cvd6 : cvd5.d()) {
                    if (!((cut) this.f.get(cvd6)).a) {
                        break;
                    }
                }
                if (!(cvd5 instanceof cuz) || ((cuz) cvd5).a()) {
                    cut.a = true;
                }
            }
        }
        size5 = this.d.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                cuv cuv = (cuv) this.d.get(size5);
                ArrayList arrayList3 = cuv.c;
                i3 = arrayList3.size();
                for (size = 0; size < i3; size++) {
                    if (!((cut) this.f.get(arrayList3.get(size))).a) {
                        break;
                    }
                }
                cuq cuq = cuv.d;
                if (cuq != null) {
                    cuq.a();
                }
                cuv.a();
            }
        }
    }
}
