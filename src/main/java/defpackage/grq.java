package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/* renamed from: grq */
public final class grq {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public grq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) grq.a(bcaa, 1);
        this.b = (bcaa) grq.a(bcaa2, 2);
        this.c = (bcaa) grq.a(bcaa3, 3);
        this.d = (bcaa) grq.a(bcaa4, 4);
        this.e = (bcaa) grq.a(bcaa5, 5);
        this.f = (bcaa) grq.a(bcaa6, 6);
    }

    public final grl a(grr grr, RecyclerView recyclerView, apxu apxu, acvx acvx, ayvv ayvv) {
        grr grr2 = grr;
        return new grl((Context) grq.a((Context) this.a.get(), 1), (akpe) grq.a((akpe) this.b.get(), 2), (akvz) grq.a((akvz) this.c.get(), 3), (aaas) grq.a((aaas) this.d.get(), 4), (acum) grq.a((acum) this.e.get(), 5), (xuu) grq.a((xuu) this.f.get(), 6), (grr) grq.a(grr, 7), (RecyclerView) grq.a(recyclerView, 8), (apxu) grq.a(apxu, 9), (acvx) grq.a(acvx, 10), (ayvv) grq.a(ayvv, 11));
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
