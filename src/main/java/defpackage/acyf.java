package defpackage;

/* renamed from: acyf */
public final class acyf implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    private acyf(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
    }

    public static acyf a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        return new acyf(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6);
    }

    public final /* synthetic */ Object get() {
        return new acyg(this.a, this.b, this.c, this.d, (afpu) this.e.get(), this.f);
    }
}
