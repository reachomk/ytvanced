package defpackage;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: my */
final class my extends or implements oh {
    public final nv a;
    public boolean b;
    public int c = -1;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.c);
        }
        if (this.l != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.l);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public my(nv nvVar) {
        this.a = nvVar;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, nf nfVar, String str, int i2) {
        Class cls = nfVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(cls.getCanonicalName());
            stringBuilder.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2;
        String str2 = " now ";
        String str3 = ": was ";
        if (str != null) {
            String str4 = nfVar.B;
            if (str4 == null || str.equals(str4)) {
                nfVar.B = str;
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Can't change tag of fragment ");
                stringBuilder2.append(nfVar);
                stringBuilder2.append(str3);
                stringBuilder2.append(nfVar.B);
                stringBuilder2.append(str2);
                stringBuilder2.append(str);
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = nfVar.z;
                if (i3 == 0 || i3 == i) {
                    nfVar.z = i;
                    nfVar.A = i;
                } else {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Can't change container ID of fragment ");
                    stringBuilder2.append(nfVar);
                    stringBuilder2.append(str3);
                    stringBuilder2.append(nfVar.z);
                    stringBuilder2.append(str2);
                    stringBuilder2.append(i);
                    throw new IllegalStateException(stringBuilder2.toString());
                }
            }
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Can't add fragment ");
            stringBuilder2.append(nfVar);
            stringBuilder2.append(" with tag ");
            stringBuilder2.append(str);
            stringBuilder2.append(" to container view with no id");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        b(new oq(i2, nfVar));
        nfVar.v = this.a;
    }

    public final or a(nf nfVar) {
        nv nvVar = nfVar.v;
        if (nvVar == null || nvVar == this.a) {
            b(new oq(3, nfVar));
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        stringBuilder.append(nfVar.toString());
        stringBuilder.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final or b(nf nfVar) {
        nv nvVar = nfVar.v;
        if (nvVar == null || nvVar == this.a) {
            b(new oq(4, nfVar));
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        stringBuilder.append(nfVar.toString());
        stringBuilder.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final or c(nf nfVar) {
        nv nvVar = nfVar.v;
        if (nvVar == null || nvVar == this.a) {
            b(new oq(5, nfVar));
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        stringBuilder.append(nfVar.toString());
        stringBuilder.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (this.k) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                nf nfVar = ((oq) this.d.get(i2)).b;
                if (nfVar != null) {
                    nfVar.u += i;
                }
            }
        }
    }

    public final int a() {
        return b(false);
    }

    public final int b() {
        return b(true);
    }

    public final void c() {
        g();
        this.a.b((oh) this, false);
    }

    public final void d() {
        g();
        this.a.b((oh) this, true);
    }

    private final int b(boolean z) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        this.b = true;
        if (this.k) {
            int intValue;
            nv nvVar = this.a;
            synchronized (nvVar) {
                ArrayList arrayList = nvVar.i;
                if (arrayList != null) {
                    if (arrayList.size() > 0) {
                        arrayList = nvVar.i;
                        intValue = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
                        nvVar.h.set(intValue, this);
                    }
                }
                if (nvVar.h == null) {
                    nvVar.h = new ArrayList();
                }
                intValue = nvVar.h.size();
                nvVar.h.add(this);
            }
            this.c = intValue;
        } else {
            this.c = -1;
        }
        this.a.a((oh) this, z);
        return this.c;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.k) {
            nv nvVar = this.a;
            if (nvVar.e == null) {
                nvVar.e = new ArrayList();
            }
            nvVar.e.add(this);
        }
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean b(int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            nf nfVar = ((oq) this.d.get(i2)).b;
            int i3 = nfVar != null ? nfVar.A : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(ArrayList arrayList, int i, int i2) {
        if (i2 != i) {
            int size = this.d.size();
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                nf nfVar = ((oq) this.d.get(i4)).b;
                int i5 = nfVar != null ? nfVar.A : 0;
                if (!(i5 == 0 || i5 == i3)) {
                    for (i3 = i; i3 < i2; i3++) {
                        my myVar = (my) arrayList.get(i3);
                        int size2 = myVar.d.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            nf nfVar2 = ((oq) myVar.d.get(i6)).b;
                            if ((nfVar2 != null ? nfVar2.A : 0) == i5) {
                                return true;
                            }
                        }
                    }
                    i3 = i5;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            oq oqVar = (oq) this.d.get(i);
            nf nfVar = oqVar.b;
            if (nfVar != null) {
                nfVar.b(this.i, this.j);
            }
            switch (oqVar.a) {
                case 1:
                    nfVar.b(oqVar.c);
                    this.a.a(nfVar, false);
                    break;
                case 3:
                    nfVar.b(oqVar.d);
                    this.a.f(nfVar);
                    break;
                case 4:
                    nfVar.b(oqVar.d);
                    nv.g(nfVar);
                    break;
                case 5:
                    nfVar.b(oqVar.c);
                    nv.h(nfVar);
                    break;
                case 6:
                    nfVar.b(oqVar.d);
                    this.a.i(nfVar);
                    break;
                case 7:
                    nfVar.b(oqVar.c);
                    this.a.j(nfVar);
                    break;
                case 8:
                    this.a.k(nfVar);
                    break;
                case 9:
                    this.a.k(null);
                    break;
                case 10:
                    this.a.a(nfVar, oqVar.h);
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown cmd: ");
                    stringBuilder.append(oqVar.a);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            if (!(this.s || oqVar.a == 1 || nfVar == null)) {
                this.a.d(nfVar);
            }
        }
        if (!this.s) {
            nv nvVar = this.a;
            nvVar.a(nvVar.j, true);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        int size = this.d.size();
        while (true) {
            size--;
            if (size >= 0) {
                oq oqVar = (oq) this.d.get(size);
                nf nfVar = oqVar.b;
                if (nfVar != null) {
                    nfVar.b(nv.c(this.i), this.j);
                }
                switch (oqVar.a) {
                    case 1:
                        nfVar.b(oqVar.f);
                        this.a.f(nfVar);
                        break;
                    case 3:
                        nfVar.b(oqVar.e);
                        this.a.a(nfVar, false);
                        break;
                    case 4:
                        nfVar.b(oqVar.e);
                        nv.h(nfVar);
                        break;
                    case 5:
                        nfVar.b(oqVar.f);
                        nv.g(nfVar);
                        break;
                    case 6:
                        nfVar.b(oqVar.e);
                        this.a.j(nfVar);
                        break;
                    case 7:
                        nfVar.b(oqVar.f);
                        this.a.i(nfVar);
                        break;
                    case 8:
                        this.a.k(null);
                        break;
                    case 9:
                        this.a.k(nfVar);
                        break;
                    case 10:
                        this.a.a(nfVar, oqVar.g);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown cmd: ");
                        stringBuilder.append(oqVar.a);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
                if (!this.s) {
                    if (oqVar.a != 3) {
                        if (nfVar != null) {
                            this.a.d(nfVar);
                        }
                    }
                }
            } else if (!this.s && z) {
                nv nvVar = this.a;
                nvVar.a(nvVar.j, true);
                return;
            } else {
                return;
            }
        }
    }

    public static boolean a(oq oqVar) {
        nf nfVar = oqVar.b;
        if (!(nfVar == null || !nfVar.o || nfVar.K == null || nfVar.D || nfVar.C)) {
            nfVar.U();
        }
        return false;
    }
}
