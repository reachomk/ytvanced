package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcyt */
final class bcyt implements bcuc, bcud {
    public long a;
    public final AtomicLong b;
    public volatile bcuc c;
    private final bcup d;
    private final Queue e;
    private boolean f;
    private boolean g;
    private volatile boolean h;
    private Throwable i;

    public bcyt(Object obj, bcup bcup) {
        Queue bddo;
        this.d = bcup;
        if (bddx.a()) {
            bddo = new bddo();
        } else {
            bddo = new bdcz();
        }
        this.e = bddo;
        bddo.offer(bcwf.a(obj));
        this.b = new AtomicLong();
    }

    public final void e_(Object obj) {
        this.e.offer(bcwf.a(obj));
        b();
    }

    private final boolean a(boolean z, boolean z2, bcup bcup) {
        if (bcup.c()) {
            return true;
        }
        if (z) {
            Throwable th = this.i;
            if (th != null) {
                bcup.a(th);
                return true;
            } else if (z2) {
                bcup.bM_();
                return true;
            }
        }
        return false;
    }

    public final void a(Throwable th) {
        this.i = th;
        this.h = true;
        b();
    }

    public final void bM_() {
        this.h = true;
        b();
    }

    public final void a(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("n >= required but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j != 0) {
            bcvu.a(this.b, j);
            bcuc bcuc = this.c;
            if (bcuc == null) {
                synchronized (this.b) {
                    bcuc = this.c;
                    if (bcuc == null) {
                        this.a = bcvu.b(this.a, j);
                    }
                }
            }
            if (bcuc != null) {
                bcuc.a(j);
            }
            b();
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:9:0x000d, code skipped:
            r0 = r14.d;
            r2 = r14.e;
            r3 = r14.b;
            r4 = r3.get();
     */
    /* JADX WARNING: Missing block: B:11:0x0021, code skipped:
            if (a(r14.h, r2.isEmpty(), r0) != false) goto L_0x006f;
     */
    /* JADX WARNING: Missing block: B:12:0x0023, code skipped:
            r8 = 0;
     */
    /* JADX WARNING: Missing block: B:14:0x0029, code skipped:
            if (r8 == r4) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:15:0x002b, code skipped:
            r11 = r14.h;
            r12 = r2.poll();
     */
    /* JADX WARNING: Missing block: B:16:0x0031, code skipped:
            if (r12 != null) goto L_0x0035;
     */
    /* JADX WARNING: Missing block: B:17:0x0033, code skipped:
            r13 = true;
     */
    /* JADX WARNING: Missing block: B:18:0x0035, code skipped:
            r13 = false;
     */
    /* JADX WARNING: Missing block: B:20:0x003a, code skipped:
            if (a(r11, r13, r0) != false) goto L_0x006f;
     */
    /* JADX WARNING: Missing block: B:21:0x003c, code skipped:
            if (r13 != false) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:22:0x003e, code skipped:
            r10 = defpackage.bcwf.e(r12);
     */
    /* JADX WARNING: Missing block: B:24:?, code skipped:
            r0.e_(r10);
     */
    /* JADX WARNING: Missing block: B:25:0x0045, code skipped:
            r8 = r8 + 1;
     */
    /* JADX WARNING: Missing block: B:26:0x0049, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:27:0x004a, code skipped:
            defpackage.bcva.a(r1, r0, r10);
     */
    /* JADX WARNING: Missing block: B:28:0x004d, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:30:0x0050, code skipped:
            if (r8 == 0) goto L_0x005f;
     */
    /* JADX WARNING: Missing block: B:32:0x0059, code skipped:
            if (r4 == Long.MAX_VALUE) goto L_0x005f;
     */
    /* JADX WARNING: Missing block: B:33:0x005b, code skipped:
            r4 = defpackage.bcvu.b(r3, r8);
     */
    /* JADX WARNING: Missing block: B:34:0x005f, code skipped:
            monitor-enter(r14);
     */
    /* JADX WARNING: Missing block: B:37:0x0062, code skipped:
            if (r14.g != false) goto L_0x0068;
     */
    /* JADX WARNING: Missing block: B:38:0x0064, code skipped:
            r14.f = false;
     */
    /* JADX WARNING: Missing block: B:39:0x0066, code skipped:
            monitor-exit(r14);
     */
    /* JADX WARNING: Missing block: B:41:0x0068, code skipped:
            r14.g = false;
     */
    /* JADX WARNING: Missing block: B:42:0x006a, code skipped:
            monitor-exit(r14);
     */
    /* JADX WARNING: Missing block: B:47:0x006f, code skipped:
            return;
     */
    public final void b() {
        /*
        r14 = this;
        monitor-enter(r14);
        r0 = r14.f;	 Catch:{ all -> 0x0070 }
        r1 = 1;
        if (r0 == 0) goto L_0x000a;
    L_0x0006:
        r14.g = r1;	 Catch:{ all -> 0x0070 }
        monitor-exit(r14);	 Catch:{ all -> 0x0070 }
        return;
    L_0x000a:
        r14.f = r1;	 Catch:{ all -> 0x0070 }
        monitor-exit(r14);	 Catch:{ all -> 0x0070 }
        r0 = r14.d;
        r2 = r14.e;
        r3 = r14.b;
        r4 = r3.get();
    L_0x0017:
        r6 = r14.h;
        r7 = r2.isEmpty();
        r6 = r14.a(r6, r7, r0);
        if (r6 != 0) goto L_0x006f;
    L_0x0023:
        r6 = 0;
        r8 = r6;
    L_0x0026:
        r10 = 0;
        r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r11 == 0) goto L_0x004e;
    L_0x002b:
        r11 = r14.h;
        r12 = r2.poll();
        if (r12 != 0) goto L_0x0035;
    L_0x0033:
        r13 = 1;
        goto L_0x0036;
    L_0x0035:
        r13 = 0;
    L_0x0036:
        r11 = r14.a(r11, r13, r0);
        if (r11 != 0) goto L_0x006f;
    L_0x003c:
        if (r13 != 0) goto L_0x004e;
    L_0x003e:
        r10 = defpackage.bcwf.e(r12);
        r0.e_(r10);	 Catch:{ all -> 0x0049 }
        r10 = 1;
        r8 = r8 + r10;
        goto L_0x0026;
    L_0x0049:
        r1 = move-exception;
        defpackage.bcva.a(r1, r0, r10);
        return;
    L_0x004e:
        r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r11 == 0) goto L_0x005f;
    L_0x0052:
        r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r11 == 0) goto L_0x005f;
    L_0x005b:
        r4 = defpackage.bcvu.b(r3, r8);
    L_0x005f:
        monitor-enter(r14);
        r6 = r14.g;	 Catch:{ all -> 0x006c }
        if (r6 != 0) goto L_0x0068;
    L_0x0064:
        r14.f = r10;	 Catch:{ all -> 0x006c }
        monitor-exit(r14);	 Catch:{ all -> 0x006c }
        goto L_0x006f;
    L_0x0068:
        r14.g = r10;	 Catch:{ all -> 0x006c }
        monitor-exit(r14);	 Catch:{ all -> 0x006c }
        goto L_0x0017;
    L_0x006c:
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x006c }
        throw r0;
    L_0x006f:
        return;
    L_0x0070:
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x0070 }
        goto L_0x0074;
    L_0x0073:
        throw r0;
    L_0x0074:
        goto L_0x0073;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcyt.b():void");
    }
}
