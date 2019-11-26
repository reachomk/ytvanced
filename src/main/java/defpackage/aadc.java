package defpackage;

/* renamed from: aadc */
public final class aadc implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aadc(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aadc a(bcaa bcaa, bcaa bcaa2) {
        return new aadc(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new aadd(this.a, (aadw) this.b.get());
    }
}
