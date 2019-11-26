package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: ryp */
final class ryp implements ryo {
    public final CountDownLatch a = new CountDownLatch(1);

    private ryp() {
    }

    public final void a(Object obj) {
        this.a.countDown();
    }

    public final void a(Exception exception) {
        this.a.countDown();
    }

    public final void a() {
        this.a.countDown();
    }

    /* synthetic */ ryp(byte b) {
    }
}
