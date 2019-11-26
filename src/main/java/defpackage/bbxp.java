package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: bbxp */
final class bbxp implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final bbmz c;
    public final ThreadFactory d;
    private final ScheduledExecutorService e;
    private final Future f;

    bbxp(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        Future scheduleWithFixedDelay;
        this.a = timeUnit != null ? timeUnit.toNanos(j) : 0;
        this.b = new ConcurrentLinkedQueue();
        this.c = new bbmz();
        this.d = threadFactory;
        ScheduledExecutorService scheduledExecutorService = null;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, bbxq.a);
            long j2 = this.a;
            scheduleWithFixedDelay = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
        } else {
            scheduleWithFixedDelay = null;
        }
        this.e = scheduledExecutorService;
        this.f = scheduleWithFixedDelay;
    }

    public final void run() {
        if (!this.b.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                bbxr bbxr = (bbxr) it.next();
                if (bbxr.a > nanoTime) {
                    return;
                }
                if (this.b.remove(bbxr)) {
                    this.c.b(bbxr);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.c.bK_();
        Future future = this.f;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }
}
