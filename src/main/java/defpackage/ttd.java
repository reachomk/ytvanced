package defpackage;

import android.animation.Animator;

/* renamed from: ttd */
final class ttd extends try {
    private final /* synthetic */ ttb a;

    ttd(ttb ttb) {
        this.a = ttb;
    }

    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.d = null;
            return;
        }
        ttb ttb = this.a;
        super.setVisible(ttb.c, false);
        this.a.b.cancel();
        this.a.b();
        Runnable runnable = this.a.d;
        if (runnable != null) {
            runnable.run();
            this.a.d = null;
        }
    }
}
