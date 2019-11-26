package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: zvl */
final class zvl implements AnimationListener {
    private final /* synthetic */ zuf a;
    private final /* synthetic */ int b;
    private final /* synthetic */ zvi c;

    zvl(zvi zvi, zuf zuf, int i) {
        this.c = zvi;
        this.a = zuf;
        this.b = i;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.c.a(this.a, this.b, true);
    }
}
