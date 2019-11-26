package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: bagl */
final class bagl implements AnimationListener {
    private final /* synthetic */ bagh a;

    bagl(bagh bagh) {
        this.a = bagh;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.setVisibility(8);
        ((ViewGroup) this.a.getParent()).removeView(this.a);
        Runnable runnable = this.a.c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
