package defpackage;

/* renamed from: yrq */
public final class yrq {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;

    public yrq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) yrq.a(bcaa, 1);
        this.b = (bcaa) yrq.a(bcaa2, 2);
        this.c = (bcaa) yrq.a(bcaa3, 3);
        this.d = (bcaa) yrq.a(bcaa4, 4);
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
