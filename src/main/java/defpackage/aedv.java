package defpackage;

/* renamed from: aedv */
public final class aedv implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aedv(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aedv a(bcaa bcaa, bcaa bcaa2) {
        return new aedv(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        this.a.get();
        this.b.get();
        return Boolean.valueOf(false);
    }
}
