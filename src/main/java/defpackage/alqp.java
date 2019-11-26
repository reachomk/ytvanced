package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: alqp */
final class alqp implements Future {
    private final Future a;
    private final alri b;

    alqp(Future future, alri alri) {
        this.a = future;
        this.b = alri;
    }

    public final boolean cancel(boolean z) {
        xtl.c("Timed out waiting for video metadata");
        this.b.bH_();
        return this.a.cancel(z);
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return (altl) this.a.get(j, timeUnit);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return (altl) this.a.get();
    }
}
