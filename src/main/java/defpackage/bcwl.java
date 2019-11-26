package defpackage;

import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bcwl */
final class bcwl extends AtomicInteger implements bcuc, bcuo {
    private static final Object n = new Object();
    public static final long serialVersionUID = 8567835998786448817L;
    public final bcup a;
    public final bcwi[] b;
    public final int c;
    public volatile boolean d;
    public final AtomicReference e;
    private final bcvs f;
    private final Object[] g;
    private final bdcw h;
    private final boolean i = false;
    private volatile boolean j;
    private final AtomicLong k;
    private int l;
    private int m;

    public bcwl(bcup bcup, bcvs bcvs, int i, int i2) {
        this.a = bcup;
        this.f = bcvs;
        this.c = i2;
        this.g = new Object[i];
        Arrays.fill(this.g, n);
        this.b = new bcwi[i];
        this.h = new bdcw(i2);
        this.k = new AtomicLong();
        this.e = new AtomicReference();
    }

    public final void a(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("n >= required but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j != 0) {
            bcvu.a(this.k, j);
            a();
        }
    }

    public final void b() {
        if (!this.d) {
            this.d = true;
            if (getAndIncrement() == 0) {
                a(this.h);
            }
        }
    }

    public final boolean c() {
        return this.d;
    }

    private final void a(Queue queue) {
        queue.clear();
        for (bcup b : this.b) {
            b.b();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj, int i) {
        int length;
        int i2;
        Object obj2 = this.b[i];
        synchronized (this) {
            Object[] objArr = this.g;
            length = objArr.length;
            Object obj3 = objArr[i];
            i2 = this.l;
            if (obj3 == n) {
                i2++;
                this.l = i2;
            }
            int i3 = this.m;
            if (obj == null) {
                i3++;
                this.m = i3;
            } else {
                this.g[i] = bcwf.e(obj);
            }
            if (i3 != length) {
                if (obj == null) {
                    if (obj3 != n) {
                    }
                }
                if (obj == null || i2 != length) {
                    if (obj == null && this.e.get() != null) {
                        obj3 = n;
                        this.j = true;
                    }
                } else {
                    this.h.a(obj2, this.g.clone());
                }
            }
            this.j = true;
        }
        if (i2 == length || obj == null) {
            a();
        } else {
            obj2.e();
        }
    }

    private final void a() {
        if (getAndIncrement() == 0) {
            Queue queue = this.h;
            bcup bcup = this.a;
            AtomicLong atomicLong = this.k;
            int i = 1;
            loop0:
            while (true) {
                if (!a(this.j, queue.isEmpty(), bcup, queue, false)) {
                    long j;
                    long j2 = atomicLong.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z = this.j;
                        bcwi bcwi = (bcwi) queue.peek();
                        boolean z2 = bcwi == null;
                        j = j3;
                        if (!a(z, z2, bcup, queue, false)) {
                            if (z2) {
                                break;
                            }
                            queue.poll();
                            Object[] objArr = (Object[]) queue.poll();
                            if (objArr == null) {
                                this.d = true;
                                a(queue);
                                bcup.a(new IllegalStateException("Broken queue?! Sender received but not the array."));
                                return;
                            }
                            try {
                                bcup.e_(this.f.a(objArr));
                                bcwi.e();
                                j3 = j + 1;
                            } catch (Throwable th) {
                                this.d = true;
                                a(queue);
                                bcup.a(th);
                                return;
                            }
                        }
                        break loop0;
                    }
                    j = j3;
                    if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                        bcvu.b(atomicLong, j);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    private final boolean a(boolean z, boolean z2, bcup bcup, Queue queue, boolean z3) {
        if (this.d) {
            a(queue);
            return true;
        }
        if (z) {
            Throwable th = (Throwable) this.e.get();
            if (th != null) {
                a(queue);
                bcup.a(th);
                return true;
            } else if (z2) {
                bcup.bM_();
                return true;
            }
        }
        return false;
    }
}
