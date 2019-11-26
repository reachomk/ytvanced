package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akzn */
final class akzn extends apc {
    private static final cyi i = new akzp();
    public final cwj a;
    public final akei b;
    public final acvx c;
    public final boolean d;
    public final cxk e;
    public final syb f;
    public bbmz g;
    public final float h;
    private final dad j;
    private final akpd k;
    private final akzf l;
    private final SparseArray m = new SparseArray();
    private final boolean n;
    private final boolean o;

    public final void a() {
        int i;
        ArrayList arrayList = new ArrayList(this.k.a());
        int a = this.k.a();
        int i2 = 0;
        for (i = 0; i < a; i++) {
            arrayList.add(a(this.k.getItem(i), i));
        }
        dad dad = this.j;
        synchronized (dad) {
            if (dad.z) {
                throw new RuntimeException("Trying to do a sync replaceAll when using asynchronous mutations!");
            }
            i = dad.b.size();
            int size = arrayList.size();
            if (i > size) {
                while (true) {
                    i--;
                    if (i < size) {
                        break;
                    }
                    ((cyl) dad.b.remove(i)).l();
                }
            }
            while (i2 < size) {
                dbz dbz = (dbz) arrayList.get(i2);
                if (i2 >= dad.b.size()) {
                    dad.b.add(i2, dad.b(dbz));
                } else {
                    cyl cyl = (cyl) dad.b.get(i2);
                    if (cyl.e().f() && dbz.f()) {
                        cyl.a(dbz);
                    } else {
                        cyl.l();
                        dad.b.set(i2, dad.b(dbz));
                    }
                }
                dad.C.a(dbz);
                i2++;
            }
        }
        dad.f.aa_();
        dad.A.a(true);
        this.j.a(true, i);
    }

    public final void a(int i, int i2) {
        List arrayList = new ArrayList(i2);
        i2 += i;
        for (int i3 = i; i3 < i2; i3++) {
            arrayList.add(a(this.k.getItem(i3), i3));
        }
        this.j.b(i, arrayList);
        this.j.a(true, i);
    }

    public final void b(int i, int i2) {
        List arrayList = new ArrayList(i2);
        i2 += i;
        for (int i3 = i; i3 < i2; i3++) {
            arrayList.add(a(this.k.getItem(i3), i3));
        }
        this.j.a(i, arrayList);
        this.j.a(true, i);
    }

    public final void c(int i, int i2) {
        this.j.b(i, i2);
        this.j.a(true, i);
    }

    public final void d(int i, int i2) {
        if (i != i2) {
            if (i < i2) {
                this.j.a(i, i2);
            } else {
                this.j.a(i, i2);
            }
            this.j.a(true, i);
        }
    }

    private final dbz a(Object obj, int i) {
        Object obj2 = obj;
        int i2 = 0;
        bbnc bbmz;
        if (obj2 instanceof akda) {
            cma cma;
            akda akda = (akda) obj2;
            bbmz = new bbmz();
            akzm akzm = new akzm(this, akda, bbmz);
            if (this.o) {
                cwj cwj = this.a;
                akzx akzx = new akzx();
                akzx.a(akzx, cwj, new akzu());
                akzx.a.a = akzm;
                akzx.d.set(0);
                cma = (akzu) akzx.c();
            } else {
                akzs a = akzt.a(this.a);
                a.a(akzm);
                cma = (akzt) a.c();
            }
            bbmz bbmz2 = this.g;
            if (bbmz2 != null) {
                bbmz2.a(bbmz);
            }
            return new akzc(cma, bbmz);
        }
        if (this.l != null) {
            boolean z = obj2 instanceof akni;
            if (z) {
                dbz akzc;
                akni akni = (akni) obj2;
                int i3 = 0;
                while (i3 < akni.a) {
                    Object a2 = akni.a(i3);
                    if (a2 == null || (a2 instanceof akda)) {
                        i3++;
                    }
                }
                akzf akzf = this.l;
                cmg cmg = this.a;
                acvx acvx = this.c;
                bbmz bbmz3 = this.g;
                if (z) {
                    bbmz = new bbmz();
                    cqy a3 = cqz.a(cmg);
                    int i4 = akni.a;
                    while (i2 < i4) {
                        akzf akzf2;
                        akda akda2 = (akda) akni.a(i2);
                        if (akda2 != null) {
                            akzf2 = akzf;
                            akze akze = r6;
                            akze akze2 = new akze(akzf, cmg, akda2, acvx, bbmz);
                            akzs a4 = akzt.a(cmg);
                            a4.a(akze);
                            a3.b(((akzt) ((akzs) a4.e(100.0f / ((float) i4))).c()).g());
                        } else {
                            akzf2 = akzf;
                            a3.b((cls) ((clr) cls.a(cmg).e(100.0f / ((float) i4))).c());
                        }
                        i2++;
                        akzf = akzf2;
                    }
                    if (bbmz3 != null) {
                        bbmz3.a(bbmz);
                    }
                    akzc = new akzc((cqz) a3.c(), bbmz);
                } else {
                    akzc = null;
                }
                return akzc;
            }
        }
        if (this.n) {
            return dat.a;
        }
        int a5 = this.k.a(obj2);
        cye cye = (akzq) this.m.get(a5);
        if (cye == null) {
            cye = new akzq(this.k, a5);
            this.m.append(a5, cye);
        }
        ddd ddd = (ddd) dde.b.a();
        if (ddd == null) {
            ddd = new ddd();
        }
        ddd.d = cye;
        ddd.c = new akzr(this.k, i, obj2);
        ddd.e = true;
        ddd.f = a5 + 201000;
        return ddd.b();
    }

    /* synthetic */ akzn(cwj cwj, dad dad, akpd akpd, akei akei, acvx acvx, boolean z, cxk cxk, akzf akzf, boolean z2, boolean z3, syb syb, float f) {
        this.a = cwj;
        this.j = dad;
        this.k = akpd;
        this.b = akei;
        this.c = acvx;
        this.d = z;
        this.e = cxk;
        this.l = akzf;
        this.n = z2;
        this.o = z3;
        this.f = syb;
        this.h = f;
    }
}
