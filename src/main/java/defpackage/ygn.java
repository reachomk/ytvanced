package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: ygn */
final class ygn implements AnimatorUpdateListener {
    private final /* synthetic */ ygo a;

    ygn(ygo ygo) {
        this.a = ygo;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.b.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
