package defpackage;

/* renamed from: agja */
public final class agja {
    public final bcaa a;
    public final bcaa b;

    public agja(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) agja.a(bcaa, 1);
        this.b = (bcaa) agja.a(bcaa2, 2);
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
