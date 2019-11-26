package defpackage;

import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: upb */
public final class upb implements uoz {
    public final ukz a;
    private final long b = 201326592;
    private final double c = 0.2d;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private PriorityBlockingQueue h;
    private uop i;
    private final upa j = new upa();
    private final upa k = new upa();
    private final upa l = new upa();
    private final /* synthetic */ uoy m;

    public upb(uoy uoy, ukz ukz) {
        this.m = uoy;
        this.a = (ukz) uhy.a((Object) ukz);
        this.h = new PriorityBlockingQueue(10);
        e();
    }

    public final ukz a() {
        return this.a;
    }

    public final upf b() {
        return this.l;
    }

    public final synchronized upf c() {
        return this.j;
    }

    public final synchronized upf d() {
        return this.k;
    }

    public final uon a(long j, long j2, String str) {
        uhy.a(j <= j2);
        int a = this.a.a(j);
        if (a != -1) {
            int a2 = this.a.a(j2);
            if (a2 != -1) {
                int[] iArr = new int[((a2 - a) + 1)];
                for (int i = 0; i < iArr.length; i++) {
                    iArr[i] = a + i;
                }
                uon uon = new uon(iArr, h(), str, 10);
                a(uon);
                return uon;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final void a(long j, long j2) {
        uon uon = (uon) this.k.a;
        if (uon != null) {
            uon.d.a(j, j2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARNING: Missing block: B:67:0x01d8, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:74:0x01dd, code skipped:
            return;
     */
    public final synchronized void e() {
        /*
        r13 = this;
        monitor-enter(r13);
        r0 = r13.m;	 Catch:{ all -> 0x01de }
        r1 = r0.e;	 Catch:{ all -> 0x01de }
        if (r1 == 0) goto L_0x01dc;
    L_0x0007:
        r1 = r0.f;	 Catch:{ all -> 0x01de }
        if (r1 == 0) goto L_0x01dc;
    L_0x000b:
        r1 = r0.h;	 Catch:{ all -> 0x01de }
        if (r1 == 0) goto L_0x01dc;
    L_0x000f:
        r0 = r0.d;	 Catch:{ all -> 0x01de }
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0017;
    L_0x0015:
        r0 = 1;
        goto L_0x0018;
    L_0x0017:
        r0 = 0;
    L_0x0018:
        defpackage.uhy.b(r0);	 Catch:{ all -> 0x01de }
        r0 = r13.m;	 Catch:{ all -> 0x01de }
        r0 = r0.d;	 Catch:{ all -> 0x01de }
        r0 = r0.getResources();	 Catch:{ all -> 0x01de }
        r3 = 2131626928; // 0x7f0e0bb0 float:1.8881106E38 double:1.053163635E-314;
        r0 = r0.getDimensionPixelSize(r3);	 Catch:{ all -> 0x01de }
        r3 = r13.a;	 Catch:{ all -> 0x01de }
        r3 = r3.c();	 Catch:{ all -> 0x01de }
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r4 > 0) goto L_0x003a;
    L_0x0036:
        r0 = (float) r0;	 Catch:{ all -> 0x01de }
        r0 = r0 * r3;
        r0 = (int) r0;	 Catch:{ all -> 0x01de }
    L_0x003a:
        r4 = (float) r0;	 Catch:{ all -> 0x01de }
        r4 = r4 / r3;
        r3 = java.lang.Math.round(r4);	 Catch:{ all -> 0x01de }
        r4 = r13.d;	 Catch:{ all -> 0x01de }
        if (r0 != r4) goto L_0x0048;
    L_0x0044:
        r4 = r13.e;	 Catch:{ all -> 0x01de }
        if (r3 == r4) goto L_0x0154;
    L_0x0048:
        r13.d = r0;	 Catch:{ all -> 0x01de }
        r13.e = r3;	 Catch:{ all -> 0x01de }
        if (r0 > 0) goto L_0x0050;
    L_0x004e:
        r0 = 0;
        goto L_0x0054;
    L_0x0050:
        if (r3 > 0) goto L_0x0053;
    L_0x0052:
        goto L_0x004e;
    L_0x0053:
        r0 = 1;
    L_0x0054:
        defpackage.uhy.b(r0);	 Catch:{ all -> 0x01de }
        r0 = r13.d;	 Catch:{ all -> 0x01de }
        r3 = (long) r0;	 Catch:{ all -> 0x01de }
        r0 = r13.e;	 Catch:{ all -> 0x01de }
        r5 = (long) r0;	 Catch:{ all -> 0x01de }
        r3 = r3 * r5;
        r0 = 2;
        r3 = r3 << r0;
        r0 = java.lang.Runtime.getRuntime();	 Catch:{ all -> 0x01de }
        r5 = r0.maxMemory();	 Catch:{ all -> 0x01de }
        r7 = r0.totalMemory();	 Catch:{ all -> 0x01de }
        r5 = r5 - r7;
        r7 = r0.freeMemory();	 Catch:{ all -> 0x01de }
        r5 = r5 + r7;
        r0 = r13.l;	 Catch:{ all -> 0x01de }
        r0 = r0.a;	 Catch:{ all -> 0x01de }
        r0 = (defpackage.uot) r0;	 Catch:{ all -> 0x01de }
        if (r0 != 0) goto L_0x007c;
    L_0x007b:
        goto L_0x00a2;
    L_0x007c:
        r7 = r0.b;	 Catch:{ all -> 0x01de }
        monitor-enter(r7);	 Catch:{ all -> 0x01de }
        r0 = r0.b;	 Catch:{ all -> 0x01d9 }
        r0 = r0.iterator();	 Catch:{ all -> 0x01d9 }
        r8 = 0;
    L_0x0086:
        r9 = r0.hasNext();	 Catch:{ all -> 0x01d9 }
        if (r9 == 0) goto L_0x009f;
    L_0x008c:
        r9 = r0.next();	 Catch:{ all -> 0x01d9 }
        r9 = (defpackage.uor) r9;	 Catch:{ all -> 0x01d9 }
        r9 = r9.b();	 Catch:{ all -> 0x01d9 }
        if (r9 != 0) goto L_0x0099;
    L_0x0098:
        goto L_0x0086;
    L_0x0099:
        r9 = r9.getByteCount();	 Catch:{ all -> 0x01d9 }
        r8 = r8 + r9;
        goto L_0x0086;
    L_0x009f:
        monitor-exit(r7);	 Catch:{ all -> 0x01d9 }
        r7 = (long) r8;
        r5 = r5 + r7;
    L_0x00a2:
        r7 = 0;
        r9 = (double) r5;
        r11 = r13.c;	 Catch:{ all -> 0x01de }
        java.lang.Double.isNaN(r9);
        r9 = r9 * r11;
        r9 = (long) r9;
        r11 = r13.b;	 Catch:{ all -> 0x01de }
        r5 = r5 - r11;
        r5 = java.lang.Math.min(r9, r5);	 Catch:{ all -> 0x01de }
        r5 = java.lang.Math.max(r7, r5);	 Catch:{ all -> 0x01de }
        r5 = r5 / r3;
        r0 = (int) r5;	 Catch:{ all -> 0x01de }
        r3 = r13.m;	 Catch:{ all -> 0x01de }
        r3 = r3.d;	 Catch:{ all -> 0x01de }
        r3 = r3.getResources();	 Catch:{ all -> 0x01de }
        r3 = r3.getDisplayMetrics();	 Catch:{ all -> 0x01de }
        r4 = r13.m;	 Catch:{ all -> 0x01de }
        r4 = r4.i;	 Catch:{ all -> 0x01de }
        if (r4 == 0) goto L_0x00cf;
    L_0x00cc:
        r3 = r3.widthPixels;	 Catch:{ all -> 0x01de }
        goto L_0x00d7;
    L_0x00cf:
        r4 = r3.widthPixels;	 Catch:{ all -> 0x01de }
        r3 = r3.heightPixels;	 Catch:{ all -> 0x01de }
        r3 = java.lang.Math.max(r4, r3);	 Catch:{ all -> 0x01de }
    L_0x00d7:
        r3 = (float) r3;	 Catch:{ all -> 0x01de }
        r4 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r6 = r13.d;	 Catch:{ all -> 0x01de }
        r7 = r13.m;	 Catch:{ all -> 0x01de }
        r7 = r7.d;	 Catch:{ all -> 0x01de }
        r7 = r7.getResources();	 Catch:{ all -> 0x01de }
        r8 = 2131627068; // 0x7f0e0c3c float:1.888139E38 double:1.053163704E-314;
        r7 = r7.getDimensionPixelSize(r8);	 Catch:{ all -> 0x01de }
        r6 = r6 * r7;
        r6 = (float) r6;	 Catch:{ all -> 0x01de }
        r7 = r13.e;	 Catch:{ all -> 0x01de }
        r7 = (float) r7;	 Catch:{ all -> 0x01de }
        r6 = r6 / r7;
        r6 = java.lang.Math.round(r6);	 Catch:{ all -> 0x01de }
        r6 = (float) r6;	 Catch:{ all -> 0x01de }
        r6 = r3 / r6;
        r6 = (double) r6;	 Catch:{ all -> 0x01de }
        r6 = java.lang.Math.floor(r6);	 Catch:{ all -> 0x01de }
        r4 = java.lang.Math.max(r4, r6);	 Catch:{ all -> 0x01de }
        r4 = (int) r4;	 Catch:{ all -> 0x01de }
        r13.f = r4;	 Catch:{ all -> 0x01de }
        r5 = r13.a;	 Catch:{ all -> 0x01de }
        r5 = r5.d();	 Catch:{ all -> 0x01de }
        r4 = java.lang.Math.min(r4, r5);	 Catch:{ all -> 0x01de }
        r13.f = r4;	 Catch:{ all -> 0x01de }
        r4 = r13.m;	 Catch:{ all -> 0x01de }
        r4 = r4.d;	 Catch:{ all -> 0x01de }
        r4 = r4.getResources();	 Catch:{ all -> 0x01de }
        r4 = r4.getDisplayMetrics();	 Catch:{ all -> 0x01de }
        r4 = r4.density;	 Catch:{ all -> 0x01de }
        r5 = r13.a;	 Catch:{ all -> 0x01de }
        r5 = r5.g;	 Catch:{ all -> 0x01de }
        r5 = (float) r5;	 Catch:{ all -> 0x01de }
        r6 = 1232348160; // 0x49742400 float:1000000.0 double:6.088608896E-315;
        r5 = r5 / r6;
        r6 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r5 = r5 * r6;
        r7 = (double) r5;	 Catch:{ all -> 0x01de }
        r7 = java.lang.Math.ceil(r7);	 Catch:{ all -> 0x01de }
        r5 = (int) r7;	 Catch:{ all -> 0x01de }
        r7 = r13.a;	 Catch:{ all -> 0x01de }
        r7 = r7.d();	 Catch:{ all -> 0x01de }
        r5 = java.lang.Math.min(r5, r7);	 Catch:{ all -> 0x01de }
        r4 = r4 * r6;
        r3 = r3 / r4;
        r3 = (int) r3;	 Catch:{ all -> 0x01de }
        r4 = r13.f;	 Catch:{ all -> 0x01de }
        r0 = r0 - r4;
        r0 = java.lang.Math.min(r3, r0);	 Catch:{ all -> 0x01de }
        r0 = java.lang.Math.min(r5, r0);	 Catch:{ all -> 0x01de }
        r0 = java.lang.Math.max(r2, r0);	 Catch:{ all -> 0x01de }
        r13.g = r0;	 Catch:{ all -> 0x01de }
        r13.g();	 Catch:{ all -> 0x01de }
    L_0x0154:
        r0 = r13.h();	 Catch:{ all -> 0x01de }
        r0 = defpackage.uhy.a(r0);	 Catch:{ all -> 0x01de }
        r6 = r0;
        r6 = (defpackage.uot) r6;	 Catch:{ all -> 0x01de }
        r0 = r13.h;	 Catch:{ all -> 0x01de }
        if (r0 == 0) goto L_0x0164;
    L_0x0163:
        r2 = 1;
    L_0x0164:
        defpackage.uhy.b(r2);	 Catch:{ all -> 0x01de }
        r0 = r13.j;	 Catch:{ all -> 0x01de }
        r0 = r0.a;	 Catch:{ all -> 0x01de }
        r0 = (defpackage.uon) r0;	 Catch:{ all -> 0x01de }
        if (r0 != 0) goto L_0x018a;
    L_0x016f:
        r0 = r13.f;	 Catch:{ all -> 0x01de }
        if (r0 <= 0) goto L_0x018a;
    L_0x0173:
        r2 = r13.a;	 Catch:{ all -> 0x01de }
        r0 = defpackage.uoy.a(r2, r0);	 Catch:{ all -> 0x01de }
        r2 = new uon;	 Catch:{ all -> 0x01de }
        r3 = "Overview";
        r4 = 100;
        r2.<init>(r0, r6, r3, r4);	 Catch:{ all -> 0x01de }
        r13.a(r2);	 Catch:{ all -> 0x01de }
        r0 = r13.j;	 Catch:{ all -> 0x01de }
        r0.a(r2);	 Catch:{ all -> 0x01de }
    L_0x018a:
        r0 = r13.k;	 Catch:{ all -> 0x01de }
        r0 = r0.a;	 Catch:{ all -> 0x01de }
        r0 = (defpackage.uon) r0;	 Catch:{ all -> 0x01de }
        if (r0 != 0) goto L_0x01af;
    L_0x0192:
        r0 = r13.g;	 Catch:{ all -> 0x01de }
        if (r0 <= 0) goto L_0x01af;
    L_0x0196:
        r2 = r13.a;	 Catch:{ all -> 0x01de }
        r4 = defpackage.uoy.a(r2, r0);	 Catch:{ all -> 0x01de }
        r0 = new uon;	 Catch:{ all -> 0x01de }
        r5 = defpackage.unw.b;	 Catch:{ all -> 0x01de }
        r7 = "Seek Preview";
        r8 = 0;
        r3 = r0;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01de }
        r13.a(r0);	 Catch:{ all -> 0x01de }
        r2 = r13.k;	 Catch:{ all -> 0x01de }
        r2.a(r0);	 Catch:{ all -> 0x01de }
    L_0x01af:
        r0 = r13.i;	 Catch:{ all -> 0x01de }
        if (r0 != 0) goto L_0x01d7;
    L_0x01b3:
        defpackage.uhy.b(r1);	 Catch:{ all -> 0x01de }
        r0 = new uop;	 Catch:{ all -> 0x01de }
        r1 = r13.m;	 Catch:{ all -> 0x01de }
        r3 = r1.d;	 Catch:{ all -> 0x01de }
        r4 = r13.a;	 Catch:{ all -> 0x01de }
        r5 = r13.d;	 Catch:{ all -> 0x01de }
        r6 = r13.e;	 Catch:{ all -> 0x01de }
        r7 = r13.h;	 Catch:{ all -> 0x01de }
        r8 = r1.a;	 Catch:{ all -> 0x01de }
        r9 = r1.b;	 Catch:{ all -> 0x01de }
        r10 = r1.c;	 Catch:{ all -> 0x01de }
        r11 = r1.h;	 Catch:{ all -> 0x01de }
        r2 = r0;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x01de }
        r13.i = r0;	 Catch:{ all -> 0x01de }
        r0 = r13.i;	 Catch:{ all -> 0x01de }
        r0.start();	 Catch:{ all -> 0x01de }
    L_0x01d7:
        monitor-exit(r13);
        return;
    L_0x01d9:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x01d9 }
        throw r0;	 Catch:{ all -> 0x01de }
    L_0x01dc:
        monitor-exit(r13);
        return;
    L_0x01de:
        r0 = move-exception;
        monitor-exit(r13);
        goto L_0x01e2;
    L_0x01e1:
        throw r0;
    L_0x01e2:
        goto L_0x01e1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upb.e():void");
    }

    private final uot h() {
        uot uot = (uot) this.l.a;
        if (uot == null) {
            uot = new uot(this.a);
            this.l.a((upf) uot);
        }
        uhy.b(this.a.equals(uot.a));
        return uot;
    }

    public final synchronized void f() {
        if (this.i != null) {
            uhy.b(true);
            this.i.a();
            this.i = null;
        }
    }

    private final void a(uok uok) {
        this.h.add(uok);
    }

    public final synchronized void g() {
        f();
        upf a = this.j.a(null);
        if (a != null) {
            a.f();
        }
        a = this.k.a(null);
        if (a != null) {
            a.f();
        }
        this.h.clear();
        this.h = new PriorityBlockingQueue(10);
        a = this.l.a(null);
        if (a != null) {
            a.f();
        }
    }
}
