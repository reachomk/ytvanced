package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: abqd */
public final class abqd {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;
    private final bcaa k;

    public abqd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11) {
        this.a = (bcaa) abqd.a(bcaa, 1);
        this.b = (bcaa) abqd.a(bcaa2, 2);
        this.c = (bcaa) abqd.a(bcaa3, 3);
        this.d = (bcaa) abqd.a(bcaa4, 4);
        this.e = (bcaa) abqd.a(bcaa5, 5);
        this.f = (bcaa) abqd.a(bcaa6, 6);
        this.g = (bcaa) abqd.a(bcaa7, 7);
        this.h = (bcaa) abqd.a(bcaa8, 8);
        this.i = (bcaa) abqd.a(bcaa9, 9);
        this.j = (bcaa) abqd.a(bcaa10, 10);
        this.k = (bcaa) abqd.a(bcaa11, 11);
    }

    public final abpo a(aboq aboq) {
        abqd.a((Context) this.a.get(), 1);
        return new abpo((abbj) abqd.a((abbj) this.b.get(), 2), (abbf) abqd.a((abbf) this.c.get(), 3), (afxb) abqd.a((afxb) this.d.get(), 4), (xci) abqd.a((xci) this.e.get(), 5), (aizy) abqd.a((aizy) this.f.get(), 6), (xoi) abqd.a((xoi) this.g.get(), 7), (acvx) abqd.a((acvx) this.h.get(), 8), (Handler) abqd.a((Handler) this.i.get(), 9), (akti) abqd.a((akti) this.j.get(), 10), (abrj) abqd.a((abrj) this.k.get(), 11), (aboq) abqd.a(aboq, 12));
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
