package defpackage;

/* renamed from: twv */
final class twv implements Runnable {
    private final /* synthetic */ tww a;

    twv(tww tww) {
        this.a = tww;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x014a A:{Catch:{ Exception -> 0x0136 }} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0145 A:{Catch:{ Exception -> 0x0136 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0138 */
    /* JADX WARNING: Failed to process nested try/catch */
    public final void run() {
        /*
        r13 = this;
        r0 = "DirStatsCapture";
        r1 = r13.a;
        r1 = r1.e;
        r2 = defpackage.tww.d;
        defpackage.uia.b();
        r4 = "primes.packageMetric.lastSendTime";
        r5 = -1;
        r7 = r1.getLong(r4, r5);
        r9 = android.os.SystemClock.elapsedRealtime();
        r11 = 0;
        r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r12 >= 0) goto L_0x0036;
    L_0x001c:
        r1 = r1.edit();
        r1 = r1.remove(r4);
        r1 = r1.commit();
        r1 = r1 ^ 1;
        if (r1 == 0) goto L_0x0035;
    L_0x002c:
        r1 = new java.lang.Object[r11];
        r7 = "SamplingUtil";
        r8 = "Failure storing timestamp to SharedPreferences";
        defpackage.tyv.b(r7, r8, r1);
    L_0x0035:
        r7 = r5;
    L_0x0036:
        r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r1 == 0) goto L_0x0041;
    L_0x003a:
        r7 = r7 + r2;
        r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r1 <= 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0041;
    L_0x0040:
        return;
    L_0x0041:
        r1 = r13.a;
        r2 = r1.a;
        r2 = com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.getPackageStats(r2);
        r3 = "PackageMetricService";
        if (r2 != 0) goto L_0x0056;
    L_0x004d:
        r0 = new java.lang.Object[r11];
        r1 = "PackageStats capture failed.";
        defpackage.tyv.d(r3, r1, r0);
        goto L_0x01be;
    L_0x0056:
        r5 = defpackage.bcfe.x;
        r5 = r5.createBuilder();
        r5 = (defpackage.bcfd) r5;
        defpackage.uhy.a(r2);
        r6 = defpackage.bcei.k;
        r6 = r6.createBuilder();
        r6 = (defpackage.bceh) r6;
        r7 = r2.cacheSize;
        r6.copyOnWrite();
        r9 = r6.instance;
        r9 = (defpackage.bcei) r9;
        r10 = r9.a;
        r10 = r10 | 1;
        r9.a = r10;
        r9.b = r7;
        r7 = r2.codeSize;
        r6.copyOnWrite();
        r9 = r6.instance;
        r9 = (defpackage.bcei) r9;
        r10 = r9.a;
        r10 = r10 | 2;
        r9.a = r10;
        r9.c = r7;
        r7 = r2.dataSize;
        r6.copyOnWrite();
        r9 = r6.instance;
        r9 = (defpackage.bcei) r9;
        r10 = r9.a;
        r10 = r10 | 4;
        r9.a = r10;
        r9.d = r7;
        r7 = r2.externalCacheSize;
        r6.copyOnWrite();
        r9 = r6.instance;
        r9 = (defpackage.bcei) r9;
        r10 = r9.a;
        r10 = r10 | 8;
        r9.a = r10;
        r9.e = r7;
        r7 = r2.externalCodeSize;
        r6.copyOnWrite();
        r9 = r6.instance;
        r9 = (defpackage.bcei) r9;
        r10 = r9.a;
        r10 = r10 | 16;
        r9.a = r10;
        r9.f = r7;
        r7 = r2.externalDataSize;
        r6.copyOnWrite();
        r9 = r6.instance;
        r9 = (defpackage.bcei) r9;
        r10 = r9.a;
        r10 = r10 | 32;
        r9.a = r10;
        r9.g = r7;
        r7 = r2.externalMediaSize;
        r6.copyOnWrite();
        r9 = r6.instance;
        r9 = (defpackage.bcei) r9;
        r10 = r9.a;
        r10 = r10 | 64;
        r9.a = r10;
        r9.h = r7;
        r7 = r2.externalObbSize;
        r6.copyOnWrite();
        r2 = r6.instance;
        r2 = (defpackage.bcei) r2;
        r9 = r2.a;
        r9 = r9 | 128;
        r2.a = r9;
        r2.i = r7;
        r2 = r6.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.bcei) r2;
        r2 = r2.toBuilder();
        r2 = (defpackage.anxo) r2;
        r2 = (defpackage.bceh) r2;
        r6 = r1.f;
        if (r6 != 0) goto L_0x0107;
    L_0x0105:
        goto L_0x0193;
    L_0x0107:
        r2.copyOnWrite();
        r6 = r2.instance;
        r6 = (defpackage.bcei) r6;
        r7 = defpackage.anxl.emptyProtobufList();
        r6.j = r7;
        r6 = r1.a;
        r7 = r1.g;
        r8 = r1.h;
        r9 = new java.util.ArrayList;
        r9.<init>();
        defpackage.uia.b();	 Catch:{ all -> 0x01bf }
        r10 = r6.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0138 }
        r12 = r6.getPackageName();	 Catch:{ NameNotFoundException -> 0x0138 }
        r10 = r10.getApplicationInfo(r12, r11);	 Catch:{ NameNotFoundException -> 0x0138 }
        r12 = new java.io.File;	 Catch:{ NameNotFoundException -> 0x0138 }
        r10 = r10.dataDir;	 Catch:{ NameNotFoundException -> 0x0138 }
        r12.<init>(r10);	 Catch:{ NameNotFoundException -> 0x0138 }
        goto L_0x014b;
    L_0x0136:
        r6 = move-exception;
        goto L_0x0160;
    L_0x0138:
        r10 = "Failed to use package manager getting data directory from context instead.";
        r12 = new java.lang.Object[r11];	 Catch:{ Exception -> 0x0136 }
        defpackage.tyv.d(r0, r10, r12);	 Catch:{ Exception -> 0x0136 }
        r6 = r6.getFilesDir();	 Catch:{ Exception -> 0x0136 }
        if (r6 == 0) goto L_0x014a;
    L_0x0145:
        r12 = r6.getParentFile();	 Catch:{ Exception -> 0x0136 }
        goto L_0x014b;
    L_0x014a:
        r12 = 0;
    L_0x014b:
        if (r12 != 0) goto L_0x0152;
    L_0x014d:
        r9 = java.util.Collections.emptyList();	 Catch:{ Exception -> 0x0136 }
        goto L_0x0184;
    L_0x0152:
        r6 = new ucl;	 Catch:{ Exception -> 0x0136 }
        r6.<init>(r12, r9, r7, r8);	 Catch:{ Exception -> 0x0136 }
        r7 = new uco;	 Catch:{ Exception -> 0x0136 }
        r7.<init>(r6);	 Catch:{ Exception -> 0x0136 }
        r6.a(r7);	 Catch:{ Exception -> 0x0136 }
        goto L_0x0184;
    L_0x0160:
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x01bf }
        r7 = r6.length();	 Catch:{ all -> 0x01bf }
        r7 = r7 + 29;
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01bf }
        r8.<init>(r7);	 Catch:{ all -> 0x01bf }
        r7 = "Failed to retrieve DirStats: ";
        r8.append(r7);	 Catch:{ all -> 0x01bf }
        r8.append(r6);	 Catch:{ all -> 0x01bf }
        r6 = r8.toString();	 Catch:{ all -> 0x01bf }
        r7 = new java.lang.Object[r11];	 Catch:{ all -> 0x01bf }
        defpackage.tyv.d(r0, r6, r7);	 Catch:{ all -> 0x01bf }
        r9 = java.util.Collections.emptyList();	 Catch:{ all -> 0x01bf }
    L_0x0184:
        r2.copyOnWrite();
        r0 = r2.instance;
        r0 = (defpackage.bcei) r0;
        r0.a();
        r0 = r0.j;
        defpackage.anvf.addAll(r9, r0);
    L_0x0193:
        r5.a(r2);
        r0 = r5.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.bcfe) r0;
        r1.a(r0);
        r0 = r1.e;
        r1 = android.os.SystemClock.elapsedRealtime();
        r0 = r0.edit();
        r0 = r0.putLong(r4, r1);
        r0 = r0.commit();
        r0 = r0 ^ 1;
        if (r0 == 0) goto L_0x01be;
    L_0x01b7:
        r0 = new java.lang.Object[r11];
        r1 = "Failure storing timestamp persistently";
        defpackage.tyv.b(r3, r1, r0);
    L_0x01be:
        return;
    L_0x01bf:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twv.run():void");
    }
}
