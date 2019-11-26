package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: aov */
public final class aov implements Runnable {
    private final /* synthetic */ RecyclerView a;

    public aov(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.a;
        if (recyclerView.s && !recyclerView.isLayoutRequested()) {
            recyclerView = this.a;
            if (!recyclerView.q) {
                recyclerView.requestLayout();
            } else if (recyclerView.u) {
                recyclerView.t = true;
            } else {
                recyclerView.e();
            }
        }
    }
}
