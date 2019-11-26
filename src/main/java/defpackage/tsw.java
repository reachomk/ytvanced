package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: tsw */
final class tsw extends AnimatorListenerAdapter {
    private final /* synthetic */ tst a;

    tsw(tst tst) {
        this.a = tst;
    }

    public final void onAnimationStart(Animator animator) {
        if (!this.a.a.isStarted()) {
            this.a.a.start();
        }
    }
}
