package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: ei */
final class ei implements AnimatorUpdateListener {
    private final /* synthetic */ eh a;

    ei(eh ehVar) {
        this.a = ehVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
