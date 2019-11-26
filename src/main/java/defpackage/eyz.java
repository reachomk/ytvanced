package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: eyz */
final class eyz extends AnimatorListenerAdapter implements AnimatorUpdateListener {
    private final View a;
    private final float b;
    private final float c;

    public eyz(View view, float f, float f2) {
        this.a = view;
        this.b = f;
        this.c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            this.a.setRotation(((Float) animatedValue).floatValue());
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.a.setRotation(this.b);
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setRotation(this.c);
    }
}
