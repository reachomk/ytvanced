package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: ip */
public final class ip implements AnimatorUpdateListener {
    private final /* synthetic */ BaseTransientBottomBar a;

    public ip(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.e.setScaleX(floatValue);
        this.a.e.setScaleY(floatValue);
    }
}
