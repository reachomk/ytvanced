package defpackage;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: abwr */
final /* synthetic */ class abwr implements Runnable {
    private final abwo a;

    abwr(abwo abwo) {
        this.a = abwo;
    }

    public final void run() {
        abwo abwo = this.a;
        if (abwo.g) {
            abwo.g = false;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            alphaAnimation.setDuration(300);
            alphaAnimation.setAnimationListener(abwo);
            abwo.a.startAnimation(alphaAnimation);
        }
    }
}
