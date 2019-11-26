package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

/* renamed from: zhv */
final /* synthetic */ class zhv implements AnimatorUpdateListener {
    private final zhu a;

    zhv(zhu zhu) {
        this.a = zhu;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        zhu zhu = this.a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        LayoutParams layoutParams = zhu.ak.getLayoutParams();
        layoutParams.width = intValue;
        zhu.ak.setLayoutParams(layoutParams);
    }
}
