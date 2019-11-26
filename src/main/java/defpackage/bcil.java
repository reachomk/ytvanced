package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bcil */
final class bcil implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    bcil() {
    }

    public final Thread newThread(Runnable runnable) {
        bcik bcik = new bcik(runnable);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CrAsyncTask #");
        stringBuilder.append(this.a.getAndIncrement());
        return new Thread(bcik, stringBuilder.toString());
    }
}
