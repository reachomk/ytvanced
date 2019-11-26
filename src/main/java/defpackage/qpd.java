package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qpd */
public final class qpd implements ThreadFactory {
    private final String a;
    private final AtomicInteger b = new AtomicInteger();
    private final ThreadFactory c = Executors.defaultThreadFactory();

    public qpd(String str) {
        this.a = (String) pzr.a((Object) str, (Object) "Name must not be null");
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new qpg(runnable));
        String str = this.a;
        int andIncrement = this.b.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
        stringBuilder.append(str);
        stringBuilder.append("[");
        stringBuilder.append(andIncrement);
        stringBuilder.append("]");
        newThread.setName(stringBuilder.toString());
        return newThread;
    }
}
