package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: nw */
final class nw implements AnimationListener {
    public final /* synthetic */ nf a;
    public final /* synthetic */ nv b;
    private final /* synthetic */ ViewGroup c;

    nw(nv nvVar, ViewGroup viewGroup, nf nfVar) {
        this.b = nvVar;
        this.c = viewGroup;
        this.a = nfVar;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.c.post(new nz(this));
    }
}
