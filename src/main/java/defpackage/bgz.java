package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: bgz */
final class bgz extends AnimatorListenerAdapter {
    private final /* synthetic */ zj a;
    private final /* synthetic */ bgx b;

    bgz(bgx bgx, zj zjVar) {
        this.b = bgx;
        this.a = zjVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.b.o.add(animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.o.remove(animator);
    }
}
