package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bdcg */
public final class bdcg extends AtomicLong implements ThreadFactory {
    public static final ThreadFactory a = new bdcj();
    public static final long serialVersionUID = -8841098858898482335L;
    private final String b;

    public bdcg(String str) {
        this.b = str;
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(incrementAndGet());
        Thread thread = new Thread(runnable, stringBuilder.toString());
        thread.setDaemon(true);
        return thread;
    }
}
