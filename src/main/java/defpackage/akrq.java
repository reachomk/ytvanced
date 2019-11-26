package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: akrq */
final class akrq extends AnimatorListenerAdapter {
    private final /* synthetic */ akpy a;
    private final /* synthetic */ akrr b;

    akrq(akrr akrr, akpy akpy) {
        this.b = akrr;
        this.a = akpy;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.c().run();
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.b.setListener(null);
        this.b.d();
    }
}
