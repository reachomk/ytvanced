package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: btv */
final class btv implements ThreadFactory {
    btv() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new bty(runnable), "glide-active-resources");
    }
}
