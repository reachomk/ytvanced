package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* renamed from: xal */
public final class xal extends ScheduledThreadPoolExecutor {
    private final List a;

    public xal(String str) {
        this(2, new xaf(8, str));
    }

    public xal(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
        this.a = new CopyOnWriteArrayList();
    }

    public final xal a(xai xai) {
        if (!this.a.contains(xai)) {
            this.a.add(xai);
        }
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (!this.a.isEmpty()) {
            for (xai a : this.a) {
                a.a();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            try {
                Future future = (Future) runnable;
                if (future.isDone() && !future.isCancelled()) {
                    future.get();
                }
            } catch (ExecutionException e) {
                th = e.getCause();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (!this.a.isEmpty()) {
            for (xai a : this.a) {
                a.a(th);
            }
        }
    }
}
