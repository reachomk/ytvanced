package defpackage;

/* renamed from: addw */
public final class addw {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final bcaa h;
    public final bcaa i;

    public addw(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9) {
        this.a = (bcaa) addw.a(bcaa, 1);
        this.b = (bcaa) addw.a(bcaa2, 2);
        this.c = (bcaa) addw.a(bcaa3, 3);
        this.d = (bcaa) addw.a(bcaa4, 4);
        this.e = (bcaa) addw.a(bcaa5, 5);
        this.f = (bcaa) addw.a(bcaa6, 6);
        this.g = (bcaa) addw.a(bcaa7, 7);
        this.h = (bcaa) addw.a(bcaa8, 8);
        this.i = (bcaa) addw.a(bcaa9, 9);
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
