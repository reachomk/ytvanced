package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

/* renamed from: ain */
final class ain implements OnAttachStateChangeListener {
    private final /* synthetic */ ail a;

    ain(ail ail) {
        this.a = ail;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.e = view.getViewTreeObserver();
            }
            ail ail = this.a;
            ail.e.removeGlobalOnLayoutListener(ail.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
