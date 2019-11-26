package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: qpe */
public final class qpe implements ThreadFactory {
    private final String a;
    private final ThreadFactory b = Executors.defaultThreadFactory();

    public qpe(String str) {
        this.a = (String) pzr.a((Object) str, (Object) "Name must not be null");
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new qpg(runnable));
        newThread.setName(this.a);
        return newThread;
    }
}
