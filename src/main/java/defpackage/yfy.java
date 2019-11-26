package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: yfy */
final class yfy extends AnimatorListenerAdapter {
    private final /* synthetic */ yfr a;

    yfy(yfr yfr) {
        this.a = yfr;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b.setVisibility(8);
    }
}
