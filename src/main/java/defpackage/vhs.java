package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: vhs */
final class vhs implements anjv {
    private final anko a = anko.f();
    private final anko b = anko.f();

    public final void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    public final void a(Object obj) {
        this.b.a_(obj);
    }

    public final Object get() {
        return this.b.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final boolean cancel(boolean z) {
        z = this.b.cancel(z);
        a();
        return z;
    }

    public final void a() {
        if (this.b.isDone()) {
            this.a.a_(Boolean.valueOf(true));
        }
    }
}
