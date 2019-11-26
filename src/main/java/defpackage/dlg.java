package defpackage;

/* renamed from: dlg */
final class dlg implements bcaa {
    private final int a;
    private final /* synthetic */ dlh b;

    dlg(dlh dlh, int i) {
        this.b = dlh;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        dlh dlh;
        Object obj;
        Object obj2;
        switch (i) {
            case 0:
                dlh = this.b;
                return new goe(xfa.a(dlh.d.a), dlh.d.g(), dlh.a());
            case 1:
                dlh = this.b;
                return new gof(dlh.d.V.cd(), dlh.d.V.oB());
            case 2:
                dlh = this.b;
                obj = dlh.b;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dlh.b;
                        if (obj2 instanceof baqe) {
                            obj2 = (goa) baqd.a(dlh.a.a, "Cannot return null from a non-@Nullable @Provides method");
                            dlh.b = bapx.a(dlh.b, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (goa) obj;
            case 3:
                return new got();
            case 4:
                return new gou();
            case 5:
                dlh = this.b;
                dle dle = dlh.d;
                bcaa bcaa = dle.N;
                if (bcaa == null) {
                    bcaa = new dlj(dle, 45);
                    dle.N = bcaa;
                }
                bcaa K = dlh.d.V.K();
                bcaa aR = dlh.d.V.aR();
                bcaa ky = dlh.d.V.ky();
                bcaa r = dlh.d.r();
                dle = dlh.d;
                bcaa bcaa2 = dle.P;
                if (bcaa2 == null) {
                    bcaa2 = new dlj(dle, 46);
                    dle.P = bcaa2;
                }
                bcaa at = dlh.d.V.at();
                dle = dlh.d;
                bcaa bcaa3 = dle.S;
                if (bcaa3 == null) {
                    bcaa3 = new dlj(dle, 47);
                    dle.S = bcaa3;
                }
                return new est(bcaa, K, aR, ky, r, bcaa2, at, bcaa3, dlh.d.V.bt(), dlh.d.V.lI(), dlh.d.o(), dlh.d.V.kJ(), dlh.d.V.fd(), dlh.d.V.lJ());
            case 6:
                dlh = this.b;
                obj = dlh.c;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dlh.c;
                        if (obj2 instanceof baqe) {
                            obj2 = new gpq(dlh.d.V.k());
                            dlh.c = bapx.a(dlh.c, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (gpq) obj;
            case 7:
                dlh = this.b;
                return new gpt(xfa.a(dlh.d.a), dlh.d.n(), dlh.d.c(), dlh.d.V.n());
            case 8:
                dlh = this.b;
                return new gnu(dlh.d.n(), dlh.d.g(), dlh.d.p());
            default:
                throw new AssertionError(i);
        }
    }
}
