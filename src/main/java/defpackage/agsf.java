package defpackage;

/* renamed from: agsf */
public final class agsf {
    public final bcaa a;

    public agsf(bcaa bcaa) {
        this.a = (bcaa) agsf.a(bcaa);
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }
}
