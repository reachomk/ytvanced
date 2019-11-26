package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbcz */
public final class bbcz implements Runnable {
    private static final Logger a = Logger.getLogger(bbcz.class.getName());
    private final Runnable b;

    public bbcz(Runnable runnable) {
        this.b = (Runnable) amqw.a((Object) runnable, (Object) "task");
    }

    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(this.b);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 35);
            stringBuilder.append("Exception while executing runnable ");
            stringBuilder.append(valueOf);
            logger.logp(level, "io.grpc.internal.LogExceptionRunnable", "run", stringBuilder.toString(), th);
            amrs.a(th);
            AssertionError assertionError = new AssertionError(th);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 22);
        stringBuilder.append("LogExceptionRunnable(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
