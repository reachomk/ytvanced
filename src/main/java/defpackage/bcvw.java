package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bcvw */
public final class bcvw implements Future {
    private volatile boolean a;
    private final /* synthetic */ CountDownLatch b;
    private final /* synthetic */ bcuo c;
    private final /* synthetic */ AtomicReference d;
    private final /* synthetic */ AtomicReference e;

    public bcvw(CountDownLatch countDownLatch, bcuo bcuo, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.b = countDownLatch;
        this.c = bcuo;
        this.d = atomicReference;
        this.e = atomicReference2;
    }

    public final boolean cancel(boolean z) {
        if (this.b.getCount() <= 0) {
            return false;
        }
        this.a = true;
        this.c.b();
        this.b.countDown();
        return true;
    }

    public final boolean isCancelled() {
        return this.a;
    }

    public final boolean isDone() {
        return this.b.getCount() == 0;
    }

    public final Object get() {
        this.b.await();
        return a();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (this.b.await(j, timeUnit)) {
            return a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Timed out after ");
        stringBuilder.append(timeUnit.toMillis(j));
        stringBuilder.append("ms waiting for underlying Observable.");
        throw new TimeoutException(stringBuilder.toString());
    }

    private final Object a() {
        Throwable th = (Throwable) this.d.get();
        if (th != null) {
            throw new ExecutionException("Observable onError", th);
        } else if (!this.a) {
            return this.e.get();
        } else {
            throw new CancellationException("Subscription unsubscribed");
        }
    }
}
