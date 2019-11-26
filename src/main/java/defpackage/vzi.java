package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.youtube.ads.player.ui.SkipAdButton;

/* renamed from: vzi */
final class vzi implements AnimatorUpdateListener {
    private final /* synthetic */ SkipAdButton a;

    vzi(SkipAdButton skipAdButton) {
        this.a = skipAdButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.a.g.getLayoutParams().width = num.intValue();
        this.a.g.requestLayout();
    }
}
