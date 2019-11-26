package defpackage;

/* renamed from: aeee */
public final class aeee implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aeee(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aeee a(bcaa bcaa, bcaa bcaa2) {
        return new aeee(bcaa, bcaa2);
    }

    public static afhg a(aajk aajk, afis afis) {
        return (afhg) baqd.a(afiq.a(afis, aajk, 2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aeee.a((aajk) this.a.get(), (afis) this.b.get());
    }
}
