package defpackage;

/* renamed from: dma */
final class dma implements fro {
    public final frq a;
    public volatile Object b = new baqe();
    public volatile Object c = new baqe();
    public final /* synthetic */ dlu d;
    private volatile bcaa e;
    private volatile bcaa f;
    private volatile bcaa g;
    private volatile bcaa h;

    private final bcaa a() {
        bcaa bcaa = this.e;
        if (bcaa != null) {
            return bcaa;
        }
        dmd dmd = new dmd(this, 0);
        this.e = dmd;
        return dmd;
    }

    private final bcaa b() {
        bcaa bcaa = this.f;
        if (bcaa != null) {
            return bcaa;
        }
        dmd dmd = new dmd(this, 1);
        this.f = dmd;
        return dmd;
    }

    private final bcaa c() {
        bcaa bcaa = this.g;
        if (bcaa != null) {
            return bcaa;
        }
        dmd dmd = new dmd(this, 2);
        this.g = dmd;
        return dmd;
    }

    public final void a(frn frn) {
        fja fja = frn;
        fja.Z = bapx.b(this.d.dL.jy());
        fja.aa = this.d.dL.H();
        fja.ab = this.d.dF();
        fja.ac = this.d.dP();
        fja.ad = this.d.j();
        fja.ae = this.d.hl();
        fja.af = new yqe(this.d.dL.R(), this.d.dL.ca(), this.d.dL.nI(), a(), this.d.dL.jx(), b(), c(), this.d.q());
        fja.ag = new yox(this.d.aq(), this.d.dL.ca(), this.d.dL.nI(), a(), this.d.dL.jx(), b(), c());
        bcaa R = this.d.dL.R();
        bcaa ca = this.d.dL.ca();
        bcaa nI = this.d.dL.nI();
        bcaa bcaa = this.h;
        if (bcaa == null) {
            bcaa = new dmd(this, 3);
            this.h = bcaa;
        }
        fja.ah = new ypz(R, ca, nI, bcaa);
    }

    /* synthetic */ dma(dlu dlu, frq frq) {
        this.d = dlu;
        this.a = frq;
    }
}
