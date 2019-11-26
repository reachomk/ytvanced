package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bbmn */
public abstract class bbmn {
    public abstract bbmp a();

    public bbnc a(Runnable runnable) {
        return a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        bbmp a = a();
        bbmq bbmq = new bbmq(bbzf.a(runnable), a);
        a.a(bbmq, j, timeUnit);
        return bbmq;
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());
    }
}
