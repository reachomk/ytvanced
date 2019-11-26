package defpackage;

/* renamed from: gqt */
public final class gqt {
    private final bcaa a;

    public gqt(bcaa bcaa) {
        this.a = (bcaa) gqt.a(bcaa);
    }

    public final gqp a() {
        return new gqp((gqf) gqt.a((gqf) this.a.get()));
    }

    private static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }
}
