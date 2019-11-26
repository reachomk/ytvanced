package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: ber */
final class ber implements AnimatorUpdateListener {
    private final /* synthetic */ bet a;
    private final /* synthetic */ bes b;

    ber(bes bes, bet bet) {
        this.b = bes;
        this.a = bet;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bes.a(floatValue, this.a);
        this.b.a(floatValue, this.a, false);
        this.b.invalidateSelf();
    }
}
