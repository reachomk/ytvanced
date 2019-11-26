package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: zhz */
final class zhz extends AnimatorListenerAdapter {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ zhu b;

    zhz(zhu zhu, boolean z) {
        this.b = zhu;
        this.a = z;
    }

    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            this.b.aq.setVisibility(0);
            this.b.ag.setVisibility(0);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.b.aq.setVisibility(4);
            this.b.ag.setVisibility(4);
        }
    }
}
