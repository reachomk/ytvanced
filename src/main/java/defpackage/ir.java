package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: ir */
public final class ir implements AnimatorUpdateListener {
    private int a = this.b;
    private final /* synthetic */ int b;
    private final /* synthetic */ BaseTransientBottomBar c;

    public ir(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.c = baseTransientBottomBar;
        this.b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (BaseTransientBottomBar.b) {
            abe.d(this.c.e, intValue - this.a);
        } else {
            this.c.e.setTranslationY((float) intValue);
        }
        this.a = intValue;
    }
}
