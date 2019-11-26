package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbgt */
final class bbgt implements Executor {
    private static final Logger a = Logger.getLogger(bbgt.class.getName());
    private boolean b;
    private ArrayDeque c;

    bbgt() {
    }

    public final void execute(Runnable runnable) {
        amqw.a((Object) runnable, (Object) "'task' must not be null.");
        if (this.b) {
            if (this.c == null) {
                this.c = new ArrayDeque(4);
            }
            this.c.add(runnable);
            return;
        }
        this.b = true;
        try {
            runnable.run();
            if (this.c != null) {
                a();
            }
            this.b = false;
        } catch (Throwable th) {
            if (this.c != null) {
                a();
            }
            this.b = false;
        }
    }

    private final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(runnable);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 35);
                    stringBuilder.append("Exception while executing runnable ");
                    stringBuilder.append(valueOf);
                    logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", stringBuilder.toString(), th);
                }
            } else {
                return;
            }
        }
    }
}
