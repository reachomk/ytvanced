package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: zwg */
final class zwg implements AnimatorUpdateListener {
    private final /* synthetic */ zwi a;

    zwg(zwi zwi) {
        this.a = zwi;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
