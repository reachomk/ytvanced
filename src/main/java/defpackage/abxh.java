package defpackage;

/* renamed from: abxh */
public final class abxh {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;

    public abxh(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) abxh.a(bcaa, 1);
        this.b = (bcaa) abxh.a(bcaa2, 2);
        this.c = (bcaa) abxh.a(bcaa3, 3);
        this.d = (bcaa) abxh.a(bcaa4, 4);
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
