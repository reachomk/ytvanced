package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: xnf */
final class xnf implements AnimationListener {
    private final /* synthetic */ xnc a;

    public final void onAnimationEnd(Animation animation) {
        this.a.a();
        if (this.a.a.hasOverlappingRendering()) {
            this.a.a.setLayerType(0, null);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    /* synthetic */ xnf(xnc xnc) {
        this.a = xnc;
    }
}
