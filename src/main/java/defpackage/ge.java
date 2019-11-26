package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ge */
public final class ge extends AnimatorListenerAdapter {
    private final /* synthetic */ gk a = null;
    private final /* synthetic */ gc b;

    public ge(gc gcVar, gk gkVar) {
        this.b = gcVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.b.D.a(0, false);
        gc gcVar = this.b;
        gcVar.u = 2;
        gcVar.o = animator;
    }

    public final void onAnimationEnd(Animator animator) {
        gc gcVar = this.b;
        gcVar.u = 0;
        gcVar.o = null;
        gk gkVar = this.a;
        if (gkVar != null) {
            gkVar.a();
        }
    }
}
