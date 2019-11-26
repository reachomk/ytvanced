package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: azp */
final class azp implements AnimationListener {
    private final /* synthetic */ azl a;

    azp(azl azl) {
        this.a = azl;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.e(true);
    }
}
