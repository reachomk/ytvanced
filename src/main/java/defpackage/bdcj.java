package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: bdcj */
final class bdcj implements ThreadFactory {
    bdcj() {
    }

    public final Thread newThread(Runnable runnable) {
        throw new AssertionError("No threads allowed.");
    }
}
