package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: cgb */
public final class cgb implements cga, cgd {
    private static final cge a = new cge();
    private final int b;
    private final int c;
    private final boolean d = true;
    private Object e;
    private cfz f;
    private boolean g;
    private boolean h;
    private boolean i;
    private bvn j;

    public cgb(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final void a() {
    }

    public final void a(Drawable drawable) {
    }

    public final synchronized void a(Object obj, chb chb) {
    }

    public final void b() {
    }

    public final void b(Drawable drawable) {
    }

    public final void b(cgr cgr) {
    }

    public final void c() {
    }

    public final synchronized void c(Drawable drawable) {
    }

    /* JADX WARNING: Missing block: B:11:0x001b, code skipped:
            return true;
     */
    public final synchronized boolean cancel(boolean r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.isDone();	 Catch:{ all -> 0x001f }
        if (r0 != 0) goto L_0x001c;
    L_0x0007:
        r0 = 1;
        r1.g = r0;	 Catch:{ all -> 0x001f }
        r1.notifyAll();	 Catch:{ all -> 0x001f }
        if (r2 != 0) goto L_0x0010;
    L_0x000f:
        goto L_0x001a;
    L_0x0010:
        r2 = r1.f;	 Catch:{ all -> 0x001f }
        if (r2 == 0) goto L_0x001a;
    L_0x0014:
        r2.b();	 Catch:{ all -> 0x001f }
        r2 = 0;
        r1.f = r2;	 Catch:{ all -> 0x001f }
    L_0x001a:
        monitor-exit(r1);
        return r0;
    L_0x001c:
        r2 = 0;
        monitor-exit(r1);
        return r2;
    L_0x001f:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgb.cancel(boolean):boolean");
    }

    public final synchronized boolean isCancelled() {
        return this.g;
    }

    public final synchronized boolean isDone() {
        boolean z;
        z = this.g || this.h || this.i;
        return z;
    }

    public final Object get() {
        try {
            return a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return a(Long.valueOf(timeUnit.toMillis(j)));
    }

    public final void a(cgr cgr) {
        cgr.a(this.b, this.c);
    }

    public final synchronized void a(cfz cfz) {
        this.f = cfz;
    }

    public final synchronized cfz d() {
        return this.f;
    }

    private final synchronized Object a(Long l) {
        if (this.d) {
            if (!isDone()) {
                if (!chv.c()) {
                    throw new IllegalArgumentException("You must call this method on a background thread");
                }
            }
        }
        if (this.g) {
            throw new CancellationException();
        } else if (this.i) {
            throw new ExecutionException(this.j);
        } else if (this.h) {
            return this.e;
        } else {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    wait(longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.i) {
                throw new ExecutionException(this.j);
            } else if (this.g) {
                throw new CancellationException();
            } else if (this.h) {
                return this.e;
            } else {
                throw new TimeoutException();
            }
        }
    }

    public final synchronized boolean a(bvn bvn, Object obj, cgu cgu, boolean z) {
        this.i = true;
        this.j = bvn;
        notifyAll();
        return false;
    }

    public final synchronized boolean a(Object obj, int i) {
        this.h = true;
        this.e = obj;
        notifyAll();
        return false;
    }
}
