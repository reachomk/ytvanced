package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: acbi */
final /* synthetic */ class acbi implements UncaughtExceptionHandler {
    private final acay a;

    acbi(acay acay) {
        this.a = acay;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        acay acay = this.a;
        xtl.a("MediaMuxCapturePipelineMgr", "Codec thread died unexpectedly", th);
        acay.a(1);
    }
}
