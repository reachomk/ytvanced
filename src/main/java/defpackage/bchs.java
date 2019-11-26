package defpackage;

import org.chromium.base.JavaHandlerThread;

/* renamed from: bchs */
public final class bchs implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ long b;
    private final /* synthetic */ JavaHandlerThread c;

    public bchs(JavaHandlerThread javaHandlerThread, long j, long j2) {
        this.c = javaHandlerThread;
        this.a = j;
        this.b = j2;
    }

    public final void run() {
        this.c.nativeInitializeThread(this.a, this.b);
    }
}
