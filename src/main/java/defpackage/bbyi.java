package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbyi */
final class bbyi extends bbmp implements bbnc {
    public final PriorityBlockingQueue a = new PriorityBlockingQueue();
    public volatile boolean b;
    private final AtomicInteger c = new AtomicInteger();
    private final AtomicInteger d = new AtomicInteger();

    bbyi() {
    }

    public final bbnc a(Runnable runnable) {
        return a(runnable, bbmp.a(TimeUnit.MILLISECONDS));
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        long a = bbmp.a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
        return a(new bbyg(runnable, this, a), a);
    }

    private final bbnc a(Runnable runnable, long j) {
        if (this.b) {
            return bboc.INSTANCE;
        }
        bbyf bbyf = new bbyf(runnable, Long.valueOf(j), this.d.incrementAndGet());
        this.a.add(bbyf);
        if (this.c.getAndIncrement() != 0) {
            return bbnb.a(new bbyh(this, bbyf));
        }
        int i = 1;
        while (!this.b) {
            bbyf bbyf2 = (bbyf) this.a.poll();
            if (bbyf2 == null) {
                i = this.c.addAndGet(-i);
                if (i == 0) {
                    return bboc.INSTANCE;
                }
            } else if (!bbyf2.b) {
                bbyf2.a.run();
            }
        }
        this.a.clear();
        return bboc.INSTANCE;
    }

    public final void bK_() {
        this.b = true;
    }

    public final boolean c() {
        return this.b;
    }
}
