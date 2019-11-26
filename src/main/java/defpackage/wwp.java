package defpackage;

/* renamed from: wwp */
public final class wwp implements baqa {
    private final bcaa a;
    private final bcaa b;

    private wwp(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static wwp a(bcaa bcaa, bcaa bcaa2) {
        return new wwp(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        bcaa bcaa = this.a;
        Object obj = (xsc) this.b.get();
        if (obj == null) {
            obj = (xsc) bcaa.get();
        }
        return (xsc) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
