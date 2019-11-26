package defpackage;

/* renamed from: ynp */
public final class ynp {
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

    public ynp(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10) {
        this.a = (bcaa) ynp.a(bcaa, 1);
        this.b = (bcaa) ynp.a(bcaa2, 2);
        this.c = (bcaa) ynp.a(bcaa3, 3);
        this.d = (bcaa) ynp.a(bcaa4, 4);
        this.e = (bcaa) ynp.a(bcaa5, 5);
        this.f = (bcaa) ynp.a(bcaa6, 6);
        this.g = (bcaa) ynp.a(bcaa7, 7);
        this.h = (bcaa) ynp.a(bcaa8, 8);
        this.i = (bcaa) ynp.a(bcaa9, 9);
        this.j = (bcaa) ynp.a(bcaa10, 10);
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
