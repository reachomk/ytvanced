package defpackage;

/* renamed from: hhj */
public final class hhj {
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

    public hhj(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12) {
        this.a = (bcaa) hhj.a(bcaa, 1);
        this.b = (bcaa) hhj.a(bcaa2, 2);
        this.c = (bcaa) hhj.a(bcaa3, 3);
        this.d = (bcaa) hhj.a(bcaa4, 4);
        this.e = (bcaa) hhj.a(bcaa5, 5);
        this.f = (bcaa) hhj.a(bcaa6, 6);
        this.g = (bcaa) hhj.a(bcaa7, 7);
        this.h = (bcaa) hhj.a(bcaa8, 8);
        this.i = (bcaa) hhj.a(bcaa9, 9);
        this.j = (bcaa) hhj.a(bcaa10, 10);
        this.k = (bcaa) hhj.a(bcaa11, 11);
        this.l = (bcaa) hhj.a(bcaa12, 12);
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
