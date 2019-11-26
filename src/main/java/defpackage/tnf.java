package defpackage;

/* renamed from: tnf */
final class tnf implements tmn {
    private final rwg a;

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Missing block: B:27:0x0082, code skipped:
            if (defpackage.rwg.b.booleanValue() != false) goto L_0x0084;
     */
    public final java.lang.Object a() {
        /*
        r7 = this;
        r0 = "PhenotypeFlag";
        r1 = r7.a;
        r2 = r1.g;
        r2 = defpackage.rwg.a;
        if (r2 == 0) goto L_0x00e3;
    L_0x000a:
        r2 = r1.c;
        r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype";
        r3 = 0;
        r4 = defpackage.rwg.a();	 Catch:{ SecurityException -> 0x0042 }
        if (r4 == 0) goto L_0x0048;
    L_0x0015:
        r4 = new rxa;	 Catch:{ SecurityException -> 0x0042 }
        r4.<init>(r2);	 Catch:{ SecurityException -> 0x0042 }
        r2 = defpackage.rwg.a(r4);	 Catch:{ SecurityException -> 0x0042 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ SecurityException -> 0x0042 }
        r2 = r2.booleanValue();	 Catch:{ SecurityException -> 0x0042 }
        if (r2 == 0) goto L_0x0048;
    L_0x0026:
        r2 = r1.d;
        r2 = java.lang.String.valueOf(r2);
        r4 = "Bypass reading Phenotype values for flag: ";
        r5 = r2.length();
        if (r5 != 0) goto L_0x003a;
    L_0x0034:
        r2 = new java.lang.String;
        r2.<init>(r4);
        goto L_0x003e;
    L_0x003a:
        r2 = r4.concat(r2);
    L_0x003e:
        android.util.Log.w(r0, r2);
        goto L_0x00a4;
    L_0x0042:
        r2 = move-exception;
        r4 = "Unable to read GServices, returning default value.";
        android.util.Log.e(r0, r4, r2);
    L_0x0048:
        r2 = r1.c;
        r2 = r2.a;
        if (r2 == 0) goto L_0x00a4;
    L_0x004e:
        r2 = android.os.Build.VERSION.SDK_INT;
        r4 = 24;
        if (r2 < r4) goto L_0x0084;
    L_0x0054:
        r2 = defpackage.rwg.a;
        r2 = r2.isDeviceProtectedStorage();
        if (r2 != 0) goto L_0x0084;
    L_0x005c:
        r2 = defpackage.rwg.b;
        if (r2 == 0) goto L_0x0068;
    L_0x0060:
        r2 = defpackage.rwg.b;
        r2 = r2.booleanValue();
        if (r2 != 0) goto L_0x007c;
    L_0x0068:
        r2 = defpackage.rwg.a;
        r4 = android.os.UserManager.class;
        r2 = r2.getSystemService(r4);
        r2 = (android.os.UserManager) r2;
        r2 = r2.isUserUnlocked();
        r2 = java.lang.Boolean.valueOf(r2);
        defpackage.rwg.b = r2;
    L_0x007c:
        r2 = defpackage.rwg.b;
        r2 = r2.booleanValue();
        if (r2 == 0) goto L_0x00a4;
    L_0x0084:
        r2 = r1.h;
        if (r2 != 0) goto L_0x0095;
    L_0x0088:
        r2 = defpackage.rwg.a;
        r4 = r1.c;
        r4 = r4.a;
        r5 = 0;
        r2 = r2.getSharedPreferences(r4, r5);
        r1.h = r2;
    L_0x0095:
        r2 = r1.h;
        r4 = r1.d;
        r4 = r2.contains(r4);
        if (r4 == 0) goto L_0x00a4;
    L_0x009f:
        r2 = r1.a(r2);
        goto L_0x00a5;
    L_0x00a4:
        r2 = r3;
    L_0x00a5:
        if (r2 != 0) goto L_0x00e2;
    L_0x00a7:
        r2 = defpackage.rwg.a();
        if (r2 == 0) goto L_0x00db;
    L_0x00ad:
        r2 = new rxb;	 Catch:{ SecurityException -> 0x00bf }
        r2.<init>(r1);	 Catch:{ SecurityException -> 0x00bf }
        r2 = defpackage.rwg.a(r2);	 Catch:{ SecurityException -> 0x00bf }
        r2 = (java.lang.String) r2;	 Catch:{ SecurityException -> 0x00bf }
        if (r2 == 0) goto L_0x00db;
    L_0x00ba:
        r3 = r1.a(r2);	 Catch:{ SecurityException -> 0x00bf }
        goto L_0x00db;
    L_0x00bf:
        r2 = move-exception;
        r4 = r1.d;
        r4 = java.lang.String.valueOf(r4);
        r5 = "Unable to read GServices for flag: ";
        r6 = r4.length();
        if (r6 != 0) goto L_0x00d4;
    L_0x00ce:
        r4 = new java.lang.String;
        r4.<init>(r5);
        goto L_0x00d8;
    L_0x00d4:
        r4 = r5.concat(r4);
    L_0x00d8:
        android.util.Log.e(r0, r4, r2);
    L_0x00db:
        r2 = r3;
        if (r2 == 0) goto L_0x00df;
    L_0x00de:
        goto L_0x00e2;
    L_0x00df:
        r0 = r1.f;
        return r0;
    L_0x00e2:
        return r2;
    L_0x00e3:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnf.a():java.lang.Object");
    }

    /* synthetic */ tnf(rwg rwg) {
        this.a = rwg;
    }
}
