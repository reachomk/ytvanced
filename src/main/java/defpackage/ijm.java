package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: ijm */
final /* synthetic */ class ijm implements AnimatorUpdateListener {
    private final ijj a;

    ijm(ijj ijj) {
        this.a = ijj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
