package defpackage;

/* renamed from: ynd */
public final class ynd {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;

    public ynd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) ynd.a(bcaa, 1);
        this.b = (bcaa) ynd.a(bcaa2, 2);
        this.c = (bcaa) ynd.a(bcaa3, 3);
        this.d = (bcaa) ynd.a(bcaa4, 4);
        this.e = (bcaa) ynd.a(bcaa5, 5);
        this.f = (bcaa) ynd.a(bcaa6, 6);
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
