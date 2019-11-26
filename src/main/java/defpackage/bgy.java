package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: bgy */
final class bgy extends AnimatorListenerAdapter {
    private final /* synthetic */ bgx a;

    bgy(bgx bgx) {
        this.a = bgx;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.f();
        animator.removeListener(this);
    }
}
