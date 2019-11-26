package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: eub */
public final class eub implements UncaughtExceptionHandler {
    public UncaughtExceptionHandler a;
    public final boolean b;
    private final etx c;

    public eub(zyw zyw, etx etx) {
        aovd D = foh.D(zyw);
        boolean z = false;
        if (D != null && D.b && D.d && D.e > 0) {
            z = true;
        }
        this.b = z;
        this.c = etx;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.b && this.c.a()) {
            this.c.b();
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
