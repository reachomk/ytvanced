package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: uxm */
final class uxm implements OnGlobalLayoutListener {
    private final /* synthetic */ uxk a;

    uxm(uxk uxk) {
        this.a = uxk;
    }

    public final void onGlobalLayout() {
        if (this.a.a.getVisibility() == 0) {
            uxk uxk = this.a;
            if (!uxk.c) {
                aanv aanv = uxk.b;
                if (aanv != null && aanv.d()) {
                    this.a.a.requestFocus();
                    this.a.a.sendAccessibilityEvent(8);
                    this.a.c = true;
                }
            }
        }
    }
}
