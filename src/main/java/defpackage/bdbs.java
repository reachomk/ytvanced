package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bdbs */
public final class bdbs extends AtomicLong implements bcuc {
    public static final long serialVersionUID = 2826241102729529449L;
    public volatile boolean a;
    private boolean b;
    private Throwable c;
    private final bdbv d;

    public bdbs(bdbv bdbv) {
        this.d = bdbv;
    }

    public final void a(Throwable th) {
        if (!this.a) {
            this.c = th;
            this.a = true;
            a();
        }
    }

    public final void a(long j) {
        if (j != 0) {
            Object obj;
            long j2;
            long j3;
            do {
                j2 = get();
                obj = j2 == 0 ? 1 : null;
                j3 = Long.MAX_VALUE;
                if (j2 == Long.MAX_VALUE) {
                    break;
                } else if (j == Long.MAX_VALUE) {
                    j3 = j;
                    obj = 1;
                } else if (j2 <= Long.MAX_VALUE - j) {
                    j3 = j2 + j;
                }
            } while (!compareAndSet(j2, j3));
            if (obj != null) {
                a();
            }
        }
    }

    /* JADX WARNING: Missing block: B:8:0x000d, code skipped:
            r2 = get();
     */
    /* JADX WARNING: Missing block: B:10:?, code skipped:
            r5 = r13.d;
     */
    /* JADX WARNING: Missing block: B:11:0x0014, code skipped:
            r6 = 0;
     */
    /* JADX WARNING: Missing block: B:13:0x0019, code skipped:
            if (r2 <= 0) goto L_0x001e;
     */
    /* JADX WARNING: Missing block: B:14:0x001b, code skipped:
            if (r1 == false) goto L_0x0032;
     */
    /* JADX WARNING: Missing block: B:16:0x001e, code skipped:
            if (r1 == false) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:18:0x0024, code skipped:
            if (r5.e() != null) goto L_0x002e;
     */
    /* JADX WARNING: Missing block: B:20:?, code skipped:
            r5.b(r13.c);
     */
    /* JADX WARNING: Missing block: B:21:0x002b, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:22:0x002c, code skipped:
            r1 = th;
     */
    /* JADX WARNING: Missing block: B:24:0x0030, code skipped:
            if (r2 == 0) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:26:?, code skipped:
            r9 = r5.f();
     */
    /* JADX WARNING: Missing block: B:27:0x0036, code skipped:
            if (r9 == null) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:29:0x003c, code skipped:
            if (r5.b(r9) != false) goto L_0x0044;
     */
    /* JADX WARNING: Missing block: B:30:0x003e, code skipped:
            r2 = r2 - 1;
            r6 = r6 + 1;
     */
    /* JADX WARNING: Missing block: B:31:0x0044, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:32:0x0045, code skipped:
            monitor-enter(r13);
     */
    /* JADX WARNING: Missing block: B:34:?, code skipped:
            r1 = r13.a;
            r2 = r5.e();
     */
    /* JADX WARNING: Missing block: B:35:0x0057, code skipped:
            if (get() == Long.MAX_VALUE) goto L_0x0071;
     */
    /* JADX WARNING: Missing block: B:36:0x0059, code skipped:
            r9 = addAndGet((long) (-r6));
     */
    /* JADX WARNING: Missing block: B:38:0x0061, code skipped:
            if (r9 == 0) goto L_0x0066;
     */
    /* JADX WARNING: Missing block: B:39:0x0063, code skipped:
            if (r2 == null) goto L_0x0066;
     */
    /* JADX WARNING: Missing block: B:40:0x0066, code skipped:
            if (r1 == false) goto L_0x006d;
     */
    /* JADX WARNING: Missing block: B:41:0x0068, code skipped:
            if (r2 == null) goto L_0x006b;
     */
    /* JADX WARNING: Missing block: B:42:0x006b, code skipped:
            r2 = r9;
     */
    /* JADX WARNING: Missing block: B:44:?, code skipped:
            r13.b = false;
     */
    /* JADX WARNING: Missing block: B:45:0x006f, code skipped:
            monitor-exit(r13);
     */
    /* JADX WARNING: Missing block: B:46:0x0070, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:47:0x0071, code skipped:
            if (r2 != null) goto L_0x007c;
     */
    /* JADX WARNING: Missing block: B:48:0x0073, code skipped:
            if (r1 == false) goto L_0x0076;
     */
    /* JADX WARNING: Missing block: B:50:0x0076, code skipped:
            r13.b = false;
     */
    /* JADX WARNING: Missing block: B:51:0x0078, code skipped:
            monitor-exit(r13);
     */
    /* JADX WARNING: Missing block: B:52:0x0079, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:53:0x007a, code skipped:
            r1 = th;
     */
    /* JADX WARNING: Missing block: B:54:0x007c, code skipped:
            r2 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Missing block: B:56:?, code skipped:
            monitor-exit(r13);
     */
    /* JADX WARNING: Missing block: B:58:0x007f, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:59:0x0080, code skipped:
            r1 = r0;
            r0 = false;
     */
    /* JADX WARNING: Missing block: B:61:?, code skipped:
            monitor-exit(r13);
     */
    /* JADX WARNING: Missing block: B:63:?, code skipped:
            throw r1;
     */
    /* JADX WARNING: Missing block: B:64:0x0084, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:65:0x0085, code skipped:
            r1 = r0;
            r0 = false;
     */
    /* JADX WARNING: Missing block: B:66:0x0087, code skipped:
            if (r0 == false) goto L_0x0089;
     */
    /* JADX WARNING: Missing block: B:67:0x0089, code skipped:
            monitor-enter(r13);
     */
    /* JADX WARNING: Missing block: B:69:?, code skipped:
            r13.b = false;
     */
    /* JADX WARNING: Missing block: B:75:0x0091, code skipped:
            throw r1;
     */
    public final void a() {
        /*
        r13 = this;
        monitor-enter(r13);
        r0 = r13.b;	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r13);	 Catch:{ all -> 0x0092 }
        return;
    L_0x0007:
        r0 = 1;
        r13.b = r0;	 Catch:{ all -> 0x0092 }
        r1 = r13.a;	 Catch:{ all -> 0x0092 }
        monitor-exit(r13);	 Catch:{ all -> 0x0092 }
        r2 = r13.get();
        r4 = 0;
        r5 = r13.d;	 Catch:{ all -> 0x0084 }
    L_0x0014:
        r6 = 0;
    L_0x0015:
        r7 = 0;
        r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x001e;
    L_0x001b:
        if (r1 == 0) goto L_0x0032;
    L_0x001d:
        goto L_0x0020;
    L_0x001e:
        if (r1 == 0) goto L_0x0045;
    L_0x0020:
        r9 = r5.e();	 Catch:{ all -> 0x0084 }
        if (r9 != 0) goto L_0x002e;
    L_0x0026:
        r1 = r13.c;	 Catch:{ all -> 0x002c }
        r5.b(r1);	 Catch:{ all -> 0x002c }
        return;
    L_0x002c:
        r1 = move-exception;
        goto L_0x0087;
    L_0x002e:
        r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x0045;
    L_0x0032:
        r9 = r5.f();	 Catch:{ all -> 0x0084 }
        if (r9 == 0) goto L_0x0045;
    L_0x0038:
        r7 = r5.b(r9);	 Catch:{ all -> 0x0084 }
        if (r7 != 0) goto L_0x0044;
    L_0x003e:
        r7 = -1;
        r2 = r2 + r7;
        r6 = r6 + 1;
        goto L_0x0015;
    L_0x0044:
        return;
    L_0x0045:
        monitor-enter(r13);	 Catch:{ all -> 0x0084 }
        r1 = r13.a;	 Catch:{ all -> 0x007f }
        r2 = r5.e();	 Catch:{ all -> 0x007f }
        r9 = r13.get();	 Catch:{ all -> 0x007f }
        r11 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r3 == 0) goto L_0x0071;
    L_0x0059:
        r3 = -r6;
        r9 = (long) r3;	 Catch:{ all -> 0x007f }
        r9 = r13.addAndGet(r9);	 Catch:{ all -> 0x007f }
        r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x0066;
    L_0x0063:
        if (r2 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x006b;
    L_0x0066:
        if (r1 == 0) goto L_0x006d;
    L_0x0068:
        if (r2 == 0) goto L_0x006b;
    L_0x006a:
        goto L_0x006d;
    L_0x006b:
        r2 = r9;
        goto L_0x007d;
    L_0x006d:
        r13.b = r4;	 Catch:{ all -> 0x007a }
        monitor-exit(r13);	 Catch:{ all -> 0x007a }
        return;
    L_0x0071:
        if (r2 != 0) goto L_0x007c;
    L_0x0073:
        if (r1 == 0) goto L_0x0076;
    L_0x0075:
        goto L_0x007c;
    L_0x0076:
        r13.b = r4;	 Catch:{ all -> 0x007a }
        monitor-exit(r13);	 Catch:{ all -> 0x007a }
        return;
    L_0x007a:
        r1 = move-exception;
        goto L_0x0082;
    L_0x007c:
        r2 = r11;
    L_0x007d:
        monitor-exit(r13);	 Catch:{ all -> 0x007f }
        goto L_0x0014;
    L_0x007f:
        r0 = move-exception;
        r1 = r0;
        r0 = 0;
    L_0x0082:
        monitor-exit(r13);	 Catch:{ all -> 0x007a }
        throw r1;	 Catch:{ all -> 0x002c }
    L_0x0084:
        r0 = move-exception;
        r1 = r0;
        r0 = 0;
    L_0x0087:
        if (r0 != 0) goto L_0x0091;
    L_0x0089:
        monitor-enter(r13);
        r13.b = r4;	 Catch:{ all -> 0x008e }
        monitor-exit(r13);	 Catch:{ all -> 0x008e }
        goto L_0x0091;
    L_0x008e:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x008e }
        throw r0;
    L_0x0091:
        throw r1;
    L_0x0092:
        r0 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x0092 }
        goto L_0x0096;
    L_0x0095:
        throw r0;
    L_0x0096:
        goto L_0x0095;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdbs.a():void");
    }
}
