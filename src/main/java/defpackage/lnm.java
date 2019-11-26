package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: lnm */
public final class lnm extends llh {
    public boolean c;

    public lnm(eif eif, elu elu) {
        super("SWVR", eif);
        elu.a(2, new lno(this));
    }

    public final boolean a(View view, float f, float f2) {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent, ejd ejd) {
        if (ejd == ejd.VIRTUAL_REALITY_FULLSCREEN) {
            b();
            return;
        }
        if (this.c) {
            llc llc = this.a;
            lla a = llc != null ? llc.a() : null;
            if (a != null && llh.a(motionEvent, a.i())) {
                b();
            }
        }
    }
}
