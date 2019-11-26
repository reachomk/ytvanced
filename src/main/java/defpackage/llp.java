package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: llp */
public final class llp extends llh {
    public llp(eif eif) {
        super("SWIM", eif);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent, ejd ejd) {
        if (ejd.d()) {
            llc llc = this.a;
            lla a = llc != null ? llc.a(2) : null;
            if (a != null && !llh.a(motionEvent, a.k())) {
                b();
            }
        }
    }
}
