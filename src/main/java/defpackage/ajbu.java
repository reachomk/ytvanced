package defpackage;

/* renamed from: ajbu */
public final class ajbu implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private ajbu(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static ajbu a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new ajbu(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        bctz bctz = (bctz) this.a.get();
        bctz bctz2 = (bctz) this.b.get();
        bctz bctz3 = (bctz) this.c.get();
        this.d.get();
        return new ajbp(bctz, bctz2, bctz3);
    }
}
