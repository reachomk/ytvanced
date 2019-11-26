package defpackage;

/* renamed from: kdv */
final class kdv {
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
    public final bcaa o;
    public final bcaa p;

    kdv(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14, bcaa bcaa15, bcaa bcaa16) {
        bcaa bcaa17 = bcaa;
        this.a = (bcaa) kdv.a(bcaa, 1);
        bcaa17 = bcaa2;
        this.b = (bcaa) kdv.a(bcaa2, 2);
        bcaa17 = bcaa3;
        this.c = (bcaa) kdv.a(bcaa3, 3);
        bcaa17 = bcaa4;
        this.d = (bcaa) kdv.a(bcaa4, 4);
        bcaa17 = bcaa5;
        this.e = (bcaa) kdv.a(bcaa5, 5);
        bcaa17 = bcaa6;
        this.f = (bcaa) kdv.a(bcaa6, 6);
        bcaa17 = bcaa7;
        this.g = (bcaa) kdv.a(bcaa7, 7);
        bcaa17 = bcaa8;
        this.h = (bcaa) kdv.a(bcaa8, 8);
        bcaa17 = bcaa9;
        this.i = (bcaa) kdv.a(bcaa9, 9);
        bcaa17 = bcaa10;
        this.j = (bcaa) kdv.a(bcaa10, 10);
        bcaa17 = bcaa11;
        this.k = (bcaa) kdv.a(bcaa11, 11);
        bcaa17 = bcaa12;
        this.l = (bcaa) kdv.a(bcaa12, 12);
        this.m = (bcaa) kdv.a(bcaa13, 13);
        this.n = (bcaa) kdv.a(bcaa14, 14);
        this.o = (bcaa) kdv.a(bcaa15, 15);
        this.p = (bcaa) kdv.a(bcaa16, 16);
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
