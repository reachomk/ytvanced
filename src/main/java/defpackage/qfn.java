package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qfn */
final class qfn implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    qfn() {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.a.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("gcm-task#");
        stringBuilder.append(andIncrement);
        Thread thread = new Thread(runnable, stringBuilder.toString());
        thread.setPriority(4);
        return thread;
    }
}
