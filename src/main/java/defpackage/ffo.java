package defpackage;

/* renamed from: ffo */
public final class ffo {
    public static ffp a(String str, String str2) {
        return new ffp((String) ffo.a((Object) str, 1), (String) ffo.a((Object) str2, 2));
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
