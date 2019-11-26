package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: uld */
public final class uld implements ukl {
    public final ukm a;
    public CountDownLatch b;
    public volatile boolean c = false;

    public uld(ukm ukm) {
        this.a = ukm;
    }

    public final void b() {
        this.c = true;
    }

    public final void a() {
        this.c = false;
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void c() {
        this.a.c(this);
    }
}
