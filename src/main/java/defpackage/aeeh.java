package defpackage;

/* renamed from: aeeh */
public final class aeeh implements baqa {
    private final bcaa a;

    private aeeh(bcaa bcaa) {
        this.a = bcaa;
    }

    public static aeeh a(bcaa bcaa) {
        return new aeeh(bcaa);
    }

    public static aemu a(aema aema) {
        return (aemu) baqd.a(aema.c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aeeh.a((aema) this.a.get());
    }
}
