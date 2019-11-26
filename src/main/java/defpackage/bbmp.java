package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bbmp */
public abstract class bbmp implements bbnc {
    public abstract bbnc a(Runnable runnable, long j, TimeUnit timeUnit);

    public bbnc a(Runnable runnable) {
        return a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public static long a(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
}
