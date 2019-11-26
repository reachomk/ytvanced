package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: zct */
final /* synthetic */ class zct implements AnimatorUpdateListener {
    private final zcv a;

    zct(zcv zcv) {
        this.a = zcv;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
