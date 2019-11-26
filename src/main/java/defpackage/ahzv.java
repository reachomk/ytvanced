package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: ahzv */
final class ahzv implements AnimationListener {
    private final /* synthetic */ ahzw a;

    ahzv(ahzw ahzw) {
        this.a = ahzw;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.a();
    }
}
