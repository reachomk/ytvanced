package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: alkm */
final class alkm implements OnGlobalLayoutListener {
    private final /* synthetic */ alkc a;

    alkm(alkc alkc) {
        this.a = alkc;
    }

    public final void onGlobalLayout() {
        if (this.a.ad.getChildCount() <= 1) {
            return;
        }
        if (this.a.ae.getChildCount() == 0 || this.a.ae.getHeight() > 0) {
            this.a.ad.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a.f(true);
        }
    }
}
