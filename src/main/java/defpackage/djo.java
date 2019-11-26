package defpackage;

/* renamed from: djo */
final class djo implements bcaa {
    private final int a;
    private final /* synthetic */ djp b;

    djo(djp djp, int i) {
        this.b = djp;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        if (i == 0) {
            djp djp = this.b;
            bcaa bcaa = djp.a;
            if (bcaa == null) {
                bcaa = new djo(djp, 1);
                djp.a = bcaa;
            }
            bapu b = bapx.b(bcaa);
            bcaa = djp.b;
            if (bcaa == null) {
                bcaa = new djo(djp, 2);
                djp.b = bcaa;
            }
            return zjh.a(b, bapx.b(bcaa), djp.c.c.ow());
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
