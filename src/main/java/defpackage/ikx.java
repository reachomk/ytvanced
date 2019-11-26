package defpackage;

/* renamed from: ikx */
public final class ikx {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final bcaa h;
    public final bcaa i;

    public ikx(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9) {
        this.a = (bcaa) ikx.a(bcaa, 1);
        this.b = (bcaa) ikx.a(bcaa2, 2);
        this.c = (bcaa) ikx.a(bcaa3, 3);
        this.d = (bcaa) ikx.a(bcaa4, 4);
        this.e = (bcaa) ikx.a(bcaa5, 5);
        this.f = (bcaa) ikx.a(bcaa6, 6);
        this.g = (bcaa) ikx.a(bcaa7, 7);
        this.h = (bcaa) ikx.a(bcaa8, 8);
        this.i = (bcaa) ikx.a(bcaa9, 9);
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
