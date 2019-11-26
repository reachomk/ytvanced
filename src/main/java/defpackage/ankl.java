package defpackage;

/* renamed from: ankl */
final class ankl implements Runnable {
    private final /* synthetic */ ankj a;

    /* JADX WARNING: Missing block: B:10:0x001c, code skipped:
            if (r2 == 0) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:12:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing block: B:13:0x0025, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:17:0x0032, code skipped:
            r10.a.d = 1;
     */
    /* JADX WARNING: Missing block: B:19:0x0037, code skipped:
            if (r2 == 0) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:21:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing block: B:27:0x0046, code skipped:
            r2 = r2 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            r0.run();
     */
    /* JADX WARNING: Missing block: B:32:0x004e, code skipped:
            r8 = move-exception;
     */
    /* JADX WARNING: Missing block: B:34:?, code skipped:
            r0 = java.lang.String.valueOf(r0);
            r9 = new java.lang.StringBuilder(r0.length() + 35);
            r9.append("Exception while executing runnable ");
            r9.append(r0);
            defpackage.ankj.a.logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", r9.toString(), r8);
     */
    public final void run() {
        /*
        r10 = this;
        r0 = 0;
        r1 = 1;
        r2 = 0;
    L_0x0003:
        r3 = r10.a;	 Catch:{ all -> 0x004c }
        r3 = r3.b;	 Catch:{ all -> 0x004c }
        monitor-enter(r3);	 Catch:{ all -> 0x004c }
        if (r0 != 0) goto L_0x0026;
    L_0x000a:
        r0 = r10.a;	 Catch:{ all -> 0x0076 }
        r4 = r0.d;	 Catch:{ all -> 0x0076 }
        r5 = 4;
        if (r4 == r5) goto L_0x001b;
    L_0x0011:
        r6 = r0.c;	 Catch:{ all -> 0x0076 }
        r8 = 1;
        r6 = r6 + r8;
        r0.c = r6;	 Catch:{ all -> 0x0076 }
        r0.d = r5;	 Catch:{ all -> 0x0076 }
        goto L_0x0026;
    L_0x001b:
        monitor-exit(r3);	 Catch:{ all -> 0x0076 }
        if (r2 == 0) goto L_0x0040;
    L_0x001e:
        r0 = java.lang.Thread.currentThread();	 Catch:{ Error -> 0x0083 }
        r0.interrupt();	 Catch:{ Error -> 0x0083 }
        return;
    L_0x0026:
        r0 = r10.a;	 Catch:{ all -> 0x0076 }
        r0 = r0.b;	 Catch:{ all -> 0x0076 }
        r0 = r0.poll();	 Catch:{ all -> 0x0076 }
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x0076 }
        if (r0 != 0) goto L_0x0041;
    L_0x0032:
        r0 = r10.a;	 Catch:{ all -> 0x0076 }
        r0.d = r1;	 Catch:{ all -> 0x0076 }
        monitor-exit(r3);	 Catch:{ all -> 0x0076 }
        if (r2 == 0) goto L_0x0040;
    L_0x0039:
        r0 = java.lang.Thread.currentThread();	 Catch:{ Error -> 0x0083 }
        r0.interrupt();	 Catch:{ Error -> 0x0083 }
    L_0x0040:
        return;
    L_0x0041:
        monitor-exit(r3);	 Catch:{ all -> 0x0076 }
        r3 = java.lang.Thread.interrupted();	 Catch:{ all -> 0x004c }
        r2 = r2 | r3;
        r0.run();	 Catch:{ RuntimeException -> 0x004e }
    L_0x004a:
        r0 = 1;
        goto L_0x0003;
    L_0x004c:
        r0 = move-exception;
        goto L_0x0079;
    L_0x004e:
        r8 = move-exception;
        r3 = defpackage.ankj.a;	 Catch:{ all -> 0x004c }
        r4 = java.util.logging.Level.SEVERE;	 Catch:{ all -> 0x004c }
        r5 = "com.google.common.util.concurrent.SequentialExecutor$QueueWorker";
        r6 = "workOnQueue";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x004c }
        r7 = r0.length();	 Catch:{ all -> 0x004c }
        r7 = r7 + 35;
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004c }
        r9.<init>(r7);	 Catch:{ all -> 0x004c }
        r7 = "Exception while executing runnable ";
        r9.append(r7);	 Catch:{ all -> 0x004c }
        r9.append(r0);	 Catch:{ all -> 0x004c }
        r7 = r9.toString();	 Catch:{ all -> 0x004c }
        r3.logp(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x004c }
        goto L_0x004a;
    L_0x0076:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0076 }
        throw r0;	 Catch:{ all -> 0x004c }
    L_0x0079:
        if (r2 == 0) goto L_0x0082;
    L_0x007b:
        r2 = java.lang.Thread.currentThread();	 Catch:{ Error -> 0x0083 }
        r2.interrupt();	 Catch:{ Error -> 0x0083 }
    L_0x0082:
        throw r0;	 Catch:{ Error -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        r2 = r10.a;
        r2 = r2.b;
        monitor-enter(r2);
        r3 = r10.a;	 Catch:{ all -> 0x008f }
        r3.d = r1;	 Catch:{ all -> 0x008f }
        monitor-exit(r2);	 Catch:{ all -> 0x008f }
        throw r0;
    L_0x008f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x008f }
        goto L_0x0093;
    L_0x0092:
        throw r0;
    L_0x0093:
        goto L_0x0092;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ankl.run():void");
    }

    /* synthetic */ ankl(ankj ankj) {
        this.a = ankj;
    }
}
