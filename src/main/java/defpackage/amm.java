package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: amm */
final class amm extends AnimatorListenerAdapter {
    private final /* synthetic */ aqj a;
    private final /* synthetic */ int b;
    private final /* synthetic */ View c;
    private final /* synthetic */ int d;
    private final /* synthetic */ ViewPropertyAnimator e;
    private final /* synthetic */ amg f;

    amm(amg amg, aqj aqj, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = amg;
        this.a = aqj;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        this.f.f(this.a);
        this.f.e.remove(this.a);
        this.f.c();
    }
}
