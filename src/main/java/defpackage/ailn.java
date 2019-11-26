package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: ailn */
final class ailn implements AnimatorUpdateListener {
    private final /* synthetic */ ailk a;

    ailn(ailk ailk) {
        this.a = ailk;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.a.a.invalidate();
    }
}
