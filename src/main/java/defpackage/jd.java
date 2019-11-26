package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: jd */
final class jd extends AnimatorListenerAdapter {
    private final /* synthetic */ BaseTransientBottomBar a;

    jd(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.h();
    }
}
