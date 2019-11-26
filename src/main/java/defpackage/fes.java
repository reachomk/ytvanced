package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;

/* renamed from: fes */
final class fes implements AnimationListener {
    private final /* synthetic */ feq a;

    fes(feq feq) {
        this.a = feq;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        LinearLayout linearLayout = this.a.a;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }
}
