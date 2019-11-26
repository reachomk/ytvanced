package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: kfj */
final class kfj implements AnimationListener {
    private final kfi a;
    private final boolean b;

    public kfj(kfi kfi, boolean z) {
        this.a = (kfi) amqw.a((Object) kfi);
        this.b = z;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.b(this.b);
    }
}
