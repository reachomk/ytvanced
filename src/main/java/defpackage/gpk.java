package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: gpk */
final class gpk implements AnimationListener {
    private final View a;

    public gpk(View view) {
        this.a = view;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        this.a.setVisibility(0);
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.setVisibility(4);
    }
}
