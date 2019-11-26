package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: fly */
public final class fly {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;

    public fly(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9) {
        this.a = (bcaa) fly.a(bcaa, 1);
        this.b = (bcaa) fly.a(bcaa2, 2);
        this.c = (bcaa) fly.a(bcaa3, 3);
        this.d = (bcaa) fly.a(bcaa4, 4);
        this.e = (bcaa) fly.a(bcaa5, 5);
        this.f = (bcaa) fly.a(bcaa6, 6);
        this.g = (bcaa) fly.a(bcaa7, 7);
        this.h = (bcaa) fly.a(bcaa8, 8);
        this.i = (bcaa) fly.a(bcaa9, 9);
    }

    public final flw a(foi foi, RecyclerView recyclerView, aana aana, akwb akwb, acvx acvx, akpb akpb, akxw akxw, akxj akxj, int i, akhs akhs, syb syb) {
        foi foi2 = foi;
        int i2 = i;
        akpe akpe = (akpe) fly.a((akpe) this.a.get(), 1);
        akwn akwn = (akwn) fly.a((akwn) this.b.get(), 2);
        xci xci = (xci) fly.a((xci) this.c.get(), 3);
        xoi xoi = (xoi) fly.a((xoi) this.d.get(), 4);
        fly.a((zyw) this.e.get(), 5);
        return new flw(akpe, akwn, xci, xoi, (zzl) fly.a((zzl) this.f.get(), 6), (akei) fly.a((akei) this.g.get(), 7), (sxd) fly.a((sxd) this.h.get(), 8), (aket) fly.a((aket) this.i.get(), 9), null, foi2, (RecyclerView) fly.a(recyclerView, 12), (aana) fly.a(aana, 13), (akwb) fly.a(akwb, 14), (acvx) fly.a(acvx, 15), (akpb) fly.a(akpb, 16), (akxw) fly.a(akxw, 17), (akxj) fly.a(akxj, 18), i2, (akhs) fly.a(akhs, 20), (syb) fly.a(syb, 21));
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
