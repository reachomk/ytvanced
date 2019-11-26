package defpackage;

/* renamed from: wod */
public final class wod {
    public final bcaa a;
    public final bcaa b;

    public wod(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) wod.a(bcaa, 1);
        this.b = (bcaa) wod.a(bcaa2, 2);
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
