package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: juw */
final class juw extends apv implements apz {
    public final Runnable a = new juz(this);
    public final RecyclerView b;
    public final ent c;
    public boolean d;
    public final /* synthetic */ juv e;

    juw(juv juv, RecyclerView recyclerView, ent ent) {
        this.e = juv;
        this.b = recyclerView;
        this.c = ent;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (foh.I(this.e.a)) {
            if (!this.d) {
                this.e.b.f();
            }
            return;
        }
        ffx ffx = this.e;
        ffx.c.a(ffx, 0);
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 || i == 1) {
            this.d = false;
        }
    }

    public final void a(aqj aqj) {
        RecyclerView recyclerView = this.b;
        recyclerView.removeCallbacks(this.a);
        recyclerView.post(this.a);
    }
}
