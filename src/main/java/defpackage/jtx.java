package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/* renamed from: jtx */
public final class jtx {
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
    private final bcaa l;
    private final bcaa m;
    private final bcaa n;
    private final bcaa o;
    private final bcaa p;

    public jtx(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14, bcaa bcaa15, bcaa bcaa16, bcaa bcaa17) {
        bcaa bcaa18 = bcaa;
        this.a = (bcaa) jtx.a(bcaa, 1);
        bcaa18 = bcaa2;
        this.b = (bcaa) jtx.a(bcaa2, 2);
        bcaa18 = bcaa3;
        this.c = (bcaa) jtx.a(bcaa3, 3);
        bcaa18 = bcaa4;
        this.d = (bcaa) jtx.a(bcaa4, 4);
        bcaa18 = bcaa5;
        this.e = (bcaa) jtx.a(bcaa5, 5);
        bcaa18 = bcaa6;
        this.f = (bcaa) jtx.a(bcaa6, 6);
        bcaa18 = bcaa7;
        this.g = (bcaa) jtx.a(bcaa7, 7);
        bcaa18 = bcaa8;
        jtx.a(bcaa8, 8);
        bcaa18 = bcaa9;
        this.h = (bcaa) jtx.a(bcaa9, 9);
        bcaa18 = bcaa10;
        this.i = (bcaa) jtx.a(bcaa10, 10);
        bcaa18 = bcaa11;
        this.j = (bcaa) jtx.a(bcaa11, 11);
        bcaa18 = bcaa12;
        this.k = (bcaa) jtx.a(bcaa12, 12);
        this.l = (bcaa) jtx.a(bcaa13, 13);
        this.m = (bcaa) jtx.a(bcaa14, 14);
        this.n = (bcaa) jtx.a(bcaa15, 15);
        this.o = (bcaa) jtx.a(bcaa16, 16);
        this.p = (bcaa) jtx.a(bcaa17, 17);
    }

    public final jts a(akyd akyd, acvx acvx, RecyclerView recyclerView, aana aana, akwb akwb, akxw akxw, akxj akxj, int i, akhs akhs, syb syb) {
        akyd akyd2 = akyd;
        int i2 = i;
        Context context = (Context) jtx.a((Context) this.a.get(), 1);
        akwn akwn = (akwn) jtx.a((akwn) this.b.get(), 2);
        xci xci = (xci) jtx.a((xci) this.c.get(), 3);
        xoi xoi = (xoi) jtx.a((xoi) this.d.get(), 4);
        epf epf = (epf) jtx.a((epf) this.e.get(), 5);
        jvf jvf = (jvf) jtx.a((jvf) this.f.get(), 6);
        fzy fzy = (fzy) jtx.a((fzy) this.g.get(), 7);
        juy juy = (juy) jtx.a((juy) this.p.get(), 8);
        eti eti = (eti) jtx.a((eti) this.h.get(), 9);
        akpe akpe = (akpe) jtx.a((akpe) this.i.get(), 10);
        jtx.a((zyw) this.j.get(), 11);
        return new jts(context, akwn, xci, xoi, epf, jvf, fzy, juy, eti, akpe, (zzl) jtx.a((zzl) this.k.get(), 12), (akei) jtx.a((akei) this.l.get(), 13), (sxd) jtx.a((sxd) this.m.get(), 14), (aket) jtx.a((aket) this.n.get(), 15), (foi) jtx.a((foi) this.o.get(), 16), akyd2, (acvx) jtx.a(acvx, 18), (RecyclerView) jtx.a(recyclerView, 19), (aana) jtx.a(aana, 20), (akwb) jtx.a(akwb, 21), (akxw) jtx.a(akxw, 22), (akxj) jtx.a(akxj, 23), i2, (akhs) jtx.a(akhs, 25), (syb) jtx.a(syb, 26));
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
