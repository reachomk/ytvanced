package defpackage;

/* renamed from: uur */
public final class uur {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;

    public uur(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) uur.a(bcaa, 1);
        this.b = (bcaa) uur.a(bcaa2, 2);
        this.c = (bcaa) uur.a(bcaa3, 3);
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
