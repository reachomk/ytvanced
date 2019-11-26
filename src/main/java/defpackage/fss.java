package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: fss */
final class fss extends apv {
    public final /* synthetic */ fso a;

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i2 == 0) {
            recyclerView.post(new fsv(this));
        } else {
            this.a.b(i2);
        }
    }

    /* synthetic */ fss(fso fso) {
        this.a = fso;
    }
}
