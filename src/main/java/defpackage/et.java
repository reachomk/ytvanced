package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;

/* renamed from: et */
public final class et extends AnimatorListenerAdapter {
    private final /* synthetic */ HideBottomViewOnScrollBehavior a;

    public et(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.a = hideBottomViewOnScrollBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a = null;
    }
}
