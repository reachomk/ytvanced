package defpackage;

/* renamed from: gqj */
public final class gqj {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public gqj(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) gqj.a(bcaa, 1);
        this.b = (bcaa) gqj.a(bcaa2, 2);
        this.c = (bcaa) gqj.a(bcaa3, 3);
    }

    public final gqh a() {
        return new gqh((gqm) gqj.a((gqm) this.a.get(), 1), (xsc) gqj.a((xsc) this.b.get(), 2), (abfd) gqj.a((abfd) this.c.get(), 3));
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
