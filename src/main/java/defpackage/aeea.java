package defpackage;

/* renamed from: aeea */
public final class aeea implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aeea(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aeea a(bcaa bcaa, bcaa bcaa2) {
        return new aeea(bcaa, bcaa2);
    }

    public static afhg a(aajk aajk, afis afis) {
        return (afhg) baqd.a(afiq.a(afis, aajk, 3), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aeea.a((aajk) this.a.get(), (afis) this.b.get());
    }
}
