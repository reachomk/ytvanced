package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: atj */
final class atj implements AnimatorUpdateListener {
    private final /* synthetic */ atk a;

    atj(atk atk) {
        this.a = atk;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.m = valueAnimator.getAnimatedFraction();
    }
}
