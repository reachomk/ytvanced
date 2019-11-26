package defpackage;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: adhq */
final class adhq implements Runnable {
    private final List a;
    private final CountDownLatch b;
    private final adfq c;

    adhq(List list, CountDownLatch countDownLatch, adfq adfq) {
        this.a = list;
        this.b = countDownLatch;
        this.c = adfq;
    }

    public final void run() {
        this.a.addAll(this.c.a());
        this.b.countDown();
    }
}
