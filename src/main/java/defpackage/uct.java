package defpackage;

/* renamed from: uct */
public final class uct {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d0 A:{Splitter:B:4:0x0019, ExcHandler: Error (e java.lang.Error)} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|19) */
    /* JADX WARNING: Missing block: B:18:?, code skipped:
            defpackage.tyv.e(r3, "Invalid UUID format: '%s'", r6);
     */
    /* JADX WARNING: Missing block: B:19:0x006b, code skipped:
            r6 = null;
     */
    /* JADX WARNING: Missing block: B:32:0x00d0, code skipped:
            r14 = e;
     */
    /* JADX WARNING: Missing block: B:33:0x00d2, code skipped:
            r14 = e;
     */
    /* JADX WARNING: Missing block: B:34:0x00d3, code skipped:
            defpackage.tyv.b(r3, "StorageStatsManager is not available", r14, new java.lang.Object[0]);
     */
    /* JADX WARNING: Missing block: B:35:0x00da, code skipped:
            return null;
     */
    public static android.content.pm.PackageStats a(android.content.Context r14) {
        /*
        defpackage.uia.b();
        r0 = android.os.storage.StorageManager.class;
        r0 = r14.getSystemService(r0);
        r0 = (android.os.storage.StorageManager) r0;
        r1 = 0;
        r2 = 0;
        r3 = "PackageStatsO";
        if (r0 != 0) goto L_0x0019;
    L_0x0011:
        r14 = new java.lang.Object[r2];
        r0 = "StorageManager is not available";
        defpackage.tyv.e(r3, r0, r14);
        return r1;
    L_0x0019:
        r4 = android.app.usage.StorageStatsManager.class;
        r4 = r14.getSystemService(r4);	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r4 = (android.app.usage.StorageStatsManager) r4;	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r14 = r14.getPackageName();	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r5 = new android.content.pm.PackageStats;	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r5.<init>(r14);	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r0 = r0.getStorageVolumes();	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r0 = r0.iterator();	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
    L_0x0032:
        r6 = r0.hasNext();	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        if (r6 == 0) goto L_0x00cf;
    L_0x0038:
        r6 = r0.next();	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r6 = (android.os.storage.StorageVolume) r6;	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r7 = r6.getState();	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r8 = "mounted";
        r7 = r7.equals(r8);	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        if (r7 == 0) goto L_0x0032;
    L_0x004a:
        r6 = r6.getUuid();	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r7 = 1;
        r8 = "UUID for %s";
        r9 = new java.lang.String[r7];	 Catch:{ IllegalArgumentException -> 0x0062 }
        r9[r2] = r6;	 Catch:{ IllegalArgumentException -> 0x0062 }
        defpackage.tyv.b(r3, r8, r9);	 Catch:{ IllegalArgumentException -> 0x0062 }
        if (r6 == 0) goto L_0x005f;
    L_0x005a:
        r6 = java.util.UUID.fromString(r6);	 Catch:{ IllegalArgumentException -> 0x0062 }
        goto L_0x006c;
    L_0x005f:
        r6 = android.os.storage.StorageManager.UUID_DEFAULT;	 Catch:{ IllegalArgumentException -> 0x0062 }
        goto L_0x006c;
    L_0x0062:
        r8 = "Invalid UUID format: '%s'";
        r7 = new java.lang.String[r7];	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r7[r2] = r6;	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        defpackage.tyv.e(r3, r8, r7);	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        r6 = r1;
    L_0x006c:
        if (r6 == 0) goto L_0x0032;
    L_0x006e:
        r7 = android.os.Process.myUserHandle();	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r7 = r4.queryStatsForPackage(r6, r14, r7);	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r8 = android.os.storage.StorageManager.UUID_DEFAULT;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r6 = r8.equals(r6);	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        if (r6 == 0) goto L_0x009f;
    L_0x007e:
        r8 = r5.codeSize;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r10 = r7.getAppBytes();	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r8 = r8 + r10;
        r5.codeSize = r8;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r8 = r5.dataSize;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r10 = r7.getDataBytes();	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r12 = r7.getCacheBytes();	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r10 = r10 - r12;
        r8 = r8 + r10;
        r5.dataSize = r8;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r8 = r5.cacheSize;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r6 = r7.getCacheBytes();	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r8 = r8 + r6;
        r5.cacheSize = r8;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        goto L_0x0032;
    L_0x009f:
        r8 = r5.externalCodeSize;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r10 = r7.getAppBytes();	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r8 = r8 + r10;
        r5.externalCodeSize = r8;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r8 = r5.externalDataSize;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r10 = r7.getDataBytes();	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r12 = r7.getCacheBytes();	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r10 = r10 - r12;
        r8 = r8 + r10;
        r5.externalDataSize = r8;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r8 = r5.externalCacheSize;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r6 = r7.getCacheBytes();	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        r8 = r8 + r6;
        r5.externalCacheSize = r8;	 Catch:{ NameNotFoundException -> 0x00c5, IOException -> 0x00c3, NameNotFoundException | IOException | RuntimeException -> 0x00c1, Error -> 0x00d0 }
        goto L_0x0032;
    L_0x00c1:
        r6 = move-exception;
        goto L_0x00c6;
    L_0x00c3:
        r6 = move-exception;
        goto L_0x00c6;
    L_0x00c5:
        r6 = move-exception;
    L_0x00c6:
        r7 = "queryStatsForPackage() call failed";
        r8 = new java.lang.Object[r2];	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        defpackage.tyv.c(r3, r7, r6, r8);	 Catch:{ RuntimeException -> 0x00d2, Error -> 0x00d0 }
        goto L_0x0032;
    L_0x00cf:
        return r5;
    L_0x00d0:
        r14 = move-exception;
        goto L_0x00d3;
    L_0x00d2:
        r14 = move-exception;
    L_0x00d3:
        r0 = new java.lang.Object[r2];
        r2 = "StorageStatsManager is not available";
        defpackage.tyv.b(r3, r2, r14, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uct.a(android.content.Context):android.content.pm.PackageStats");
    }
}
