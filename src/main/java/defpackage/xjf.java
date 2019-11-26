package defpackage;

import java.net.SocketTimeoutException;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: xjf */
final class xjf implements Executor {
    public final long a;
    public final long b;
    public boolean c;
    private final BlockingQueue d = new LinkedBlockingDeque();

    xjf(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    /* Access modifiers changed, original: final */
    public final void a(bckx bckx) {
        a(bckx, this.b);
    }

    public final void a(bckx bckx, long j) {
        try {
            Runnable runnable = (Runnable) this.d.poll(j, TimeUnit.MILLISECONDS);
            if (runnable != null) {
                runnable.run();
            } else {
                bckx.c();
                throw new SocketTimeoutException();
            }
        } catch (InterruptedException e) {
            bckx.c();
            ClosedByInterruptException closedByInterruptException = new ClosedByInterruptException();
            closedByInterruptException.initCause(e);
            throw closedByInterruptException;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.c = true;
    }

    public final void execute(Runnable runnable) {
        amqw.a((Object) runnable);
        if (!this.d.offer(runnable)) {
            throw new RejectedExecutionException();
        }
    }
}
