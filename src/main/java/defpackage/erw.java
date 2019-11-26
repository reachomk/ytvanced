package defpackage;

import android.content.Context;

/* renamed from: erw */
public final class erw {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public erw(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) erw.a(bcaa, 1);
        this.b = (bcaa) erw.a(bcaa2, 2);
        this.c = (bcaa) erw.a(bcaa3, 3);
        this.d = (bcaa) erw.a(bcaa4, 4);
        this.e = (bcaa) erw.a(bcaa5, 5);
    }

    public final ert a(int i) {
        return new ert((Context) erw.a((Context) this.a.get(), 1), (akvp) erw.a((akvp) this.b.get(), 2), (aaas) erw.a((aaas) this.c.get(), 3), (akkl) erw.a((akkl) this.d.get(), 4), (epv) erw.a((epv) this.e.get(), 5), i);
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
