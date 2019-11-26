package defpackage;

/* renamed from: wwk */
public final class wwk implements baqa {
    private final bcaa a;

    private wwk(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wwk a(bcaa bcaa) {
        return new wwk(bcaa);
    }

    public final /* synthetic */ Object get() {
        Object obj = (xax) this.a.get();
        if (obj == null) {
            obj = xax.a;
        }
        return (xax) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
