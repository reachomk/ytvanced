package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: em */
final class em implements Runnable {
    private final CoordinatorLayout a;
    private final View b;
    private final /* synthetic */ en c;

    em(en enVar, CoordinatorLayout coordinatorLayout, View view) {
        this.c = enVar;
        this.a = coordinatorLayout;
        this.b = view;
    }

    public final void run() {
        if (this.b != null) {
            OverScroller overScroller = this.c.c;
            if (overScroller == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                en enVar = this.c;
                enVar.a_(this.a, this.b, enVar.c.getCurrY());
                abe.a(this.b, (Runnable) this);
                return;
            }
            this.c.a(this.a, this.b);
        }
    }
}
