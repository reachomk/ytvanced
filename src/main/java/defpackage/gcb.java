package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* renamed from: gcb */
final class gcb implements AnimatorListener {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ gbt b;

    gcb(gbt gbt, boolean z) {
        this.b = gbt;
        this.a = z;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.b.av.setVisibility(8);
        } else {
            this.b.at.setVisibility(8);
            this.b.au.setVisibility(8);
        }
        this.b.aq.setEnabled(true);
        this.b.as.setEnabled(true);
        this.b.au.setEnabled(true);
    }

    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            this.b.at.setVisibility(0);
            this.b.au.setVisibility(0);
        } else {
            this.b.av.setVisibility(0);
        }
        this.b.aq.setEnabled(false);
        this.b.as.setEnabled(false);
        this.b.au.setEnabled(false);
    }
}
