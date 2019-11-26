package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bxr */
public final class bxr implements ExecutorService {
    public static final long a = TimeUnit.SECONDS.toMillis(10);
    private static volatile int b;
    private final ExecutorService c;

    public static bxr a() {
        return new bxr(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new bxu("disk-cache", bxw.b, true)));
    }

    public static bxr a(int i, String str, bxw bxw) {
        return new bxr(new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new bxu(str, bxw, false)));
    }

    public bxr(ExecutorService executorService) {
        this.c = executorService;
    }

    public final void execute(Runnable runnable) {
        this.c.execute(runnable);
    }

    public final Future submit(Runnable runnable) {
        return this.c.submit(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.c.invokeAll(collection);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.c.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.c.invokeAny(collection);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.c.invokeAny(collection, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.c.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.c.submit(callable);
    }

    public final void shutdown() {
        this.c.shutdown();
    }

    public final List shutdownNow() {
        return this.c.shutdownNow();
    }

    public final boolean isShutdown() {
        return this.c.isShutdown();
    }

    public final boolean isTerminated() {
        return this.c.isTerminated();
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.c.awaitTermination(j, timeUnit);
    }

    public final String toString() {
        return this.c.toString();
    }

    public static int b() {
        if (b == 0) {
            b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return b;
    }
}
