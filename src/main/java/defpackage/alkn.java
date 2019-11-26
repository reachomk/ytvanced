package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: alkn */
final class alkn extends AnimatorListenerAdapter {
    private final /* synthetic */ alkc a;

    alkn(alkc alkc) {
        this.a = alkc;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.ai.a(alkv.ENTER_FROM_RIGHT_ANIMATION);
    }
}
