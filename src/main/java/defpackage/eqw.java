package defpackage;

/* renamed from: eqw */
public final class eqw {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;

    public eqw(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) eqw.a(bcaa, 1);
        this.b = (bcaa) eqw.a(bcaa2, 2);
        this.c = (bcaa) eqw.a(bcaa3, 3);
        this.d = (bcaa) eqw.a(bcaa4, 4);
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
