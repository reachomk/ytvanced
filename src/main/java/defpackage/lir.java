package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: lir */
final /* synthetic */ class lir implements AnimatorUpdateListener {
    private final lip a;

    lir(lip lip) {
        this.a = lip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        lip lip = this.a;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        lip.a(fpl.a(lip.c, lip.h, animatedFraction), fpl.a(lip.e, lip.g, animatedFraction), fpl.a(lip.d, lip.f, animatedFraction));
    }
}
