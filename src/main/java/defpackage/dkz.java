package defpackage;

/* renamed from: dkz */
final class dkz implements bcaa {
    private final int a;
    private final /* synthetic */ dkw b;

    dkz(dkw dkw, int i) {
        this.b = dkw;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        if (i == 0) {
            dkw dkw = this.b;
            bcaa bcaa = dkw.a;
            if (bcaa == null) {
                bcaa = new dkz(dkw, 1);
                dkw.a = bcaa;
            }
            bapu b = bapx.b(bcaa);
            bcaa = dkw.b;
            if (bcaa == null) {
                bcaa = new dkz(dkw, 2);
                dkw.b = bcaa;
            }
            return zjh.a(b, bapx.b(bcaa), dkw.c.e.l.ow());
        } else if (i == 1) {
            return zjd.a();
        } else {
            if (i == 2) {
                return zjg.a();
            }
            throw new AssertionError(i);
        }
    }
}
