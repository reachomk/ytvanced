package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: acco */
final /* synthetic */ class acco implements UncaughtExceptionHandler {
    private final acck a;

    acco(acck acck) {
        this.a = acck;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        acck acck = this.a;
        acck.a(new accp(acck, th));
    }
}
