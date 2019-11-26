package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: jox */
final class jox extends AnimatorListenerAdapter {
    private final /* synthetic */ jou a;

    jox(jou jou) {
        this.a = jou;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.b();
    }
}
