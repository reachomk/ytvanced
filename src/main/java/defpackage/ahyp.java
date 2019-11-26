package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: ahyp */
public final class ahyp implements AnimationListener {
    private final View a;

    public ahyp(View view) {
        this.a = view;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        View view = this.a;
        if (view instanceof ViewGroup) {
            ahyo.a((ViewGroup) view);
        } else {
            view.clearAnimation();
        }
        this.a.setVisibility(8);
    }
}
