package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbzf */
public final class bbzf {
    public static void a(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!((th instanceof bbno) || (th instanceof bbnl) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof bbnf))) {
            th = new bbnq(th);
        }
        ankx.a(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static Runnable a(Runnable runnable) {
        bbow.a((Object) runnable, "run is null");
        return runnable;
    }

    public static bbmn a(Callable callable) {
        try {
            return (bbmn) bbow.a(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            RuntimeException a = bbyw.a(th);
        }
    }
}
