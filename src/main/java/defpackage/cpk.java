package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cpk */
final class cpk implements ThreadFactory {
    private static final AtomicInteger b = new AtomicInteger(1);
    public final int a;
    private final AtomicInteger c = new AtomicInteger(1);
    private final int d;

    public cpk(int i) {
        this.a = i;
        this.d = b.getAndIncrement();
    }

    public final Thread newThread(Runnable runnable) {
        cpj cpj = new cpj(this, runnable);
        int i = this.d;
        int andIncrement = this.c.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append("ComponentLayoutThread");
        stringBuilder.append(i);
        stringBuilder.append("-");
        stringBuilder.append(andIncrement);
        Thread thread = new Thread(cpj, stringBuilder.toString());
        thread.setPriority(10);
        return thread;
    }
}
