package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ob */
final class ob extends AnimatorListenerAdapter {
    private final /* synthetic */ ViewGroup a;
    private final /* synthetic */ View b;
    private final /* synthetic */ nf c;

    ob(ViewGroup viewGroup, View view, nf nfVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = nfVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        animator.removeListener(this);
        View view = this.c.K;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
