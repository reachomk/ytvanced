package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: txc */
final class txc implements UncaughtExceptionHandler, txe {
    private final UncaughtExceptionHandler a;
    private final AtomicReference b;
    private final AtomicReference c;
    private volatile txg d;

    public final void a(tui tui) {
        this.d = tui;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.d == null) {
            Runnable runnable = (Runnable) this.b.getAndSet(null);
            CountDownLatch countDownLatch = (CountDownLatch) this.c.getAndSet(null);
            if (runnable == null || countDownLatch == null) {
                Thread.sleep(100);
            } else {
                try {
                    Executors.newSingleThreadExecutor(txb.a).execute(runnable);
                    countDownLatch.await(1000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    tyv.d("Primes", "Wait for initialization is interrupted", new Object[0]);
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (this.d != null) {
            this.d.a(this.a).uncaughtException(thread, th);
            return;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* synthetic */ txc(UncaughtExceptionHandler uncaughtExceptionHandler, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.a = uncaughtExceptionHandler;
        this.b = atomicReference;
        this.c = atomicReference2;
    }
}
