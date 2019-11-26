package defpackage;

import android.animation.Animator;

/* renamed from: wdr */
final /* synthetic */ class wdr implements Runnable {
    private final Animator a;

    public wdr(Animator animator) {
        this.a = animator;
    }

    public final void run() {
        this.a.start();
    }
}
