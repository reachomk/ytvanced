package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;

/* renamed from: gwu */
final class gwu implements OnGlobalLayoutListener {
    private final /* synthetic */ gwq a;

    gwu(gwq gwq) {
        this.a = gwq;
    }

    public final void onGlobalLayout() {
        this.a.ab.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.ad.setAlpha(0.0f);
        this.a.ad.animate().alpha(1.0f).setDuration((long) this.a.aa).start();
        gwq gwq = this.a;
        gwq.ag = false;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) gwq.ac.getHeight(), 0.0f);
        translateAnimation.setDuration((long) this.a.Z);
        translateAnimation.setInterpolator(new LinearInterpolator());
        this.a.ac.startAnimation(translateAnimation);
    }
}
