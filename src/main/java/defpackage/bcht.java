package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import org.chromium.base.JavaHandlerThread;

/* renamed from: bcht */
public final class bcht implements UncaughtExceptionHandler {
    private final /* synthetic */ JavaHandlerThread a;

    public bcht(JavaHandlerThread javaHandlerThread) {
        this.a = javaHandlerThread;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.a.b = th;
    }
}
