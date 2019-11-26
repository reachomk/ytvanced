package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;

/* renamed from: ihp */
final class ihp implements AnimatorUpdateListener {
    private final /* synthetic */ ihq a;

    ihp(ihq ihq) {
        this.a = ihq;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a.set((Rect) valueAnimator.getAnimatedValue());
        this.a.invalidate();
    }
}
