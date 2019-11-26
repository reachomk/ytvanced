package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: zvk */
final class zvk implements AnimationListener {
    private final /* synthetic */ zwt a;
    private final /* synthetic */ zvi b;

    zvk(zvi zvi, zwt zwt) {
        this.b = zvi;
        this.a = zwt;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        this.b.c.setVisibility(0);
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.b.e) {
            this.a.a();
        }
    }
}
