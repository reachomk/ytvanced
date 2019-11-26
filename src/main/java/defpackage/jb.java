package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: jb */
public final class jb extends AnimatorListenerAdapter {
    private final /* synthetic */ BaseTransientBottomBar a;

    public jb(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.g();
    }
}
