package defpackage;

/* renamed from: xfy */
public final class xfy implements baqa {
    private final bcaa a;
    private final bcaa b;

    private xfy(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static xfy a(bcaa bcaa, bcaa bcaa2) {
        return new xfy(bcaa, bcaa2);
    }

    public static xgq a(xgu xgu, xgp xgp) {
        return (xgq) baqd.a(xgu.a(xgp), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return xfy.a((xgu) this.a.get(), (xgp) this.b.get());
    }
}
