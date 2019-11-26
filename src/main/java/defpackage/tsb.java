package defpackage;

import android.animation.Animator;

/* renamed from: tsb */
public final class tsb extends try {
    public final Animator a;
    public final Runnable b;
    public final int c;
    public int d;
    private final tsf e = new tsa(this);

    public static void a(Animator animator, Runnable runnable) {
        animator.addListener(new tsb(animator, runnable));
    }

    private tsb(Animator animator, Runnable runnable) {
        this.a = animator;
        this.c = -1;
        this.b = runnable;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!a(animator)) {
            tsd.a().a(this.e);
        }
    }
}
