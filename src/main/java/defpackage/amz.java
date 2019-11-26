package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: amz */
final class amz extends AnimatorListenerAdapter {
    private boolean a = false;
    private final /* synthetic */ amy b;

    amz(amy amy) {
        this.b = amy;
    }

    public final void onAnimationEnd(Animator animator) {
        amy amy;
        if (this.a) {
            this.a = false;
        } else if (((Float) this.b.n.getAnimatedValue()).floatValue() == 0.0f) {
            amy = this.b;
            amy.o = 0;
            amy.a(0);
        } else {
            amy = this.b;
            amy.o = 2;
            amy.a();
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }
}
