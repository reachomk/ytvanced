package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: lld */
final /* synthetic */ class lld implements AnimatorUpdateListener {
    private final lle a;

    lld(lle lle) {
        this.a = lle;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        lle lle = this.a;
        float min = Math.min(Math.max(valueAnimator.getAnimatedFraction(), 0.0f), 1.0f);
        float f = lle.b;
        lle.d.a(f + (min * (lle.c - f)));
    }
}
