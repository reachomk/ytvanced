package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

/* renamed from: amjx */
final class amjx implements AnimatorUpdateListener {
    private final /* synthetic */ LayoutParams a;
    private final /* synthetic */ amjw b;

    amjx(amjw amjw, LayoutParams layoutParams) {
        this.b = amjw;
        this.a = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.b.b.setLayoutParams(this.a);
    }
}
