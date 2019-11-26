package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: wdq */
final class wdq extends AnimatorListenerAdapter {
    private final Handler a = new Handler();

    public final void onAnimationEnd(Animator animator) {
        Handler handler = this.a;
        animator.getClass();
        handler.post(new wdp(animator));
    }
}
