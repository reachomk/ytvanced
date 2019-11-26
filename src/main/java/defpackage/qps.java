package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: qps */
public final class qps {
    private final ArrayBlockingQueue a = new ArrayBlockingQueue(1);
    private boolean b = false;
    private boolean c = false;

    qps() {
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj) {
        if (this.b) {
            throw new RuntimeException("BlockingChannel can be written only once.");
        }
        this.b = true;
        this.a.offer(obj);
    }

    public final Object a(long j) {
        if (this.c) {
            throw new RuntimeException("BlockingChannel can be read only once.");
        }
        this.c = true;
        return this.a.poll(j, TimeUnit.MILLISECONDS);
    }
}
