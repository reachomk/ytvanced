package defpackage;

/* renamed from: aeed */
public final class aeed implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aeed(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aeed a(bcaa bcaa, bcaa bcaa2) {
        return new aeed(bcaa, bcaa2);
    }

    public static afjq a(xsc xsc, afia afia) {
        return (afjq) baqd.a(new afjq(xsc, afia, 2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aeed.a((xsc) this.a.get(), (afia) this.b.get());
    }
}
