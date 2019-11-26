package defpackage;

import android.view.animation.AlphaAnimation;

/* renamed from: fws */
final /* synthetic */ class fws implements akov {
    private final int a;

    fws(int i) {
        this.a = i;
    }

    public final void a(akot akot, Object obj) {
        int i = this.a;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) i);
        akot.K_().startAnimation(alphaAnimation);
    }
}
