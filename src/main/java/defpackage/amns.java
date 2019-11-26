package defpackage;

/* renamed from: amns */
public final class amns implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private amns(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static amns a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new amns(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new amnp(this.a, this.b, this.c);
    }
}
