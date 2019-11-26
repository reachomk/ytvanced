package defpackage;

import android.app.Application;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: txf */
final class txf implements txg {
    private static final AtomicInteger e = new AtomicInteger();
    public final Application a;
    public final tzu b;
    public final AtomicReference c = new AtomicReference();
    public final CountDownLatch d = new CountDownLatch(1);
    private final AtomicBoolean f = new AtomicBoolean();

    txf(Application application, tzu tzu, boolean z) {
        uhy.b(true);
        this.a = (Application) uhy.a((Object) application);
        this.b = (tzu) uhy.a((Object) tzu);
        e.incrementAndGet();
        this.c.set(new twy(false));
    }

    static boolean e() {
        return true;
    }

    /* Access modifiers changed, original: final */
    public final txg d() {
        return (txg) this.c.get();
    }

    public final Runnable a(ExecutorService executorService, Runnable runnable, boolean z) {
        return txf.a(new txi(this, executorService, runnable, true));
    }

    private static Runnable a(Runnable runnable) {
        return new txh(runnable);
    }

    static Runnable a(txf txf, tya tya, tzu tzu, tzu tzu2, tzu tzu3) {
        return txf.a(new txk(txf, tya, tzu, tzu2, tzu3, new txl(tty.a(txf.a)), new txo(tty.a(txf.a), txf.b)));
    }

    public final void a() {
        ((txg) this.c.getAndSet(new twu())).a();
        try {
            Application application = this.a;
            synchronized (tty.class) {
                if (tty.a != null) {
                    tty.a.b.b(application);
                    tty.a = null;
                }
            }
        } catch (RuntimeException unused) {
            tyv.d("Primes", "Failed to shutdown app lifecycle monitor", new Object[0]);
        }
    }

    public final void b() {
        d().b();
    }

    public final void a(String str) {
        d().a(str);
    }

    public final void a(twm twm) {
        d().a(twm);
    }

    public final void c() {
        if (!this.f.getAndSet(true)) {
            d().c();
        }
    }

    public final UncaughtExceptionHandler a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        return d().a(uncaughtExceptionHandler);
    }
}
