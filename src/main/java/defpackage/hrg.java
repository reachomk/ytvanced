package defpackage;

/* renamed from: hrg */
public final class hrg {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final bcaa h;
    public final bcaa i;

    public hrg(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9) {
        this.a = (bcaa) hrg.a(bcaa, 1);
        this.b = (bcaa) hrg.a(bcaa2, 2);
        this.c = (bcaa) hrg.a(bcaa3, 3);
        this.d = (bcaa) hrg.a(bcaa4, 4);
        this.e = (bcaa) hrg.a(bcaa5, 5);
        this.f = (bcaa) hrg.a(bcaa6, 6);
        this.g = (bcaa) hrg.a(bcaa7, 7);
        this.h = (bcaa) hrg.a(bcaa8, 8);
        this.i = (bcaa) hrg.a(bcaa9, 9);
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
