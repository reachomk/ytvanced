package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: zba */
final class zba implements Runnable {
    private final /* synthetic */ zax a;

    zba(zax zax) {
        this.a = zax;
    }

    public final void run() {
        zax zax = this.a;
        RecyclerView recyclerView = zax.a;
        if (recyclerView != null) {
            apa apa = recyclerView.m;
            if (apa != null && zax.b < apa.a()) {
                zax = this.a;
                zax.a.c(zax.b);
            }
        }
    }
}
