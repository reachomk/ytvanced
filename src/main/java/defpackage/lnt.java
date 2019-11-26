package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;

/* renamed from: lnt */
final class lnt implements AnimatorUpdateListener {
    private final Activity a;
    private final /* synthetic */ lnr b;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a.getResources().getDisplayMetrics().widthPixels;
        this.b.a((int) ((-this.b.a) - ((float) ((int) (((float) i) * ((Float) valueAnimator.getAnimatedValue()).floatValue())))), 1.0f - valueAnimator.getAnimatedFraction());
    }

    /* synthetic */ lnt(lnr lnr, Activity activity) {
        this.b = lnr;
        this.a = activity;
    }
}
