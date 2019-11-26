package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bawg */
public final class bawg implements Executor {
    private final UncaughtExceptionHandler a;
    private final Queue b = new ConcurrentLinkedQueue();
    private final AtomicReference c = new AtomicReference();

    public bawg(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = (UncaughtExceptionHandler) amqw.a((Object) uncaughtExceptionHandler, (Object) "uncaughtExceptionHandler");
    }

    public final void a() {
        while (this.c.compareAndSet(null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        this.c.set(null);
                        if (this.b.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    this.c.set(null);
                }
            }
        }
    }

    public final void a(Runnable runnable) {
        this.b.add((Runnable) amqw.a((Object) runnable, (Object) "runnable is null"));
    }

    public final void execute(Runnable runnable) {
        a(runnable);
        a();
    }

    public final void b() {
        amqw.b(Thread.currentThread() == this.c.get(), (Object) "Not called from the SynchronizationContext");
    }
}
