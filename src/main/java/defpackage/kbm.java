package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: kbm */
final class kbm implements OnAttachStateChangeListener {
    private final /* synthetic */ int a;
    private final /* synthetic */ kbi b;

    kbm(kbi kbi, int i) {
        this.b = kbi;
        this.a = i;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.b.d.removeOnAttachStateChangeListener(this);
        this.b.d.measure(0, 0);
        this.b.b(this.a);
        this.b.d.requestLayout();
    }
}
