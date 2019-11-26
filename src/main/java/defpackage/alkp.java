package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: alkp */
final class alkp implements AnimatorUpdateListener {
    private final /* synthetic */ alkc a;

    alkp(alkc alkc) {
        this.a = alkc;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.ac.c(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
