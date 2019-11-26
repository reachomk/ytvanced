package defpackage;

/* renamed from: dky */
final class dky implements gdo {
    private final gdq a;
    private volatile Object b = new baqe();
    private volatile Object c = new baqe();
    private volatile Object d = new baqe();
    private volatile Object e = new baqe();
    private volatile Object f = new baqe();
    private final /* synthetic */ dkv g;

    private final gdz a() {
        Object obj = this.b;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof baqe) {
                    dkv dkv = this.g;
                    obj2 = new gdz(dkv.a, new gfs(xfa.a(dkv.e.a), this.g.e.l.bx(), this.g.e.c(), this.g.e.d()));
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
                    gkp gkp = new gkp(xfa.a(this.g.e.a));
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
                    obj2 = gkc.a(nfVar, zrp, gkp, gaz, (gkd) obj2, this.g.e.l.s(), this.g.e.l.ox(), this.g.e.l.n(), new gkj(this.g.e.d(), new gkh(xfa.a(this.g.e.a)), new gkr(xex.a(this.g.e.a))));
                    this.f = bapx.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (gju) obj;
    }

    public final void a(gdn gdn) {
        zrg zrg = gdn;
        zrg.ao = this.g.e.l.bf();
        zrg.ap = this.g.e.l.ox();
        zrg.aq = this.g.e.l.n();
        zrg.ar = this.g.e.l.bi();
        zrg.Z = this.g.e.l.bb();
        zrg.aa = this.g.e.l.s();
        dkv dkv = this.g;
        zrg.ab = dkv.a;
        zrg.ac = new geb(xfa.a(dkv.e.a));
        zrg.ad = a();
        zrg.ae = new gdf(this.g.e.l.k(), this.g.e.c(), this.g.e.l.oF(), this.g.e.l.iM(), new zkw(), new znw(this.g.e.l.m()), this.g.e.l.ja());
        zrg.af = new gef(this.g.e.l.cd());
        zrg.ag = new gfa(xfa.a(this.g.e.a), new geu(xfa.a(this.g.e.a), this.g.e.l.bi(), this.g.e.l.bx(), this.g.e.c()));
        zrg.ah = new gdd();
        zrg.ai = new gdb();
        zrg.aj = new ged();
        zrg.ak = new gdl();
        zrg.al = new gfg(this.g.e.l.lz(), this.g.e.l.bx(), a(), this.g.e.l.oF(), new gih(this.g.e.l.oF(), b(), this.g.e(), this.g.f(), this.g.g(), this.g.j(), new ghd(xex.a(this.g.e.a), this.g.e.l.cd(), new zkw(), this.g.e.l.lz(), this.g.a)), b(), this.g.d());
        zrg.am = this.g.d();
    }

    /* synthetic */ dky(dkv dkv, gdq gdq) {
        this.g = dkv;
        this.a = gdq;
    }
}
