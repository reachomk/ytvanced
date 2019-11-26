package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: aox */
public final class aox implements Runnable {
    private final /* synthetic */ RecyclerView a;

    public aox(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        aph aph = this.a.D;
        if (aph != null) {
            aph.a();
        }
        this.a.P = false;
    }
}
