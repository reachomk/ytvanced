package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bcvx */
public final class bcvx extends bcup {
    private final /* synthetic */ CountDownLatch a;
    private final /* synthetic */ AtomicReference b;
    private final /* synthetic */ AtomicReference c;

    public bcvx(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.a = countDownLatch;
        this.b = atomicReference;
        this.c = atomicReference2;
    }

    public final void bM_() {
        this.a.countDown();
    }

    public final void a(Throwable th) {
        this.b.compareAndSet(null, th);
        this.a.countDown();
    }

    public final void e_(Object obj) {
        this.c.set(obj);
    }
}
