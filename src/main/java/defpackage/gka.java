package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: gka */
final class gka implements AnimatorListener {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ gju b;

    gka(gju gju, boolean z) {
        this.b = gju;
        this.a = z;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            this.b.i.setVisibility(0);
            this.b.i.setAlpha(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.b.i.setVisibility(8);
            this.b.j.setVisibility(0);
        }
    }
}
