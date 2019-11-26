package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: pgg */
final class pgg implements UncaughtExceptionHandler {
    private final /* synthetic */ pgd a;

    pgg(pgd pgd) {
        this.a = pgd;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        pfm pfm = this.a.e;
        if (pfm != null) {
            pfm.d("Job execution failed", th);
        }
    }
}
