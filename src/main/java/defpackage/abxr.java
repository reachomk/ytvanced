package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.TextView;

/* renamed from: abxr */
final class abxr implements AnimatorUpdateListener {
    private final /* synthetic */ TextView a;

    abxr(TextView textView) {
        this.a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
