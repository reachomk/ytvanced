package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.youtube.conversation.technodrome.view.ExpandingFrameLayout;

/* renamed from: ytf */
final /* synthetic */ class ytf implements AnimatorUpdateListener {
    private final zal a;

    ytf(zal zal) {
        this.a = zal;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        zal zal = this.a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zal.a();
        ExpandingFrameLayout expandingFrameLayout = zal.c;
        expandingFrameLayout.a = floatValue;
        expandingFrameLayout.requestLayout();
    }
}
