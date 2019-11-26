package defpackage;

/* renamed from: ddu */
final class ddu implements Runnable {
    private final /* synthetic */ dep a;
    private final /* synthetic */ ddp b;

    ddu(ddp ddp, dep dep) {
        this.b = ddp;
        this.a = dep;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0107 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:38|39|(1:41)(1:42)|43) */
    /* JADX WARNING: Missing block: B:37:0x0105, code skipped:
            if (r3 == null) goto L_0x0107;
     */
    /* JADX WARNING: Missing block: B:39:?, code skipped:
            r3 = "FJD.ExecutionDelegator";
            r4 = "Canceling job for removed service: ";
            r5 = java.lang.String.valueOf(r1.a);
     */
    /* JADX WARNING: Missing block: B:40:0x0115, code skipped:
            if (r5.length() == 0) goto L_0x0117;
     */
    /* JADX WARNING: Missing block: B:41:0x0117, code skipped:
            r5 = new java.lang.String(r4);
     */
    /* JADX WARNING: Missing block: B:42:0x011d, code skipped:
            r5 = r4.concat(r5);
     */
    /* JADX WARNING: Missing block: B:43:0x0121, code skipped:
            android.util.Log.w(r3, r5);
            r0.e.a(r1.a);
     */
    public final void run() {
        /*
        r9 = this;
        r0 = r9.b;
        r1 = r9.a;
        r2 = r0.c;
        r3 = r1.f;
        r3 = defpackage.ddm.a(r3);
        r4 = r3 & 2;
        r5 = 1;
        if (r4 == 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0018;
    L_0x0012:
        r4 = defpackage.ddo.a(r3);
        if (r4 == 0) goto L_0x0041;
    L_0x0018:
        r2 = r2.a;
        r4 = "connectivity";
        r2 = r2.getSystemService(r4);
        r2 = (android.net.ConnectivityManager) r2;
        r4 = r2.getActiveNetworkInfo();
        if (r4 == 0) goto L_0x003b;
    L_0x0028:
        r4 = r4.isConnected();
        if (r4 == 0) goto L_0x003b;
    L_0x002e:
        r3 = defpackage.ddo.a(r3);
        if (r3 == 0) goto L_0x0041;
    L_0x0034:
        r2 = r2.isActiveNetworkMetered();
        r2 = r2 ^ r5;
        if (r2 != 0) goto L_0x0041;
    L_0x003b:
        r0 = r0.f;
        r0.a(r1, r5);
        return;
    L_0x0041:
        r2 = defpackage.ddp.a;
        monitor-enter(r2);
        r3 = defpackage.ddp.a;	 Catch:{ all -> 0x012d }
        r4 = r1.b;	 Catch:{ all -> 0x012d }
        r3 = r3.get(r4);	 Catch:{ all -> 0x012d }
        r3 = (defpackage.dex) r3;	 Catch:{ all -> 0x012d }
        if (r3 == 0) goto L_0x0055;
    L_0x0050:
        r3.b(r1);	 Catch:{ all -> 0x012d }
        monitor-exit(r2);	 Catch:{ all -> 0x012d }
        return;
    L_0x0055:
        r3 = new dex;	 Catch:{ all -> 0x012d }
        r4 = r0.b;	 Catch:{ all -> 0x012d }
        r6 = r0.d;	 Catch:{ all -> 0x012d }
        r3.<init>(r4, r6);	 Catch:{ all -> 0x012d }
        r4 = defpackage.ddp.a;	 Catch:{ all -> 0x012d }
        r6 = r1.b;	 Catch:{ all -> 0x012d }
        r4.put(r6, r3);	 Catch:{ all -> 0x012d }
        r3.b(r1);	 Catch:{ all -> 0x012d }
        r4 = new android.content.Intent;	 Catch:{ all -> 0x012d }
        r6 = "com.firebase.jobdispatcher.ACTION_EXECUTE";
        r4.<init>(r6);	 Catch:{ all -> 0x012d }
        r6 = r0.d;	 Catch:{ all -> 0x012d }
        r7 = r1.b;	 Catch:{ all -> 0x012d }
        r4 = r4.setClassName(r6, r7);	 Catch:{ all -> 0x012d }
        r6 = r0.d;	 Catch:{ SecurityException -> 0x008f }
        r4 = r6.bindService(r4, r3, r5);	 Catch:{ SecurityException -> 0x008f }
        if (r4 == 0) goto L_0x00c3;
    L_0x007f:
        r1 = new ddt;	 Catch:{ all -> 0x012d }
        r1.<init>(r3);	 Catch:{ all -> 0x012d }
        r0 = r0.g;	 Catch:{ all -> 0x012d }
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x012d }
        r4 = 18;
        r0.schedule(r1, r4, r3);	 Catch:{ all -> 0x012d }
        goto L_0x012b;
    L_0x008f:
        r4 = move-exception;
        r5 = "FJD.ExecutionDelegator";
        r6 = r1.b;	 Catch:{ all -> 0x012d }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x012d }
        r7 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x012d }
        r7 = r7.length();	 Catch:{ all -> 0x012d }
        r7 = r7 + 20;
        r8 = r4.length();	 Catch:{ all -> 0x012d }
        r7 = r7 + r8;
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012d }
        r8.<init>(r7);	 Catch:{ all -> 0x012d }
        r7 = "Failed to bind to ";
        r8.append(r7);	 Catch:{ all -> 0x012d }
        r8.append(r6);	 Catch:{ all -> 0x012d }
        r6 = ": ";
        r8.append(r6);	 Catch:{ all -> 0x012d }
        r8.append(r4);	 Catch:{ all -> 0x012d }
        r4 = r8.toString();	 Catch:{ all -> 0x012d }
        android.util.Log.e(r5, r4);	 Catch:{ all -> 0x012d }
    L_0x00c3:
        r4 = "FJD.ExecutionDelegator";
        r5 = "Unable to bind to ";
        r6 = r1.b;	 Catch:{ all -> 0x012d }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x012d }
        r7 = r6.length();	 Catch:{ all -> 0x012d }
        if (r7 != 0) goto L_0x00d9;
    L_0x00d3:
        r6 = new java.lang.String;	 Catch:{ all -> 0x012d }
        r6.<init>(r5);	 Catch:{ all -> 0x012d }
        goto L_0x00dd;
    L_0x00d9:
        r6 = r5.concat(r6);	 Catch:{ all -> 0x012d }
    L_0x00dd:
        android.util.Log.e(r4, r6);	 Catch:{ all -> 0x012d }
        r4 = defpackage.ddp.a;	 Catch:{ all -> 0x012d }
        r5 = r1.b;	 Catch:{ all -> 0x012d }
        r4.remove(r5);	 Catch:{ all -> 0x012d }
        r3.b();	 Catch:{ all -> 0x012d }
        r3 = r1.b;	 Catch:{ all -> 0x012d }
        r4 = r0.d;	 Catch:{ NameNotFoundException -> 0x0107 }
        r4 = r4.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0107 }
        r5 = new android.content.ComponentName;	 Catch:{ NameNotFoundException -> 0x0107 }
        r6 = r0.d;	 Catch:{ NameNotFoundException -> 0x0107 }
        r5.<init>(r6, r3);	 Catch:{ NameNotFoundException -> 0x0107 }
        r3 = 0;
        r3 = r4.getServiceInfo(r5, r3);	 Catch:{ NameNotFoundException -> 0x0107 }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ NameNotFoundException -> 0x0107 }
        r4.length();	 Catch:{ NameNotFoundException -> 0x0107 }
        if (r3 != 0) goto L_0x012b;
    L_0x0107:
        r3 = "FJD.ExecutionDelegator";
        r4 = "Canceling job for removed service: ";
        r5 = r1.a;	 Catch:{ all -> 0x012d }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x012d }
        r6 = r5.length();	 Catch:{ all -> 0x012d }
        if (r6 != 0) goto L_0x011d;
    L_0x0117:
        r5 = new java.lang.String;	 Catch:{ all -> 0x012d }
        r5.<init>(r4);	 Catch:{ all -> 0x012d }
        goto L_0x0121;
    L_0x011d:
        r5 = r4.concat(r5);	 Catch:{ all -> 0x012d }
    L_0x0121:
        android.util.Log.w(r3, r5);	 Catch:{ all -> 0x012d }
        r0 = r0.e;	 Catch:{ all -> 0x012d }
        r1 = r1.a;	 Catch:{ all -> 0x012d }
        r0.a(r1);	 Catch:{ all -> 0x012d }
    L_0x012b:
        monitor-exit(r2);	 Catch:{ all -> 0x012d }
        return;
    L_0x012d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x012d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddu.run():void");
    }
}
