package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: hb */
final class hb extends AnimatorListenerAdapter {
    private final /* synthetic */ gy a;

    hb(gy gyVar) {
        this.a = gyVar;
    }

    public final void onAnimationEnd(Animator animator) {
        gy gyVar = this.a;
        if (gyVar.c == animator) {
            gyVar.c = null;
        }
    }
}
