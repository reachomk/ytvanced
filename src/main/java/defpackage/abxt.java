package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.TextView;

/* renamed from: abxt */
public final class abxt implements AnimatorUpdateListener {
    private final /* synthetic */ TextView a;

    public abxt(TextView textView) {
        this.a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setHintTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
