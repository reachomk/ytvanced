package defpackage;

/* renamed from: zcd */
public final class zcd {
    public final bcaa a;

    public zcd(bcaa bcaa) {
        this.a = (bcaa) zcd.a(bcaa);
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }
}
