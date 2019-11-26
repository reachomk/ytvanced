package defpackage;

/* renamed from: wwj */
public final class wwj implements baqa {
    private final bcaa a;

    private wwj(bcaa bcaa) {
        this.a = bcaa;
    }

    public static wwj a(bcaa bcaa) {
        return new wwj(bcaa);
    }

    public final /* synthetic */ Object get() {
        Boolean bool = (Boolean) this.a.get();
        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
    }
}
