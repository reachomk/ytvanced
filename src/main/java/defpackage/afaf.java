package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CyclicBarrier;

/* renamed from: afaf */
final class afaf {
    private final Set a = new HashSet();
    private final long b;
    private final Set c = new HashSet();
    private CyclicBarrier d;
    private long e = -1;

    afaf(long j) {
        this.b = j;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(aezg aezg) {
        CyclicBarrier cyclicBarrier = this.d;
        if (cyclicBarrier != null) {
            cyclicBarrier.reset();
            this.d = null;
        }
        this.a.add(aezg);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(aezg aezg) {
        CyclicBarrier cyclicBarrier = this.d;
        if (cyclicBarrier != null) {
            cyclicBarrier.reset();
            this.d = null;
        }
        this.a.remove(aezg);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void c(aezg aezg) {
        if (this.a.contains(aezg)) {
            CyclicBarrier cyclicBarrier = this.d;
            if (cyclicBarrier != null) {
                cyclicBarrier.reset();
                this.d = null;
            }
            this.c.add(aezg);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r5 = r4.b;
     */
    /* JADX WARNING: Missing block: B:17:0x0031, code skipped:
            if (r5 <= 0) goto L_0x003b;
     */
    /* JADX WARNING: Missing block: B:18:0x0033, code skipped:
            r4.d.await(r5, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Missing block: B:19:0x003b, code skipped:
            r4.d.await();
     */
    public final long a(defpackage.aezg r5, long r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.c;	 Catch:{ all -> 0x0050 }
        r5 = r0.contains(r5);	 Catch:{ all -> 0x0050 }
        if (r5 != 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r4);	 Catch:{ all -> 0x0050 }
        return r6;
    L_0x000b:
        r5 = r4.d;	 Catch:{ all -> 0x0050 }
        if (r5 != 0) goto L_0x001c;
    L_0x000f:
        r5 = new java.util.concurrent.CyclicBarrier;	 Catch:{ all -> 0x0050 }
        r0 = r4.c;	 Catch:{ all -> 0x0050 }
        r0 = r0.size();	 Catch:{ all -> 0x0050 }
        r5.<init>(r0);	 Catch:{ all -> 0x0050 }
        r4.d = r5;	 Catch:{ all -> 0x0050 }
    L_0x001c:
        r0 = r4.e;	 Catch:{ all -> 0x0050 }
        r2 = -1;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x0028;
    L_0x0024:
        r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r5 >= 0) goto L_0x002a;
    L_0x0028:
        r4.e = r6;	 Catch:{ all -> 0x0050 }
    L_0x002a:
        monitor-exit(r4);	 Catch:{ all -> 0x0050 }
        r5 = r4.b;	 Catch:{ BrokenBarrierException | TimeoutException -> 0x0040, BrokenBarrierException | TimeoutException -> 0x0040 }
        r0 = 0;
        r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r7 <= 0) goto L_0x003b;
    L_0x0033:
        r7 = r4.d;	 Catch:{ BrokenBarrierException | TimeoutException -> 0x0040, BrokenBarrierException | TimeoutException -> 0x0040 }
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ BrokenBarrierException | TimeoutException -> 0x0040, BrokenBarrierException | TimeoutException -> 0x0040 }
        r7.await(r5, r0);	 Catch:{ BrokenBarrierException | TimeoutException -> 0x0040, BrokenBarrierException | TimeoutException -> 0x0040 }
        goto L_0x0040;
    L_0x003b:
        r5 = r4.d;	 Catch:{ BrokenBarrierException | TimeoutException -> 0x0040, BrokenBarrierException | TimeoutException -> 0x0040 }
        r5.await();	 Catch:{ BrokenBarrierException | TimeoutException -> 0x0040, BrokenBarrierException | TimeoutException -> 0x0040 }
    L_0x0040:
        monitor-enter(r4);
        r5 = 0;
        r4.d = r5;	 Catch:{ all -> 0x004d }
        r5 = r4.c;	 Catch:{ all -> 0x004d }
        r5.clear();	 Catch:{ all -> 0x004d }
        monitor-exit(r4);	 Catch:{ all -> 0x004d }
        r5 = r4.e;
        return r5;
    L_0x004d:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x004d }
        throw r5;
    L_0x0050:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0050 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afaf.a(aezg, long):long");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        CyclicBarrier cyclicBarrier = this.d;
        if (cyclicBarrier != null) {
            cyclicBarrier.reset();
            this.d = null;
        }
        this.c.clear();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized long a(long j) {
        for (aezg a : this.a) {
            long a2 = a.a(j);
            if (a2 != -1) {
                return a2;
            }
        }
        return -1;
    }
}
