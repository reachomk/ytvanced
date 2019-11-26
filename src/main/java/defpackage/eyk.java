package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.youtube.app.common.ui.HeightTransitionLayout;

/* renamed from: eyk */
final /* synthetic */ class eyk implements AnimatorUpdateListener {
    private final HeightTransitionLayout a;

    eyk(HeightTransitionLayout heightTransitionLayout) {
        this.a = heightTransitionLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
