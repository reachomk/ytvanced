package defpackage;

/* renamed from: xyr */
public final class xyr {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;

    public xyr(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = (bcaa) xyr.a(bcaa, 1);
        this.b = (bcaa) xyr.a(bcaa2, 2);
        this.c = (bcaa) xyr.a(bcaa3, 3);
        this.d = (bcaa) xyr.a(bcaa4, 4);
        this.e = (bcaa) xyr.a(bcaa5, 5);
        this.f = (bcaa) xyr.a(bcaa6, 6);
        this.g = (bcaa) xyr.a(bcaa7, 7);
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
