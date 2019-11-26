package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: zvj */
final class zvj implements AnimationListener {
    private final /* synthetic */ zvi a;

    zvj(zvi zvi) {
        this.a = zvi;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.c.setVisibility(8);
    }
}
