package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: tyd */
final class tyd implements ThreadFactory {
    public final int a;
    private final AtomicInteger b;
    private final String c;

    tyd(int i) {
        this("Primes", i);
    }

    tyd(String str, int i) {
        this.b = new AtomicInteger(1);
        this.a = i;
        this.c = str;
    }

    public final Thread newThread(Runnable runnable) {
        tyg tyg = new tyg(this, runnable);
        String str = this.c;
        int andIncrement = this.b.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder.append(str);
        stringBuilder.append("-");
        stringBuilder.append(andIncrement);
        Thread thread = new Thread(tyg, stringBuilder.toString());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
