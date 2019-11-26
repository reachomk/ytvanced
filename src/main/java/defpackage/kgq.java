package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kgq */
public final class kgq extends kgp {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;

    public kgq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9) {
        this.a = (bcaa) kgq.a(bcaa, 1);
        this.b = (bcaa) kgq.a(bcaa2, 2);
        this.c = (bcaa) kgq.a(bcaa3, 3);
        this.d = (bcaa) kgq.a(bcaa4, 4);
        this.e = (bcaa) kgq.a(bcaa5, 5);
        this.f = (bcaa) kgq.a(bcaa6, 6);
        this.g = (bcaa) kgq.a(bcaa7, 7);
        this.h = (bcaa) kgq.a(bcaa8, 8);
        this.i = (bcaa) kgq.a(bcaa9, 9);
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

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new kgn((Context) kgq.a((Context) this.a.get(), 1), (xci) kgq.a((xci) this.b.get(), 2), (akvo) kgq.a((akvo) this.c.get(), 3), (fhu) kgq.a((fhu) this.d.get(), 4), (aizy) kgq.a((aizy) this.e.get(), 5), (ekz) kgq.a((ekz) this.f.get(), 6), (lum) kgq.a((lum) this.g.get(), 7), (aaas) kgq.a((aaas) this.h.get(), 8), (ltz) kgq.a((ltz) this.i.get(), 9), viewGroup);
    }
}
