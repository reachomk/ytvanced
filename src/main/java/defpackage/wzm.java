package defpackage;

/* renamed from: wzm */
public final class wzm implements baqa {
    private final bcaa a;
    private final bcaa b;

    private wzm(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static wzm a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new wzm(bcaa, bcaa3);
    }

    public final /* synthetic */ Object get() {
        this.a.get();
        return (xai) baqd.a((xai) this.b.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
