package defpackage;

/* renamed from: lbv */
public final class lbv {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;

    public lbv(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) lbv.a(bcaa, 1);
        this.b = (bcaa) lbv.a(bcaa2, 2);
        this.c = (bcaa) lbv.a(bcaa3, 3);
        this.d = (bcaa) lbv.a(bcaa4, 4);
        this.e = (bcaa) lbv.a(bcaa5, 5);
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
