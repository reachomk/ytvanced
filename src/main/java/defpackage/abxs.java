package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.GradientDrawable;

/* renamed from: abxs */
final class abxs implements AnimatorUpdateListener {
    private final /* synthetic */ GradientDrawable a;

    abxs(GradientDrawable gradientDrawable) {
        this.a = gradientDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
