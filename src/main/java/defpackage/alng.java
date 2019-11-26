package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: alng */
final class alng implements AnimatorUpdateListener {
    private final /* synthetic */ alnh a;

    alng(alnh alnh) {
        this.a = alnh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        alnf alnf = this.a.a;
        if (!alnf.c) {
            alnf.a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
