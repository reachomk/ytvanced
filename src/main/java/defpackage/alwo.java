package defpackage;

/* renamed from: alwo */
final /* synthetic */ class alwo implements Runnable {
    private final alwl a;

    alwo(alwl alwl) {
        this.a = alwl;
    }

    /* JADX WARNING: Missing block: B:15:0x003a, code skipped:
            return;
     */
    public final void run() {
        /*
        r10 = this;
        r0 = r10.a;
        r1 = r0.j;
        monitor-enter(r1);
        r2 = r0.a;	 Catch:{ all -> 0x003b }
        if (r2 == 0) goto L_0x0039;
    L_0x0009:
        r2 = r0.h;	 Catch:{ all -> 0x003b }
        r4 = 0;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 >= 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0039;
    L_0x0012:
        r0.a();	 Catch:{ all -> 0x003b }
        r2 = r0.m;	 Catch:{ all -> 0x003b }
        r2 = r2.b();	 Catch:{ all -> 0x003b }
        r6 = r0.i;	 Catch:{ all -> 0x003b }
        r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r8 < 0) goto L_0x0029;
    L_0x0021:
        r8 = r0.h;	 Catch:{ all -> 0x003b }
        r6 = r6 + r8;
        r6 = r6 - r2;
        r4 = java.lang.Math.max(r4, r6);	 Catch:{ all -> 0x003b }
    L_0x0029:
        r2 = r0.n;	 Catch:{ all -> 0x003b }
        r3 = r0.s;	 Catch:{ all -> 0x003b }
        r6 = r0.h;	 Catch:{ all -> 0x003b }
        r8 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x003b }
        r2 = r2.scheduleAtFixedRate(r3, r4, r6, r8);	 Catch:{ all -> 0x003b }
        r0.t = r2;	 Catch:{ all -> 0x003b }
        monitor-exit(r1);	 Catch:{ all -> 0x003b }
        return;
    L_0x0039:
        monitor-exit(r1);	 Catch:{ all -> 0x003b }
        return;
    L_0x003b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alwo.run():void");
    }
}
