package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbdd */
final class bbdd implements UncaughtExceptionHandler {
    private final /* synthetic */ bbde a;

    bbdd(bbde bbde) {
        this.a = bbde;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = bbde.a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(this.a.d);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 59);
        stringBuilder.append("[");
        stringBuilder.append(valueOf);
        stringBuilder.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$1", "uncaughtException", stringBuilder.toString(), th);
        bbde bbde = this.a;
        if (!bbde.r) {
            bbde.r = true;
            bbde.b(true);
            bbde.a(false);
            bbde.a(new bbdi(th));
            bbde.C.a(4, "PANIC! Entering TRANSIENT_FAILURE");
            bbde.m.a(basp.TRANSIENT_FAILURE);
        }
    }
}
