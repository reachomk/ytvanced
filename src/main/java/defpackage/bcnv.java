package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bcnv */
final class bcnv implements Executor {
    private final Executor a;

    bcnv(Executor executor) {
        this.a = executor;
    }

    public final void execute(Runnable runnable) {
        bcny bcny = new bcny(runnable, Thread.currentThread());
        this.a.execute(bcny);
        bcjq bcjq = bcny.b;
        if (bcjq == null) {
            bcny.a = null;
            return;
        }
        throw bcjq;
    }
}
