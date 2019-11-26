package org.chromium.base;

import android.os.Build;
import android.os.Build.VERSION;
import defpackage.bchl;
import defpackage.bchm;
import defpackage.bchn;

public class BuildInfo {
    private final String a;
    private final int b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;

    private static String[] getAll() {
        BuildInfo buildInfo = bchm.a;
        String packageName = bchn.a.getPackageName();
        String[] strArr = new String[23];
        strArr[0] = Build.BRAND;
        strArr[1] = Build.DEVICE;
        strArr[2] = Build.ID;
        strArr[3] = Build.MANUFACTURER;
        strArr[4] = Build.MODEL;
        strArr[5] = String.valueOf(VERSION.SDK_INT);
        strArr[6] = Build.TYPE;
        strArr[7] = Build.BOARD;
        strArr[8] = packageName;
        strArr[9] = String.valueOf(buildInfo.b);
        strArr[10] = buildInfo.a;
        strArr[11] = buildInfo.c;
        strArr[12] = String.valueOf(buildInfo.d);
        strArr[13] = buildInfo.e;
        strArr[14] = buildInfo.i;
        strArr[15] = buildInfo.g;
        strArr[16] = buildInfo.f;
        strArr[17] = buildInfo.h;
        strArr[18] = bchl.a;
        strArr[19] = buildInfo.k;
        strArr[20] = buildInfo.l;
        strArr[21] = buildInfo.j;
        String str = (VERSION.CODENAME.length() != 1 || VERSION.CODENAME.charAt(0) < 'Q' || VERSION.CODENAME.charAt(0) > 'Z') ? "0" : "1";
        strArr[22] = str;
        return strArr;
    }

