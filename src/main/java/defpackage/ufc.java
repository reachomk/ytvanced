package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* renamed from: ufc */
public final class ufc {
    public final ufd a;
    public Animator b = new AnimatorSet();

    public ufc(ufd ufd) {
        this.a = ufd;
    }

    public final void a() {
        if (this.b.isStarted()) {
            this.b.end();
        }
    }
}
