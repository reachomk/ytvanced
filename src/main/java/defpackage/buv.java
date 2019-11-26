package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: buv */
public final class buv implements bvk, bvo, bxj {
    private final bvs a;
    private final bxk b;
    private final bva c;
    private final bvx d;
    private final bvc e;
    private final buy f;
    private final btw g;

    public buv(bxk bxk, bwv bwv, bxr bxr, bxr bxr2, bxr bxr3, bxr bxr4) {
        this.b = bxk;
        this.e = new bvc(bwv);
        btw btw = new btw();
        this.g = btw;
        synchronized (this) {
            synchronized (btw) {
                btw.b = this;
            }
        }
        bvm bvm = new bvm();
        this.a = new bvs();
        this.c = new bva(bxr, bxr2, bxr3, bxr4, this, this);
        this.f = new buy(this.e);
        this.d = new bvx();
        bxk.a((bxj) this);
    }

    public final synchronized bvb a(brb brb, Object obj, bsm bsm, int i, int i2, Class cls, Class cls2, bre bre, bup bup, Map map, boolean z, boolean z2, bsq bsq, boolean z3, boolean z4, boolean z5, boolean z6, cgf cgf, Executor executor) {
        brb brb2 = brb;
        Object obj2 = obj;
        bsm bsm2 = bsm;
        int i3 = i;
        int i4 = i2;
        bre bre2 = bre;
        bup bup2 = bup;
        bsq bsq2 = bsq;
        boolean z7 = z6;
        cgf cgf2 = cgf;
        Executor executor2 = executor;
        synchronized (this) {
            bvw b;
            bsm bsm3 = r8;
            bvj bvj = new bvj(obj, bsm, i, i2, map, cls, cls2, bsq);
            if (z3) {
                b = this.g.b(bsm3);
                if (b != null) {
                    b.e();
                }
            } else {
                b = null;
            }
            if (b == null) {
                int i5;
                bup bup3;
                bre bre3;
                int i6;
                bsm bsm4;
                Object obj3;
                bvw bvw;
                bsm bsm5;
                if (z3) {
                    bsm bsm6;
                    b = this.b.a(bsm3);
                    if (b == null) {
                        i5 = i;
                        bup3 = bup2;
                        bre3 = bre2;
                        i6 = i4;
                        bsm6 = bsm3;
                        bsm4 = bsm2;
                        obj3 = obj2;
                        bvw = null;
                    } else if (b instanceof bvl) {
                        i5 = i;
                        bup3 = bup2;
                        bre3 = bre2;
                        bsm6 = bsm3;
                        bsm4 = bsm2;
                        obj3 = obj2;
                        bvw = (bvl) b;
                        i6 = i4;
                    } else {
                        bup3 = bup2;
                        bre3 = bre2;
                        bvw bvw2 = b;
                        i6 = i4;
                        i5 = i;
                        bsm6 = bsm3;
                        bsm4 = bsm2;
                        obj3 = obj2;
                        bvw bvl = new bvl(bvw2, true, true, bsm6, this);
                    }
                    if (bvw == null) {
                        bsm5 = bsm6;
                    } else {
                        bvw.e();
                        bsm5 = bsm6;
                        this.g.a(bsm5, bvw);
                    }
                } else {
                    i5 = i;
                    bup3 = bup2;
                    bre3 = bre2;
                    i6 = i4;
                    bsm4 = bsm2;
                    obj3 = obj2;
                    bvw = null;
                    bsm5 = bsm3;
                }
                if (bvw == null) {
                    boolean z8 = z6;
                    bve bve = (bve) this.a.a(z8).get(bsm5);
                    cgf cgf3;
                    if (bve != null) {
                        cgf3 = cgf;
                        bve.a(cgf3, executor);
                        bvb bvb = new bvb(this, cgf3, bve);
                        return bvb;
                    }
                    cgf3 = cgf;
                    Executor executor3 = executor;
                    bve bve2 = (bve) chw.a((bve) this.c.g.a());
                    bve bve3 = bve2;
                    bsm bsm7 = bsm5;
                    bve2.a(bsm5, z3, z4, z5, z6);
                    buy buy = this.f;
                    buh buh = (buh) chw.a((buh) buy.b.a());
                    i4 = buy.c;
                    buy.c = i4 + 1;
                    bui bui = buh.a;
                    bul bul = buh.b;
                    bui.c = brb2;
                    bui.d = obj3;
                    bui.n = bsm4;
                    bui.e = i5;
                    bui.f = i6;
                    bui.p = bup3;
                    bui.g = cls;
                    bui.h = bul;
                    bui.k = cls2;
                    bui.o = bre3;
                    bsq bsq3 = bsq;
                    bui.i = bsq3;
                    bui.j = map;
                    bui.q = z;
                    bui.r = z2;
                    buh.d = brb2;
                    buh.e = bsm4;
                    buh.f = bre3;
                    buh.g = bsm7;
                    buh.h = i5;
                    buh.i = i6;
                    buh.j = bup3;
                    buh.n = z8;
                    buh.k = bsq3;
                    bve = bve3;
                    buh.l = bve;
                    buh.m = i4;
                    buh.r = 1;
                    buh.o = obj3;
                    this.a.a(bve.b).put(bsm7, bve);
                    cgf cgf4 = cgf;
                    bve bve4 = bve;
                    bve4.a(cgf4, executor);
                    bve4.b(buh);
                    bvb bvb2 = new bvb(this, cgf4, bve4);
                    return bvb2;
                }
                cgf.a(bvw, 5);
            } else {
                cgf.a(b, 5);
            }
            return null;
        }
    }

    public final synchronized void a(bve bve, bsm bsm, bvl bvl) {
        if (bvl != null) {
            if (bvl.a) {
                this.g.a(bsm, bvl);
            }
        }
        this.a.a(bsm, bve);
    }

    public final synchronized void a(bve bve, bsm bsm) {
        this.a.a(bsm, bve);
    }

    public final void a(bvw bvw) {
        this.d.a(bvw);
    }

    public final synchronized void a(bsm bsm, bvl bvl) {
        this.g.a(bsm);
        if (bvl.a) {
            this.b.a(bsm, bvl);
        } else {
            this.d.a(bvl);
        }
    }
}
