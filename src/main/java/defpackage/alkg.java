package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: alkg */
final class alkg implements OnGlobalLayoutListener {
    private final /* synthetic */ alkc a;

    alkg(alkc alkc) {
        this.a = alkc;
    }

    public final void onGlobalLayout() {
        alkc alkc = this.a;
        alkc.ap.removeCallbacks(alkc.ak);
        alkc = this.a;
        alkc.ap.post(alkc.ak);
    }
}
