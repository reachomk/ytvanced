package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: ailm */
final class ailm implements AnimatorListener {
    private final /* synthetic */ ailk a;

    ailm(ailk ailk) {
        this.a = ailk;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.a.setVisibility(0);
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a.setVisibility(8);
    }

    public final void onAnimationCancel(Animator animator) {
        this.a.a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animator animator) {
        this.a.a.setVisibility(8);
    }
}
