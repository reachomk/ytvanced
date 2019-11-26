package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: jrg */
final class jrg extends AnimatorListenerAdapter {
    private final /* synthetic */ jrf a;

    jrg(jrf jrf) {
        this.a = jrf;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }
}
