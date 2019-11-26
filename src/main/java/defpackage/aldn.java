package defpackage;

/* renamed from: aldn */
public final class aldn {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;

    public aldn(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) aldn.a(bcaa, 1);
        this.b = (bcaa) aldn.a(bcaa2, 2);
        this.c = (bcaa) aldn.a(bcaa3, 3);
        this.d = (bcaa) aldn.a(bcaa4, 4);
        this.e = (bcaa) aldn.a(bcaa5, 5);
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
