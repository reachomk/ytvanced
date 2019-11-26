package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: yti */
final class yti extends AnimatorListenerAdapter {
    private final /* synthetic */ zal a;
    private final /* synthetic */ ynz b;
    private final /* synthetic */ ytg c;

    yti(ytg ytg, zal zal, ynz ynz) {
        this.c = ytg;
        this.a = zal;
        this.b = ynz;
    }

    public final void onAnimationEnd(Animator animator) {
        if (((Float) this.c.getAnimatedValue()).floatValue() == 0.0f) {
            View view = this.a.a;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        this.b.a();
    }
}
