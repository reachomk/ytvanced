package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.libraries.youtube.livechat.ui.view.VerticalShimmerLoadingFrameLayout;

/* renamed from: abxn */
public final /* synthetic */ class abxn implements AnimatorUpdateListener {
    private final VerticalShimmerLoadingFrameLayout a;

    public abxn(VerticalShimmerLoadingFrameLayout verticalShimmerLoadingFrameLayout) {
        this.a = verticalShimmerLoadingFrameLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        VerticalShimmerLoadingFrameLayout verticalShimmerLoadingFrameLayout = this.a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float height;
        float f;
        if (floatValue < 0.5f) {
            height = (float) verticalShimmerLoadingFrameLayout.d.getHeight();
            f = (-height) * (floatValue + floatValue);
            verticalShimmerLoadingFrameLayout.d.setTranslationY(f);
            verticalShimmerLoadingFrameLayout.e.setTranslationY(height + f);
            return;
        }
        floatValue -= 8.0f;
        height = (float) verticalShimmerLoadingFrameLayout.d.getHeight();
        f = (-height) * (floatValue + floatValue);
        verticalShimmerLoadingFrameLayout.e.setTranslationY(f);
        verticalShimmerLoadingFrameLayout.d.setTranslationY(height + f);
    }
}
