package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mus */
final class mus extends apv {
    private final anm a;
    private final AtomicBoolean b;

    public mus(anm anm, AtomicBoolean atomicBoolean) {
        this.a = anm;
        this.b = atomicBoolean;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            i = this.a.p();
            int r = this.a.r();
            for (i = Math.max(0, i); i <= r; i++) {
                muv muv = (muv) recyclerView.a(i, false);
                if (muv != null) {
                    muv.u();
                }
            }
            return;
        }
        this.b.set(true);
    }
}
