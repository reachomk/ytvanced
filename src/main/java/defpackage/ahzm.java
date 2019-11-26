package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: ahzm */
final class ahzm implements AnimationListener {
    private final /* synthetic */ ahzj a;

    ahzm(ahzj ahzj) {
        this.a = ahzj;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        View b = this.a.b();
        if (b.getParent() != null) {
            ((ViewGroup) b.getParent()).removeView(b);
        }
    }
}
