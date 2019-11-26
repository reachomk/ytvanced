package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: ajs */
final class ajs implements OnGlobalLayoutListener {
    private final /* synthetic */ ajp a;

    ajs(ajp ajp) {
        this.a = ajp;
    }

    public final void onGlobalLayout() {
        if (this.a.e()) {
            ajp ajp = this.a;
            if (!ajp.a.q) {
                View view = ajp.c;
                if (view == null || !view.isShown()) {
                    this.a.d();
                } else {
                    this.a.a.f_();
                }
            }
        }
    }
}
