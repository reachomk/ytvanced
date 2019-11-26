package defpackage;

/* renamed from: yji */
public final class yji {
    private final bcaa a;

    public yji(bcaa bcaa) {
        this.a = (bcaa) yji.a(bcaa);
    }

    public final yjf a() {
        return new yjf((zzl) yji.a((zzl) this.a.get()));
    }

    private static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }
}
