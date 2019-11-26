package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: akrs */
final class akrs extends AnimatorListenerAdapter {
    private final /* synthetic */ akrd a;
    private final /* synthetic */ akrt b;

    akrs(akrt akrt, akrd akrd) {
        this.b = akrt;
        this.a = akrd;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.c().run();
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.c.setListener(null);
        this.b.d();
    }
}
