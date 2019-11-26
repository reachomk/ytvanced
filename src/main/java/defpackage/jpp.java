package defpackage;

import android.content.Context;

/* renamed from: jpp */
public final class jpp {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public jpp(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) jpp.a(bcaa, 1);
        this.b = (bcaa) jpp.a(bcaa2, 2);
        this.c = (bcaa) jpp.a(bcaa3, 3);
        this.d = (bcaa) jpp.a(bcaa4, 4);
        this.e = (bcaa) jpp.a(bcaa5, 5);
    }

    public final jpq a(acvx acvx, aphg aphg, int i) {
        return new jpq((aaas) jpp.a((aaas) this.a.get(), 1), (akvp) jpp.a((akvp) this.b.get(), 2), (fmx) jpp.a((fmx) this.c.get(), 3), (zyw) jpp.a((zyw) this.d.get(), 4), (Context) jpp.a((Context) this.e.get(), 5), (acvx) jpp.a(acvx, 6), (aphg) jpp.a(aphg, 7), i);
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
