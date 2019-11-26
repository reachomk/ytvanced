package defpackage;

/* renamed from: xxe */
public final class xxe {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;

    public xxe(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) xxe.a(bcaa, 1);
        this.b = (bcaa) xxe.a(bcaa2, 2);
        this.c = (bcaa) xxe.a(bcaa3, 3);
        this.d = (bcaa) xxe.a(bcaa4, 4);
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
