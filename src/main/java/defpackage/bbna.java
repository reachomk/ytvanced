package defpackage;

import android.os.Handler;

/* renamed from: bbna */
final class bbna implements bbnc, Runnable {
    private final Handler a;
    private final Runnable b;
    private volatile boolean c;

    bbna(Handler handler, Runnable runnable) {
        this.a = handler;
        this.b = runnable;
    }

    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            Throwable illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.", th);
            bbzf.a(illegalStateException);
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
        }
    }

    public final void bK_() {
        this.c = true;
        this.a.removeCallbacks(this);
    }

    public final boolean c() {
        return this.c;
    }
}
