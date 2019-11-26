package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: alki */
final class alki extends AnimatorListenerAdapter {
    private final /* synthetic */ alkj a;

    alki(alkj alkj) {
        this.a = alkj;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a.ai.a(alkv.ENTER_FROM_BELOW_ANIMATION);
    }
}
