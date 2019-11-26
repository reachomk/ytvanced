package defpackage;

/* renamed from: hqz */
public final class hqz {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;

    public hqz(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) hqz.a(bcaa, 1);
        this.b = (bcaa) hqz.a(bcaa2, 2);
        this.c = (bcaa) hqz.a(bcaa3, 3);
        this.d = (bcaa) hqz.a(bcaa4, 4);
        this.e = (bcaa) hqz.a(bcaa5, 5);
        this.f = (bcaa) hqz.a(bcaa6, 6);
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
