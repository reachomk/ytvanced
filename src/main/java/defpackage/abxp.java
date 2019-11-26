package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.livechat.ui.view.VerticalShimmerLoadingFrameLayout;

/* renamed from: abxp */
public final class abxp extends AnimatorListenerAdapter {
    private final /* synthetic */ VerticalShimmerLoadingFrameLayout a;

    public abxp(VerticalShimmerLoadingFrameLayout verticalShimmerLoadingFrameLayout) {
        this.a = verticalShimmerLoadingFrameLayout;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a(false);
    }
}
