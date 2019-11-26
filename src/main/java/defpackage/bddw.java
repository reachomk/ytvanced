package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bddw */
public final class bddw {
    private final bctz a;

    private bddw(bctz bctz) {
        this.a = bctz;
    }

    public static bddw a(bctz bctz) {
        return new bddw(bctz);
    }

    public final Object a() {
        bctz d = this.a.d();
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        bcuo a = bctz.a(new bddz(countDownLatch, atomicReference2, atomicReference), d);
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                a.b();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
        if (atomicReference2.get() != null) {
            bcva.a((Throwable) atomicReference2.get());
        }
        return atomicReference.get();
    }

    static {
        Object obj = new Object();
        obj = new Object();
        obj = new Object();
    }
}
