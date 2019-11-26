package defpackage;

/* renamed from: dly */
final class dly implements frj {
    public volatile bcaa A;
    public volatile bcaa B;
    public final /* synthetic */ dlu C;
    private volatile bcaa D;
    private volatile bcaa E;
    private volatile bcaa F;
    private volatile bcaa G;
    private volatile Object H = new baqe();
    public final frk a;
    public volatile bcaa b;
    public volatile Object c = new baqe();
    public volatile bcaa d;
    public volatile bcaa e;
    public volatile bcaa f;
    public volatile bcaa g;
    public volatile bcaa h;
    public volatile bcaa i;
    public volatile bcaa j;
    public volatile bcaa k;
    public volatile bcaa l;
    public volatile bcaa m;
    public volatile bcaa n;
    public volatile bcaa o;
    public volatile bcaa p;
    public volatile bcaa q;
    public volatile bcaa r;
    public volatile bcaa s;
    public volatile bcaa t;
    public volatile bcaa u;
    public volatile bcaa v;
    public volatile Object w = new baqe();
    public volatile bcaa x;
    public volatile bcaa y;
    public volatile bcaa z;

    public final bcaa a() {
        bcaa bcaa = this.D;
        if (bcaa != null) {
            return bcaa;
        }
        dmb dmb = new dmb(this, 0);
        this.D = dmb;
        return dmb;
    }

    public final bcaa b() {
        bcaa bcaa = this.E;
        if (bcaa != null) {
            return bcaa;
        }
        dmb dmb = new dmb(this, 7);
        this.E = dmb;
        return dmb;
    }

    public final bcaa c() {
        bcaa bcaa = this.F;
        if (bcaa != null) {
            return bcaa;
        }
        dmb dmb = new dmb(this, 19);
        this.F = dmb;
        return dmb;
    }

    public final void a(frf frf) {
        frf.Z = bapx.b(this.C.dL.jy());
        frf.aa = this.C.dL.H();
        frf.ab = this.C.dF();
        frf.ac = this.C.dP();
        frf.ad = this.C.j();
        bcaa aq = this.C.aq();
        bcaa ca = this.C.dL.ca();
        bcaa a = a();
        bcaa nI = this.C.dL.nI();
        bcaa bcaa = this.G;
        if (bcaa == null) {
            bcaa = new dmb(this, 1);
            this.G = bcaa;
        }
        frf.ae = new yqq(aq, ca, a, nI, bcaa, this.C.dL.jy());
        frf.af = this.C.hl();
        frf.ag = this.C.dL.cd();
        frf.ah = this.C.dL.fk();
        frf.ai = this.C.gF();
        Object obj = this.H;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.H;
                if (obj2 instanceof baqe) {
                    obj2 = (ysc) baqd.a(new frw(this.a.a.v), "Cannot return null from a non-@Nullable @Provides method");
                    this.H = bapx.a(this.H, obj2);
                }
            }
            obj = obj2;
        }
        frf.aj = (ysc) obj;
        aq = this.C.dL.nI();
        ca = this.C.bf();
        a = this.C.iy();
        nI = this.C.X();
        bcaa bQ = this.C.bQ();
        bcaa af = this.C.af();
        bcaa F = this.C.F();
        bcaa F2 = this.C.F();
        dlu dlu = this.C;
        bcaa bcaa2 = dlu.dm;
        if (bcaa2 == null) {
            bcaa2 = new dmu(dlu, 609);
            dlu.dm = bcaa2;
        }
        frf.ak = new fru(aq, ca, a, nI, bQ, af, F, F2, bcaa2, this.C.q(), this.C.dL.jy());
        frf.al = this.C.dL.oC();
        frf.am = this.C.iA();
        frf.an = this.C.dB();
    }

    /* synthetic */ dly(dlu dlu, frk frk) {
        this.C = dlu;
        this.a = frk;
    }
}
