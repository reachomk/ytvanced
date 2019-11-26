package defpackage;

/* renamed from: ltk */
public final class ltk {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final bcaa h;
    public final bcaa i;
    public final bcaa j;
    public final bcaa k;
    public final bcaa l;
    public final bcaa m;
    public final bcaa n;

    public ltk(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14) {
        this.a = (bcaa) ltk.a(bcaa, 1);
        this.b = (bcaa) ltk.a(bcaa2, 2);
        this.c = (bcaa) ltk.a(bcaa3, 3);
        this.d = (bcaa) ltk.a(bcaa4, 4);
        this.e = (bcaa) ltk.a(bcaa5, 5);
        this.f = (bcaa) ltk.a(bcaa6, 6);
        this.g = (bcaa) ltk.a(bcaa7, 7);
        this.h = (bcaa) ltk.a(bcaa8, 8);
        this.i = (bcaa) ltk.a(bcaa9, 9);
        this.j = (bcaa) ltk.a(bcaa10, 10);
        this.k = (bcaa) ltk.a(bcaa11, 11);
        this.l = (bcaa) ltk.a(bcaa12, 12);
        this.m = (bcaa) ltk.a(bcaa13, 13);
        this.n = (bcaa) ltk.a(bcaa14, 14);
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
