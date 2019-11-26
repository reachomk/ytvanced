package defpackage;

/* renamed from: bchy */
public final class bchy {
    public static final String[] a;

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|14) */
    /* JADX WARNING: Missing block: B:26:0x006c, code skipped:
            if (r2 != null) goto L_0x006f;
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            org.chromium.base.PathUtils.a(r0, r2);
     */
    static {
        /*
        r0 = 0;
        r1 = 0;
        r2 = r1.cancel(r0);	 Catch:{ InterruptedException | ExecutionException -> 0x007a, InterruptedException | ExecutionException -> 0x007a }
        if (r2 == 0) goto L_0x0073;
    L_0x0008:
        r2 = defpackage.bchz.a();	 Catch:{ InterruptedException | ExecutionException -> 0x007a, InterruptedException | ExecutionException -> 0x007a }
        r3 = 3;
        r3 = new java.lang.String[r3];	 Catch:{ all -> 0x0069 }
        r4 = defpackage.bchn.a;	 Catch:{ all -> 0x0069 }
        r5 = r4.getDir(r1, r0);	 Catch:{ all -> 0x0069 }
        r5 = r5.getPath();	 Catch:{ all -> 0x0069 }
        r3[r0] = r5;	 Catch:{ all -> 0x0069 }
        r6 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0069 }
        r7 = 21;
        if (r6 < r7) goto L_0x0044;
    L_0x0021:
        r6 = 448; // 0x1c0 float:6.28E-43 double:2.213E-321;
        android.system.Os.chmod(r5, r6);	 Catch:{ Exception -> 0x0027 }
        goto L_0x0044;
    L_0x0027:
        r6 = "PathUtils";
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0069 }
        r7.<init>();	 Catch:{ all -> 0x0069 }
        r8 = "Failed to set permissions for path \"";
        r7.append(r8);	 Catch:{ all -> 0x0069 }
        r7.append(r5);	 Catch:{ all -> 0x0069 }
        r5 = "\"";
        r7.append(r5);	 Catch:{ all -> 0x0069 }
        r5 = r7.toString();	 Catch:{ all -> 0x0069 }
        r7 = new java.lang.Object[r0];	 Catch:{ all -> 0x0069 }
        defpackage.bchu.c(r6, r5, r7);	 Catch:{ all -> 0x0069 }
    L_0x0044:
        r5 = "textures";
        r0 = r4.getDir(r5, r0);	 Catch:{ all -> 0x0069 }
        r0 = r0.getPath();	 Catch:{ all -> 0x0069 }
        r5 = 1;
        r3[r5] = r0;	 Catch:{ all -> 0x0069 }
        r0 = r4.getCacheDir();	 Catch:{ all -> 0x0069 }
        if (r0 == 0) goto L_0x0062;
    L_0x0057:
        r0 = r4.getCacheDir();	 Catch:{ all -> 0x0069 }
        r0 = r0.getPath();	 Catch:{ all -> 0x0069 }
        r4 = 2;
        r3[r4] = r0;	 Catch:{ all -> 0x0069 }
    L_0x0062:
        if (r2 == 0) goto L_0x0067;
    L_0x0064:
        org.chromium.base.PathUtils.a(r1, r2);	 Catch:{ InterruptedException | ExecutionException -> 0x007a, InterruptedException | ExecutionException -> 0x007a }
    L_0x0067:
        r1 = r3;
        goto L_0x007a;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x006b }
    L_0x006b:
        r3 = move-exception;
        if (r2 != 0) goto L_0x006f;
    L_0x006e:
        goto L_0x0072;
    L_0x006f:
        org.chromium.base.PathUtils.a(r0, r2);	 Catch:{ InterruptedException | ExecutionException -> 0x007a, InterruptedException | ExecutionException -> 0x007a }
    L_0x0072:
        throw r3;	 Catch:{ InterruptedException | ExecutionException -> 0x007a, InterruptedException | ExecutionException -> 0x007a }
    L_0x0073:
        r0 = r1.get();	 Catch:{ InterruptedException | ExecutionException -> 0x007a, InterruptedException | ExecutionException -> 0x007a }
        r0 = (java.lang.String[]) r0;	 Catch:{ InterruptedException | ExecutionException -> 0x007a, InterruptedException | ExecutionException -> 0x007a }
        r1 = r0;
    L_0x007a:
        a = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bchy.<clinit>():void");
    }
}
