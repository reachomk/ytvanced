package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;

/* renamed from: hji */
final class hji implements AnimatorListener {
    private final /* synthetic */ SlimStatusBar a;
    private final /* synthetic */ hja b;

    hji(hja hja, SlimStatusBar slimStatusBar) {
        this.b = hja;
        this.a = slimStatusBar;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.setBackgroundColor(this.b.a);
    }
}
