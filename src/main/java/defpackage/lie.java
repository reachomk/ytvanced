package defpackage;

/* renamed from: lie */
public final class lie {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;

    public lie(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) lie.a(bcaa, 1);
        this.b = (bcaa) lie.a(bcaa2, 2);
        this.c = (bcaa) lie.a(bcaa3, 3);
        this.d = (bcaa) lie.a(bcaa4, 4);
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
