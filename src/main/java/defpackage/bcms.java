package defpackage;

import android.os.Process;

/* renamed from: bcms */
final class bcms implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ bcmt b;

    bcms(bcmt bcmt, Runnable runnable) {
        this.b = bcmt;
        this.a = runnable;
    }

    public final void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(this.b.a);
        this.a.run();
    }
}
