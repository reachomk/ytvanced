package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;

/* renamed from: gfx */
final class gfx implements AnimatorListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ ggb b;

    gfx(View view, ggb ggb) {
        this.a = view;
        this.b = ggb;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.b.d();
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.e();
    }
}
