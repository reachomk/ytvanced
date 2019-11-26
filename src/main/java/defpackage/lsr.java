package defpackage;

/* renamed from: lsr */
public final class lsr {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;

    public lsr(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) lsr.a(bcaa, 1);
        this.b = (bcaa) lsr.a(bcaa2, 2);
        this.c = (bcaa) lsr.a(bcaa3, 3);
        this.d = (bcaa) lsr.a(bcaa4, 4);
        this.e = (bcaa) lsr.a(bcaa5, 5);
        this.f = (bcaa) lsr.a(bcaa6, 6);
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
