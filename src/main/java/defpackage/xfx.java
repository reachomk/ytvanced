package defpackage;

/* renamed from: xfx */
public final class xfx implements baqa {
    private final bcaa a;
    private final bcaa b;

    private xfx(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static xfx a(bcaa bcaa, bcaa bcaa2) {
        return new xfx(bcaa, bcaa2);
    }

    public static xgq a(bcaa bcaa, amqp amqp) {
        return (xgq) baqd.a((xgq) amqp.a((xgq) bcaa.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return xfx.a(this.a, (amqp) this.b.get());
    }
}
