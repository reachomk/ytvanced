package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: bdaj */
final class bdaj {
    public final ThreadFactory a;
    public final long b;
    public final ConcurrentLinkedQueue c;
    public final bdfu d;
    private final ScheduledExecutorService e;
    private final Future f;

    bdaj(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
        ScheduledExecutorService newScheduledThreadPool;
        this.a = threadFactory;
        this.b = timeUnit != null ? timeUnit.toNanos(j) : 0;
        this.c = new ConcurrentLinkedQueue();
        this.d = new bdfu();
        Future future = null;
        if (timeUnit != null) {
            newScheduledThreadPool = Executors.newScheduledThreadPool(1, new bdai(threadFactory));
            bdbc.b(newScheduledThreadPool);
            bdal bdal = new bdal(this);
            long j2 = this.b;
            future = newScheduledThreadPool.scheduleWithFixedDelay(bdal, j2, j2, TimeUnit.NANOSECONDS);
        } else {
            newScheduledThreadPool = null;
        }
        this.e = newScheduledThreadPool;
        this.f = future;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        try {
            Future future = this.f;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
            this.d.b();
        } catch (Throwable th) {
            this.d.b();
        }
    }
}
