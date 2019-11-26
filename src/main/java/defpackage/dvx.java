package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: dvx */
final class dvx implements AnimatorUpdateListener {
    private final /* synthetic */ vqh a;
    private final /* synthetic */ dvy b;

    dvx(dvy dvy, vqh vqh) {
        this.b = dvy;
        this.a = vqh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        dvy dvy = this.b;
        float f2 = dvy.b;
        dvy.b = f2 + ((this.a.a - f2) * f.floatValue());
        dvy = this.b;
        f2 = dvy.d;
        dvy.d = f2 + ((this.a.c - f2) * f.floatValue());
        dvy = this.b;
        f2 = dvy.c;
        dvy.c = f2 + ((this.a.b - f2) * f.floatValue());
        for (lkx a : this.b.a) {
            a.a();
        }
    }
}
