package defpackage;

/* renamed from: lbj */
public final class lbj {
    public final bcaa a;

    public lbj(bcaa bcaa) {
        this.a = (bcaa) lbj.a(bcaa, 1);
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
