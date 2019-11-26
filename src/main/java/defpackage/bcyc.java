package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: bcyc */
final class bcyc extends bcup {
    private static final bcya[] p = new bcya[0];
    public final bcup a;
    public final boolean b = false;
    public bcyd c;
    public boolean d;
    public boolean e;
    private final int f;
    private volatile Queue g;
    private volatile bdfu h;
    private volatile ConcurrentLinkedQueue i;
    private volatile boolean j;
    private final Object k;
    private volatile bcya[] l;
    private long m;
    private long n;
    private int o;
    private final int q;
    private int r;

    public bcyc(bcup bcup, boolean z, int i) {
        this.a = bcup;
        this.f = i;
        this.k = new Object();
        this.l = p;
        if (i == Integer.MAX_VALUE) {
            this.q = Integer.MAX_VALUE;
            a(Long.MAX_VALUE);
            return;
        }
        this.q = Math.max(1, i >> 1);
        a((long) i);
    }

    /* Access modifiers changed, original: final */
    public final Queue e() {
        Queue queue = this.i;
        if (queue == null) {
            synchronized (this) {
                queue = this.i;
                if (queue == null) {
                    queue = new ConcurrentLinkedQueue();
                    this.i = queue;
                }
            }
        }
        return queue;
    }

    private final void h() {
        Collection arrayList = new ArrayList(this.i);
        if (arrayList.size() == 1) {
            this.a.a((Throwable) arrayList.get(0));
        } else {
            this.a.a(new bcux(arrayList));
        }
    }

    public final void a(Throwable th) {
        e().offer(th);
        this.j = true;
        f();
    }

    public final void bM_() {
        this.j = true;
        f();
    }

    protected static void a(bcya bcya, Object obj) {
        bdch bdch = bcya.c;
        if (bdch == null) {
            bdch = bdch.a();
            bcya.a((bcuo) bdch);
            bcya.c = bdch;
        }
        try {
            Object obj2;
            int i;
            obj = bcwf.a(obj);
            synchronized (bdch) {
                Queue queue = bdch.a;
                obj2 = null;
                if (queue == null) {
                    i = 0;
                    obj2 = 1;
                } else {
                    i = queue.offer(bcwf.a(obj)) ^ 1;
                }
            }
            if (obj2 == null) {
                if (i != 0) {
                    throw new bcvd();
                }
                return;
            }
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        } catch (bcvd e) {
            bcya.b();
            bcya.a(e);
        } catch (IllegalStateException e2) {
            if (!bcya.c()) {
                bcya.b();
                bcya.a(e2);
            }
        }
    }

