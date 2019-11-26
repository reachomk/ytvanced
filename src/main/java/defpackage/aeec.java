package defpackage;

/* renamed from: aeec */
public final class aeec implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aeec(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aeec a(bcaa bcaa, bcaa bcaa2) {
        return new aeec(bcaa, bcaa2);
    }

    public static afhg a(afhg afhg, afio afio) {
        return (afhg) baqd.a(afio.a(afio, afhg), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aeec.a((afhg) this.a.get(), (afio) this.b.get());
    }
}
