package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: zhw */
final /* synthetic */ class zhw implements AnimatorUpdateListener {
    private final zhu a;

    zhw(zhu zhu) {
        this.a = zhu;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.am.requestLayout();
    }
}
