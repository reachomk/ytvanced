package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: akro */
final class akro extends AnimatorListenerAdapter {
    private final /* synthetic */ akre a;
    private final /* synthetic */ akrm b;

    akro(akrm akrm, akre akre) {
        this.b = akrm;
        this.a = akre;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.f().run();
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.c.setListener(null);
        this.b.e();
    }
}
