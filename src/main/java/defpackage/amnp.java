package defpackage;

/* renamed from: amnp */
public final class amnp {
    public amnp(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        amnp.a(bcaa, 1);
        amnp.a(bcaa2, 2);
        amnp.a(bcaa3, 3);
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
