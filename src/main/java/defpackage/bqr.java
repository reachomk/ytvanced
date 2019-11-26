package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bqr */
public final class bqr implements bqj, bqk, Future {
    private boolean a = false;
    private Object b;
    private bqn c;

    public static bqr a() {
        return new bqr();
    }

    public final synchronized boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    private bqr() {
    }

    public final Object get() {
        try {
            return a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return a(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    private final synchronized Object a(Long l) {
        bqn bqn = this.c;
        if (bqn != null) {
            throw new ExecutionException(bqn);
        } else if (this.a) {
            return this.b;
        } else {
            if (l == null) {
                while (!isDone()) {
                    wait(0);
                }
            } else if (l.longValue() > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long longValue = l.longValue() + uptimeMillis;
                while (!isDone() && uptimeMillis < longValue) {
                    wait(longValue - uptimeMillis);
                    uptimeMillis = SystemClock.uptimeMillis();
                }
            }
            bqn bqn2 = this.c;
            if (bqn2 != null) {
                throw new ExecutionException(bqn2);
            } else if (this.a) {
                return this.b;
            } else {
                throw new TimeoutException();
            }
        }
    }

    public final synchronized boolean isDone() {
        boolean z;
        z = this.a || this.c != null;
        return z;
    }

    public final synchronized void a(Object obj) {
        this.a = true;
        this.b = obj;
        notifyAll();
    }

    public final synchronized void a(bqn bqn) {
        this.c = bqn;
        notifyAll();
    }
}
