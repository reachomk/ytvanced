package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: jmr */
final class jmr implements AnimationListener {
    private final /* synthetic */ jml a;

    jmr(jml jml) {
        this.a = jml;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.c.clearAnimation();
        this.a.c.setVisibility(0);
    }
}
