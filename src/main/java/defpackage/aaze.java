package defpackage;

/* renamed from: aaze */
public final class aaze implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private aaze(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static aaze a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new aaze(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        return new aazb((aamf) this.a.get(), (aamd) this.b.get(), (xhf) this.c.get(), (aald) this.d.get());
    }
}
