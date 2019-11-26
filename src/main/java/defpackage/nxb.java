package defpackage;

import android.os.HandlerThread;
import android.os.Process;

/* renamed from: nxb */
public final class nxb extends HandlerThread {
    private final int a = -16;

    public nxb(String str) {
        super(str);
    }

    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
