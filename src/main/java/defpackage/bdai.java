package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: bdai */
final class bdai implements ThreadFactory {
    private final /* synthetic */ ThreadFactory a;

    bdai(ThreadFactory threadFactory) {
        this.a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(newThread.getName());
        stringBuilder.append(" (Evictor)");
        newThread.setName(stringBuilder.toString());
        return newThread;
    }
}
