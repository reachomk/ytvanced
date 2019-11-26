package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: anjc */
final class anjc extends anja {
    private final anjv a;

    anjc(anjv anjv) {
        this.a = (anjv) amqw.a((Object) anjv);
    }

    public final void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public final Object get() {
        return this.a.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
