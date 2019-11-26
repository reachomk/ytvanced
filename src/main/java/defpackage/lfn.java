package defpackage;

/* renamed from: lfn */
public final class lfn {
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

    public lfn(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11) {
        this.a = (bcaa) lfn.a(bcaa, 1);
        this.b = (bcaa) lfn.a(bcaa2, 2);
        this.c = (bcaa) lfn.a(bcaa3, 3);
        this.d = (bcaa) lfn.a(bcaa4, 4);
        this.e = (bcaa) lfn.a(bcaa5, 5);
        this.f = (bcaa) lfn.a(bcaa6, 6);
        this.g = (bcaa) lfn.a(bcaa7, 7);
        this.h = (bcaa) lfn.a(bcaa8, 8);
        this.i = (bcaa) lfn.a(bcaa9, 9);
        this.j = (bcaa) lfn.a(bcaa10, 10);
        this.k = (bcaa) lfn.a(bcaa11, 11);
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
