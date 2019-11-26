package defpackage;

import android.animation.Animator;

/* renamed from: tsu */
final class tsu extends try {
    private final /* synthetic */ tss a;

    tsu(tss tss) {
        this.a = tss;
    }

    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.c = null;
            return;
        }
        tss tss = this.a;
        super.setVisible(tss.a, false);
        Runnable runnable = this.a.c;
        if (runnable != null) {
            runnable.run();
            this.a.c = null;
        }
        this.a.b();
    }
}
