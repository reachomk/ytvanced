package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: iq */
public final class iq implements AnimatorUpdateListener {
    private final /* synthetic */ BaseTransientBottomBar a;

    public iq(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
