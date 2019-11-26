package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: jow */
final class jow extends AnimatorListenerAdapter {
    private final /* synthetic */ jou a;

    jow(jou jou) {
        this.a = jou;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b();
    }
}
