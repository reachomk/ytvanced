package defpackage;

/* renamed from: wqi */
public final class wqi {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;

    public wqi(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) wqi.a(bcaa, 1);
        this.b = (bcaa) wqi.a(bcaa2, 2);
        this.c = (bcaa) wqi.a(bcaa3, 3);
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
