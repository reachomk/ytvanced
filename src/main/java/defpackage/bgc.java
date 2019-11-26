package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: bgc */
final class bgc extends AnimatorListenerAdapter {
    private final View a;
    private boolean b = false;

    bgc(View view) {
        this.a = view;
    }

    public final void onAnimationStart(Animator animator) {
        if (abe.w(this.a) && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, null);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        bht.a(this.a, 1.0f);
        if (this.b) {
            this.a.setLayerType(0, null);
        }
    }
}
