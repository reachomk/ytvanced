package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: bbfl */
final class bbfl {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final amrj g;

    bbfl(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, amrj amrj) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = amrj;
        amrj.b();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
