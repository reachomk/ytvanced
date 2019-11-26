package defpackage;

import android.os.Process;

/* renamed from: tyg */
final class tyg implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ tyd b;

    tyg(tyd tyd, Runnable runnable) {
        this.b = tyd;
        this.a = runnable;
    }

    public final void run() {
        int i = this.b.a;
        if (i != 0) {
            Process.setThreadPriority(i);
        }
        this.a.run();
    }
}
