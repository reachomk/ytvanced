package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbtg */
final class bbtg extends AtomicInteger implements bbmo, bbnc, bbpp {
    public static final long serialVersionUID = 8080567949447303262L;
    private final bbmo a;
    private final bbnv b;
    private final int c;
    private final int d;
    private final bbyr e = new bbyr();
    private final ArrayDeque f = new ArrayDeque();
    private bbpg g;
    private bbnc h;
    private volatile boolean i;
    private int j;
    private volatile boolean k;
    private bbpq l;
    private int m;
    private final int n;

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.h, bbnc)) {
            this.h = bbnc;
            if (bbnc instanceof bboz) {
                bboz bboz = (bboz) bbnc;
                int a = bboz.a(3);
                if (a == 1) {
                    this.j = 1;
                    this.g = bboz;
                    this.i = true;
                    this.a.a((bbnc) this);
                    b();
                    return;
                } else if (a == 2) {
                    this.j = 2;
                    this.g = bboz;
                    this.a.a((bbnc) this);
                    return;
                }
            }
            this.g = new bbxb(this.d);
            this.a.a((bbnc) this);
        }
    }

    public final void b_(Object obj) {
        if (this.j == 0) {
            this.g.a(obj);
        }
        b();
    }

    public final void a(Throwable th) {
        if (bbyw.a(this.e, th)) {
            this.i = true;
            b();
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        this.i = true;
        b();
    }

    public final void bK_() {
        this.k = true;
        if (getAndIncrement() == 0) {
            this.g.e();
            e();
        }
    }

    public final boolean c() {
        return this.k;
    }

    /* JADX WARNING: Missing block: B:1:0x0002, code skipped:
            if (r0 == null) goto L_0x0008;
     */
    /* JADX WARNING: Missing block: B:2:0x0005, code skipped:
            defpackage.bbnz.a(r0);
     */
    /* JADX WARNING: Missing block: B:3:0x0008, code skipped:
            r0 = (defpackage.bbpq) r1.f.poll();
     */
    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (r0 == null) goto L_0x0013;
     */
    /* JADX WARNING: Missing block: B:5:0x0013, code skipped:
            return;
     */
    private final void e() {
        /*
        r1 = this;
        r0 = r1.l;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        goto L_0x0008;
    L_0x0005:
        defpackage.bbnz.a(r0);
    L_0x0008:
        r0 = r1.f;
        r0 = r0.poll();
        r0 = (defpackage.bbpq) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0005;
    L_0x0013:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbtg.e():void");
    }

    public final void a(bbpq bbpq, Object obj) {
        bbpq.a.a(obj);
        b();
    }

    public final void a(bbpq bbpq, Throwable th) {
        if (bbyw.a(this.e, th)) {
            if (this.n == 1) {
                this.h.bK_();
            }
            bbpq.b();
            b();
            return;
        }
        bbzf.a(th);
    }

    public final void a(bbpq bbpq) {
        bbpq.b();
        b();
    }

    /* JADX WARNING: Missing block: B:42:0x00d6, code skipped:
            if (r7 != null) goto L_0x00f9;
     */
    public final void b() {
        /*
        r12 = this;
        r0 = r12.getAndIncrement();
        if (r0 != 0) goto L_0x0166;
    L_0x0006:
        r0 = r12.g;
        r1 = r12.f;
        r2 = r12.a;
        r3 = r12.n;
        r4 = 1;
        r5 = 1;
    L_0x0010:
        r6 = r12.m;
    L_0x0012:
        r7 = r12.c;
        if (r6 == r7) goto L_0x0080;
    L_0x0016:
        r7 = r12.k;
        if (r7 == 0) goto L_0x0021;
    L_0x001a:
        r0.e();
        r12.e();
        return;
    L_0x0021:
        if (r3 != r4) goto L_0x003e;
    L_0x0023:
        r7 = r12.e;
        r7 = r7.get();
        r7 = (java.lang.Throwable) r7;
        if (r7 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x003e;
    L_0x002e:
        r0.e();
        r12.e();
        r0 = r12.e;
        r0 = defpackage.bbyw.a(r0);
        r2.a(r0);
        return;
    L_0x003e:
        r7 = r0.bI_();	 Catch:{ all -> 0x0062 }
        if (r7 == 0) goto L_0x0080;
    L_0x0044:
        r8 = r12.b;	 Catch:{ all -> 0x0062 }
        r7 = r8.a(r7);	 Catch:{ all -> 0x0062 }
        r8 = "The mapper returned a null ObservableSource";
        r7 = defpackage.bbow.a(r7, r8);	 Catch:{ all -> 0x0062 }
        r7 = (defpackage.bbmm) r7;	 Catch:{ all -> 0x0062 }
        r8 = new bbpq;
        r9 = r12.d;
        r8.<init>(r12, r9);
        r1.offer(r8);
        r7.b(r8);
        r6 = r6 + 1;
        goto L_0x0012;
    L_0x0062:
        r1 = move-exception;
        defpackage.bbnm.a(r1);
        r3 = r12.h;
        r3.bK_();
        r0.e();
        r12.e();
        r0 = r12.e;
        defpackage.bbyw.a(r0, r1);
        r0 = r12.e;
        r0 = defpackage.bbyw.a(r0);
        r2.a(r0);
        return;
    L_0x0080:
        r12.m = r6;
        r6 = r12.k;
        if (r6 == 0) goto L_0x008d;
    L_0x0086:
        r0.e();
        r12.e();
        return;
    L_0x008d:
        if (r3 != r4) goto L_0x00aa;
    L_0x008f:
        r6 = r12.e;
        r6 = r6.get();
        r6 = (java.lang.Throwable) r6;
        if (r6 != 0) goto L_0x009a;
    L_0x0099:
        goto L_0x00aa;
    L_0x009a:
        r0.e();
        r12.e();
        r0 = r12.e;
        r0 = defpackage.bbyw.a(r0);
        r2.a(r0);
        return;
    L_0x00aa:
        r6 = r12.l;
        if (r6 != 0) goto L_0x00fc;
    L_0x00ae:
        r6 = 2;
        if (r3 != r6) goto L_0x00cc;
    L_0x00b1:
        r6 = r12.e;
        r6 = r6.get();
        r6 = (java.lang.Throwable) r6;
        if (r6 != 0) goto L_0x00bc;
    L_0x00bb:
        goto L_0x00cc;
    L_0x00bc:
        r0.e();
        r12.e();
        r0 = r12.e;
        r0 = defpackage.bbyw.a(r0);
        r2.a(r0);
        return;
    L_0x00cc:
        r6 = r12.i;
        r7 = r1.poll();
        r7 = (defpackage.bbpq) r7;
        if (r6 != 0) goto L_0x00d9;
    L_0x00d6:
        if (r7 == 0) goto L_0x00fb;
    L_0x00d8:
        goto L_0x00f9;
    L_0x00d9:
        if (r7 != 0) goto L_0x00f9;
    L_0x00db:
        r1 = r12.e;
        r1 = r1.get();
        r1 = (java.lang.Throwable) r1;
        if (r1 == 0) goto L_0x00f5;
    L_0x00e5:
        r0.e();
        r12.e();
        r0 = r12.e;
        r0 = defpackage.bbyw.a(r0);
        r2.a(r0);
        return;
    L_0x00f5:
        r2.a();
        return;
    L_0x00f9:
        r12.l = r7;
    L_0x00fb:
        r6 = r7;
    L_0x00fc:
        if (r6 != 0) goto L_0x00ff;
    L_0x00fe:
        goto L_0x0133;
    L_0x00ff:
        r7 = r6.a;
    L_0x0101:
        r8 = r12.k;
        if (r8 != 0) goto L_0x0160;
    L_0x0105:
        r8 = r6.b;
        if (r3 != r4) goto L_0x0124;
    L_0x0109:
        r9 = r12.e;
        r9 = r9.get();
        r9 = (java.lang.Throwable) r9;
        if (r9 != 0) goto L_0x0114;
    L_0x0113:
        goto L_0x0124;
    L_0x0114:
        r0.e();
        r12.e();
        r0 = r12.e;
        r0 = defpackage.bbyw.a(r0);
        r2.a(r0);
        return;
    L_0x0124:
        r9 = 0;
        r10 = r7.bI_();	 Catch:{ all -> 0x014d }
        if (r10 == 0) goto L_0x012d;
    L_0x012b:
        r11 = 0;
        goto L_0x012e;
    L_0x012d:
        r11 = 1;
    L_0x012e:
        if (r8 != 0) goto L_0x013d;
    L_0x0130:
        if (r10 == 0) goto L_0x0133;
    L_0x0132:
        goto L_0x0149;
    L_0x0133:
        r5 = -r5;
        r5 = r12.addAndGet(r5);
        if (r5 == 0) goto L_0x013c;
    L_0x013a:
        goto L_0x0010;
    L_0x013c:
        return;
    L_0x013d:
        if (r11 == 0) goto L_0x0149;
    L_0x013f:
        r12.l = r9;
        r6 = r12.m;
        r6 = r6 + -1;
        r12.m = r6;
        goto L_0x0010;
    L_0x0149:
        r2.b_(r10);
        goto L_0x0101;
    L_0x014d:
        r6 = move-exception;
        defpackage.bbnm.a(r6);
        r7 = r12.e;
        defpackage.bbyw.a(r7, r6);
        r12.l = r9;
        r6 = r12.m;
        r6 = r6 + -1;
        r12.m = r6;
        goto L_0x0010;
    L_0x0160:
        r0.e();
        r12.e();
    L_0x0166:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbtg.b():void");
    }

    bbtg(bbmo bbmo, bbnv bbnv, int i, int i2, int i3) {
        this.a = bbmo;
        this.b = bbnv;
        this.c = i;
        this.d = i2;
        this.n = i3;
    }
}
