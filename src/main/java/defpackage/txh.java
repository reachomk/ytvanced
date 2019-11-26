package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: txh */
final class txh implements Runnable {
    private final AtomicReference a = new AtomicReference(this.b);
    private final /* synthetic */ Runnable b;

    txh(Runnable runnable) {
        this.b = runnable;
    }

    public final void run() {
        Runnable runnable = (Runnable) this.a.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
