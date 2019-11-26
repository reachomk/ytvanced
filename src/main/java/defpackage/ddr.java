package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: ddr */
final class ddr implements ThreadFactory {
    ddr() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "FJD.ExecutionDelegator gms-bg-executor");
    }
}
