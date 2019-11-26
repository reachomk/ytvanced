package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: gwz */
final class gwz implements OnGlobalLayoutListener {
    private final /* synthetic */ gwq a;

    gwz(gwq gwq) {
        this.a = gwq;
    }

    public final void onGlobalLayout() {
        this.a.af.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.f(true);
    }
}
