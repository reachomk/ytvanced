package defpackage;

/* renamed from: wnq */
public final class wnq {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;

    public wnq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) wnq.a(bcaa, 1);
        this.b = (bcaa) wnq.a(bcaa2, 2);
        this.c = (bcaa) wnq.a(bcaa3, 3);
        this.d = (bcaa) wnq.a(bcaa4, 4);
        this.e = (bcaa) wnq.a(bcaa5, 5);
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
