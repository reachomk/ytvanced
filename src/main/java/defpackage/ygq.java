package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ygq */
final class ygq extends AnimatorListenerAdapter {
    private final /* synthetic */ ygo a;

    ygq(ygo ygo) {
        this.a = ygo;
    }

    public final void onAnimationEnd(Animator animator) {
        ygo ygo = this.a;
        boolean z = false;
        ygo.a = false;
        if (((Float) ygo.getAnimatedValue()).floatValue() == 0.0f) {
            this.a.b.q();
        }
        ygo = this.a;
        ygg ygg = ygo.b;
        if (((Float) ygo.getAnimatedValue()).floatValue() == 1.0f) {
            z = true;
        }
        ygg.c(z);
    }
}
