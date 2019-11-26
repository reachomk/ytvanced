package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: uiy */
final class uiy extends AnimatorListenerAdapter {
    private final /* synthetic */ uiw a;
    private final /* synthetic */ uiv b;

    uiy(uiv uiv, uiw uiw) {
        this.b = uiv;
        this.a = uiw;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.d.remove(this.a);
    }
}
