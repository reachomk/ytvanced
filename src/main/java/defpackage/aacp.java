package defpackage;

/* renamed from: aacp */
public final class aacp implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aacp(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aacp a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aacp(bcaa, bcaa2, bcaa3);
    }

    public static aaep a(bcaa bcaa) {
        return (aaep) baqd.a((aaep) bcaa.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        this.a.get();
        return aacp.a(this.c);
    }
}
