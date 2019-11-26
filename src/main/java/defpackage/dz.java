package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.design.appbar.AppBarLayout;
import android.support.design.appbar.AppBarLayout.BaseBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: dz */
public final class dz implements AnimatorUpdateListener {
    private final /* synthetic */ CoordinatorLayout a;
    private final /* synthetic */ AppBarLayout b;
    private final /* synthetic */ BaseBehavior c;

    public dz(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.c = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.a_(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
