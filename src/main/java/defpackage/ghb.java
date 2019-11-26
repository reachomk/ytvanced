package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: ghb */
final class ghb implements AnimatorListener {
    private final /* synthetic */ ggx a;

    ghb(ggx ggx) {
        this.a = ggx;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        ggx ggx = this.a;
        ggx.aa.b(ggx);
    }
}
