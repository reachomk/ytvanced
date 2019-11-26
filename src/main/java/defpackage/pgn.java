package defpackage;

/* renamed from: pgn */
public final class pgn extends pgb {
    private final pem a = new pem();

    pgn(pgd pgd) {
        super(pgd);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|(1:18)(1:19)|20) */
    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r2 = "GAv4";
            r5 = "Error retrieving package info: appName set to ";
            r6 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Missing block: B:17:0x0053, code skipped:
            if (r6.length() == 0) goto L_0x0055;
     */
    /* JADX WARNING: Missing block: B:18:0x0055, code skipped:
            r6 = new java.lang.String(r5);
     */
    /* JADX WARNING: Missing block: B:19:0x005b, code skipped:
            r6 = r5.concat(r6);
     */
    /* JADX WARNING: Missing block: B:20:0x005f, code skipped:
            android.util.Log.e(r2, r6);
     */
    public final void a() {
        /*
        r8 = this;
        r0 = r8.l();
        r1 = r0.c;
        if (r1 != 0) goto L_0x006d;
    L_0x0008:
        monitor-enter(r0);
        r1 = r0.c;	 Catch:{ all -> 0x006a }
        if (r1 != 0) goto L_0x0068;
    L_0x000d:
        r1 = new pem;	 Catch:{ all -> 0x006a }
        r1.<init>();	 Catch:{ all -> 0x006a }
        r2 = r0.b;	 Catch:{ all -> 0x006a }
        r2 = r2.getPackageManager();	 Catch:{ all -> 0x006a }
        r3 = r0.b;	 Catch:{ all -> 0x006a }
        r3 = r3.getPackageName();	 Catch:{ all -> 0x006a }
        r1.c = r3;	 Catch:{ all -> 0x006a }
        r4 = r2.getInstallerPackageName(r3);	 Catch:{ all -> 0x006a }
        r1.d = r4;	 Catch:{ all -> 0x006a }
        r4 = 0;
        r5 = r0.b;	 Catch:{ NameNotFoundException -> 0x0047 }
        r5 = r5.getPackageName();	 Catch:{ NameNotFoundException -> 0x0047 }
        r6 = 0;
        r5 = r2.getPackageInfo(r5, r6);	 Catch:{ NameNotFoundException -> 0x0047 }
        if (r5 == 0) goto L_0x0062;
    L_0x0034:
        r6 = r5.applicationInfo;	 Catch:{ NameNotFoundException -> 0x0047 }
        r2 = r2.getApplicationLabel(r6);	 Catch:{ NameNotFoundException -> 0x0047 }
        r6 = android.text.TextUtils.isEmpty(r2);	 Catch:{ NameNotFoundException -> 0x0047 }
        if (r6 != 0) goto L_0x0044;
    L_0x0040:
        r3 = r2.toString();	 Catch:{ NameNotFoundException -> 0x0047 }
    L_0x0044:
        r4 = r5.versionName;	 Catch:{ NameNotFoundException -> 0x0047 }
        goto L_0x0062;
    L_0x0047:
        r2 = "GAv4";
        r5 = "Error retrieving package info: appName set to ";
        r6 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x006a }
        r7 = r6.length();	 Catch:{ all -> 0x006a }
        if (r7 != 0) goto L_0x005b;
    L_0x0055:
        r6 = new java.lang.String;	 Catch:{ all -> 0x006a }
        r6.<init>(r5);	 Catch:{ all -> 0x006a }
        goto L_0x005f;
    L_0x005b:
        r6 = r5.concat(r6);	 Catch:{ all -> 0x006a }
    L_0x005f:
        android.util.Log.e(r2, r6);	 Catch:{ all -> 0x006a }
    L_0x0062:
        r1.a = r3;	 Catch:{ all -> 0x006a }
        r1.b = r4;	 Catch:{ all -> 0x006a }
        r0.c = r1;	 Catch:{ all -> 0x006a }
    L_0x0068:
        monitor-exit(r0);	 Catch:{ all -> 0x006a }
        goto L_0x006d;
    L_0x006a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x006a }
        throw r1;
    L_0x006d:
        r0 = r0.c;
        r1 = r8.a;
        r2 = r0.a;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x007d;
    L_0x0079:
        r2 = r0.a;
        r1.a = r2;
    L_0x007d:
        r2 = r0.b;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x0089;
    L_0x0085:
        r2 = r0.b;
        r1.b = r2;
    L_0x0089:
        r2 = r0.c;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x0095;
    L_0x0091:
        r2 = r0.c;
        r1.c = r2;
    L_0x0095:
        r2 = r0.d;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x00a1;
    L_0x009d:
        r0 = r0.d;
        r1.d = r0;
    L_0x00a1:
        r0 = r8.o();
        r0.f();
        r1 = r0.b;
        if (r1 != 0) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00b1;
    L_0x00ad:
        r2 = r8.a;
        r2.a = r1;
    L_0x00b1:
        r0.f();
        r0 = r0.a;
        if (r0 != 0) goto L_0x00b9;
    L_0x00b8:
        goto L_0x00bd;
    L_0x00b9:
        r1 = r8.a;
        r1.b = r0;
    L_0x00bd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgn.a():void");
    }
}
