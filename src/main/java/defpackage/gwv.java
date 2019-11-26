package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: gwv */
final /* synthetic */ class gwv implements AnimatorUpdateListener {
    private final gwq a;
    private final int b;

    gwv(gwq gwq, int i) {
        this.a = gwq;
        this.b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gwq gwq = this.a;
        gwq.ae.a(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.b, false);
    }
}
