package defpackage;

import android.animation.Animator;

/* renamed from: tta */
final class tta extends try {
    private final /* synthetic */ tsx a;

    tta(tsx tsx) {
        this.a = tsx;
    }

    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.c = null;
            return;
        }
        tsx tsx = this.a;
        super.setVisible(tsx.a, false);
        this.a.b();
        Runnable runnable = this.a.c;
        if (runnable != null) {
            runnable.run();
            this.a.c = null;
        }
    }
}
