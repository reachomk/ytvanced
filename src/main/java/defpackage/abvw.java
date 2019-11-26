package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: abvw */
final class abvw extends AnimatorListenerAdapter {
    private final /* synthetic */ abvm a;

    abvw(abvm abvm) {
        this.a = abvm;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.w().setVisibility(8);
    }
}
