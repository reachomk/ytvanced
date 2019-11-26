package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: acmg */
final class acmg implements AnimationListener {
    private final /* synthetic */ aclq a;

    acmg(aclq aclq) {
        this.a = aclq;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        this.a.aj.setBackgroundColor(-1);
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.aj.setBackgroundColor(0);
    }
}
