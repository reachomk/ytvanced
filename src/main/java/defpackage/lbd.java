package defpackage;

/* renamed from: lbd */
public final class lbd {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public lbd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) lbd.a(bcaa, 1);
        this.b = (bcaa) lbd.a(bcaa2, 2);
        this.c = (bcaa) lbd.a(bcaa3, 3);
        this.d = (bcaa) lbd.a(bcaa4, 4);
        this.e = (bcaa) lbd.a(bcaa5, 5);
        this.f = (bcaa) lbd.a(bcaa6, 6);
    }

    public final laz a(ajxx ajxx) {
        return new laz((fiz) lbd.a((fiz) this.a.get(), 1), (xci) lbd.a((xci) this.b.get(), 2), (fkz) lbd.a((fkz) this.c.get(), 3), (aaas) lbd.a((aaas) this.d.get(), 4), (acvx) lbd.a((acvx) this.e.get(), 5), (imj) lbd.a((imj) this.f.get(), 6), (ajxx) lbd.a(ajxx, 7));
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
