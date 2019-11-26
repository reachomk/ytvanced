package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* renamed from: anhz */
public abstract class anhz extends AbstractExecutorService implements anka {
    /* Access modifiers changed, original: protected|final */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return anku.a(runnable, obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final RunnableFuture newTaskFor(Callable callable) {
        return anku.a(callable);
    }

    /* renamed from: a */
    public final anjv submit(Callable callable) {
        return (anjv) super.submit(callable);
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (anjv) super.submit(runnable, obj);
    }
}
