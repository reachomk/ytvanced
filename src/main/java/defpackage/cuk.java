package defpackage;

import android.view.Choreographer;

/* renamed from: cuk */
final class cuk implements Runnable {
    private final /* synthetic */ cuh a;

    cuk(cuh cuh) {
        this.a = cuh;
    }

    public final void run() {
        this.a.b = Choreographer.getInstance();
    }
}
