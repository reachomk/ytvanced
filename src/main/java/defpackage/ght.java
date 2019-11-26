package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: ght */
final class ght implements AnimatorListener {
    private final /* synthetic */ ghn a;

    ght(ghn ghn) {
        this.a = ghn;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        ghn ghn = this.a;
        ghn.d(ghn.ar);
    }
}
