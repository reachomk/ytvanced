package defpackage;

/* renamed from: vec */
public final class vec implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private vec(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static vec a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new vec(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new ved(this.a, this.b, this.c);
    }
}
