package defpackage;

/* renamed from: abkk */
public final class abkk implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private abkk(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static abkk a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new abkk(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        return new abkc((aamn) this.a.get(), (amqp) this.b.get(), this.c, (aald) this.d.get());
    }
}
