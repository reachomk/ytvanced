package defpackage;

/* renamed from: yqe */
public final class yqe {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final bcaa h;

    public yqe(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        this.a = (bcaa) yqe.a(bcaa, 1);
        this.b = (bcaa) yqe.a(bcaa2, 2);
        this.c = (bcaa) yqe.a(bcaa3, 3);
        this.d = (bcaa) yqe.a(bcaa4, 4);
        this.e = (bcaa) yqe.a(bcaa5, 5);
        this.f = (bcaa) yqe.a(bcaa6, 6);
        this.g = (bcaa) yqe.a(bcaa7, 7);
        this.h = (bcaa) yqe.a(bcaa8, 8);
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
