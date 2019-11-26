package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: zgw */
final class zgw extends AnimatorListenerAdapter {
    private final /* synthetic */ zgu a;

    zgw(zgu zgu) {
        this.a = zgu;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.c.setVisibility(4);
    }
}
