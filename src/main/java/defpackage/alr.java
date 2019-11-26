package defpackage;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: alr */
final class alr implements OnDismissListener {
    private final /* synthetic */ OnGlobalLayoutListener a;
    private final /* synthetic */ alq b;

    alr(alq alq, OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = alq;
        this.a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
