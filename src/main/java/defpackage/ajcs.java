package defpackage;

/* renamed from: ajcs */
public final class ajcs implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private ajcs(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static ajcs a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new ajcs(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new ajct(this.a, this.b, this.c);
    }
}
