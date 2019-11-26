package defpackage;

/* renamed from: ztq */
public final class ztq {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;

    public ztq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) ztq.a(bcaa, 1);
        this.b = (bcaa) ztq.a(bcaa2, 2);
        this.c = (bcaa) ztq.a(bcaa3, 3);
        this.d = (bcaa) ztq.a(bcaa4, 4);
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
