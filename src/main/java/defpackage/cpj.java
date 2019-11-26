package defpackage;

import android.os.Looper;
import android.os.Process;

/* renamed from: cpj */
final class cpj implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ cpk b;

    cpj(cpk cpk, Runnable runnable) {
        this.b = cpk;
        this.a = runnable;
    }

    public final void run() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        try {
            Process.setThreadPriority(this.b.a);
        } catch (SecurityException unused) {
            Process.setThreadPriority(this.b.a + 1);
        }
        this.a.run();
    }
}
