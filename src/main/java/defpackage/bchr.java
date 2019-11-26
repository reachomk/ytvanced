package defpackage;

import org.chromium.base.JavaHandlerThread;

/* renamed from: bchr */
public final class bchr implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ JavaHandlerThread b;

    public bchr(JavaHandlerThread javaHandlerThread, long j) {
        this.b = javaHandlerThread;
        this.a = j;
    }

    public final void run() {
        this.b.a.quit();
        this.b.nativeOnLooperStopped(this.a);
    }
}
