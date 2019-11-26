package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: amk */
final class amk extends AnimatorListenerAdapter {
    private final /* synthetic */ aqj a;
    private final /* synthetic */ ViewPropertyAnimator b;
    private final /* synthetic */ View c;
    private final /* synthetic */ amg d;

    amk(amg amg, aqj aqj, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = amg;
        this.a = aqj;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.d.f(this.a);
        this.d.f.remove(this.a);
        this.d.c();
    }
}
