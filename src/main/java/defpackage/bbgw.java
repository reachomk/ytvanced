package defpackage;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbgw */
public final class bbgw implements Runnable, Executor {
    private static final Logger b;
    private static final bbgv c;
    public volatile int a = 0;
    private final Executor d;
    private final Queue e = new ConcurrentLinkedQueue();

    public bbgw(Executor executor) {
        amqw.a((Object) executor, (Object) "'executor' must not be null.");
        this.d = executor;
    }

    public final void execute(Runnable runnable) {
        this.e.add((Runnable) amqw.a((Object) runnable, (Object) "'r' must not be null."));
        a(runnable);
    }

    private final void a(Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
            }
        }
    }

    public final void run() {
        while (true) {
            Runnable runnable;
            try {
                runnable = (Runnable) this.e.poll();
                if (runnable == null) {
                    break;
                }
                runnable.run();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(runnable);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 35);
                stringBuilder.append("Exception while executing runnable ");
                stringBuilder.append(valueOf);
                b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "run", stringBuilder.toString(), e);
            } catch (Throwable th) {
                c.b(this);
            }
        }
        c.b(this);
        if (!this.e.isEmpty()) {
            a(null);
        }
    }

    static {
        bbgv bbgy;
        Class cls = bbgw.class;
        b = Logger.getLogger(cls.getName());
        try {
            bbgy = new bbgy(AtomicIntegerFieldUpdater.newUpdater(cls, "a"));
        } catch (Throwable th) {
            b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            bbgy = new bbgx();
        }
        c = bbgy;
    }
}
