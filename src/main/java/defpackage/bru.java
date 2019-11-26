package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: bru */
final class bru implements ThreadFactory {
    private bru() {
    }

    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }

    /* synthetic */ bru(byte b) {
    }
}
