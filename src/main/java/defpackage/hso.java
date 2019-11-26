package defpackage;

/* renamed from: hso */
public final class hso {
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

    public hso(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10) {
        this.a = (bcaa) hso.a(bcaa, 1);
        this.b = (bcaa) hso.a(bcaa2, 2);
        this.c = (bcaa) hso.a(bcaa3, 3);
        this.d = (bcaa) hso.a(bcaa4, 4);
        this.e = (bcaa) hso.a(bcaa5, 5);
        this.f = (bcaa) hso.a(bcaa6, 6);
        this.g = (bcaa) hso.a(bcaa7, 7);
        this.h = (bcaa) hso.a(bcaa8, 8);
        this.i = (bcaa) hso.a(bcaa9, 9);
        this.j = (bcaa) hso.a(bcaa10, 10);
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
