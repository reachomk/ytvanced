package defpackage;

/* renamed from: hrl */
public final class hrl {
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

    public hrl(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13) {
        this.a = (bcaa) hrl.a(bcaa, 1);
        this.b = (bcaa) hrl.a(bcaa2, 2);
        this.c = (bcaa) hrl.a(bcaa3, 3);
        this.d = (bcaa) hrl.a(bcaa4, 4);
        this.e = (bcaa) hrl.a(bcaa5, 5);
        this.f = (bcaa) hrl.a(bcaa6, 6);
        this.g = (bcaa) hrl.a(bcaa7, 7);
        this.h = (bcaa) hrl.a(bcaa8, 8);
        this.i = (bcaa) hrl.a(bcaa9, 9);
        this.j = (bcaa) hrl.a(bcaa10, 10);
        this.k = (bcaa) hrl.a(bcaa11, 11);
        this.l = (bcaa) hrl.a(bcaa12, 12);
        this.m = (bcaa) hrl.a(bcaa13, 13);
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
