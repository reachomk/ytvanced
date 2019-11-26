package defpackage;

/* renamed from: upv */
public final class upv implements baqa {
    private final bcaa a;

    private upv(bcaa bcaa) {
        this.a = bcaa;
    }

    public static upv a(bcaa bcaa) {
        return new upv(bcaa);
    }

    public final /* synthetic */ Object get() {
        auya auya = ((zyw) this.a.get()).a().i;
        if (auya == null) {
            auya = auya.J;
        }
        Object obj = auya.E;
        if (obj == null) {
            obj = aott.d;
        }
        return (aott) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
