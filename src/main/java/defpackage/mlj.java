package defpackage;

/* renamed from: mlj */
public final class mlj implements baqa {
    private final mlh a;

    private mlj(mlh mlh) {
        this.a = mlh;
    }

    public static mlj a(mlh mlh) {
        return new mlj(mlh);
    }

    public final /* synthetic */ Object get() {
        return (String) baqd.a(this.a.a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
