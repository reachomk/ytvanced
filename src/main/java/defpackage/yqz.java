package defpackage;

/* renamed from: yqz */
public final class yqz {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;

    public yqz(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) yqz.a(bcaa, 1);
        this.b = (bcaa) yqz.a(bcaa2, 2);
        this.c = (bcaa) yqz.a(bcaa3, 3);
        this.d = (bcaa) yqz.a(bcaa4, 4);
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