    private static String a(CharSequence charSequence) {
        return charSequence != null ? charSequence.toString() : "";
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0057 */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|(2:3|4)|(2:8|9)(1:10)|11|12|13|14|15|16|(1:18)(1:19)|20|(1:22)(1:23)|24|25) */
    private BuildInfo() {
        /*
        r6 = this;
        r6.<init>();
        r0 = defpackage.bchn.a;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = r0.getPackageName();	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00b3 }
        r2 = 0;
        r3 = r0.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r4 = r3.versionCode;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.b = r4;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.c = r1;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.d = r4;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = r3.versionName;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = a(r1);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.e = r1;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = r3.applicationInfo;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = r0.getApplicationLabel(r1);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = a(r1);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.a = r1;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = r6.c;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = r0.getInstallerPackageName(r1);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = a(r1);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.f = r1;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = "com.google.android.gms";
        r1 = r0.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x0041 }
        goto L_0x0042;
    L_0x0041:
        r1 = 0;
    L_0x0042:
        if (r1 != 0) goto L_0x0047;
    L_0x0044:
        r1 = "gms versionCode not available.";
        goto L_0x004d;
    L_0x0047:
        r1 = r1.versionCode;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ NameNotFoundException -> 0x00b3 }
    L_0x004d:
        r6.g = r1;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = "true";
        r4 = "projekt.substratum";
        r0.getPackageInfo(r4, r2);	 Catch:{ NameNotFoundException -> 0x0057 }
        goto L_0x0059;
    L_0x0057:
        r1 = "false";
    L_0x0059:
        r6.k = r1;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = "Not Enabled";
        r6.l = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = 21;
        r4 = 1;
        if (r0 >= r1) goto L_0x007a;
    L_0x0066:
        r0 = "ABI1: %s, ABI2: %s";
        r1 = 2;
        r1 = new java.lang.Object[r1];	 Catch:{ NameNotFoundException -> 0x00b3 }
        r5 = android.os.Build.CPU_ABI;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1[r2] = r5;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r5 = android.os.Build.CPU_ABI2;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1[r4] = r5;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = java.lang.String.format(r0, r1);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.h = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        goto L_0x0084;
    L_0x007a:
        r0 = ", ";
        r1 = android.os.Build.SUPPORTED_ABIS;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = android.text.TextUtils.join(r0, r1);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.h = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
    L_0x0084:
        r0 = r6.d;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = 10;
        if (r0 <= r1) goto L_0x008c;
    L_0x008a:
        r0 = (long) r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        goto L_0x008e;
    L_0x008c:
        r0 = r3.lastUpdateTime;	 Catch:{ NameNotFoundException -> 0x00b3 }
    L_0x008e:
        r3 = "@%x";
        r4 = new java.lang.Object[r4];	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r4[r2] = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = java.lang.String.format(r3, r4);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.j = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = android.os.Build.FINGERPRINT;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = android.os.Build.FINGERPRINT;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = r1.length();	 Catch:{ NameNotFoundException -> 0x00b3 }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r1 = java.lang.Math.min(r1, r3);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = r0.substring(r2, r1);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.i = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        return;
    L_0x00b3:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BuildInfo.<init>():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0057 */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|(2:3|4)|(2:8|9)(1:10)|11|12|13|14|15|16|(1:18)(1:19)|20|(1:22)(1:23)|24|25) */
    public /* synthetic */ BuildInfo(byte r7) {
        /*
        r6 = this;
        r6.<init>();
        r7 = defpackage.bchn.a;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = r7.getPackageName();	 Catch:{ NameNotFoundException -> 0x00b3 }
        r7 = r7.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00b3 }
        r1 = 0;
        r2 = r7.getPackageInfo(r0, r1);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r3 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.b = r3;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.c = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.d = r3;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = r2.versionName;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = a(r0);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.e = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = r2.applicationInfo;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = r7.getApplicationLabel(r0);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = a(r0);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.a = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = r6.c;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = r7.getInstallerPackageName(r0);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = a(r0);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.f = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = "com.google.android.gms";
        r0 = r7.getPackageInfo(r0, r1);	 Catch:{ NameNotFoundException -> 0x0041 }
        goto L_0x0042;
    L_0x0041:
        r0 = 0;
    L_0x0042:
        if (r0 != 0) goto L_0x0047;
    L_0x0044:
        r0 = "gms versionCode not available.";
        goto L_0x004d;
    L_0x0047:
        r0 = r0.versionCode;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ NameNotFoundException -> 0x00b3 }
    L_0x004d:
        r6.g = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = "true";
        r3 = "projekt.substratum";
        r7.getPackageInfo(r3, r1);	 Catch:{ NameNotFoundException -> 0x0057 }
        goto L_0x0059;
    L_0x0057:
        r0 = "false";
    L_0x0059:
        r6.k = r0;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r7 = "Not Enabled";
        r6.l = r7;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = 21;
        r3 = 1;
        if (r7 >= r0) goto L_0x007a;
    L_0x0066:
        r7 = "ABI1: %s, ABI2: %s";
        r0 = 2;
        r0 = new java.lang.Object[r0];	 Catch:{ NameNotFoundException -> 0x00b3 }
        r4 = android.os.Build.CPU_ABI;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0[r1] = r4;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r4 = android.os.Build.CPU_ABI2;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0[r3] = r4;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r7 = java.lang.String.format(r7, r0);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.h = r7;	 Catch:{ NameNotFoundException -> 0x00b3 }
        goto L_0x0084;
    L_0x007a:
        r7 = ", ";
        r0 = android.os.Build.SUPPORTED_ABIS;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r7 = android.text.TextUtils.join(r7, r0);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.h = r7;	 Catch:{ NameNotFoundException -> 0x00b3 }
    L_0x0084:
        r7 = r6.d;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = 10;
        if (r7 <= r0) goto L_0x008c;
    L_0x008a:
        r4 = (long) r7;	 Catch:{ NameNotFoundException -> 0x00b3 }
        goto L_0x008e;
    L_0x008c:
        r4 = r2.lastUpdateTime;	 Catch:{ NameNotFoundException -> 0x00b3 }
    L_0x008e:
        r7 = "@%x";
        r0 = new java.lang.Object[r3];	 Catch:{ NameNotFoundException -> 0x00b3 }
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0[r1] = r2;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r7 = java.lang.String.format(r7, r0);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.j = r7;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r7 = android.os.Build.FINGERPRINT;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = android.os.Build.FINGERPRINT;	 Catch:{ NameNotFoundException -> 0x00b3 }
        r0 = r0.length();	 Catch:{ NameNotFoundException -> 0x00b3 }
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = java.lang.Math.min(r0, r2);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r7 = r7.substring(r1, r0);	 Catch:{ NameNotFoundException -> 0x00b3 }
        r6.i = r7;	 Catch:{ NameNotFoundException -> 0x00b3 }
        return;
    L_0x00b3:
        r7 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BuildInfo.<init>(byte):void");
    }
}
