package defpackage;

/* renamed from: hjy */
public final class hjy {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;

    public hjy(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) hjy.a(bcaa, 1);
        this.b = (bcaa) hjy.a(bcaa2, 2);
        this.c = (bcaa) hjy.a(bcaa3, 3);
        this.d = (bcaa) hjy.a(bcaa4, 4);
        this.e = (bcaa) hjy.a(bcaa5, 5);
        this.f = (bcaa) hjy.a(bcaa6, 6);
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
