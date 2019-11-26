package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ankq */
final class ankq implements ThreadFactory {
    private final /* synthetic */ ThreadFactory a;
    private final /* synthetic */ String b;
    private final /* synthetic */ AtomicLong c;
    private final /* synthetic */ Boolean d;
    private final /* synthetic */ Integer e = null;
    private final /* synthetic */ UncaughtExceptionHandler f = null;

    ankq(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        String str = this.b;
        if (str != null) {
            newThread.setName(ankn.a(str, Long.valueOf(this.c.getAndIncrement())));
        }
        Boolean bool = this.d;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        return newThread;
    }
}
