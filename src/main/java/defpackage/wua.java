package defpackage;

/* renamed from: wua */
public final class wua {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;

    public wua(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) wua.a(bcaa, 1);
        this.b = (bcaa) wua.a(bcaa2, 2);
        this.c = (bcaa) wua.a(bcaa3, 3);
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
