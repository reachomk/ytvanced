package defpackage;

/* renamed from: weg */
public final class weg {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public weg(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) weg.a(bcaa, 1);
        this.b = (bcaa) weg.a(bcaa2, 2);
        this.c = (bcaa) weg.a(bcaa3, 3);
        this.d = (bcaa) weg.a(bcaa4, 4);
        this.e = (bcaa) weg.a(bcaa5, 5);
    }

    public final web a(ajst ajst, aana aana, acvx acvx) {
        return new web((akvz) weg.a((akvz) this.a.get(), 1), (xci) weg.a((xci) this.b.get(), 2), (xoi) weg.a((xoi) this.c.get(), 3), (wek) weg.a((wek) this.d.get(), 4), (akdk) weg.a((akdk) this.e.get(), 5), (ajst) weg.a(ajst, 6), (aana) weg.a(aana, 7), (acvx) weg.a(acvx, 8));
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
