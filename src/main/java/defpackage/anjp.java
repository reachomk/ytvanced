package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: anjp */
abstract class anjp implements anjv {
    private static final Logger a = Logger.getLogger(anjp.class.getName());

    anjp() {
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public abstract Object get();

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final void a(Runnable runnable, Executor executor) {
        amqw.a((Object) runnable, (Object) "Runnable was null.");
        amqw.a((Object) executor, (Object) "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 57) + valueOf2.length());
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with executor ");
            stringBuilder.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", stringBuilder.toString(), e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        amqw.a((Object) timeUnit);
        return get();
    }
}
