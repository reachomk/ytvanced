package defpackage;

/* renamed from: aeeq */
public final class aeeq implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aeeq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aeeq a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aeeq(bcaa, bcaa2, bcaa3);
    }

    public static aetb a(aetk aetk, afsa afsa, afsa afsa2) {
        return (aetb) baqd.a(aetk.a(afsa, afsa2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aeeq.a((aetk) this.a.get(), (afsa) this.b.get(), (afsa) this.c.get());
    }
}
