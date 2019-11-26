package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: ailc */
final class ailc implements OnAttachStateChangeListener {
    private final /* synthetic */ aila a;

    ailc(aila aila) {
        this.a = aila;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        aila aila = this.a;
        aila.b.removeCallbacks(aila.d);
    }
}
