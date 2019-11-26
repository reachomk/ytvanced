package defpackage;

/* renamed from: kxf */
public final class kxf {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;

    public kxf(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        kxf.a(bcaa, 1);
        this.a = (bcaa) kxf.a(bcaa2, 2);
        this.b = (bcaa) kxf.a(bcaa3, 3);
        this.c = (bcaa) kxf.a(bcaa4, 4);
        this.d = (bcaa) kxf.a(bcaa5, 5);
        this.e = (bcaa) kxf.a(bcaa6, 6);
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
