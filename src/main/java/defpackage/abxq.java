package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

/* renamed from: abxq */
final class abxq implements AnimatorUpdateListener {
    private final /* synthetic */ Drawable a;

    abxq(Drawable drawable) {
        this.a = drawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), Mode.SRC_IN);
    }
}
