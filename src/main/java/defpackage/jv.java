package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.design.tabs.TabLayout;

/* renamed from: jv */
public final class jv implements AnimatorUpdateListener {
    private final /* synthetic */ TabLayout a;

    public jv(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
