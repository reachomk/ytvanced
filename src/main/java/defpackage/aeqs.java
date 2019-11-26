package defpackage;

/* renamed from: aeqs */
public final class aeqs implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private aeqs(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static aeqs a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new aeqs(bcaa, bcaa2, bcaa3, bcaa4);
    }

    public final /* synthetic */ Object get() {
        bcaa bcaa = this.a;
        xhv xhv = (xhv) this.b.get();
        aajk aajk = (aajk) this.c.get();
        this.d.get();
        return new aeqo(bcaa, xhv, aajk);
    }
}
