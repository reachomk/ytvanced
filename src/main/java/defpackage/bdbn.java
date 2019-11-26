package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bdbn */
final class bdbn extends bcue implements bcuo {
    public final PriorityBlockingQueue a = new PriorityBlockingQueue();
    private final AtomicInteger b = new AtomicInteger();
    private final bdfs c = new bdfs();
    private final AtomicInteger d = new AtomicInteger();

    bdbn() {
    }

    public final bcuo a(bcvl bcvl) {
        return a(bcvl, System.currentTimeMillis());
    }

    public final bcuo a(bcvl bcvl, long j, TimeUnit timeUnit) {
        long currentTimeMillis = System.currentTimeMillis() + timeUnit.toMillis(j);
        return a(new bdbl(bcvl, this, currentTimeMillis), currentTimeMillis);
    }

    private final bcuo a(bcvl bcvl, long j) {
        if (this.c.c()) {
            return bdfz.a;
        }
        bdbp bdbp = new bdbp(bcvl, Long.valueOf(j), this.b.incrementAndGet());
        this.a.add(bdbp);
        if (this.d.getAndIncrement() != 0) {
            return bdfz.a(new bdbm(this, bdbp));
        }
        do {
            bdbp bdbp2 = (bdbp) this.a.poll();
            if (bdbp2 != null) {
                bdbp2.a.a();
            }
        } while (this.d.decrementAndGet() > 0);
        return bdfz.a;
    }

    public final void b() {
        this.c.b();
    }

    public final boolean c() {
        return this.c.c();
    }
}
