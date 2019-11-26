package com.google.vr.vrcore.base.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import defpackage.bahp;

public final class VrCoreUtils {
    public static int getVrCoreClientApiVersion(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (!applicationInfo.enabled) {
                throw new bahp(2);
            } else if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getInt("com.google.vr.vrcore.ClientApiVersion", 0);
            } else {
                return 0;
            }
        } catch (NameNotFoundException unused) {
            throw new bahp(a(context));
        }
    }

    /* JADX WARNING: Missing block: B:14:0x004b, code skipped:
            if (defpackage.bahn.a(r3, defpackage.bahn.b) == false) goto L_0x004d;
     */
    public static int a(android.content.Context r6) {
        /*
        r0 = r6.getPackageName();
        r1 = "com.google.vr.vrcore";
        r0 = r1.equals(r0);
        r2 = 0;
        if (r0 != 0) goto L_0x00b7;
    L_0x000d:
        r0 = 1;
        r3 = r6.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0053 }
        r3 = r3.getApplicationInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x0053 }
        r3 = r3.enabled;	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r3 == 0) goto L_0x0051;
    L_0x001a:
        r3 = r6.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0053 }
        r4 = 64;
        r3 = r3.getPackageInfo(r1, r4);	 Catch:{ NameNotFoundException -> 0x0053 }
        r4 = new android.content.pm.Signature[r0];	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = defpackage.bahn.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r4[r2] = r5;	 Catch:{ NameNotFoundException -> 0x0053 }
        r4 = defpackage.bahn.a(r3, r4);	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r4 != 0) goto L_0x0050;
    L_0x0030:
        r4 = defpackage.bahm.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r4 != 0) goto L_0x0039;
    L_0x0034:
        r4 = defpackage.bahm.a(r6);	 Catch:{ NameNotFoundException -> 0x0053 }
        goto L_0x003f;
    L_0x0039:
        r4 = defpackage.bahm.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r4 = r4.booleanValue();	 Catch:{ NameNotFoundException -> 0x0053 }
    L_0x003f:
        if (r4 == 0) goto L_0x004d;
    L_0x0041:
        r4 = new android.content.pm.Signature[r0];	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = defpackage.bahn.b;	 Catch:{ NameNotFoundException -> 0x0053 }
        r4[r2] = r5;	 Catch:{ NameNotFoundException -> 0x0053 }
        r6 = defpackage.bahn.a(r3, r4);	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r6 != 0) goto L_0x0050;
    L_0x004d:
        r6 = 9;
        return r6;
    L_0x0050:
        return r2;
    L_0x0051:
        r6 = 2;
        return r6;
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 21;
        r4 = 3;
        if (r2 < r3) goto L_0x00a7;
    L_0x005b:
        r2 = r6.getPackageManager();	 Catch:{ RuntimeException -> 0x0068 }
        r2 = r2.getPackageInstaller();	 Catch:{ RuntimeException -> 0x0068 }
        r2 = r2.getAllSessions();	 Catch:{ RuntimeException -> 0x0068 }
        goto L_0x008a;
    L_0x0068:
        r2 = move-exception;
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        r5 = new java.lang.StringBuilder;
        r3 = r3 + 45;
        r5.<init>(r3);
        r3 = "Failure querying package installer sessions: ";
        r5.append(r3);
        r5.append(r2);
        r2 = r5.toString();
        r3 = "VrCoreUtils";
        android.util.Log.w(r3, r2);
        r2 = 0;
    L_0x008a:
        if (r2 == 0) goto L_0x00a7;
    L_0x008c:
        r2 = r2.iterator();
    L_0x0090:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x00a7;
    L_0x0096:
        r3 = r2.next();
        r3 = (android.content.pm.PackageInstaller.SessionInfo) r3;
        r3 = r3.getAppPackageName();
        r3 = r1.equals(r3);
        if (r3 == 0) goto L_0x0090;
    L_0x00a6:
        return r4;
    L_0x00a7:
        r6 = r6.getPackageManager();
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r6 = r6.getApplicationInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x00b6 }
        r6 = r6.enabled;	 Catch:{ NameNotFoundException -> 0x00b6 }
        if (r6 == 0) goto L_0x00b6;
    L_0x00b5:
        return r4;
    L_0x00b6:
        return r0;
    L_0x00b7:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vr.vrcore.base.api.VrCoreUtils.a(android.content.Context):int");
    }
}
