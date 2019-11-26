package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: akrp */
final class akrp extends AnimatorListenerAdapter {
    private final /* synthetic */ akre a;
    private final /* synthetic */ akrm b;

    akrp(akrm akrm, akre akre) {
        this.b = akrm;
        this.a = akre;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.d().run();
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.b.setListener(null);
        this.b.d();
    }
}
