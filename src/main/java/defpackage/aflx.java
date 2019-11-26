package defpackage;

/* renamed from: aflx */
public final class aflx implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aflx(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aflx a(bcaa bcaa, bcaa bcaa2) {
        return new aflx(bcaa, bcaa2);
    }

    public static xhf a(xhi xhi, xhl xhl) {
        return (xhf) baqd.a(xhi.a(new bqs(), xhl), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aflx.a((xhi) this.a.get(), (xhl) this.b.get());
    }
}
