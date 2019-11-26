package defpackage;

/* renamed from: aael */
public final class aael implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aael(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aael a(bcaa bcaa, bcaa bcaa2) {
        return new aael(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new aaei((xsc) this.a.get(), (zzl) this.b.get());
    }
}
