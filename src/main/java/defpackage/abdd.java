package defpackage;

/* renamed from: abdd */
public final class abdd implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    private abdd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
    }

    public static abdd a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        return new abdd(bcaa, bcaa2, bcaa3, bcaa4, bcaa5);
    }

    public final /* synthetic */ Object get() {
        return new abcz((aamf) this.a.get(), (aamd) this.b.get(), (afpu) this.c.get(), (xhf) this.d.get(), (zyw) this.e.get());
    }
}
