package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pgx */
final class pgx implements ThreadFactory {
    private static final AtomicInteger a = new AtomicInteger();

    private pgx() {
    }

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = a.incrementAndGet();
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append("measurement-");
        stringBuilder.append(incrementAndGet);
        return new pha(runnable, stringBuilder.toString());
    }

    /* synthetic */ pgx(byte b) {
    }
}
