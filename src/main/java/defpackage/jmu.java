package defpackage;

/* renamed from: jmu */
public final class jmu {
    public final bcaa a;

    public jmu(bcaa bcaa) {
        this.a = (bcaa) jmu.a(bcaa, 1);
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
