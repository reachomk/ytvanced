package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: alnb */
final class alnb extends AnimatorListenerAdapter {
    private final /* synthetic */ almx a;

    alnb(almx almx) {
        this.a = almx;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.b.setAlpha(0.0f);
        this.a.b.setVisibility(0);
    }
}
