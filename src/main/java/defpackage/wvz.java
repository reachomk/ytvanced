package defpackage;

/* renamed from: wvz */
public final class wvz implements baqa {
    private final bcaa a;
    private final bcaa b;

    private wvz(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static wvz a(bcaa bcaa, bcaa bcaa2) {
        return new wvz(bcaa, bcaa2);
    }

    public static xoi a(bcaa bcaa, amqp amqp) {
        return (xoi) baqd.a((xoi) amqp.a(new wvq(bcaa)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wvz.a(this.a, (amqp) this.b.get());
    }
}
