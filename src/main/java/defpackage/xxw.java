package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: xxw */
final class xxw implements Runnable {
    private final /* synthetic */ xxp a;

    xxw(xxp xxp) {
        this.a = xxp;
    }

    public final void run() {
        xxp xxp = this.a;
        if (xxp.m != null) {
            int max = Math.max(xxp.g.d() - 1, 0);
            ((RecyclerView) this.a.m.z()).c(max);
            this.a.k.b = max;
        }
    }
}
