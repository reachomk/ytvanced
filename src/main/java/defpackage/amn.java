package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: amn */
final class amn extends AnimatorListenerAdapter {
    private final /* synthetic */ aqj a;
    private final /* synthetic */ View b;
    private final /* synthetic */ ViewPropertyAnimator c;
    private final /* synthetic */ amg d;

    amn(amg amg, aqj aqj, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = amg;
        this.a = aqj;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        this.d.f(this.a);
        this.d.d.remove(this.a);
        this.d.c();
    }
}
