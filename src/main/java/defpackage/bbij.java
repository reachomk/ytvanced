package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Logger;

/* renamed from: bbij */
final class bbij extends ConcurrentLinkedQueue implements Executor {
    public static final Logger a = Logger.getLogger(bbij.class.getName());
    public volatile Thread b;

    bbij() {
    }

    public static void a(Thread thread) {
        if (thread.isInterrupted()) {
            throw new InterruptedException();
        }
    }

    public final void execute(Runnable runnable) {
        add(runnable);
        LockSupport.unpark(this.b);
    }
}
