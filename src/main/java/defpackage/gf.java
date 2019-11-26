package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: gf */
public final class gf extends AnimatorListenerAdapter {
    private boolean a;
    private final /* synthetic */ gk b = null;
    private final /* synthetic */ gc c;

    public gf(gc gcVar, gk gkVar) {
        this.c = gcVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.c.D.a(0, false);
        gc gcVar = this.c;
        gcVar.u = 1;
        gcVar.o = animator;
        this.a = false;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        gc gcVar = this.c;
        gcVar.u = 0;
        gcVar.o = null;
        if (!this.a) {
            gcVar.D.a(4, false);
            gk gkVar = this.b;
            if (gkVar != null) {
                gkVar.b();
            }
        }
    }
}
