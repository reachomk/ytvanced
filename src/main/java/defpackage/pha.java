package defpackage;

import android.os.Process;

/* renamed from: pha */
final class pha extends Thread {
    pha(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
