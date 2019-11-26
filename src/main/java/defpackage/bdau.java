package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bdau */
final class bdau extends bcue implements Runnable {
    public final bdfu a = new bdfu();
    private final Executor b;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private final AtomicInteger d = new AtomicInteger();
    private final ScheduledExecutorService e;

    public bdau(Executor executor) {
        ScheduledExecutorService scheduledExecutorService;
        this.b = executor;
        ScheduledExecutorService[] scheduledExecutorServiceArr = (ScheduledExecutorService[]) bdaz.c.d.get();
        if (scheduledExecutorServiceArr == bdaz.a) {
            scheduledExecutorService = bdaz.b;
        } else {
            int i = bdaz.e + 1;
            if (i >= scheduledExecutorServiceArr.length) {
                i = 0;
            }
            bdaz.e = i;
            scheduledExecutorService = scheduledExecutorServiceArr[i];
        }
        this.e = scheduledExecutorService;
    }

    public final bcuo a(bcvl bcvl) {
        if (c()) {
            return bdfz.a;
        }
        bcuo bdbe = new bdbe(bdeh.a(bcvl), this.a);
        this.a.a(bdbe);
        this.c.offer(bdbe);
        if (this.d.getAndIncrement() == 0) {
            try {
                this.b.execute(this);
            } catch (RejectedExecutionException e) {
                this.a.b(bdbe);
                this.d.decrementAndGet();
                bdeh.a(e);
                throw e;
            }
        }
        return bdbe;
    }

    public final void run() {
        while (!this.a.b) {
            bdbe bdbe = (bdbe) this.c.poll();
            if (bdbe != null) {
                if (!bdbe.c()) {
                    if (this.a.b) {
                        this.c.clear();
                        return;
                    }
                    bdbe.run();
                }
                if (this.d.decrementAndGet() == 0) {
                }
            }
            return;
        }
        this.c.clear();
    }

    public final bcuo a(bcvl bcvl, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return a(bcvl);
        }
        if (c()) {
            return bdfz.a;
        }
        bcvl = bdeh.a(bcvl);
        bdfx bdfx = new bdfx();
        bcuo bdfx2 = new bdfx();
        bdfx2.a(bdfx);
        this.a.a(bdfx2);
        bcuo a = bdfz.a(new bdax(this, bdfx2));
        bdbe bdbe = new bdbe(new bdaw(this, bdfx2, bcvl, a));
        bdfx.a(bdbe);
        try {
            bdbe.a(this.e.schedule(bdbe, j, timeUnit));
            return a;
        } catch (RejectedExecutionException e) {
            bdeh.a(e);
            throw e;
        }
    }

    public final boolean c() {
        return this.a.b;
    }

    public final void b() {
        this.a.b();
        this.c.clear();
    }
}
