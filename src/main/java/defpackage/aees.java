package defpackage;

/* renamed from: aees */
public final class aees implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aees(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aees a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aees(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        aeep aeep = new aeep();
        aeep.a = this.a;
        aeep.b = (aeqo) this.b.get();
        aeep.c = (xhv) this.c.get();
        return aeep;
    }
}
