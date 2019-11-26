package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ujg */
final class ujg extends AnimatorListenerAdapter {
    private final ujb a;
    private final /* synthetic */ uja b;

    public ujg(uja uja, ujb ujb) {
        this.b = uja;
        this.a = ujb;
    }

    public final void onAnimationEnd(Animator animator) {
        uja uja = this.b;
        uja.d = this.a;
        uja.e = null;
        for (uje P_ : uja.f) {
            P_.P_();
        }
    }
}
