package defpackage;

import android.content.Context;

/* renamed from: kns */
public final class kns {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;

    public kns(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        this.a = (bcaa) kns.a(bcaa, 1);
        this.b = (bcaa) kns.a(bcaa2, 2);
        this.c = (bcaa) kns.a(bcaa3, 3);
        this.d = (bcaa) kns.a(bcaa4, 4);
        this.e = (bcaa) kns.a(bcaa5, 5);
        this.f = (bcaa) kns.a(bcaa6, 6);
        this.g = (bcaa) kns.a(bcaa7, 7);
        this.h = (bcaa) kns.a(bcaa8, 8);
    }

    public final knr a(int i) {
        return new knr((Context) kns.a((Context) this.a.get(), 1), (akkq) kns.a((akkq) this.b.get(), 2), (aaas) kns.a((aaas) this.c.get(), 3), (gal) kns.a((gal) this.d.get(), 4), (akvp) kns.a((akvp) this.e.get(), 5), (hmc) kns.a((hmc) this.f.get(), 6), (xsc) kns.a((xsc) this.g.get(), 7), (gak) kns.a((gak) this.h.get(), 8), i);
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
