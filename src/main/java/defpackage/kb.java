package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: kb */
final class kb extends AnimatorListenerAdapter {
    private final /* synthetic */ int a;
    private final /* synthetic */ jz b;

    kb(jz jzVar, int i) {
        this.b = jzVar;
        this.a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        jz jzVar = this.b;
        jzVar.c = this.a;
        jzVar.d = 0.0f;
    }
}
