package defpackage;

/* renamed from: fru */
public final class fru {
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

    public fru(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11) {
        this.a = (bcaa) fru.a(bcaa, 1);
        this.b = (bcaa) fru.a(bcaa2, 2);
        this.c = (bcaa) fru.a(bcaa3, 3);
        this.d = (bcaa) fru.a(bcaa4, 4);
        this.e = (bcaa) fru.a(bcaa5, 5);
        this.f = (bcaa) fru.a(bcaa6, 6);
        this.g = (bcaa) fru.a(bcaa7, 7);
        this.h = (bcaa) fru.a(bcaa8, 8);
        this.i = (bcaa) fru.a(bcaa9, 9);
        this.j = (bcaa) fru.a(bcaa10, 10);
        this.k = (bcaa) fru.a(bcaa11, 11);
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
