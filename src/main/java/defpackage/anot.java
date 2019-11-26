package defpackage;

/* renamed from: anot */
final /* synthetic */ class anot implements Runnable {
    private final anos a;

    anot(anos anos) {
        this.a = anos;
    }

    /* JADX WARNING: Missing block: B:14:0x0037, code skipped:
            r3 = r0.f.a;
            r4 = r0.b;
            r5 = android.os.Message.obtain();
            r5.what = r1.c;
            r5.arg1 = r1.a;
            r5.replyTo = r4;
            r4 = new android.os.Bundle();
            r4.putBoolean("oneWay", r1.a());
            r4.putString("pkg", r3.getPackageName());
            r4.putBundle("data", r1.d);
            r5.setData(r4);
     */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r1 = r0.c;
            r3 = r1.a;
     */
    /* JADX WARNING: Missing block: B:17:0x0070, code skipped:
            if (r3 == null) goto L_0x0076;
     */
    /* JADX WARNING: Missing block: B:18:0x0072, code skipped:
            r3.send(r5);
     */
    /* JADX WARNING: Missing block: B:19:0x0076, code skipped:
            r1 = r1.b;
     */
    /* JADX WARNING: Missing block: B:20:0x0078, code skipped:
            if (r1 == null) goto L_0x007e;
     */
    /* JADX WARNING: Missing block: B:21:0x007a, code skipped:
            r1.a(r5);
     */
    /* JADX WARNING: Missing block: B:23:0x0085, code skipped:
            throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Missing block: B:24:0x0086, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:25:0x0087, code skipped:
            r0.a(2, r1.getMessage());
     */
    public final void run() {
        /*
        r8 = this;
        r0 = r8.a;
    L_0x0002:
        monitor-enter(r0);
        r1 = r0.a;	 Catch:{ all -> 0x0090 }
        r2 = 2;
        if (r1 == r2) goto L_0x000a;
    L_0x0008:
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;
    L_0x000a:
        r1 = r0.d;	 Catch:{ all -> 0x0090 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0017;
    L_0x0012:
        r0.a();	 Catch:{ all -> 0x0090 }
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;
    L_0x0017:
        r1 = r0.d;	 Catch:{ all -> 0x0090 }
        r1 = r1.poll();	 Catch:{ all -> 0x0090 }
        r1 = (defpackage.anox) r1;	 Catch:{ all -> 0x0090 }
        r3 = r0.e;	 Catch:{ all -> 0x0090 }
        r4 = r1.a;	 Catch:{ all -> 0x0090 }
        r3.put(r4, r1);	 Catch:{ all -> 0x0090 }
        r3 = r0.f;	 Catch:{ all -> 0x0090 }
        r3 = r3.b;	 Catch:{ all -> 0x0090 }
        r4 = new anow;	 Catch:{ all -> 0x0090 }
        r4.<init>(r0, r1);	 Catch:{ all -> 0x0090 }
        r5 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0090 }
        r6 = 30;
        r3.schedule(r4, r6, r5);	 Catch:{ all -> 0x0090 }
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        r3 = r0.f;
        r3 = r3.a;
        r4 = r0.b;
        r5 = android.os.Message.obtain();
        r6 = r1.c;
        r5.what = r6;
        r6 = r1.a;
        r5.arg1 = r6;
        r5.replyTo = r4;
        r4 = new android.os.Bundle;
        r4.<init>();
        r6 = r1.a();
        r7 = "oneWay";
        r4.putBoolean(r7, r6);
        r3 = r3.getPackageName();
        r6 = "pkg";
        r4.putString(r6, r3);
        r1 = r1.d;
        r3 = "data";
        r4.putBundle(r3, r1);
        r5.setData(r4);
        r1 = r0.c;	 Catch:{ RemoteException -> 0x0086 }
        r3 = r1.a;	 Catch:{ RemoteException -> 0x0086 }
        if (r3 == 0) goto L_0x0076;
    L_0x0072:
        r3.send(r5);	 Catch:{ RemoteException -> 0x0086 }
        goto L_0x0002;
    L_0x0076:
        r1 = r1.b;	 Catch:{ RemoteException -> 0x0086 }
        if (r1 == 0) goto L_0x007e;
    L_0x007a:
        r1.a(r5);	 Catch:{ RemoteException -> 0x0086 }
        goto L_0x0002;
    L_0x007e:
        r1 = new java.lang.IllegalStateException;	 Catch:{ RemoteException -> 0x0086 }
        r3 = "Both messengers are null";
        r1.<init>(r3);	 Catch:{ RemoteException -> 0x0086 }
        throw r1;	 Catch:{ RemoteException -> 0x0086 }
    L_0x0086:
        r1 = move-exception;
        r1 = r1.getMessage();
        r0.a(r2, r1);
        goto L_0x0002;
    L_0x0090:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        goto L_0x0094;
    L_0x0093:
        throw r1;
    L_0x0094:
        goto L_0x0093;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anot.run():void");
    }
}
