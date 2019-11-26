package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bczj */
final class bczj extends bcup {
    private static final Throwable m = new Throwable("Terminal error");
    public final bcup a;
    public final bdfw b = new bdfw();
    public final AtomicLong c = new AtomicLong();
    public final bdcw d = new bdcw(bdch.c);
    public long e;
    public bcuc f;
    public boolean g;
    private final boolean h = false;
    private boolean i;
    private boolean j;
    private volatile boolean k;
    private Throwable l;

    bczj(bcup bcup, boolean z) {
        this.a = bcup;
    }

    public final void a(Throwable th) {
        boolean b;
        synchronized (this) {
            b = b(th);
        }
        if (b) {
            this.k = true;
            e();
            return;
        }
        bdeh.a(th);
    }

    /* Access modifiers changed, original: final */
    public final boolean b(Throwable th) {
        Throwable th2 = this.l;
        if (th2 == m) {
            return false;
        }
        if (th2 == null) {
            this.l = th;
        } else if (th2 instanceof bcux) {
            Collection arrayList = new ArrayList(((bcux) th2).a);
            arrayList.add(th);
            this.l = new bcux(arrayList);
        } else {
            this.l = new bcux(th2, th);
        }
        return true;
    }

    public final void bM_() {
        this.k = true;
        e();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:16:0x0023, code skipped:
            r9 = r8.d;
            r10 = r8.c;
            r11 = r8.a;
            r12 = r0;
            r14 = r1;
            r0 = r3;
            r13 = r8.k;
     */
    /* JADX WARNING: Missing block: B:17:0x002f, code skipped:
            r16 = 0;
     */
    /* JADX WARNING: Missing block: B:19:0x0035, code skipped:
            if (r16 == r14) goto L_0x0073;
     */
    /* JADX WARNING: Missing block: B:21:0x003b, code skipped:
            if (r11.c() != false) goto L_0x0072;
     */
    /* JADX WARNING: Missing block: B:22:0x003d, code skipped:
            r18 = r9.isEmpty();
     */
    /* JADX WARNING: Missing block: B:23:0x004e, code skipped:
            if (a(r13, r12, r0, r9, r11, r18) != false) goto L_0x0072;
     */
    /* JADX WARNING: Missing block: B:24:0x0050, code skipped:
            if (r18 != false) goto L_0x0073;
     */
    /* JADX WARNING: Missing block: B:25:0x0052, code skipped:
            r1 = (defpackage.bczg) r9.poll();
            r2 = defpackage.bcwf.e(r9.poll());
     */
    /* JADX WARNING: Missing block: B:26:0x0068, code skipped:
            if (r10.get() != r1.a) goto L_0x0033;
     */
    /* JADX WARNING: Missing block: B:27:0x006a, code skipped:
            r11.e_(r2);
            r16 = r16 + 1;
     */
    /* JADX WARNING: Missing block: B:28:0x0072, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:30:0x0075, code skipped:
            if (r16 != r14) goto L_0x0091;
     */
    /* JADX WARNING: Missing block: B:32:0x007b, code skipped:
            if (r11.c() != false) goto L_0x0090;
     */
    /* JADX WARNING: Missing block: B:34:0x008d, code skipped:
            if (a(r8.k, r12, r0, r9, r11, r9.isEmpty()) != false) goto L_0x0090;
     */
    /* JADX WARNING: Missing block: B:35:0x0090, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:36:0x0091, code skipped:
            monitor-enter(r19);
     */
    /* JADX WARNING: Missing block: B:38:?, code skipped:
            r0 = r8.e;
     */
    /* JADX WARNING: Missing block: B:39:0x009b, code skipped:
            if (r0 == Long.MAX_VALUE) goto L_0x00a1;
     */
    /* JADX WARNING: Missing block: B:40:0x009d, code skipped:
            r0 = r0 - r16;
            r8.e = r0;
     */
    /* JADX WARNING: Missing block: B:41:0x00a1, code skipped:
            r14 = r0;
     */
    /* JADX WARNING: Missing block: B:42:0x00a5, code skipped:
            if (r8.j != false) goto L_0x00ab;
     */
    /* JADX WARNING: Missing block: B:43:0x00a7, code skipped:
            r8.i = false;
     */
    /* JADX WARNING: Missing block: B:44:0x00a9, code skipped:
            monitor-exit(r19);
     */
    /* JADX WARNING: Missing block: B:45:0x00aa, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:46:0x00ab, code skipped:
            r8.j = false;
            r13 = r8.k;
            r12 = r8.g;
            r0 = r8.l;
     */
    /* JADX WARNING: Missing block: B:47:0x00b3, code skipped:
            if (r0 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Missing block: B:49:0x00b7, code skipped:
            if (r0 == m) goto L_0x00c1;
     */
    /* JADX WARNING: Missing block: B:51:0x00bb, code skipped:
            if (r8.h != false) goto L_0x00c1;
     */
    /* JADX WARNING: Missing block: B:52:0x00bd, code skipped:
            r8.l = m;
     */
    /* JADX WARNING: Missing block: B:53:0x00c1, code skipped:
            monitor-exit(r19);
     */
    public final void e() {
        /*
        r19 = this;
        r8 = r19;
        monitor-enter(r19);
        r0 = r8.i;	 Catch:{ all -> 0x00c7 }
        r1 = 1;
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r8.j = r1;	 Catch:{ all -> 0x00c7 }
        monitor-exit(r19);	 Catch:{ all -> 0x00c7 }
        return;
    L_0x000c:
        r8.i = r1;	 Catch:{ all -> 0x00c7 }
        r0 = r8.g;	 Catch:{ all -> 0x00c7 }
        r1 = r8.e;	 Catch:{ all -> 0x00c7 }
        r3 = r8.l;	 Catch:{ all -> 0x00c7 }
        if (r3 == 0) goto L_0x0022;
    L_0x0016:
        r4 = m;	 Catch:{ all -> 0x00c7 }
        if (r3 == r4) goto L_0x0022;
    L_0x001a:
        r4 = r8.h;	 Catch:{ all -> 0x00c7 }
        if (r4 != 0) goto L_0x0022;
    L_0x001e:
        r4 = m;	 Catch:{ all -> 0x00c7 }
        r8.l = r4;	 Catch:{ all -> 0x00c7 }
    L_0x0022:
        monitor-exit(r19);	 Catch:{ all -> 0x00c7 }
        r9 = r8.d;
        r10 = r8.c;
        r11 = r8.a;
        r4 = r8.k;
        r12 = r0;
        r14 = r1;
        r0 = r3;
        r13 = r4;
    L_0x002f:
        r1 = 0;
        r16 = r1;
    L_0x0033:
        r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1));
        if (r1 == 0) goto L_0x0073;
    L_0x0037:
        r1 = r11.c();
        if (r1 != 0) goto L_0x0072;
    L_0x003d:
        r18 = r9.isEmpty();
        r1 = r19;
        r2 = r13;
        r3 = r12;
        r4 = r0;
        r5 = r9;
        r6 = r11;
        r7 = r18;
        r1 = r1.a(r2, r3, r4, r5, r6, r7);
        if (r1 != 0) goto L_0x0072;
    L_0x0050:
        if (r18 != 0) goto L_0x0073;
    L_0x0052:
        r1 = r9.poll();
        r1 = (defpackage.bczg) r1;
        r2 = r9.poll();
        r2 = defpackage.bcwf.e(r2);
        r3 = r10.get();
        r5 = r1.a;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x0033;
    L_0x006a:
        r11.e_(r2);
        r1 = 1;
        r16 = r16 + r1;
        goto L_0x0033;
    L_0x0072:
        return;
    L_0x0073:
        r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1));
        if (r1 != 0) goto L_0x0091;
    L_0x0077:
        r1 = r11.c();
        if (r1 != 0) goto L_0x0090;
    L_0x007d:
        r2 = r8.k;
        r7 = r9.isEmpty();
        r1 = r19;
        r3 = r12;
        r4 = r0;
        r5 = r9;
        r6 = r11;
        r0 = r1.a(r2, r3, r4, r5, r6, r7);
        if (r0 != 0) goto L_0x0090;
    L_0x008f:
        goto L_0x0091;
    L_0x0090:
        return;
    L_0x0091:
        monitor-enter(r19);
        r0 = r8.e;	 Catch:{ all -> 0x00c4 }
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x00a1;
    L_0x009d:
        r0 = r0 - r16;
        r8.e = r0;	 Catch:{ all -> 0x00c4 }
    L_0x00a1:
        r14 = r0;
        r0 = r8.j;	 Catch:{ all -> 0x00c4 }
        r1 = 0;
        if (r0 != 0) goto L_0x00ab;
    L_0x00a7:
        r8.i = r1;	 Catch:{ all -> 0x00c4 }
        monitor-exit(r19);	 Catch:{ all -> 0x00c4 }
        return;
    L_0x00ab:
        r8.j = r1;	 Catch:{ all -> 0x00c4 }
        r13 = r8.k;	 Catch:{ all -> 0x00c4 }
        r12 = r8.g;	 Catch:{ all -> 0x00c4 }
        r0 = r8.l;	 Catch:{ all -> 0x00c4 }
        if (r0 == 0) goto L_0x00c1;
    L_0x00b5:
        r1 = m;	 Catch:{ all -> 0x00c4 }
        if (r0 == r1) goto L_0x00c1;
    L_0x00b9:
        r1 = r8.h;	 Catch:{ all -> 0x00c4 }
        if (r1 != 0) goto L_0x00c1;
    L_0x00bd:
        r1 = m;	 Catch:{ all -> 0x00c4 }
        r8.l = r1;	 Catch:{ all -> 0x00c4 }
    L_0x00c1:
        monitor-exit(r19);	 Catch:{ all -> 0x00c4 }
        goto L_0x002f;
    L_0x00c4:
        r0 = move-exception;
        monitor-exit(r19);	 Catch:{ all -> 0x00c4 }
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        monitor-exit(r19);	 Catch:{ all -> 0x00c7 }
        goto L_0x00cb;
    L_0x00ca:
        throw r0;
    L_0x00cb:
        goto L_0x00ca;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bczj.e():void");
    }

    private final boolean a(boolean z, boolean z2, Throwable th, bdcw bdcw, bcup bcup, boolean z3) {
        if (this.h) {
            if (z && !z2 && z3) {
                if (th != null) {
                    bcup.a(th);
                } else {
                    bcup.bM_();
                }
                return true;
            }
        } else if (th != null) {
            bdcw.clear();
            bcup.a(th);
            return true;
        } else if (z && !z2 && z3) {
            bcup.bM_();
            return true;
        }
        return false;
    }

    public final /* synthetic */ void e_(Object obj) {
        bcup bczg;
        bctz bctz = (bctz) obj;
        long incrementAndGet = this.c.incrementAndGet();
        bcuo a = this.b.a.a();
        if (a != null) {
            a.b();
        }
        synchronized (this) {
            bczg = new bczg(incrementAndGet, this);
            this.g = true;
            this.f = null;
        }
        this.b.a(bczg);
        bctz.a(bczg);
    }
}
