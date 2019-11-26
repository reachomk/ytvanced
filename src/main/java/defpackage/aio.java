package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: aio */
final class aio implements OnGlobalLayoutListener {
    private final /* synthetic */ ail a;

    aio(ail ail) {
        this.a = ail;
    }

    public final void onGlobalLayout() {
        if (this.a.e() && this.a.b.size() > 0 && !((air) this.a.b.get(0)).a.q) {
            View view = this.a.d;
            if (view == null || !view.isShown()) {
                this.a.d();
                return;
            }
            for (air air : this.a.b) {
                air.a.f_();
            }
        }
    }
}
