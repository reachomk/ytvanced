package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.ViewGroup.LayoutParams;

/* renamed from: amjv */
final class amjv extends AnimatorListenerAdapter {
    private final /* synthetic */ amjw a;

    amjv(amjw amjw) {
        this.a = amjw;
    }

    public final void onAnimationEnd(Animator animator) {
        amjw amjw = this.a;
        LayoutParams layoutParams = amjw.b.getLayoutParams();
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{amjw.b.getHeight(), 1}).setDuration(amjw.a);
        duration.addListener(new amjy(amjw, layoutParams, r1));
        duration.addUpdateListener(new amjx(amjw, layoutParams));
        duration.start();
    }
}
