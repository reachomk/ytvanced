package defpackage;

/* renamed from: zaz */
public final class zaz {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;

    public zaz(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) zaz.a(bcaa, 1);
        this.b = (bcaa) zaz.a(bcaa2, 2);
        this.c = (bcaa) zaz.a(bcaa3, 3);
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
