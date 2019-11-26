package defpackage;

/* renamed from: hiw */
public final class hiw {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final bcaa h;

    public hiw(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        this.a = (bcaa) hiw.a(bcaa, 1);
        this.b = (bcaa) hiw.a(bcaa2, 2);
        this.c = (bcaa) hiw.a(bcaa3, 3);
        this.d = (bcaa) hiw.a(bcaa4, 4);
        this.e = (bcaa) hiw.a(bcaa5, 5);
        this.f = (bcaa) hiw.a(bcaa6, 6);
        this.g = (bcaa) hiw.a(bcaa7, 7);
        this.h = (bcaa) hiw.a(bcaa8, 8);
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
