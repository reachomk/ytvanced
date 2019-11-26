package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bcyn */
final class bcyn extends AtomicLong implements bcuc, bcud, bcuo {
    private static final Object h = new Object();
    public static final long serialVersionUID = -1364393685005146274L;
    public bcym a;
    private final bcup b;
    private final AtomicReference c = new AtomicReference(h);
    private Throwable d;
    private volatile boolean e;
    private boolean f;
    private boolean g;

    public bcyn(bcup bcup) {
        this.b = bcup;
        lazySet(-4611686018427387904L);
    }

    public final void a(long j) {
        if (j >= 0) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return;
                }
                if (j2 != -4611686018427387904L) {
                    j3 = j2 + j;
                    if (j3 < 0) {
                        j3 = Long.MAX_VALUE;
                    }
                } else {
                    j3 = j;
                }
            } while (!compareAndSet(j2, j3));
            if (j2 == -4611686018427387904L) {
                this.a.a(Long.MAX_VALUE);
            }
            d();
        }
    }

    public final boolean c() {
        return get() == Long.MIN_VALUE;
    }

    public final void b() {
        if (get() >= 0) {
            getAndSet(Long.MIN_VALUE);
        }
    }

    public final void e_(Object obj) {
        this.c.lazySet(obj);
        d();
    }

    public final void a(Throwable th) {
        this.d = th;
        this.e = true;
        d();
    }

    public final void bM_() {
        this.e = true;
        d();
    }

    /* JADX WARNING: Missing block: B:10:?, code skipped:
            r2 = get();
     */
    /* JADX WARNING: Missing block: B:11:0x0018, code skipped:
            if (r2 == Long.MIN_VALUE) goto L_0x0076;
     */
    /* JADX WARNING: Missing block: B:12:0x001a, code skipped:
            r4 = r9.c.get();
     */
    /* JADX WARNING: Missing block: B:13:0x0024, code skipped:
            if (r2 <= 0) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:15:0x0028, code skipped:
            if (r4 == h) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:16:0x002a, code skipped:
            r9.b.e_(r4);
            r9.c.compareAndSet(r4, h);
     */
    /* JADX WARNING: Missing block: B:17:0x0036, code skipped:
            r2 = get();
     */
    /* JADX WARNING: Missing block: B:18:0x003c, code skipped:
            if (r2 < 0) goto L_0x0047;
     */
    /* JADX WARNING: Missing block: B:20:0x0045, code skipped:
            if (compareAndSet(r2, -1 + r2) == false) goto L_0x0036;
     */
    /* JADX WARNING: Missing block: B:21:0x0047, code skipped:
            r4 = h;
     */
    /* JADX WARNING: Missing block: B:23:0x004b, code skipped:
            if (r4 != h) goto L_0x0060;
     */
    /* JADX WARNING: Missing block: B:25:0x004f, code skipped:
            if (r9.e == false) goto L_0x0060;
     */
    /* JADX WARNING: Missing block: B:26:0x0051, code skipped:
            r2 = r9.d;
     */
    /* JADX WARNING: Missing block: B:27:0x0053, code skipped:
            if (r2 == null) goto L_0x005b;
     */
    /* JADX WARNING: Missing block: B:28:0x0055, code skipped:
            r9.b.a(r2);
     */
    /* JADX WARNING: Missing block: B:29:0x005b, code skipped:
            r9.b.bM_();
     */
    /* JADX WARNING: Missing block: B:30:0x0060, code skipped:
            monitor-enter(r9);
     */
    /* JADX WARNING: Missing block: B:33:0x0063, code skipped:
            if (r9.g != false) goto L_0x006b;
     */
    /* JADX WARNING: Missing block: B:34:0x0065, code skipped:
            r9.f = false;
     */
    /* JADX WARNING: Missing block: B:36:?, code skipped:
            monitor-exit(r9);
     */
    /* JADX WARNING: Missing block: B:37:0x0069, code skipped:
            r2 = th;
     */
    /* JADX WARNING: Missing block: B:39:?, code skipped:
            r9.g = false;
     */
    /* JADX WARNING: Missing block: B:40:0x006d, code skipped:
            monitor-exit(r9);
     */
    /* JADX WARNING: Missing block: B:42:0x006f, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:43:0x0070, code skipped:
            r2 = r1;
            r1 = false;
     */
    /* JADX WARNING: Missing block: B:45:?, code skipped:
            monitor-exit(r9);
     */
    /* JADX WARNING: Missing block: B:47:?, code skipped:
            throw r2;
     */
    /* JADX WARNING: Missing block: B:48:0x0074, code skipped:
            r2 = th;
     */
    /* JADX WARNING: Missing block: B:49:0x0076, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:50:0x0077, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:51:0x0078, code skipped:
            r2 = r1;
            r1 = false;
     */
    /* JADX WARNING: Missing block: B:52:0x007a, code skipped:
            if (r1 == false) goto L_0x007c;
     */
    /* JADX WARNING: Missing block: B:53:0x007c, code skipped:
            monitor-enter(r9);
     */
    /* JADX WARNING: Missing block: B:55:?, code skipped:
            r9.f = false;
     */
    /* JADX WARNING: Missing block: B:61:0x0084, code skipped:
            throw r2;
     */
    private final void d() {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.f;	 Catch:{ all -> 0x0085 }
        r1 = 1;
        if (r0 == 0) goto L_0x000a;
    L_0x0006:
        r9.g = r1;	 Catch:{ all -> 0x0085 }
        monitor-exit(r9);	 Catch:{ all -> 0x0085 }
        return;
    L_0x000a:
        r9.f = r1;	 Catch:{ all -> 0x0085 }
        r0 = 0;
        r9.g = r0;	 Catch:{ all -> 0x0085 }
        monitor-exit(r9);	 Catch:{ all -> 0x0085 }
    L_0x0010:
        r2 = r9.get();	 Catch:{ all -> 0x0077 }
        r4 = -9223372036854775808;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0076;
    L_0x001a:
        r4 = r9.c;	 Catch:{ all -> 0x0077 }
        r4 = r4.get();	 Catch:{ all -> 0x0077 }
        r5 = 0;
        r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x0049;
    L_0x0026:
        r2 = h;	 Catch:{ all -> 0x0077 }
        if (r4 == r2) goto L_0x0049;
    L_0x002a:
        r2 = r9.b;	 Catch:{ all -> 0x0077 }
        r2.e_(r4);	 Catch:{ all -> 0x0077 }
        r2 = r9.c;	 Catch:{ all -> 0x0077 }
        r3 = h;	 Catch:{ all -> 0x0077 }
        r2.compareAndSet(r4, r3);	 Catch:{ all -> 0x0077 }
    L_0x0036:
        r2 = r9.get();	 Catch:{ all -> 0x0077 }
        r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r4 < 0) goto L_0x0047;
    L_0x003e:
        r7 = -1;
        r7 = r7 + r2;
        r2 = r9.compareAndSet(r2, r7);	 Catch:{ all -> 0x0077 }
        if (r2 == 0) goto L_0x0036;
    L_0x0047:
        r4 = h;	 Catch:{ all -> 0x0077 }
    L_0x0049:
        r2 = h;	 Catch:{ all -> 0x0077 }
        if (r4 != r2) goto L_0x0060;
    L_0x004d:
        r2 = r9.e;	 Catch:{ all -> 0x0077 }
        if (r2 == 0) goto L_0x0060;
    L_0x0051:
        r2 = r9.d;	 Catch:{ all -> 0x0077 }
        if (r2 == 0) goto L_0x005b;
    L_0x0055:
        r3 = r9.b;	 Catch:{ all -> 0x0077 }
        r3.a(r2);	 Catch:{ all -> 0x0077 }
        goto L_0x0060;
    L_0x005b:
        r2 = r9.b;	 Catch:{ all -> 0x0077 }
        r2.bM_();	 Catch:{ all -> 0x0077 }
    L_0x0060:
        monitor-enter(r9);	 Catch:{ all -> 0x0077 }
        r2 = r9.g;	 Catch:{ all -> 0x006f }
        if (r2 != 0) goto L_0x006b;
    L_0x0065:
        r9.f = r0;	 Catch:{ all -> 0x006f }
        monitor-exit(r9);	 Catch:{ all -> 0x0069 }
        goto L_0x0076;
    L_0x0069:
        r2 = move-exception;
        goto L_0x0072;
    L_0x006b:
        r9.g = r0;	 Catch:{ all -> 0x006f }
        monitor-exit(r9);	 Catch:{ all -> 0x006f }
        goto L_0x0010;
    L_0x006f:
        r1 = move-exception;
        r2 = r1;
        r1 = 0;
    L_0x0072:
        monitor-exit(r9);	 Catch:{ all -> 0x0069 }
        throw r2;	 Catch:{ all -> 0x0074 }
    L_0x0074:
        r2 = move-exception;
        goto L_0x007a;
    L_0x0076:
        return;
    L_0x0077:
        r1 = move-exception;
        r2 = r1;
        r1 = 0;
    L_0x007a:
        if (r1 != 0) goto L_0x0084;
    L_0x007c:
        monitor-enter(r9);
        r9.f = r0;	 Catch:{ all -> 0x0081 }
        monitor-exit(r9);	 Catch:{ all -> 0x0081 }
        goto L_0x0084;
    L_0x0081:
        r0 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0081 }
        throw r0;
    L_0x0084:
        throw r2;
    L_0x0085:
        r0 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0085 }
        goto L_0x0089;
    L_0x0088:
        throw r0;
    L_0x0089:
        goto L_0x0088;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcyn.d():void");
    }
}
