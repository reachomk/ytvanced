package defpackage;

/* renamed from: kxk */
public final class kxk {
    public final bcaa a;

    public kxk(bcaa bcaa) {
        this.a = (bcaa) kxk.a(bcaa, 1);
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
