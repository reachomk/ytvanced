package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: zpj */
final class zpj extends AnimatorListenerAdapter {
    private final /* synthetic */ zpi a;

    zpj(zpi zpi) {
        this.a = zpi;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(0);
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a.a.getAlpha() == 0.0f) {
            this.a.a.setVisibility(8);
        }
        if (this.a.b.getAlpha() == 0.0f) {
            this.a.b.setVisibility(8);
        }
    }
}
