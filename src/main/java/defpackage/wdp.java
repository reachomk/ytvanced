package defpackage;

import android.animation.Animator;

/* renamed from: wdp */
final /* synthetic */ class wdp implements Runnable {
    private final Animator a;

    public wdp(Animator animator) {
        this.a = animator;
    }

    public final void run() {
        this.a.start();
    }
}
