package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: lnu */
final class lnu extends AnimatorListenerAdapter {
    private final /* synthetic */ loc a;
    private final /* synthetic */ lnr b;

    lnu(lnr lnr, loc loc) {
        this.b = lnr;
        this.a = loc;
    }

    public final void onAnimationStart(Animator animator) {
        this.b.d = true;
    }

    public final void onAnimationEnd(Animator animator) {
        wae wae = this.a.a;
        if (wae != null) {
            wae.b();
        }
    }
}
