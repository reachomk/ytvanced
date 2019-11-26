package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;

/* renamed from: ajr */
final class ajr implements OnAttachStateChangeListener {
    private final /* synthetic */ ajp a;

    ajr(ajp ajp) {
        this.a = ajp;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.a.d = view.getViewTreeObserver();
            }
            ajp ajp = this.a;
            ajp.d.removeGlobalOnLayoutListener(ajp.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
