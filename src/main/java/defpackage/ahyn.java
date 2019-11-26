package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: ahyn */
final class ahyn implements AnimatorUpdateListener {
    private final /* synthetic */ ahyo a;

    ahyn(ahyo ahyo) {
        this.a = ahyo;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.a.e.setAlpha((int) (255.0f * animatedFraction));
        this.a.setAlpha(1.0f - (animatedFraction * 0.3f));
    }
}
