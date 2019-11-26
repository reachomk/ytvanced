package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: zae */
final /* synthetic */ class zae implements AnimatorUpdateListener {
    private final zac a;

    zae(zac zac) {
        this.a = zac;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
