package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: txb */
final /* synthetic */ class txb implements ThreadFactory {
    public static final ThreadFactory a = new txb();

    private txb() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "Primes-preInit");
    }
}
