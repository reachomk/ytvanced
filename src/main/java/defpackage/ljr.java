package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: ljr */
final class ljr implements OnAttachStateChangeListener {
    private final /* synthetic */ ljp a;

    ljr(ljp ljp) {
        this.a = ljp;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.a.a();
    }
}
