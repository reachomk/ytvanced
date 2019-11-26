package defpackage;

/* renamed from: bcof */
final class bcof implements Runnable {
    private final /* synthetic */ bcog a;

    bcof(bcog bcog) {
        this.a = bcog;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0052 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:30|31|32|33|34|35|36) */
    /* JADX WARNING: Missing block: B:11:0x001f, code skipped:
            if (r1 == null) goto L_0x0057;
     */
    /* JADX WARNING: Missing block: B:13:?, code skipped:
            r1.run();
     */
    /* JADX WARNING: Missing block: B:14:0x0024, code skipped:
            r0 = r6.a.c;
     */
    /* JADX WARNING: Missing block: B:15:0x0028, code skipped:
            monitor-enter(r0);
     */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            r1 = (java.lang.Runnable) r6.a.c.pollFirst();
            r2 = r6.a;
     */
    /* JADX WARNING: Missing block: B:18:0x0035, code skipped:
            if (r1 == null) goto L_0x0039;
     */
    /* JADX WARNING: Missing block: B:19:0x0037, code skipped:
            r5 = true;
     */
    /* JADX WARNING: Missing block: B:20:0x0039, code skipped:
            r5 = false;
     */
    /* JADX WARNING: Missing block: B:21:0x003a, code skipped:
            r2.d = r5;
     */
    /* JADX WARNING: Missing block: B:22:0x003c, code skipped:
            monitor-exit(r0);
     */
    /* JADX WARNING: Missing block: B:29:0x0046, code skipped:
            monitor-enter(r6.a.c);
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            r2 = r6.a;
            r2.d = false;
     */
    /* JADX WARNING: Missing block: B:33:?, code skipped:
            r2.a.execute(r2.b);
     */
    /* JADX WARNING: Missing block: B:41:0x0057, code skipped:
            return;
     */
    public final void run() {
        /*
        r6 = this;
        r0 = r6.a;
        r0 = r0.c;
        monitor-enter(r0);
        r1 = r6.a;	 Catch:{ all -> 0x005a }
        r2 = r1.d;	 Catch:{ all -> 0x005a }
        if (r2 != 0) goto L_0x0058;
    L_0x000b:
        r1 = r1.c;	 Catch:{ all -> 0x005a }
        r1 = r1.pollFirst();	 Catch:{ all -> 0x005a }
        r1 = (java.lang.Runnable) r1;	 Catch:{ all -> 0x005a }
        r2 = r6.a;	 Catch:{ all -> 0x005a }
        r3 = 1;
        r4 = 0;
        if (r1 == 0) goto L_0x001b;
    L_0x0019:
        r5 = 1;
        goto L_0x001c;
    L_0x001b:
        r5 = 0;
    L_0x001c:
        r2.d = r5;	 Catch:{ all -> 0x005a }
        monitor-exit(r0);	 Catch:{ all -> 0x005a }
    L_0x001f:
        if (r1 == 0) goto L_0x0057;
    L_0x0021:
        r1.run();	 Catch:{ all -> 0x0041 }
        r0 = r6.a;
        r0 = r0.c;
        monitor-enter(r0);
        r1 = r6.a;	 Catch:{ all -> 0x003e }
        r1 = r1.c;	 Catch:{ all -> 0x003e }
        r1 = r1.pollFirst();	 Catch:{ all -> 0x003e }
        r1 = (java.lang.Runnable) r1;	 Catch:{ all -> 0x003e }
        r2 = r6.a;	 Catch:{ all -> 0x003e }
        if (r1 == 0) goto L_0x0039;
    L_0x0037:
        r5 = 1;
        goto L_0x003a;
    L_0x0039:
        r5 = 0;
    L_0x003a:
        r2.d = r5;	 Catch:{ all -> 0x003e }
        monitor-exit(r0);	 Catch:{ all -> 0x003e }
        goto L_0x001f;
    L_0x003e:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003e }
        throw r1;
    L_0x0041:
        r0 = move-exception;
        r1 = r6.a;
        r1 = r1.c;
        monitor-enter(r1);
        r2 = r6.a;	 Catch:{ all -> 0x0054 }
        r2.d = r4;	 Catch:{ all -> 0x0054 }
        r3 = r2.a;	 Catch:{ RejectedExecutionException -> 0x0052 }
        r2 = r2.b;	 Catch:{ RejectedExecutionException -> 0x0052 }
        r3.execute(r2);	 Catch:{ RejectedExecutionException -> 0x0052 }
    L_0x0052:
        monitor-exit(r1);	 Catch:{ all -> 0x0054 }
        throw r0;
    L_0x0054:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0054 }
        throw r0;
    L_0x0057:
        return;
    L_0x0058:
        monitor-exit(r0);	 Catch:{ all -> 0x005a }
        return;
    L_0x005a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x005a }
        goto L_0x005e;
    L_0x005d:
        throw r1;
    L_0x005e:
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcof.run():void");
    }
}
