package defpackage;

/* renamed from: afma */
public final class afma implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private afma(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static afma a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new afma(bcaa, bcaa2, bcaa3);
    }

    public static xhl a(xsc xsc, xgp xgp, afms afms) {
        return (xhl) baqd.a(xhl.a(xgp, new afsh(afms, xsc)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return afma.a((xsc) this.a.get(), (xgp) this.b.get(), (afms) this.c.get());
    }
}
