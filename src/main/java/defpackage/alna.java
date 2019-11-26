package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: alna */
final class alna extends AnimatorListenerAdapter {
    private final /* synthetic */ almx a;

    alna(almx almx) {
        this.a = almx;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b.setVisibility(8);
    }
}
