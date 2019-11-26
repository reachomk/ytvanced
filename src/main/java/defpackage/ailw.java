package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ailw */
final class ailw extends AnimatorListenerAdapter {
    private final /* synthetic */ ails a;

    ailw(ails ails) {
        this.a = ails;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.f.setVisibility(0);
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.j();
    }
}
