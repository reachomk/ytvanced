package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: akru */
final class akru extends AnimatorListenerAdapter {
    private final /* synthetic */ akqy a;
    private final /* synthetic */ akrv b;

    akru(akrv akrv, akqy akqy) {
        this.b = akrv;
        this.a = akqy;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.c().run();
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.b.setListener(null);
        this.b.d();
    }
}
