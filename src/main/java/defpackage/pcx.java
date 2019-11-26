package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: pcx */
final class pcx extends Thread {
    public final CountDownLatch a = new CountDownLatch(1);
    public boolean b = false;
    private final WeakReference c;
    private final long d;

    public pcx(pcv pcv, long j) {
        this.c = new WeakReference(pcv);
        this.d = j;
        start();
    }

    private final void a() {
        pcv pcv = (pcv) this.c.get();
        if (pcv != null) {
            pcv.b();
            this.b = true;
        }
    }

    public final void run() {
        try {
            if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
