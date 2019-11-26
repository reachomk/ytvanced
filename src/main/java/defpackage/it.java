package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: it */
final class it implements AnimatorUpdateListener {
    private int a = 0;
    private final /* synthetic */ BaseTransientBottomBar b;

    it(BaseTransientBottomBar baseTransientBottomBar) {
        this.b = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (BaseTransientBottomBar.b) {
            abe.d(this.b.e, intValue - this.a);
        } else {
            this.b.e.setTranslationY((float) intValue);
        }
        this.a = intValue;
    }
}
