package defpackage;

/* renamed from: aflr */
public final class aflr implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aflr(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aflr a(bcaa bcaa, bcaa bcaa2) {
        return new aflr(bcaa, bcaa2);
    }

    public static afms a(afmv afmv, bcaa bcaa) {
        return (afms) baqd.a((afms) bcaa.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aflr.a((afmv) this.a.get(), this.b);
    }
}
