package defpackage;

/* renamed from: dmr */
final class dmr implements gdo {
    private final gdq a;
    private volatile Object b = new baqe();
    private volatile Object c = new baqe();
    private volatile Object d = new baqe();
    private volatile Object e = new baqe();
    private volatile Object f = new baqe();
    private final /* synthetic */ dmk g;

    private final gdz a() {
        Object obj = this.b;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof baqe) {
                    dmk dmk = this.g;
                    obj2 = new gdz(dmk.a, new gfs(xfa.a(dmk.d.a), this.g.d.dL.bx(), this.g.d.gF(), this.g.d.p()));
                    this.b = bapx.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (gdz) obj;
    }

    private final gju b() {
        Object obj = this.f;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof baqe) {
                    obj2 = this.c;
                    if (obj2 instanceof baqe) {
                        Object obj3;
                        synchronized (obj2) {
                            obj3 = this.c;
                            if (obj3 instanceof baqe) {
                                obj3 = gdt.a(this.a);
                                this.c = bapx.a(this.c, obj3);
                            }
                        }
                        obj2 = obj3;
                    }
                    nf nfVar = (nf) obj2;
                    obj2 = this.d;
                    if (obj2 instanceof baqe) {
                        Object obj4;
                        synchronized (obj2) {
                            obj4 = this.d;
                            if (obj4 instanceof baqe) {
                                obj4 = gds.a(this.a);
                                this.d = bapx.a(this.d, obj4);
                            }
                        }
                        obj2 = obj4;
                    }
                    zrp zrp = (zrp) obj2;
                    gkp gkp = new gkp(xfa.a(this.g.d.a));
                    gaz gaz = new gaz();
                    obj2 = this.e;
                    if (obj2 instanceof baqe) {
                        Object obj5;
                        synchronized (obj2) {
                            obj5 = this.e;
                            if (obj5 instanceof baqe) {
                                obj5 = gdv.a(this.a);
                                this.e = bapx.a(this.e, obj5);
                            }
                        }
                        obj2 = obj5;
                    }
                    obj2 = gkc.a(nfVar, zrp, gkp, gaz, (gkd) obj2, this.g.d.dL.s(), this.g.d.dL.ox(), this.g.d.dL.n(), new gkj(this.g.d.p(), new gkh(xfa.a(this.g.d.a)), new gkr(xex.a(this.g.d.a))));
                    this.f = bapx.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (gju) obj;
    }

    public final void a(gdn gdn) {
        zrg zrg = gdn;
        zrg.ao = this.g.d.dL.bf();
        zrg.ap = this.g.d.dL.ox();
        zrg.aq = this.g.d.dL.n();
        zrg.ar = this.g.d.dL.bi();
        zrg.Z = this.g.d.dL.bb();
        zrg.aa = this.g.d.dL.s();
        dmk dmk = this.g;
        zrg.ab = dmk.a;
        zrg.ac = new geb(xfa.a(dmk.d.a));
        zrg.ad = a();
        zrg.ae = new gdf(this.g.d.dL.k(), this.g.d.gF(), this.g.d.dL.oF(), this.g.d.dL.iM(), new zkw(), new znw(this.g.d.dL.m()), this.g.d.dL.ja());
        zrg.af = new gef(this.g.d.dL.cd());
        zrg.ag = new gfa(xfa.a(this.g.d.a), new geu(xfa.a(this.g.d.a), this.g.d.dL.bi(), this.g.d.dL.bx(), this.g.d.gF()));
        zrg.ah = new gdd();
        zrg.ai = new gdb();
        zrg.aj = new ged();
        zrg.ak = new gdl();
        zrg.al = new gfg(this.g.d.dL.lz(), this.g.d.dL.bx(), a(), this.g.d.dL.oF(), new gih(this.g.d.dL.oF(), b(), this.g.e(), this.g.f(), this.g.g(), this.g.j(), new ghd(xex.a(this.g.d.a), this.g.d.dL.cd(), new zkw(), this.g.d.dL.lz(), this.g.a)), b(), this.g.d());
        zrg.am = this.g.d();
    }

    /* synthetic */ dmr(dmk dmk, gdq gdq) {
        this.g = dmk;
        this.a = gdq;
    }
}
