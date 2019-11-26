package defpackage;

/* renamed from: dmo */
final class dmo implements bcaa {
    private final int a;
    private final /* synthetic */ dmp b;

    dmo(dmp dmp, int i) {
        this.b = dmp;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        if (i == 0) {
            dmp dmp = this.b;
            bcaa bcaa = dmp.a;
            if (bcaa == null) {
                bcaa = new dmo(dmp, 1);
                dmp.a = bcaa;
            }
            bapu b = bapx.b(bcaa);
            bcaa = dmp.b;
            if (bcaa == null) {
                bcaa = new dmo(dmp, 2);
                dmp.b = bcaa;
            }
            return zjh.a(b, bapx.b(bcaa), dmp.c.d.dL.ow());
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
