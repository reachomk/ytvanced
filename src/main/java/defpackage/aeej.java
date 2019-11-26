package defpackage;

/* renamed from: aeej */
public final class aeej implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aeej(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aeej a(bcaa bcaa, bcaa bcaa2) {
        return new aeej(bcaa, bcaa2);
    }

    public static afjq a(xsc xsc, afia afia) {
        return (afjq) baqd.a(new afjq(xsc, afia, 1), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aeej.a((xsc) this.a.get(), (afia) this.b.get());
    }
}
