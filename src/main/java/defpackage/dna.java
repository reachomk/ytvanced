package defpackage;

/* renamed from: dna */
final class dna implements bcaa {
    private final int a;
    private final /* synthetic */ dmw b;

    dna(dmw dmw, int i) {
        this.b = dmw;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        dmw dmw;
        bcaa bcaa;
        bcaa jx;
        bcaa q;
        bcaa mw;
        dlu dlu;
        bcaa bcaa2;
        switch (i) {
            case 0:
                return this.b.g();
            case 1:
                return this.b.h();
            case 2:
                return this.b.c();
            case 3:
                dmw = this.b;
                return new lff(dmw.a, dmw.h(), dmw.k.U(), dmw.k.gF(), dmw.k.cj());
            case 4:
                dmw = this.b;
                bcaa = dmw.j;
                jx = dmw.k.dL.jx();
                q = dmw.k.q();
                mw = dmw.k.dL.mw();
                dlu = dmw.k;
                bcaa2 = dlu.du;
                if (bcaa2 == null) {
                    bcaa2 = new dmu(dlu, 615);
                    dlu.du = bcaa2;
                }
                return new ldm(bcaa, jx, q, mw, bcaa2);
            case 5:
                dmw = this.b;
                return new ldo(dmw.j, dmw.k.iX(), baqg.a(dmw.k.bJ()));
            case 6:
                dmw = this.b;
                return new ldq(dmw.j, dmw.k.dL.jx());
            case 7:
                dmw = this.b;
                bcaa2 = dmw.b;
                if (bcaa2 == null) {
                    bcaa2 = new dna(dmw, 8);
                    dmw.b = bcaa2;
                }
                bcaa = bcaa2;
                bcaa2 = dmw.c;
                if (bcaa2 == null) {
                    bcaa2 = new dna(dmw, 9);
                    dmw.c = bcaa2;
                }
                jx = bcaa2;
                bcaa2 = dmw.d;
                if (bcaa2 == null) {
                    bcaa2 = new dna(dmw, 10);
                    dmw.d = bcaa2;
                }
                q = bcaa2;
                mw = dmw.k.jJ();
                dlu dlu2 = dmw.k;
                bcaa bcaa3 = dlu2.dv;
                if (bcaa3 == null) {
                    bcaa3 = new dmu(dlu2, 617);
                    dlu2.dv = bcaa3;
                }
                dlu = dmw.k;
                bcaa2 = dlu.dw;
                if (bcaa2 == null) {
                    bcaa2 = new dmu(dlu, 618);
                    dlu.dw = bcaa2;
                }
                return new abqj(bcaa, jx, q, mw, bcaa3, bcaa2);
            case 8:
                dmw = this.b;
                return new abxh(dmw.k.aq(), dmw.k.jJ(), dmw.k.bA(), dmw.k.bC());
            case 9:
                dmw = this.b;
                return new abwn(dmw.k.aq(), dmw.k.by(), dmw.k.aD(), dmw.k.bz());
            case 10:
                return new abxj(this.b.k.bA());
            case 11:
                dmw = this.b;
                acwa p = dmw.k.p();
                jx = dmw.d();
                dlu = dmw.k;
                q = dlu.dx;
                if (q == null) {
                    q = new dmu(dlu, 619);
                    dlu.dx = q;
                }
                return new lfm(p, jx, q);
            case 12:
                dmw = this.b;
                return new ldt(dmw.a, dmw.k.dL.aZ(), dmw.k.dL.oI(), dmw.k.dL.oC(), dmw.k.w(), dmw.h(), dmw.k.dL.oB(), dmw.k.dL.s(), dmw.k.gF(), dmw.k.ja(), dmw.c(), dmw.k.dL.bn(), dmw.k.dL.c(), dmw.k.hB(), dmw.d());
            case 13:
                dmw = this.b;
                return new lfo(dmw.a, dmw.d(), dmw.k.p(), dmw.k.dL.oI(), dmw.k.gr(), dmw.k.w(), dmw.k.ct(), dmw.k.dL.oC(), dmw.k.hO(), dmw.k.cG(), dmw.k.dL.mt(), dvo.a(dmw.k.a));
            case 14:
                dmw = this.b;
                return new leb(dmw.a, dmw.d(), xex.a(dmw.k.a), dmw.k.dL.cd(), dmw.k.gF(), dmw.k.dL.s(), dmw.k.dL.k(), dmw.k.dL.aQ(), dmw.k.cA());
            case 15:
                return this.b.e();
            case 16:
                return this.b.f();
            case 17:
                return this.b.a();
            case 18:
                return this.b.b();
            default:
                throw new AssertionError(i);
        }
    }
}
