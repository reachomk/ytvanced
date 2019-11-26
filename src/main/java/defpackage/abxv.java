package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.GradientDrawable;

/* renamed from: abxv */
final class abxv implements AnimatorUpdateListener {
    private final /* synthetic */ GradientDrawable a;
    private final /* synthetic */ GradientDrawable b;

    abxv(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
        this.a = gradientDrawable;
        this.b = gradientDrawable2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.b.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
