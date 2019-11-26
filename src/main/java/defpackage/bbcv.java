package defpackage;

/* renamed from: bbcv */
final class bbcv implements bbej {
    private final bazv a;
    private final /* synthetic */ bbcm b;

    bbcv(bbcm bbcm, bazv bazv) {
        this.b = bbcm;
        this.a = bazv;
    }

    public final void a() {
        this.b.g.a(2, "READY");
        try {
            bavx bavx;
            synchronized (this.b.h) {
                bbcm bbcm = this.b;
                bavx = bbcm.t;
                bbcm.k = null;
                if (bavx != null) {
                    amqw.b(bbcm.r == null, (Object) "Unexpected non-null activeTransport");
                } else if (bbcm.q == this.a) {
                    bbcm.a(basp.READY);
                    this.b.r = this.a;
                    this.b.q = null;
                }
            }
            this.b.i.a();
            if (bavx != null) {
                this.a.a(bavx);
            }
        } catch (Throwable th) {
            this.b.i.a();
        }
    }

    public final void a(boolean z) {
        this.b.a(this.a, z);
    }

    /* JADX WARNING: Missing block: B:35:0x0117, code skipped:
            r10.b.i.a();
     */
    /* JADX WARNING: Missing block: B:36:0x011e, code skipped:
            return;
     */
    public final void a(defpackage.bavx r11) {
        /*
        r10 = this;
        r0 = r10.b;
        r0 = r0.g;
        r1 = 2;
        r2 = new java.lang.Object[r1];
        r3 = r10.a;
        r3 = r3.b();
        r4 = 0;
        r2[r4] = r3;
        r3 = defpackage.bbcm.c(r11);
        r5 = 1;
        r2[r5] = r3;
        r3 = "{0} SHUTDOWN with {1}";
        r0.a(r1, r3, r2);
        r0 = r10.b;	 Catch:{ all -> 0x0122 }
        r0 = r0.h;	 Catch:{ all -> 0x0122 }
        monitor-enter(r0);	 Catch:{ all -> 0x0122 }
        r2 = r10.b;	 Catch:{ all -> 0x011f }
        r2 = r2.s;	 Catch:{ all -> 0x011f }
        r2 = r2.a;	 Catch:{ all -> 0x011f }
        r3 = defpackage.basp.SHUTDOWN;	 Catch:{ all -> 0x011f }
        if (r2 != r3) goto L_0x0034;
    L_0x002b:
        monitor-exit(r0);	 Catch:{ all -> 0x011f }
        r11 = r10.b;
        r11 = r11.i;
        r11.a();
        return;
    L_0x0034:
        r2 = r10.b;	 Catch:{ all -> 0x011f }
        r2 = r2.r;	 Catch:{ all -> 0x011f }
        r3 = r10.a;	 Catch:{ all -> 0x011f }
        if (r2 != r3) goto L_0x0051;
    L_0x003c:
        r11 = r10.b;	 Catch:{ all -> 0x011f }
        r1 = defpackage.basp.IDLE;	 Catch:{ all -> 0x011f }
        r11.a(r1);	 Catch:{ all -> 0x011f }
        r11 = r10.b;	 Catch:{ all -> 0x011f }
        r1 = 0;
        r11.r = r1;	 Catch:{ all -> 0x011f }
        r11 = r10.b;	 Catch:{ all -> 0x011f }
        r11 = r11.j;	 Catch:{ all -> 0x011f }
        r11.a();	 Catch:{ all -> 0x011f }
        goto L_0x0116;
    L_0x0051:
        r2 = r10.b;	 Catch:{ all -> 0x011f }
        r6 = r2.q;	 Catch:{ all -> 0x011f }
        if (r6 != r3) goto L_0x0116;
    L_0x0057:
        r2 = r2.s;	 Catch:{ all -> 0x011f }
        r2 = r2.a;	 Catch:{ all -> 0x011f }
        r3 = defpackage.basp.CONNECTING;	 Catch:{ all -> 0x011f }
        if (r2 != r3) goto L_0x0061;
    L_0x005f:
        r2 = 1;
        goto L_0x0062;
    L_0x0061:
        r2 = 0;
    L_0x0062:
        r3 = "Expected state is CONNECTING, actual state is %s";
        r6 = r10.b;	 Catch:{ all -> 0x011f }
        r6 = r6.s;	 Catch:{ all -> 0x011f }
        r6 = r6.a;	 Catch:{ all -> 0x011f }
        defpackage.amqw.b(r2, r3, r6);	 Catch:{ all -> 0x011f }
        r2 = r10.b;	 Catch:{ all -> 0x011f }
        r2 = r2.j;	 Catch:{ all -> 0x011f }
        r3 = r2.a;	 Catch:{ all -> 0x011f }
        r6 = r2.b;	 Catch:{ all -> 0x011f }
        r3 = r3.get(r6);	 Catch:{ all -> 0x011f }
        r3 = (defpackage.batd) r3;	 Catch:{ all -> 0x011f }
        r6 = r2.c;	 Catch:{ all -> 0x011f }
        r6 = r6 + r5;
        r2.c = r6;	 Catch:{ all -> 0x011f }
        r3 = r3.a;	 Catch:{ all -> 0x011f }
        r3 = r3.size();	 Catch:{ all -> 0x011f }
        if (r6 < r3) goto L_0x008f;
    L_0x0088:
        r3 = r2.b;	 Catch:{ all -> 0x011f }
        r3 = r3 + r5;
        r2.b = r3;	 Catch:{ all -> 0x011f }
        r2.c = r4;	 Catch:{ all -> 0x011f }
    L_0x008f:
        r2 = r10.b;	 Catch:{ all -> 0x011f }
        r2 = r2.j;	 Catch:{ all -> 0x011f }
        r3 = r2.b;	 Catch:{ all -> 0x011f }
        r2 = r2.a;	 Catch:{ all -> 0x011f }
        r2 = r2.size();	 Catch:{ all -> 0x011f }
        if (r3 >= r2) goto L_0x00a3;
    L_0x009d:
        r11 = r10.b;	 Catch:{ all -> 0x011f }
        r11.c();	 Catch:{ all -> 0x011f }
        goto L_0x0116;
    L_0x00a3:
        r2 = r10.b;	 Catch:{ all -> 0x011f }
        r2.q = null;	 Catch:{ all -> 0x011f }
        r2 = r10.b;	 Catch:{ all -> 0x011f }
        r2 = r2.j;	 Catch:{ all -> 0x011f }
        r2.a();	 Catch:{ all -> 0x011f }
        r2 = r10.b;	 Catch:{ all -> 0x011f }
        r3 = r11.a();	 Catch:{ all -> 0x011f }
        r3 = r3 ^ r5;
        r6 = "The error status must not be OK";
        defpackage.amqw.a(r3, r6);	 Catch:{ all -> 0x011f }
        r3 = new bass;	 Catch:{ all -> 0x011f }
        r6 = defpackage.basp.TRANSIENT_FAILURE;	 Catch:{ all -> 0x011f }
        r3.<init>(r6, r11);	 Catch:{ all -> 0x011f }
        r2.a(r3);	 Catch:{ all -> 0x011f }
        r3 = r2.k;	 Catch:{ all -> 0x011f }
        if (r3 != 0) goto L_0x00d1;
    L_0x00c9:
        r3 = r2.c;	 Catch:{ all -> 0x011f }
        r3 = r3.a();	 Catch:{ all -> 0x011f }
        r2.k = r3;	 Catch:{ all -> 0x011f }
    L_0x00d1:
        r3 = r2.k;	 Catch:{ all -> 0x011f }
        r6 = r3.a();	 Catch:{ all -> 0x011f }
        r3 = r2.l;	 Catch:{ all -> 0x011f }
        r8 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x011f }
        r8 = r3.a(r8);	 Catch:{ all -> 0x011f }
        r6 = r6 - r8;
        r3 = r2.g;	 Catch:{ all -> 0x011f }
        r8 = new java.lang.Object[r1];	 Catch:{ all -> 0x011f }
        r11 = defpackage.bbcm.c(r11);	 Catch:{ all -> 0x011f }
        r8[r4] = r11;	 Catch:{ all -> 0x011f }
        r11 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x011f }
        r8[r5] = r11;	 Catch:{ all -> 0x011f }
        r11 = "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns";
        r3.a(r1, r11, r8);	 Catch:{ all -> 0x011f }
        r11 = r2.m;	 Catch:{ all -> 0x011f }
        if (r11 != 0) goto L_0x00fa;
    L_0x00f9:
        goto L_0x00fb;
    L_0x00fa:
        r5 = 0;
    L_0x00fb:
        r11 = "previous reconnectTask is not done";
        defpackage.amqw.b(r5, r11);	 Catch:{ all -> 0x011f }
        r2.n = r4;	 Catch:{ all -> 0x011f }
        r11 = r2.e;	 Catch:{ all -> 0x011f }
        r1 = new bbcz;	 Catch:{ all -> 0x011f }
        r3 = new bbco;	 Catch:{ all -> 0x011f }
        r3.<init>(r2);	 Catch:{ all -> 0x011f }
        r1.<init>(r3);	 Catch:{ all -> 0x011f }
        r3 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x011f }
        r11 = r11.schedule(r1, r6, r3);	 Catch:{ all -> 0x011f }
        r2.m = r11;	 Catch:{ all -> 0x011f }
    L_0x0116:
        monitor-exit(r0);	 Catch:{ all -> 0x011f }
        r11 = r10.b;
        r11 = r11.i;
        r11.a();
        return;
    L_0x011f:
        r11 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x011f }
        throw r11;	 Catch:{ all -> 0x0122 }
    L_0x0122:
        r11 = move-exception;
        r0 = r10.b;
        r0 = r0.i;
        r0.a();
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbcv.a(bavx):void");
    }

    public final void b() {
        boolean z = true;
        this.b.g.a(2, "{0} Terminated", this.a.b());
        batm batm = this.b.f;
        batm.b(batm.d, this.a);
        this.b.a(this.a, false);
        try {
            synchronized (this.b.h) {
                this.b.o.remove(this.a);
                if (this.b.s.a == basp.SHUTDOWN && this.b.o.isEmpty()) {
                    this.b.d();
                }
            }
            this.b.i.a();
            if (this.b.r == this.a) {
                z = false;
            }
            amqw.b(z, (Object) "activeTransport still points to this transport. Seems transportShutdown() was not called.");
        } catch (Throwable th) {
            this.b.i.a();
        }
    }
}
