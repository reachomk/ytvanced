package defpackage;

/* renamed from: iiw */
public final class iiw {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;

    public iiw(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) iiw.a(bcaa, 1);
        this.b = (bcaa) iiw.a(bcaa2, 2);
        this.c = (bcaa) iiw.a(bcaa3, 3);
        this.d = (bcaa) iiw.a(bcaa4, 4);
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
