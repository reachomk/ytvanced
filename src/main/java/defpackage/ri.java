package defpackage;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* renamed from: ri */
final class ri implements Callable {
    private final /* synthetic */ rj a;

    ri(rj rjVar) {
        this.a = rjVar;
    }

    public final Object call() {
        Throwable th;
        this.a.d.set(true);
        Object a;
        try {
            Process.setThreadPriority(10);
            a = this.a.a();
            try {
                Binder.flushPendingCommands();
                this.a.c(a);
                return a;
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.a.c.set(true);
                    throw th;
                } catch (Throwable th3) {
                    this.a.c(a);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            a = null;
            this.a.c.set(true);
            throw th;
        }
    }
}
