package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: zpk */
final class zpk implements AnimatorUpdateListener {
    private final /* synthetic */ zpi a;

    zpk(zpi zpi) {
        this.a = zpi;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.a.setAlpha(floatValue);
        this.a.b.setAlpha(1.0f - floatValue);
    }
}
