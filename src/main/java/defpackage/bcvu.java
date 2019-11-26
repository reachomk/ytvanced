package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcvu */
public final class bcvu {
    public static long a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, bcvu.b(j2, j)));
        return j2;
    }

    public static long b(long j, long j2) {
        j += j2;
        return j < 0 ? Long.MAX_VALUE : j;
    }

    public static long a(long j, long j2) {
        long j3 = j * j2;
        return (((j | j2) >>> 31) == 0 || j2 == 0 || j3 / j2 == j) ? j3 : Long.MAX_VALUE;
    }

    /* JADX WARNING: Missing block: B:32:0x005f, code skipped:
            r6 = r10.addAndGet(-(r0 & Long.MAX_VALUE));
     */
    /* JADX WARNING: Missing block: B:33:0x0067, code skipped:
            if (r6 == Long.MIN_VALUE) goto L_0x006a;
     */
    /* JADX WARNING: Missing block: B:35:0x006a, code skipped:
            return;
     */
    static void a(java.util.concurrent.atomic.AtomicLong r10, java.util.Queue r11, defpackage.bcup r12) {
        /*
        r0 = r10.get();
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x0022;
    L_0x000d:
        r10 = r12.c();
        if (r10 != 0) goto L_0x0021;
    L_0x0013:
        r10 = r11.poll();
        if (r10 != 0) goto L_0x001d;
    L_0x0019:
        r12.bM_();
        return;
    L_0x001d:
        r12.e_(r10);
        goto L_0x000d;
    L_0x0021:
        return;
    L_0x0022:
        r4 = -9223372036854775808;
        r6 = r0;
    L_0x0025:
        r0 = r4;
    L_0x0026:
        r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x0042;
    L_0x002a:
        r8 = r12.c();
        if (r8 != 0) goto L_0x0041;
    L_0x0030:
        r8 = r11.poll();
        if (r8 != 0) goto L_0x003a;
    L_0x0036:
        r12.bM_();
        return;
    L_0x003a:
        r12.e_(r8);
        r8 = 1;
        r0 = r0 + r8;
        goto L_0x0026;
    L_0x0041:
        return;
    L_0x0042:
        r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r8 != 0) goto L_0x0057;
    L_0x0046:
        r6 = r12.c();
        if (r6 != 0) goto L_0x0056;
    L_0x004c:
        r6 = r11.isEmpty();
        if (r6 != 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0057;
    L_0x0053:
        r12.bM_();
    L_0x0056:
        return;
    L_0x0057:
        r6 = r10.get();
        r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r8 != 0) goto L_0x0026;
    L_0x005f:
        r0 = r0 & r2;
        r0 = -r0;
        r6 = r10.addAndGet(r0);
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x006a;
    L_0x0069:
        goto L_0x0025;
    L_0x006a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcvu.a(java.util.concurrent.atomic.AtomicLong, java.util.Queue, bcup):void");
    }

    public static long b(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j2 = j3 - j;
            if (j2 < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("More produced than requested: ");
                stringBuilder.append(j2);
                throw new IllegalStateException(stringBuilder.toString());
            }
        } while (!atomicLong.compareAndSet(j3, j2));
        return j2;
    }

    public static boolean a(long j) {
        if (j >= 0) {
            return j != 0;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("n >= 0 required but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
