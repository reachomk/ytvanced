package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: abmr */
public final class abmr {
    public int a = 0;
    private final SparseArray b = new SparseArray();

    public final void a(anwm anwm) {
        for (int i = 0; i < this.b.size(); i++) {
            a(this.b.keyAt(i), this.b.valueAt(i), anwm);
        }
    }

    public final void a(anwf anwf, ammw ammw) {
        int a = anwf.a();
        while (a > 0) {
            int a2;
            Object valueOf;
            int b = aobj.b(a);
            ammw a3 = ammw.a(b);
            int i = 0;
            if (a3.c.isEmpty() && !a3.d) {
                i = 1;
            }
            if ((i ^ 1) != 0) {
                this.a += anwm.q(a);
                a2 = aobj.a(a);
                long e;
                if (a2 == 0) {
                    e = anwf.e();
                    this.a += anwm.f(e);
                    valueOf = Long.valueOf(e);
                } else if (a2 == 1) {
                    e = anwf.g();
                    this.a += anwm.d();
                    valueOf = Long.valueOf(e);
                } else if (a2 == 2) {
                    ammw a4 = ammw.a(b);
                    if (amqq.a(a4, ammw.b)) {
                        valueOf = anwf.l();
                        this.a += anwm.b((anvu) valueOf);
                    } else {
                        a2 = anwf.t();
                        this.a += anwm.q(a2);
                        int v = anwf.v();
                        i = anwf.c(a2);
                        abmr abmr = new abmr();
                        abmr.a(anwf, a4);
                        anwf.d(i);
                        b = anwf.v() - v;
                        if (b == a2) {
                            this.a += abmr.a;
                            valueOf = abmr;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder(43);
                            stringBuilder.append("Mismatched size: ");
                            stringBuilder.append(a2);
                            stringBuilder.append(" != ");
                            stringBuilder.append(b);
                            throw new anyf(stringBuilder.toString());
                        }
                    }
                } else if (a2 == 5) {
                    b = anwf.h();
                    this.a += anwm.b();
                    valueOf = Integer.valueOf(b);
                } else {
                    throw new anyf("Unexpected wire type");
                }
            }
            anwf.b(a);
            valueOf = null;
            if (valueOf != null) {
                a2 = this.b.indexOfKey(a);
                if (a2 < 0) {
                    this.b.append(a, valueOf);
                } else {
                    Object valueAt = this.b.valueAt(a2);
                    if (valueAt instanceof ArrayList) {
                        ((ArrayList) valueAt).add(valueOf);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(valueAt);
                        arrayList.add(valueOf);
                        this.b.append(a, arrayList);
                    }
                }
            }
            a = anwf.a();
        }
    }

    private final void a(int i, Object obj, anwm anwm) {
        int b = aobj.b(i);
        int a = aobj.a(i);
        if (a == 0) {
            anwm.a(b, ((Long) obj).longValue());
        } else if (a == 1) {
            anwm.c(b, ((Long) obj).longValue());
        } else if (a != 2) {
            if (a == 5) {
                anwm.f(b, ((Integer) obj).intValue());
                return;
            }
            throw new anyf("Unexpected wire type");
        } else if (obj instanceof anvu) {
            anwm.a(b, (anvu) obj);
        } else if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            b = arrayList.size();
            for (a = 0; a < b; a++) {
                a(i, arrayList.get(a), anwm);
            }
        } else if (obj instanceof abmr) {
            abmr abmr = (abmr) obj;
            anwm.b(b, 2);
            anwm.e(abmr.a);
            abmr.a(anwm);
        } else {
            throw new anyf("Unexpected WIRETYPE_LENGTH_DELIMITED value");
        }
    }
}
