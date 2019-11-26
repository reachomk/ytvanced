package defpackage;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: joy */
final class joy implements OnGlobalLayoutListener {
    private final /* synthetic */ ViewTreeObserver a;
    private final /* synthetic */ jou b;

    joy(jou jou, ViewTreeObserver viewTreeObserver) {
        this.b = jou;
        this.a = viewTreeObserver;
    }

    public final void onGlobalLayout() {
        this.a.removeOnGlobalLayoutListener(this);
        this.b.d();
    }
}
