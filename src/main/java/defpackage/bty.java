package defpackage;

import android.os.Process;

/* renamed from: bty */
final class bty implements Runnable {
    private final /* synthetic */ Runnable a;

    bty(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
