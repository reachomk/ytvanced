package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: hjn */
final /* synthetic */ class hjn implements AnimatorUpdateListener {
    private final View a;

    hjn(View view) {
        this.a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
