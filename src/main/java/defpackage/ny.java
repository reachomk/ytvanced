package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ny */
final class ny extends AnimatorListenerAdapter {
    private final /* synthetic */ ViewGroup a;
    private final /* synthetic */ View b;
    private final /* synthetic */ nf c;
    private final /* synthetic */ nv d;

    ny(nv nvVar, ViewGroup viewGroup, View view, nf nfVar) {
        this.d = nvVar;
        this.a = viewGroup;
        this.b = view;
        this.c = nfVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        animator = this.c.S();
        this.c.a(null);
        if (animator != null && this.a.indexOfChild(this.b) < 0) {
            nv nvVar = this.d;
            nf nfVar = this.c;
            nvVar.a(nfVar, nfVar.T(), 0, 0, false);
        }
    }
}
