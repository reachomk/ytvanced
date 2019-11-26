package defpackage;

/* renamed from: ypg */
public final class ypg {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;

    public ypg(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) ypg.a(bcaa, 1);
        this.b = (bcaa) ypg.a(bcaa2, 2);
        this.c = (bcaa) ypg.a(bcaa3, 3);
        this.d = (bcaa) ypg.a(bcaa4, 4);
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