    private final void i() {
        Queue queue = this.g;
        if (queue == null) {
            int i = this.f;
            if (i == Integer.MAX_VALUE) {
                queue = new bdcy(bdch.c);
            } else {
                bdcx bdcx;
                if (((i - 1) & i) != 0) {
                    bdcx = new bdcx(i);
                } else if (bddx.a()) {
                    bdcx = new bddj(i);
                } else {
                    bdcx = new bdcu(i);
                }
                queue = bdcx;
            }
            this.g = queue;
        }
        if (!queue.offer(bcwf.a(null))) {
            b();
            a(bcvh.a(new bcvd(), null));
        }
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        synchronized (this) {
            if (this.d) {
                this.e = true;
                return;
            }
            this.d = true;
            g();
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0212  */
    /* JADX WARNING: Missing block: B:137:0x0162, code skipped:
            r9 = r8.b;
            r11 = r8.c;
     */
    /* JADX WARNING: Missing block: B:138:0x0166, code skipped:
            if (r9 != false) goto L_0x0169;
     */
    /* JADX WARNING: Missing block: B:140:0x0169, code skipped:
            if (r11 == null) goto L_0x0175;
     */
    /* JADX WARNING: Missing block: B:142:0x016f, code skipped:
            if (r11.e() != false) goto L_0x0175;
     */
    /* JADX WARNING: Missing block: B:145:0x0175, code skipped:
            r2 = r8.c;
     */
    /* JADX WARNING: Missing block: B:146:0x0177, code skipped:
            if (r2 == null) goto L_0x017c;
     */
    /* JADX WARNING: Missing block: B:147:0x0179, code skipped:
            r2.d();
     */
    /* JADX WARNING: Missing block: B:148:0x017c, code skipped:
            r1.h.b(r8);
            r2 = r1.k;
     */
    /* JADX WARNING: Missing block: B:149:0x0183, code skipped:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:151:?, code skipped:
            r9 = r1.l;
            r11 = r9.length;
            r12 = 0;
     */
    /* JADX WARNING: Missing block: B:153:0x018a, code skipped:
            if (r12 >= r11) goto L_0x0199;
     */
    /* JADX WARNING: Missing block: B:155:0x0192, code skipped:
            if (r8.equals(r9[r12]) != false) goto L_0x019a;
     */
    /* JADX WARNING: Missing block: B:156:0x0194, code skipped:
            r12 = r12 + 1;
     */
    /* JADX WARNING: Missing block: B:157:0x0199, code skipped:
            r12 = -1;
     */
    /* JADX WARNING: Missing block: B:158:0x019a, code skipped:
            if (r12 >= 0) goto L_0x019f;
     */
    /* JADX WARNING: Missing block: B:159:0x019c, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:162:0x01a0, code skipped:
            if (r11 == 1) goto L_0x01b6;
     */
    /* JADX WARNING: Missing block: B:163:0x01a2, code skipped:
            r13 = new defpackage.bcya[(r11 - 1)];
            java.lang.System.arraycopy(r9, 0, r13, 0, r12);
            java.lang.System.arraycopy(r9, r12 + 1, r13, r12, (r11 - r12) - 1);
            r1.l = r13;
     */
    /* JADX WARNING: Missing block: B:164:0x01b4, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:166:0x01b6, code skipped:
            r1.l = p;
     */
    /* JADX WARNING: Missing block: B:167:0x01ba, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:170:0x01bf, code skipped:
            if (j() != false) goto L_0x01d5;
     */
    /* JADX WARNING: Missing block: B:171:0x01c1, code skipped:
            r17 = r17 + 1;
            r2 = 1;
     */
    /* JADX WARNING: Missing block: B:173:0x01c7, code skipped:
            if (r15 != 0) goto L_0x01ca;
     */
    /* JADX WARNING: Missing block: B:174:0x01ca, code skipped:
            r3 = r3 + 1;
     */
    /* JADX WARNING: Missing block: B:175:0x01cc, code skipped:
            if (r3 == r10) goto L_0x01cf;
     */
    /* JADX WARNING: Missing block: B:176:0x01cf, code skipped:
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:177:0x01d0, code skipped:
            r0 = r0 + 1;
            r13 = 0;
     */
    /* JADX WARNING: Missing block: B:178:0x01d5, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:213:0x0209, code skipped:
            r0 = th;
     */
    public final void g() {
        /*
        r23 = this;
        r1 = r23;
        r4 = r1.a;	 Catch:{ all -> 0x020e }
    L_0x0004:
        r0 = r23.j();	 Catch:{ all -> 0x020e }
        if (r0 != 0) goto L_0x020d;
    L_0x000a:
        r5 = r1.g;	 Catch:{ all -> 0x020e }
        r0 = r1.c;	 Catch:{ all -> 0x020e }
        r6 = r0.get();	 Catch:{ all -> 0x020e }
        r8 = -1;
        r11 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r13 = 0;
        if (r5 != 0) goto L_0x0022;
    L_0x001d:
        r15 = r6;
        r17 = 0;
        goto L_0x0082;
    L_0x0022:
        r15 = r6;
        r0 = 0;
    L_0x0024:
        r17 = r0;
        r0 = 0;
        r10 = 0;
    L_0x0028:
        r18 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1));
        if (r18 > 0) goto L_0x002d;
    L_0x002c:
        goto L_0x006a;
    L_0x002d:
        r18 = r5.poll();	 Catch:{ all -> 0x020e }
        r0 = r23.j();	 Catch:{ all -> 0x020e }
        if (r0 != 0) goto L_0x020d;
    L_0x0037:
        if (r18 == 0) goto L_0x0068;
    L_0x0039:
        r0 = defpackage.bcwf.e(r18);	 Catch:{ all -> 0x020e }
        r4.e_(r0);	 Catch:{ all -> 0x0041 }
        goto L_0x0060;
    L_0x0041:
        r0 = move-exception;
        r19 = r0;
        r0 = r1.b;	 Catch:{ all -> 0x020e }
        if (r0 != 0) goto L_0x0057;
    L_0x0048:
        defpackage.bcva.b(r19);	 Catch:{ all -> 0x020e }
        r23.b();	 Catch:{ all -> 0x0054 }
        r5 = r19;
        r4.a(r5);	 Catch:{ all -> 0x0054 }
        return;
    L_0x0054:
        r0 = move-exception;
        goto L_0x012e;
    L_0x0057:
        r3 = r19;
        r0 = r23.e();	 Catch:{ all -> 0x020e }
        r0.offer(r3);	 Catch:{ all -> 0x020e }
    L_0x0060:
        r17 = r17 + 1;
        r10 = r10 + 1;
        r15 = r15 + r8;
        r0 = r18;
        goto L_0x0028;
    L_0x0068:
        r0 = r18;
    L_0x006a:
        if (r10 <= 0) goto L_0x0078;
    L_0x006c:
        r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1));
        if (r3 == 0) goto L_0x0077;
    L_0x0070:
        r3 = r1.c;	 Catch:{ all -> 0x020e }
        r15 = r3.a(r10);	 Catch:{ all -> 0x020e }
        goto L_0x0078;
    L_0x0077:
        r15 = r11;
    L_0x0078:
        r3 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1));
        if (r3 == 0) goto L_0x0082;
    L_0x007c:
        if (r0 != 0) goto L_0x007f;
    L_0x007e:
        goto L_0x0082;
    L_0x007f:
        r0 = r17;
        goto L_0x0024;
    L_0x0082:
        r0 = r1.j;	 Catch:{ all -> 0x020e }
        r3 = r1.g;	 Catch:{ all -> 0x020e }
        r5 = r1.l;	 Catch:{ all -> 0x020e }
        r10 = r5.length;	 Catch:{ all -> 0x020e }
        if (r0 == 0) goto L_0x00a8;
    L_0x008b:
        if (r3 == 0) goto L_0x0093;
    L_0x008d:
        r0 = r3.isEmpty();	 Catch:{ all -> 0x020e }
        if (r0 == 0) goto L_0x00a8;
    L_0x0093:
        if (r10 != 0) goto L_0x00a8;
    L_0x0095:
        r0 = r1.i;	 Catch:{ all -> 0x020e }
        if (r0 == 0) goto L_0x00a4;
    L_0x0099:
        r0 = r0.isEmpty();	 Catch:{ all -> 0x020e }
        if (r0 == 0) goto L_0x00a0;
    L_0x009f:
        goto L_0x00a4;
    L_0x00a0:
        r23.h();	 Catch:{ all -> 0x020e }
        return;
    L_0x00a4:
        r4.bM_();	 Catch:{ all -> 0x020e }
        return;
    L_0x00a8:
        if (r10 <= 0) goto L_0x01e6;
    L_0x00aa:
        r2 = r1.n;	 Catch:{ all -> 0x020e }
        r0 = r1.o;	 Catch:{ all -> 0x020e }
        if (r10 <= r0) goto L_0x00b9;
    L_0x00b0:
        r11 = r5[r0];	 Catch:{ all -> 0x020e }
        r11 = r11.a;	 Catch:{ all -> 0x020e }
        r22 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1));
        if (r22 != 0) goto L_0x00b9;
    L_0x00b8:
        goto L_0x00de;
    L_0x00b9:
        if (r10 <= r0) goto L_0x00bc;
    L_0x00bb:
        goto L_0x00bd;
    L_0x00bc:
        r0 = 0;
    L_0x00bd:
        r11 = r0;
        r0 = 0;
    L_0x00bf:
        if (r0 >= r10) goto L_0x00d5;
    L_0x00c1:
        r12 = r5[r11];	 Catch:{ all -> 0x020e }
        r8 = r12.a;	 Catch:{ all -> 0x020e }
        r12 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r12 == 0) goto L_0x00d5;
    L_0x00c9:
        r8 = r11 + 1;
        if (r8 == r10) goto L_0x00cf;
    L_0x00cd:
        r11 = r8;
        goto L_0x00d0;
    L_0x00cf:
        r11 = 0;
    L_0x00d0:
        r0 = r0 + 1;
        r8 = -1;
        goto L_0x00bf;
    L_0x00d5:
        r1.o = r11;	 Catch:{ all -> 0x020e }
        r0 = r5[r11];	 Catch:{ all -> 0x020e }
        r2 = r0.a;	 Catch:{ all -> 0x020e }
        r1.n = r2;	 Catch:{ all -> 0x020e }
        r0 = r11;
    L_0x00de:
        r3 = r0;
        r0 = 0;
        r2 = 0;
    L_0x00e1:
        if (r0 >= r10) goto L_0x01da;
    L_0x00e3:
        r8 = r23.j();	 Catch:{ all -> 0x020e }
        if (r8 != 0) goto L_0x01d9;
    L_0x00e9:
        r8 = r5[r3];	 Catch:{ all -> 0x020e }
        r9 = 0;
    L_0x00ec:
        r11 = 0;
    L_0x00ed:
        r12 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1));
        if (r12 <= 0) goto L_0x0131;
    L_0x00f1:
        r12 = r23.j();	 Catch:{ all -> 0x020e }
        if (r12 != 0) goto L_0x0137;
    L_0x00f7:
        r12 = r8.c;	 Catch:{ all -> 0x020e }
        if (r12 != 0) goto L_0x00fc;
    L_0x00fb:
        goto L_0x0131;
    L_0x00fc:
        monitor-enter(r12);	 Catch:{ all -> 0x020e }
        r9 = r12.a;	 Catch:{ all -> 0x0134 }
        if (r9 != 0) goto L_0x0104;
    L_0x0101:
        monitor-exit(r12);	 Catch:{ all -> 0x0134 }
        r9 = 0;
        goto L_0x010b;
    L_0x0104:
        r9 = r9.poll();	 Catch:{ all -> 0x0134 }
        r13 = r12.b;	 Catch:{ all -> 0x0134 }
        monitor-exit(r12);	 Catch:{ all -> 0x0134 }
    L_0x010b:
        if (r9 == 0) goto L_0x0131;
    L_0x010d:
        r12 = defpackage.bcwf.e(r9);	 Catch:{ all -> 0x020e }
        r4.e_(r12);	 Catch:{ all -> 0x011c }
        r13 = -1;
        r15 = r15 + r13;
        r11 = r11 + 1;
        r13 = 0;
        goto L_0x00ed;
    L_0x011c:
        r0 = move-exception;
        r2 = r0;
        defpackage.bcva.b(r2);	 Catch:{ all -> 0x0054 }
        r4.a(r2);	 Catch:{ all -> 0x0128 }
        r23.b();	 Catch:{ all -> 0x0054 }
        return;
    L_0x0128:
        r0 = move-exception;
        r2 = r0;
        r23.b();	 Catch:{ all -> 0x0054 }
        throw r2;	 Catch:{ all -> 0x0054 }
    L_0x012e:
        r2 = 1;
        goto L_0x0210;
    L_0x0131:
        r13 = -1;
        goto L_0x0138;
    L_0x0134:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x0134 }
        throw r0;	 Catch:{ all -> 0x020e }
    L_0x0137:
        return;
    L_0x0138:
        if (r11 <= 0) goto L_0x0151;
    L_0x013a:
        r20 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r12 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1));
        if (r12 == 0) goto L_0x014a;
    L_0x0143:
        r12 = r1.c;	 Catch:{ all -> 0x020e }
        r15 = r12.a(r11);	 Catch:{ all -> 0x020e }
        goto L_0x014c;
    L_0x014a:
        r15 = r20;
    L_0x014c:
        r11 = (long) r11;	 Catch:{ all -> 0x020e }
        r8.b(r11);	 Catch:{ all -> 0x020e }
        goto L_0x0156;
    L_0x0151:
        r20 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x0156:
        r11 = 0;
        r22 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1));
        if (r22 != 0) goto L_0x015d;
    L_0x015c:
        goto L_0x0162;
    L_0x015d:
        if (r9 == 0) goto L_0x0162;
    L_0x015f:
        r13 = 0;
        goto L_0x00ec;
    L_0x0162:
        r9 = r8.b;	 Catch:{ all -> 0x020e }
        r11 = r8.c;	 Catch:{ all -> 0x020e }
        if (r9 != 0) goto L_0x0169;
    L_0x0168:
        goto L_0x0171;
    L_0x0169:
        if (r11 == 0) goto L_0x0175;
    L_0x016b:
        r9 = r11.e();	 Catch:{ all -> 0x020e }
        if (r9 != 0) goto L_0x0175;
    L_0x0171:
        r8 = 1;
    L_0x0172:
        r11 = 0;
        goto L_0x01c5;
    L_0x0175:
        r2 = r8.c;	 Catch:{ all -> 0x020e }
        if (r2 == 0) goto L_0x017c;
    L_0x0179:
        r2.d();	 Catch:{ all -> 0x020e }
    L_0x017c:
        r2 = r1.h;	 Catch:{ all -> 0x020e }
        r2.b(r8);	 Catch:{ all -> 0x020e }
        r2 = r1.k;	 Catch:{ all -> 0x020e }
        monitor-enter(r2);	 Catch:{ all -> 0x020e }
        r9 = r1.l;	 Catch:{ all -> 0x01d6 }
        r11 = r9.length;	 Catch:{ all -> 0x01d6 }
        r12 = 0;
    L_0x0188:
        r22 = -1;
        if (r12 >= r11) goto L_0x0199;
    L_0x018c:
        r13 = r9[r12];	 Catch:{ all -> 0x01d6 }
        r13 = r8.equals(r13);	 Catch:{ all -> 0x01d6 }
        if (r13 != 0) goto L_0x019a;
    L_0x0194:
        r12 = r12 + 1;
        r13 = -1;
        goto L_0x0188;
    L_0x0199:
        r12 = -1;
    L_0x019a:
        if (r12 >= 0) goto L_0x019f;
    L_0x019c:
        monitor-exit(r2);	 Catch:{ all -> 0x01d6 }
        r8 = 1;
        goto L_0x01bb;
    L_0x019f:
        r8 = 1;
        if (r11 == r8) goto L_0x01b6;
    L_0x01a2:
        r13 = r11 + -1;
        r13 = new defpackage.bcya[r13];	 Catch:{ all -> 0x01d6 }
        r14 = 0;
        java.lang.System.arraycopy(r9, r14, r13, r14, r12);	 Catch:{ all -> 0x01d6 }
        r14 = r12 + 1;
        r11 = r11 - r12;
        r11 = r11 + -1;
        java.lang.System.arraycopy(r9, r14, r13, r12, r11);	 Catch:{ all -> 0x01d6 }
        r1.l = r13;	 Catch:{ all -> 0x01d6 }
        monitor-exit(r2);	 Catch:{ all -> 0x01d6 }
        goto L_0x01bb;
    L_0x01b6:
        r9 = p;	 Catch:{ all -> 0x01d6 }
        r1.l = r9;	 Catch:{ all -> 0x01d6 }
        monitor-exit(r2);	 Catch:{ all -> 0x01d6 }
    L_0x01bb:
        r2 = r23.j();	 Catch:{ all -> 0x020e }
        if (r2 != 0) goto L_0x01d5;
    L_0x01c1:
        r17 = r17 + 1;
        r2 = 1;
        goto L_0x0172;
    L_0x01c5:
        r9 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1));
        if (r9 != 0) goto L_0x01ca;
    L_0x01c9:
        goto L_0x01db;
    L_0x01ca:
        r3 = r3 + 1;
        if (r3 == r10) goto L_0x01cf;
    L_0x01ce:
        goto L_0x01d0;
    L_0x01cf:
        r3 = 0;
    L_0x01d0:
        r0 = r0 + 1;
        r13 = r11;
        goto L_0x00e1;
    L_0x01d5:
        return;
    L_0x01d6:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x01d6 }
        throw r0;	 Catch:{ all -> 0x020e }
    L_0x01d9:
        return;
    L_0x01da:
        r8 = 1;
    L_0x01db:
        r1.o = r3;	 Catch:{ all -> 0x020e }
        r0 = r5[r3];	 Catch:{ all -> 0x020e }
        r5 = r0.a;	 Catch:{ all -> 0x020e }
        r1.n = r5;	 Catch:{ all -> 0x020e }
        r0 = r17;
        goto L_0x01ea;
    L_0x01e6:
        r8 = 1;
        r0 = r17;
        r2 = 0;
    L_0x01ea:
        if (r0 <= 0) goto L_0x01f0;
    L_0x01ec:
        r5 = (long) r0;	 Catch:{ all -> 0x020e }
        r1.a(r5);	 Catch:{ all -> 0x020e }
    L_0x01f0:
        if (r2 != 0) goto L_0x0004;
    L_0x01f2:
        monitor-enter(r23);	 Catch:{ all -> 0x020e }
        r0 = r1.e;	 Catch:{ all -> 0x0205 }
        if (r0 != 0) goto L_0x01ff;
    L_0x01f7:
        r2 = 0;
        r1.d = r2;	 Catch:{ all -> 0x01fc }
        monitor-exit(r23);	 Catch:{ all -> 0x01fc }
        return;
    L_0x01fc:
        r0 = move-exception;
        r2 = 1;
        goto L_0x0207;
    L_0x01ff:
        r2 = 0;
        r1.e = r2;	 Catch:{ all -> 0x0205 }
        monitor-exit(r23);	 Catch:{ all -> 0x0205 }
        goto L_0x0004;
    L_0x0205:
        r0 = move-exception;
        r2 = 0;
    L_0x0207:
        monitor-exit(r23);	 Catch:{ all -> 0x020b }
        throw r0;	 Catch:{ all -> 0x0209 }
    L_0x0209:
        r0 = move-exception;
        goto L_0x0210;
    L_0x020b:
        r0 = move-exception;
        goto L_0x0207;
    L_0x020d:
        return;
    L_0x020e:
        r0 = move-exception;
        r2 = 0;
    L_0x0210:
        if (r2 != 0) goto L_0x021b;
    L_0x0212:
        monitor-enter(r23);
        r2 = 0;
        r1.d = r2;	 Catch:{ all -> 0x0218 }
        monitor-exit(r23);	 Catch:{ all -> 0x0218 }
        goto L_0x021b;
    L_0x0218:
        r0 = move-exception;
        monitor-exit(r23);	 Catch:{ all -> 0x0218 }
        throw r0;
    L_0x021b:
        goto L_0x021d;
    L_0x021c:
        throw r0;
    L_0x021d:
        goto L_0x021c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcyc.g():void");
    }

    private final boolean j() {
        if (this.a.c()) {
            return true;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.i;
        if (this.b || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return false;
        }
        try {
            h();
            return true;
        } finally {
            b();
        }
    }

    public final /* synthetic */ void e_(Object obj) {
        boolean z;
        Throwable th;
        bctz bctz = (bctz) obj;
        if (bctz != null) {
            z = true;
            int i;
            long j;
            if (bctz == bcwc.a) {
                i = this.r + 1;
                if (i == this.q) {
                    this.r = 0;
                    a((long) i);
                    return;
                }
                this.r = i;
            } else if (bctz instanceof bdci) {
                obj = ((bdci) bctz).a;
                if (this.c.get() == 0) {
                    j = 0;
                    obj = null;
                } else {
                    synchronized (this) {
                        j = this.c.get();
                        if (this.d || j == 0) {
                            obj = null;
                        } else {
                            this.d = true;
                            obj = 1;
                        }
                    }
                }
                if (obj != null) {
                    Queue queue = this.g;
                    if (queue == null || queue.isEmpty()) {
                        try {
                            this.a.e_(null);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (j != Long.MAX_VALUE) {
                            this.c.a(1);
                        }
                        i = this.r + 1;
                        if (i == this.q) {
                            this.r = 0;
                            a((long) i);
                        } else {
                            this.r = i;
                        }
                        synchronized (this) {
                            if (this.e) {
                                this.e = false;
                                g();
                                return;
                            }
                            this.d = false;
                            return;
                        }
                    }
                    i();
                    g();
                } else {
                    i();
                    f();
                    return;
                }
            } else {
                j = this.m;
                this.m = 1 + j;
                bcup bcya = new bcya(this, j);
                bdfu bdfu = this.h;
                if (bdfu == null) {
                    synchronized (this) {
                        bdfu = this.h;
                        if (bdfu == null) {
                            bdfu = new bdfu();
                            this.h = bdfu;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        a((bcuo) bdfu);
                    }
                }
                bdfu.a((bcuo) bcya);
                synchronized (this.k) {
                    bcya[] bcyaArr = this.l;
                    int length = bcyaArr.length;
                    bcya[] bcyaArr2 = new bcya[(length + 1)];
                    System.arraycopy(bcyaArr, 0, bcyaArr2, 0, length);
                    bcyaArr2[length] = bcya;
                    this.l = bcyaArr2;
                }
                bctz.a(bcya);
                f();
                return;
            }
        }
        return;
        if (!z) {
            synchronized (this) {
                this.d = false;
            }
        }
        throw th;
    }
}
