package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: iu */
final class iu extends AnimatorListenerAdapter {
    private final /* synthetic */ BaseTransientBottomBar a;

    iu(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.f.b();
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.h();
    }
}
