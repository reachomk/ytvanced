package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: wza */
public final class wza implements Future {
    private final Future a;

    public wza(Future future) {
        this.a = future;
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
        xak.b();
        return this.a.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        xak.b();
        return this.a.get(j, timeUnit);
    }
}
