package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ffi */
public final class ffi extends AnimatorListenerAdapter {
    private final /* synthetic */ ffg a;

    public ffi(ffg ffg) {
        this.a = ffg;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.c.setVisibility(8);
        this.a.c();
    }
}
