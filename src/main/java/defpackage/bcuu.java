package defpackage;

import android.os.Handler;

/* renamed from: bcuu */
final class bcuu implements bcuo, Runnable {
    private final bcvl a;
    private final Handler b;
    private volatile boolean c;

    bcuu(bcvl bcvl, Handler handler) {
        this.a = bcvl;
        this.b = handler;
    }

    public final void run() {
        try {
            this.a.a();
        } catch (Throwable th) {
            Throwable illegalStateException;
            if (th instanceof bcve) {
                illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th);
            } else {
                illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
            }
            bdey.a.a();
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
        }
    }

    public final void b() {
        this.c = true;
        this.b.removeCallbacks(this);
    }

    public final boolean c() {
        return this.c;
    }
}
