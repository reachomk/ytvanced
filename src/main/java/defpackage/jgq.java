package defpackage;

/* renamed from: jgq */
public final class jgq {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;

    public jgq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) jgq.a(bcaa, 1);
        this.b = (bcaa) jgq.a(bcaa2, 2);
        this.c = (bcaa) jgq.a(bcaa3, 3);
        this.d = (bcaa) jgq.a(bcaa4, 4);
        this.e = (bcaa) jgq.a(bcaa5, 5);
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
