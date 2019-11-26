package defpackage;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: bcpj */
final class bcpj implements Executor {
    private final BlockingQueue a = new LinkedBlockingQueue();
    private boolean b;
    private boolean c;
    private InterruptedIOException d;
    private RuntimeException e;

    bcpj() {
    }

    private final Runnable a(boolean z, long j) {
        Runnable runnable;
        if (z) {
            try {
                runnable = (Runnable) this.a.poll(j, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            }
        }
        runnable = (Runnable) this.a.take();
        if (runnable != null) {
            return runnable;
        }
        throw new SocketTimeoutException();
    }

    public final void a() {
        a(0);
    }

    public final void a(int i) {
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert((long) i, TimeUnit.MILLISECONDS);
        InterruptedIOException interruptedIOException;
        if (this.c) {
            interruptedIOException = this.d;
            if (interruptedIOException != null) {
                throw interruptedIOException;
            }
            throw this.e;
        } else if (this.b) {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        } else {
            this.b = true;
            while (this.b) {
                if (i == 0) {
                    try {
                        a(false, 0).run();
                    } catch (InterruptedIOException interruptedIOException2) {
                        this.b = false;
                        this.c = true;
                        this.d = interruptedIOException2;
                        throw interruptedIOException2;
                    } catch (RuntimeException e) {
                        this.b = false;
                        this.c = true;
                        this.e = e;
                        throw e;
                    }
                }
                a(true, (convert - System.nanoTime()) + nanoTime).run();
            }
        }
    }

    public final void b() {
        this.b = false;
    }

    public final void execute(Runnable runnable) {
        if (runnable != null) {
            try {
                this.a.put(runnable);
                return;
            } catch (InterruptedException e) {
                throw new RejectedExecutionException(e);
            }
        }
        throw new IllegalArgumentException();
    }
}
