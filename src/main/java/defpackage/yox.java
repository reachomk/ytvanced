package defpackage;

/* renamed from: yox */
public final class yox {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;

    public yox(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = (bcaa) yox.a(bcaa, 1);
        this.b = (bcaa) yox.a(bcaa2, 2);
        this.c = (bcaa) yox.a(bcaa3, 3);
        this.d = (bcaa) yox.a(bcaa4, 4);
        this.e = (bcaa) yox.a(bcaa5, 5);
        this.f = (bcaa) yox.a(bcaa6, 6);
        this.g = (bcaa) yox.a(bcaa7, 7);
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
