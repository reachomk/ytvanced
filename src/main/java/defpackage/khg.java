package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: khg */
final class khg extends AnimatorListenerAdapter {
    private final /* synthetic */ akrd a;
    private final /* synthetic */ khe b;

    khg(khe khe, akrd akrd) {
        this.b = khe;
        this.a = akrd;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.c().run();
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.d();
    }
}
