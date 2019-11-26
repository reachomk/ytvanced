package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: is */
public final class is extends AnimatorListenerAdapter {
    private final /* synthetic */ BaseTransientBottomBar a;

    public is(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.f.a();
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.g();
    }
}
