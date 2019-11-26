package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.design.textfield.TextInputLayout;

/* renamed from: le */
public final class le implements AnimatorUpdateListener {
    private final /* synthetic */ TextInputLayout a;

    public le(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.k.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
