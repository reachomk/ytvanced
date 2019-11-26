package defpackage;

import android.os.Process;

/* renamed from: bcik */
final /* synthetic */ class bcik implements Runnable {
    private final Runnable a;

    bcik(Runnable runnable) {
        this.a = runnable;
    }

    public final void run() {
        Runnable runnable = this.a;
        Process.setThreadPriority(10);
        runnable.run();
    }
}
