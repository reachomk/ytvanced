package defpackage;

import android.animation.Animator;

/* renamed from: tsv */
final class tsv extends try {
    private final /* synthetic */ tst a;

    tsv(tst tst) {
        this.a = tst;
    }

    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.j = null;
            return;
        }
        tst tst = this.a;
        super.setVisible(tst.i, false);
        Runnable runnable = this.a.j;
        if (runnable != null) {
            runnable.run();
            this.a.j = null;
        }
        this.a.c();
    }
}
