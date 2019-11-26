package defpackage;

/* renamed from: dmk */
final class dmk implements gcv {
    public final gcl a;
    public volatile Object b = new baqe();
    public volatile Object c = new baqe();
    public final /* synthetic */ dlu d;
    private volatile Object e = new baqe();
    private volatile Object f = new baqe();
    private volatile Object g = new baqe();
    private volatile Object h = new baqe();
    private volatile Object i = new baqe();
    private volatile Object j = new baqe();
    private volatile Object k = new baqe();
    private volatile Object l = new baqe();

    private final znv p() {
        return new znv(xfa.a(this.d.a), gcy.a(this.d.dL.aj(), this.d.dL.ak()), this.d.dL.ox());
    }

    public final ggj a() {
        Object obj = this.e;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof baqe) {
                    obj2 = new ggj(xfa.a(this.d.a), this.d.dL.oA(), this.d.dL.lz());
                    this.e = bapx.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (ggj) obj;
    }

    public final gia c() {
        return new gia(this.d.dL.ox());
    }

    public final gim d() {
        Object obj = this.f;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof baqe) {
                    obj2 = new gim(xfa.a(this.d.a), this.d.dL.oF(), this.d.dL.lz());
                    this.f = bapx.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (gim) obj;
    }

    public final ghm e() {
        Object obj = this.g;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof baqe) {
                    bcaa jy = this.d.dL.jy();
                    dlu dlu = this.d;
                    bcaa bcaa = dlu.dt;
                    if (bcaa == null) {
                        bcaa = new dmu(dlu, 614);
                        dlu.dt = bcaa;
                    }
                    ghm ghm = new ghm(new zqs(jy, bcaa, this.d.dL.jA()), xex.a(this.d.a), this.a, this.d.dL.n(), c(), this.d.dL.lz(), new zkw(), d());
                    this.g = bapx.a(this.g, ghm);
                }
            }
            obj = obj2;
        }
        return (ghm) obj;
    }

    public final ggm f() {
        Object obj = this.h;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.h;
                if (obj2 instanceof baqe) {
                    ggm ggm = new ggm(xex.a(this.d.a), this.a, a(), this.d.dL.lz(), new zkw(), d(), this.d.p());
                    this.h = bapx.a(this.h, ggm);
                }
            }
            obj = obj2;
        }
        return (ggm) obj;
    }

    public final giv g() {
        Object obj = this.i;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.i;
                if (obj2 instanceof baqe) {
                    giv giv = new giv(new grc(this.d.aq(), this.d.hf()), xex.a(this.d.a), this.d.dL.cd(), this.d.dL.lz(), this.a, c(), new zkw(), d(), this.d.p());
                    this.i = bapx.a(this.i, giv);
                }
            }
            obj = obj2;
        }
        return (giv) obj;
    }

    public final gjm h() {
        Object obj = this.j;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.j;
                if (obj2 instanceof baqe) {
                    obj2 = gjr.a(xfa.a(this.d.a), this.d.dL.oy(), this.d.dL.oA());
                    this.j = bapx.a(this.j, obj2);
                }
            }
            obj = obj2;
        }
        return (gjm) obj;
    }

    public final gjd i() {
        Object obj = this.k;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.k;
                if (obj2 instanceof baqe) {
                    obj2 = new gjd(xfa.a(this.d.a), this.d.dL.cd(), this.d.dL.oA(), h());
                    this.k = bapx.a(this.k, obj2);
                }
            }
            obj = obj2;
        }
        return (gjd) obj;
    }

    public final giw j() {
        Object obj = this.l;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.l;
                if (obj2 instanceof baqe) {
                    giw giw = new giw(i(), this.a, this.d.dL.oA(), this.d.dL.lz(), d(), this.d.p());
                    this.l = bapx.a(this.l, giw);
                }
            }
            obj = obj2;
        }
        return (giw) obj;
    }

    public final void a(gcl gcl) {
        gcl.a = this.d.dL.oF();
        gcl.b = this.d.dL.c();
        gcl.c = this.d.gF();
        gcl.Z = new gfd(this.d.dL.iX(), this.d.dL.k(), this.a);
        gcl.aa = p();
        gcl.ab = p();
        gcl.ac = new zlt(this.d.dL.oy());
        gcl.ad = this.d.dL.ox();
        gcl.ae = a();
    }

    public final gdo a(gdq gdq) {
        baqd.a(gdq);
        return new dmr(this, gdq);
    }

    public final gfq k() {
        return new dmt();
    }

    public final gcf l() {
        return new dmp(this);
    }

    public final ghv m() {
        return new dmn(this);
    }

    public final gik n() {
        return new dms(this);
    }

    public final gen o() {
        return new dmq(this);
    }

    public final alat b() {
        return new dmm(this);
    }

    /* synthetic */ dmk(dlu dlu, gcl gcl) {
        this.d = dlu;
        this.a = gcl;
    }
}
