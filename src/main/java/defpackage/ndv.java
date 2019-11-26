package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: ndv */
public final /* synthetic */ class ndv implements Runnable {
    private final ndt a;

    public ndv(ndt ndt) {
        this.a = ndt;
    }

    public final void run() {
        ndt ndt = this.a;
        ndt.A.a(ndt.s, ndt.b);
        ndt.y.j = new WeakReference(ndt.b);
    }
}
