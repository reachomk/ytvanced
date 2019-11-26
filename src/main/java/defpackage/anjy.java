package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: anjy */
public final class anjy extends FutureTask implements anjv {
    private final aniy a = new aniy();

    public static anjy a(Callable callable) {
        return new anjy(callable);
    }

    private anjy(Callable callable) {
        super(callable);
    }

    public final void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    /* Access modifiers changed, original: protected|final */
    public final void done() {
        this.a.a();
    }
}
