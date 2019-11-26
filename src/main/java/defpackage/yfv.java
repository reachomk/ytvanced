package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: yfv */
final class yfv extends AnimatorListenerAdapter {
    private final /* synthetic */ yfr a;

    yfv(yfr yfr) {
        this.a = yfr;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b.setAlpha(1.0f);
    }
}
