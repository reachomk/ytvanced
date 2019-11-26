package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: zur */
final class zur implements AnimationListener {
    private final /* synthetic */ zus a;

    zur(zus zus) {
        this.a = zus;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        zwj zwj = this.a.a;
        zwj.h.a.g.aa_();
        zwq zwq = zwj.j;
        if (zwq != null) {
            zwq.a();
        }
    }
}
