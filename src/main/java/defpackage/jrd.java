package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

/* renamed from: jrd */
final /* synthetic */ class jrd implements AnimatorUpdateListener {
    private final jre a;
    private final int b;
    private final int c;

    jrd(jre jre, int i, int i2) {
        this.a = jre;
        this.b = i;
        this.c = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        jre jre = this.a;
        int i = this.b;
        int i2 = this.c;
        LayoutParams layoutParams = jre.a.getLayoutParams();
        if (layoutParams != null) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (i2 >= i) {
                layoutParams.height = i + ((int) (((float) (i2 - i)) * animatedFraction));
            } else {
                layoutParams.height = i - ((int) (((float) (i - i2)) * animatedFraction));
            }
            jre.a.setLayoutParams(layoutParams);
        }
    }
}
