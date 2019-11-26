package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: dx */
public final class dx implements AnimatorUpdateListener {
    private final /* synthetic */ hu a;

    public dx(hu huVar) {
        this.a = huVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
