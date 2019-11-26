package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ankd */
public class ankd extends anhz {
    private final ExecutorService a;

    public ankd(ExecutorService executorService) {
        this.a = (ExecutorService) amqw.a((Object) executorService);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final void shutdown() {
        this.a.shutdown();
    }

    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
