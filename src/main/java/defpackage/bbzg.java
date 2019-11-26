package defpackage;

/* renamed from: bbzg */
public final class bbzg implements bbmo, bbnc {
    private final bbmo a;
    private bbnc b;
    private boolean c;
    private bbyp d;
    private volatile boolean e;

    public bbzg(bbmo bbmo) {
        this.a = bbmo;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.b, bbnc)) {
            this.b = bbnc;
            this.a.a((bbnc) this);
        }
    }

    public final void bK_() {
        this.b.bK_();
    }

    public final boolean c() {
        return this.b.c();
    }

    /* JADX WARNING: Missing block: B:21:0x0039, code skipped:
            r5.a.b_(r6);
     */
    /* JADX WARNING: Missing block: B:22:0x003e, code skipped:
            monitor-enter(r5);
     */
    /* JADX WARNING: Missing block: B:24:?, code skipped:
            r6 = r5.d;
     */
    /* JADX WARNING: Missing block: B:25:0x0042, code skipped:
            if (r6 != null) goto L_0x0048;
     */
    /* JADX WARNING: Missing block: B:26:0x0044, code skipped:
            r5.c = false;
     */
    /* JADX WARNING: Missing block: B:27:0x0046, code skipped:
            monitor-exit(r5);
     */
    /* JADX WARNING: Missing block: B:28:0x0047, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:29:0x0048, code skipped:
            r5.d = null;
     */
    /* JADX WARNING: Missing block: B:30:0x004b, code skipped:
            monitor-exit(r5);
     */
    /* JADX WARNING: Missing block: B:31:0x004c, code skipped:
            r1 = r5.a;
            r6 = r6.a;
     */
    /* JADX WARNING: Missing block: B:32:0x0050, code skipped:
            if (r6 == null) goto L_0x003e;
     */
    /* JADX WARNING: Missing block: B:33:0x0052, code skipped:
            r2 = 0;
     */
    /* JADX WARNING: Missing block: B:35:0x0054, code skipped:
            if (r2 >= 4) goto L_0x0081;
     */
    /* JADX WARNING: Missing block: B:36:0x0056, code skipped:
            r4 = r6[r2];
     */
    /* JADX WARNING: Missing block: B:37:0x0058, code skipped:
            if (r4 != null) goto L_0x005b;
     */
    /* JADX WARNING: Missing block: B:39:0x005d, code skipped:
            if (r4 != defpackage.bbyy.a) goto L_0x0063;
     */
    /* JADX WARNING: Missing block: B:40:0x005f, code skipped:
            r1.a();
     */
    /* JADX WARNING: Missing block: B:41:0x0062, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:43:0x0065, code skipped:
            if ((r4 instanceof defpackage.bbza) == false) goto L_0x006f;
     */
    /* JADX WARNING: Missing block: B:44:0x0067, code skipped:
            r1.a(((defpackage.bbza) r4).a);
     */
    /* JADX WARNING: Missing block: B:45:0x006e, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:47:0x0071, code skipped:
            if ((r4 instanceof defpackage.bbyx) == false) goto L_0x007b;
     */
    /* JADX WARNING: Missing block: B:48:0x0073, code skipped:
            r1.a(((defpackage.bbyx) r4).a);
     */
    /* JADX WARNING: Missing block: B:49:0x007b, code skipped:
            r1.b_(r4);
     */
    /* JADX WARNING: Missing block: B:50:0x007e, code skipped:
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:51:0x0081, code skipped:
            r6 = (java.lang.Object[]) r6[4];
     */
    public final void b_(java.lang.Object r6) {
        /*
        r5 = this;
        r0 = r5.e;
        if (r0 != 0) goto L_0x008c;
    L_0x0004:
        if (r6 != 0) goto L_0x0016;
    L_0x0006:
        r6 = r5.b;
        r6.bK_();
        r6 = new java.lang.NullPointerException;
        r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources.";
        r6.<init>(r0);
        r5.a(r6);
        return;
    L_0x0016:
        monitor-enter(r5);
        r0 = r5.e;	 Catch:{ all -> 0x0089 }
        if (r0 == 0) goto L_0x001d;
    L_0x001b:
        monitor-exit(r5);	 Catch:{ all -> 0x0089 }
        return;
    L_0x001d:
        r0 = r5.c;	 Catch:{ all -> 0x0089 }
        if (r0 == 0) goto L_0x0035;
    L_0x0021:
        r0 = r5.d;	 Catch:{ all -> 0x0089 }
        if (r0 != 0) goto L_0x002c;
    L_0x0025:
        r0 = new bbyp;	 Catch:{ all -> 0x0089 }
        r0.<init>();	 Catch:{ all -> 0x0089 }
        r5.d = r0;	 Catch:{ all -> 0x0089 }
    L_0x002c:
        r6 = defpackage.bbyy.a(r6);	 Catch:{ all -> 0x0089 }
        r0.a(r6);	 Catch:{ all -> 0x0089 }
        monitor-exit(r5);	 Catch:{ all -> 0x0089 }
        return;
    L_0x0035:
        r0 = 1;
        r5.c = r0;	 Catch:{ all -> 0x0089 }
        monitor-exit(r5);	 Catch:{ all -> 0x0089 }
        r0 = r5.a;
        r0.b_(r6);
    L_0x003e:
        monitor-enter(r5);
        r6 = r5.d;	 Catch:{ all -> 0x0086 }
        r0 = 0;
        if (r6 != 0) goto L_0x0048;
    L_0x0044:
        r5.c = r0;	 Catch:{ all -> 0x0086 }
        monitor-exit(r5);	 Catch:{ all -> 0x0086 }
        return;
    L_0x0048:
        r1 = 0;
        r5.d = r1;	 Catch:{ all -> 0x0086 }
        monitor-exit(r5);	 Catch:{ all -> 0x0086 }
        r1 = r5.a;
        r6 = r6.a;
    L_0x0050:
        if (r6 == 0) goto L_0x003e;
    L_0x0052:
        r2 = 0;
    L_0x0053:
        r3 = 4;
        if (r2 >= r3) goto L_0x0081;
    L_0x0056:
        r4 = r6[r2];
        if (r4 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x0081;
    L_0x005b:
        r3 = defpackage.bbyy.a;
        if (r4 != r3) goto L_0x0063;
    L_0x005f:
        r1.a();
        return;
    L_0x0063:
        r3 = r4 instanceof defpackage.bbza;
        if (r3 == 0) goto L_0x006f;
    L_0x0067:
        r4 = (defpackage.bbza) r4;
        r6 = r4.a;
        r1.a(r6);
        return;
    L_0x006f:
        r3 = r4 instanceof defpackage.bbyx;
        if (r3 == 0) goto L_0x007b;
    L_0x0073:
        r4 = (defpackage.bbyx) r4;
        r3 = r4.a;
        r1.a(r3);
        goto L_0x007e;
    L_0x007b:
        r1.b_(r4);
    L_0x007e:
        r2 = r2 + 1;
        goto L_0x0053;
    L_0x0081:
        r6 = r6[r3];
        r6 = (java.lang.Object[]) r6;
        goto L_0x0050;
    L_0x0086:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0086 }
        throw r6;
    L_0x0089:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0089 }
        throw r6;
    L_0x008c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbzg.b_(java.lang.Object):void");
    }

    /* JADX WARNING: Missing block: B:19:0x0031, code skipped:
            if (r1 == 0) goto L_0x0037;
     */
    /* JADX WARNING: Missing block: B:20:0x0033, code skipped:
            defpackage.bbzf.a(r4);
     */
    /* JADX WARNING: Missing block: B:21:0x0036, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:22:0x0037, code skipped:
            r3.a.a(r4);
     */
    /* JADX WARNING: Missing block: B:23:0x003c, code skipped:
            return;
     */
    public final void a(java.lang.Throwable r4) {
        /*
        r3 = this;
        r0 = r3.e;
        if (r0 == 0) goto L_0x0008;
    L_0x0004:
        defpackage.bbzf.a(r4);
        return;
    L_0x0008:
        monitor-enter(r3);
        r0 = r3.e;	 Catch:{ all -> 0x003d }
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x002f;
    L_0x000f:
        r0 = r3.c;	 Catch:{ all -> 0x003d }
        if (r0 == 0) goto L_0x002a;
    L_0x0013:
        r3.e = r2;	 Catch:{ all -> 0x003d }
        r0 = r3.d;	 Catch:{ all -> 0x003d }
        if (r0 != 0) goto L_0x0020;
    L_0x0019:
        r0 = new bbyp;	 Catch:{ all -> 0x003d }
        r0.<init>();	 Catch:{ all -> 0x003d }
        r3.d = r0;	 Catch:{ all -> 0x003d }
    L_0x0020:
        r4 = defpackage.bbyy.a(r4);	 Catch:{ all -> 0x003d }
        r0 = r0.a;	 Catch:{ all -> 0x003d }
        r0[r1] = r4;	 Catch:{ all -> 0x003d }
        monitor-exit(r3);	 Catch:{ all -> 0x003d }
        return;
    L_0x002a:
        r3.e = r2;	 Catch:{ all -> 0x003d }
        r3.c = r2;	 Catch:{ all -> 0x003d }
        goto L_0x0030;
    L_0x002f:
        r1 = 1;
    L_0x0030:
        monitor-exit(r3);	 Catch:{ all -> 0x003d }
        if (r1 == 0) goto L_0x0037;
    L_0x0033:
        defpackage.bbzf.a(r4);
        return;
    L_0x0037:
        r0 = r3.a;
        r0.a(r4);
        return;
    L_0x003d:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x003d }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbzg.a(java.lang.Throwable):void");
    }

    public final void a() {
        if (!this.e) {
            synchronized (this) {
                if (this.e) {
                } else if (this.c) {
                    bbyp bbyp = this.d;
                    if (bbyp == null) {
                        bbyp = new bbyp();
                        this.d = bbyp;
                    }
                    bbyp.a(bbyy.a);
                } else {
                    this.e = true;
                    this.c = true;
                    this.a.a();
                }
            }
        }
    }
}
