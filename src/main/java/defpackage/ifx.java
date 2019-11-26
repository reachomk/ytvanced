package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: ifx */
final class ifx implements OnAttachStateChangeListener {
    private final /* synthetic */ ifl a;

    ifx(ifl ifl) {
        this.a = ifl;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        ifl ifl = this.a;
        ifl.C.a(ifl.l);
    }
}
