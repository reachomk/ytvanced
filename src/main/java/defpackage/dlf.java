package defpackage;

/* renamed from: dlf */
final class dlf implements bcaa {
    private final int a;
    private final /* synthetic */ dkt b;

    dlf(dkt dkt, int i) {
        this.b = dkt;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        dkt dkt;
        Object obj;
        Object obj2;
        switch (i) {
            case 0:
                dkt = this.b;
                obj = dkt.b;
                if (obj == null) {
                    obj = new ageb(dkt.l.jq(), dkt.l.dr());
                    dkt.b = obj;
                }
                return obj;
            case 1:
                return new gbh(new gdu(this.b.b()));
            case 2:
                return new ggr(this.b.b());
            case 3:
                return new gbg(this.b.b());
            case 4:
                dkt = this.b;
                obj = dkt.c;
                if (obj == null) {
                    obj = new gbf();
                    dkt.c = obj;
                }
                return obj;
            case 5:
                dkt = this.b;
                obj = dkt.d;
                if (obj == null) {
                    obj = new abit(dkt.l.ly());
                    dkt.d = obj;
                }
                return obj;
            case 6:
                dkt = this.b;
                obj = dkt.e;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkt.e;
                        if (obj2 instanceof baqe) {
                            obj2 = zqh.a();
                            obj2.a = xfa.a(dkt.a);
                            obj2.b = tlg.a();
                            obj2.c = dkt.l.n();
                            dkt.e = bapx.a(dkt.e, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (zqe) obj;
            case 7:
                return xfa.a(this.b.a);
            case 8:
                dkt = this.b;
                obj = dkt.g;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkt.g;
                        if (obj2 instanceof baqe) {
                            obj2 = new akpi();
                            dkt.g = bapx.a(dkt.g, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (akpi) obj;
            case 9:
                dkt = this.b;
                obj = dkt.i;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkt.i;
                        if (obj2 instanceof baqe) {
                            obj2 = new gbe(xfa.a(dkt.a), dkt.l.ox(), dkt.l.cd());
                            dkt.i = bapx.a(dkt.i, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (gbe) obj;
            case 10:
                return this.b.c();
            default:
                throw new AssertionError(i);
        }
    }
}
