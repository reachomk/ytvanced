package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: algh */
final class algh implements AnimationListener {
    private final /* synthetic */ View a;

    algh(View view) {
        this.a = view;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.setVisibility(8);
    }
}
