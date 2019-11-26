package defpackage;

import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: avb */
public final class avb implements OnPreDrawListener {
    private final /* synthetic */ CoordinatorLayout a;

    public avb(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.a.a(0);
        return true;
    }
}
