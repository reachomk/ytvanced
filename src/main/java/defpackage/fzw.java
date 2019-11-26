package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: fzw */
final class fzw extends apv implements apz {
    public final Runnable a = new fzz(this);
    public final RecyclerView b;
    public final ent c;
    public final /* synthetic */ fzu d;

    public fzw(fzu fzu, RecyclerView recyclerView, ent ent) {
        this.d = fzu;
        this.b = recyclerView;
        this.c = ent;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i != 2) {
            this.d.a.a();
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.d.a.a();
    }

    public final void a(aqj aqj) {
        this.b.removeCallbacks(this.a);
        this.b.post(this.a);
    }
}
