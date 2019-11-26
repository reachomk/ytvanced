package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbxe */
class bbxe extends AtomicReference implements bbnc {
    public static final FutureTask c = new FutureTask(bbod.b, null);
    private static final FutureTask d = new FutureTask(bbod.b, null);
    public static final long serialVersionUID = 1811839108042568751L;
    public final Runnable a;
    public Thread b;

    bbxe(Runnable runnable) {
        this.a = runnable;
    }

    public final void bK_() {
        Future future = (Future) get();
        if (future != c) {
            Future future2 = d;
            if (future != future2 && compareAndSet(future, future2) && future != null) {
                future.cancel(this.b != Thread.currentThread());
            }
        }
    }

    public final boolean c() {
        Future future = (Future) get();
        return future == c || future == d;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == c) {
                return;
            }
            if (future2 == d) {
                future.cancel(this.b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
