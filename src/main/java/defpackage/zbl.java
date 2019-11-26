package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: zbl */
public final /* synthetic */ class zbl implements AnimatorUpdateListener {
    private final zbr a;

    public zbl(zbr zbr) {
        this.a = zbr;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        zbr zbr = this.a;
        zbr.a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        zbr.b.invalidate();
    }
}
