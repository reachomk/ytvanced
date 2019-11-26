package defpackage;

import android.os.Process;

/* renamed from: qpg */
final class qpg implements Runnable {
    private final Runnable a;

    public qpg(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
