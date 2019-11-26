package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: guk */
final class guk extends apv {
    private final /* synthetic */ gub a;

    guk(gub gub) {
        this.a = gub;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 1) {
            ffg ffg = this.a.al;
            fff fff = ffg.e;
            if (fff != null) {
                ffk b = ffg.b(fff);
                if (b != null) {
                    b.a();
                }
            }
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        ffg ffg = this.a.al;
        fff fff = ffg.e;
        if (fff != null) {
            ffk b = ffg.b(fff);
            if (b != null) {
                b.a(recyclerView, i2);
            }
        }
    }
}
