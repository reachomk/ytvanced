package defpackage;

/* renamed from: jja */
public final class jja {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    public jja(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = (bcaa) jja.a(bcaa, 1);
        this.b = (bcaa) jja.a(bcaa2, 2);
        this.c = (bcaa) jja.a(bcaa3, 3);
        this.d = (bcaa) jja.a(bcaa4, 4);
        this.e = (bcaa) jja.a(bcaa5, 5);
        this.f = (bcaa) jja.a(bcaa6, 6);
        this.g = (bcaa) jja.a(bcaa7, 7);
    }

    public final jip a(aana aana, acvx acvx, akyd akyd) {
        return new jip((akvz) jja.a((akvz) this.a.get(), 1), (xci) jja.a((xci) this.b.get(), 2), (xoi) jja.a((xoi) this.c.get(), 3), (akdk) jja.a((akdk) this.d.get(), 4), (xsc) jja.a((xsc) this.e.get(), 5), (har) jja.a((har) this.f.get(), 6), (amqp) jja.a((amqp) this.g.get(), 7), (aana) jja.a(aana, 8), (acvx) jja.a(acvx, 9), akyd);
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
