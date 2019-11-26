package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: eze */
final class eze implements AnimatorListener {
    private final /* synthetic */ ezd a;

    eze(ezd ezd) {
        this.a = ezd;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.c();
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.c();
    }
}
