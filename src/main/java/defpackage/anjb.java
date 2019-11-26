package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: anjb */
public abstract class anjb extends amtr implements Future {
    protected anjb() {
    }

    public abstract Future c();

    /* Access modifiers changed, original: protected|bridge|synthetic */
    public /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public boolean cancel(boolean z) {
        return c().cancel(z);
    }

    public final boolean isCancelled() {
        return c().isCancelled();
    }

    public final boolean isDone() {
        return c().isDone();
    }

    public Object get() {
        return c().get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return c().get(j, timeUnit);
    }
}
