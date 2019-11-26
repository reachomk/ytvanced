package defpackage;

/* renamed from: jvw */
public final class jvw {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;

    public jvw(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = (bcaa) jvw.a(bcaa, 1);
        this.b = (bcaa) jvw.a(bcaa2, 2);
        this.c = (bcaa) jvw.a(bcaa3, 3);
        this.d = (bcaa) jvw.a(bcaa4, 4);
        this.e = (bcaa) jvw.a(bcaa5, 5);
        this.f = (bcaa) jvw.a(bcaa6, 6);
        this.g = (bcaa) jvw.a(bcaa7, 7);
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
