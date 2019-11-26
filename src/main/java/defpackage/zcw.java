package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: zcw */
final class zcw extends AnimatorListenerAdapter {
    private final /* synthetic */ zcv a;
    private final /* synthetic */ zcu b;

    zcw(zcu zcu, zcv zcv) {
        this.b = zcu;
        this.a = zcv;
    }

    public final void onAnimationEnd(Animator animator) {
        if (((Float) this.b.getAnimatedValue()).floatValue() == 0.0f) {
            this.a.p();
        }
        this.a.d(((Float) this.b.getAnimatedValue()).floatValue() == 1.0f);
    }
}
