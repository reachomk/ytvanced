package defpackage;

/* renamed from: wqd */
public final class wqd {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;

    public wqd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) wqd.a(bcaa, 1);
        this.b = (bcaa) wqd.a(bcaa2, 2);
        this.c = (bcaa) wqd.a(bcaa3, 3);
        this.d = (bcaa) wqd.a(bcaa4, 4);
        this.e = (bcaa) wqd.a(bcaa5, 5);
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
