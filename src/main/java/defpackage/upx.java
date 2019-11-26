package defpackage;

/* renamed from: upx */
public final class upx implements baqa {
    private final bcaa a;
    private final bcaa b;

    private upx(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static upx a(bcaa bcaa, bcaa bcaa2) {
        return new upx(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        Object obj;
        amqp amqp = (amqp) this.a.get();
        bcaa bcaa = this.b;
        if (amqp.a()) {
            obj = (uzk) amqp.b();
        } else {
            obj = (uzk) bcaa.get();
        }
        return (uzk) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
