package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: pgy */
public final class pgy extends ThreadPoolExecutor {
    public final /* synthetic */ pgv a;

    public pgy(pgv pgv) {
        this.a = pgv;
        super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
        setThreadFactory(new pgx());
        allowCoreThreadTimeOut(true);
    }

    /* Access modifiers changed, original: protected|final */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new pgz(this, runnable, obj);
    }
}
