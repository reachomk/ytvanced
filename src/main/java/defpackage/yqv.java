package defpackage;

/* renamed from: yqv */
public final class yqv {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;

    public yqv(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) yqv.a(bcaa, 1);
        this.b = (bcaa) yqv.a(bcaa2, 2);
        this.c = (bcaa) yqv.a(bcaa3, 3);
        this.d = (bcaa) yqv.a(bcaa4, 4);
        this.e = (bcaa) yqv.a(bcaa5, 5);
        this.f = (bcaa) yqv.a(bcaa6, 6);
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
