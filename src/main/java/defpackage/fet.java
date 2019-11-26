package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.PorterDuff.Mode;
import android.widget.LinearLayout;

/* renamed from: fet */
final /* synthetic */ class fet implements AnimatorUpdateListener {
    private final feq a;
    private final int b;

    fet(feq feq, int i) {
        this.a = feq;
        this.b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        feq feq = this.a;
        int i = this.b;
        LinearLayout linearLayout = feq.a;
        if (linearLayout != null) {
            linearLayout.getBackground().setColorFilter(xnq.a(i, ((Integer) valueAnimator.getAnimatedValue()).intValue()), Mode.SRC_ATOP);
        }
    }
}
