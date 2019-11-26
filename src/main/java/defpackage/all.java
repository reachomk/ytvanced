package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: all */
public final class all implements OnGlobalLayoutListener {
    private final /* synthetic */ AppCompatSpinner a;

    public all(AppCompatSpinner appCompatSpinner) {
        this.a = appCompatSpinner;
    }

    public final void onGlobalLayout() {
        if (!this.a.b.e()) {
            this.a.a();
        }
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
