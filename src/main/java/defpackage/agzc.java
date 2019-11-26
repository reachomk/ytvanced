package defpackage;

/* renamed from: agzc */
public final class agzc implements amro {
    public ahao a;
    private final xsc b;
    private final aham c;
    private final ahai d;
    private boolean e = false;

    public agzc(xsc xsc, aham aham, ahai ahai) {
        this.b = xsc;
        this.c = aham;
        this.d = ahai;
        a();
    }

    public final synchronized void a(avqk avqk) {
        this.a = new ahao(this.b, avqk);
        this.e = false;
    }

    public final synchronized void a() {
        a(null);
    }

    /* JADX WARNING: Missing block: B:26:0x0052, code skipped:
            return;
     */
    public final synchronized void b() {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.e;	 Catch:{ all -> 0x0055 }
        if (r0 != 0) goto L_0x0053;
    L_0x0005:
        r0 = 1;
        r10.e = r0;	 Catch:{ all -> 0x0055 }
        r1 = r10.a;	 Catch:{ all -> 0x0055 }
        r2 = r1.b;	 Catch:{ all -> 0x0055 }
        r3 = 0;
        if (r2 == 0) goto L_0x0015;
    L_0x000f:
        r4 = r2.b;	 Catch:{ all -> 0x0055 }
        if (r4 != 0) goto L_0x0014;
    L_0x0013:
        goto L_0x0015;
    L_0x0014:
        r3 = 1;
    L_0x0015:
        r4 = 0;
        if (r2 != 0) goto L_0x001b;
    L_0x0019:
        r0 = r4;
        goto L_0x0036;
    L_0x001b:
        r0 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0055 }
        r2 = r1.b;	 Catch:{ all -> 0x0055 }
        r2 = r2.c;	 Catch:{ all -> 0x0055 }
        r6 = (long) r2;	 Catch:{ all -> 0x0055 }
        r6 = r0.toMillis(r6);	 Catch:{ all -> 0x0055 }
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x0055 }
        r8 = r1.c;	 Catch:{ all -> 0x0055 }
        r6 = r6 + r8;
        r1 = r1.a;	 Catch:{ all -> 0x0055 }
        r1 = r1.a();	 Catch:{ all -> 0x0055 }
        r6 = r6 - r1;
        r0 = r0.toSeconds(r6);	 Catch:{ all -> 0x0055 }
    L_0x0036:
        if (r3 == 0) goto L_0x0039;
    L_0x0038:
        goto L_0x0044;
    L_0x0039:
        r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0044;
    L_0x003d:
        r2 = r10.c;	 Catch:{ all -> 0x0055 }
        r2.a(r0);	 Catch:{ all -> 0x0055 }
        monitor-exit(r10);
        return;
    L_0x0044:
        r0 = r10.d;	 Catch:{ all -> 0x0055 }
        r0 = r0.a();	 Catch:{ all -> 0x0055 }
        if (r0 == 0) goto L_0x0051;
    L_0x004c:
        r0 = r10.c;	 Catch:{ all -> 0x0055 }
        r0.a();	 Catch:{ all -> 0x0055 }
    L_0x0051:
        monitor-exit(r10);
        return;
    L_0x0053:
        monitor-exit(r10);
        return;
    L_0x0055:
        r0 = move-exception;
        monitor-exit(r10);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agzc.b():void");
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.a;
    }
}
