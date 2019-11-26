package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ijw */
final class ijw extends AnimatorListenerAdapter {
    private final /* synthetic */ ijt a;

    ijw(ijt ijt) {
        this.a = ijt;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.c.setVisibility(8);
    }
}
