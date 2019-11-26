package defpackage;

/* renamed from: jnk */
public final class jnk {
    public final bcaa a;
    public final bcaa b;

    public jnk(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) jnk.a(bcaa, 1);
        this.b = (bcaa) jnk.a(bcaa2, 2);
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
