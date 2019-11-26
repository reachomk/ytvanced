package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: ailg */
final class ailg extends AnimatorListenerAdapter {
    private final /* synthetic */ aild a;

    ailg(aild aild) {
        this.a = aild;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a.b(true);
        this.a.d.b(true);
        this.a.b.b(true);
        this.a.h.l();
    }
}
