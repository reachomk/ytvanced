package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: kkz */
final class kkz extends AnimatorListenerAdapter implements AnimatorUpdateListener {
    private final /* synthetic */ kkt a;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.a.h == valueAnimator) {
            this.a.c.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public final void onAnimationStart(Animator animator) {
        kkt kkt = this.a;
        if (kkt.h == animator) {
            kkt.c.a(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        kkt kkt = this.a;
        if (kkt.h == animator) {
            kkt.c.b();
            this.a.h = null;
        }
    }

    /* synthetic */ kkz(kkt kkt) {
        this.a = kkt;
    }
}
