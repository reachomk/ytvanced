package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ijv */
final class ijv extends AnimatorListenerAdapter {
    private final /* synthetic */ ijt a;

    ijv(ijt ijt) {
        this.a = ijt;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.d.setVisibility(8);
    }
}
