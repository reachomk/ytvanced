package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: jy */
final class jy implements AnimatorUpdateListener {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ int d;
    private final /* synthetic */ jz e;

    jy(jz jzVar, int i, int i2, int i3, int i4) {
        this.e = jzVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.e.a(dq.a(this.a, this.b, animatedFraction), dq.a(this.c, this.d, animatedFraction));
    }
}
