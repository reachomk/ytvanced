package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* renamed from: khh */
final /* synthetic */ class khh implements AnimatorUpdateListener {
    private final khd a;
    private final SwipeLayout b;

    khh(khd khd, SwipeLayout swipeLayout) {
        this.a = khd;
        this.b = swipeLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        khd khd = this.a;
        SwipeLayout swipeLayout = this.b;
        khd.K_().setAlpha(((Float) valueAnimator.getAnimatedValue("alpha")).floatValue());
        swipeLayout.a(((Integer) valueAnimator.getAnimatedValue("displacement")).intValue());
    }
}
