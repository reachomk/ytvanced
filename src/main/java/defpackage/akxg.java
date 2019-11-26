package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: akxg */
final class akxg extends apv {
    private final /* synthetic */ akwy a;

    public final void a(RecyclerView recyclerView, int i, int i2) {
        apn apn = recyclerView.n;
        if (apn instanceof ans) {
            this.a.p = ((ans) apn).p();
        }
    }

    public final void a(RecyclerView recyclerView, int i) {
        akwy akwy = this.a;
        Runnable runnable = akwy.m;
        if (runnable == null) {
            return;
        }
        if (i == 1) {
            akwy.m = null;
        } else if (i == 0) {
            recyclerView.post(runnable);
            akwy.m = null;
        }
    }

    /* synthetic */ akxg(akwy akwy) {
        this.a = akwy;
    }
}
