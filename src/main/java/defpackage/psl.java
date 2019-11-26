package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: psl */
public class psl {
    @Deprecated
    public static final int a = 13280000;
    public static final AtomicBoolean b = new AtomicBoolean();
    private static boolean c = false;
    private static boolean d = false;
    private static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static String a(int i) {
        return psa.a(i);
    }

    @Deprecated
    public static boolean b(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e1 A:{SYNTHETIC, Splitter:B:59:0x00e1} */
    @java.lang.Deprecated
    public static int a(android.content.Context r8, int r9) {
        /*
        r0 = r8.getResources();	 Catch:{ all -> 0x000b }
        r1 = 2131952134; // 0x7f130206 float:1.9540702E38 double:1.053324308E-314;
        r0.getString(r1);	 Catch:{ all -> 0x000b }
        goto L_0x0012;
    L_0x000b:
        r0 = "GooglePlayServicesUtil";
        r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.";
        android.util.Log.e(r0, r1);
    L_0x0012:
        r0 = r8.getPackageName();
        r1 = "com.google.android.gms";
        r0 = r1.equals(r0);
        r1 = 1;
        if (r0 != 0) goto L_0x0098;
    L_0x001f:
        r0 = e;
        r0 = r0.get();
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        goto L_0x0098;
    L_0x0028:
        r0 = defpackage.pzg.a;
        monitor-enter(r0);
        r2 = defpackage.pzg.b;	 Catch:{ all -> 0x0095 }
        if (r2 == 0) goto L_0x0031;
    L_0x002f:
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        goto L_0x005e;
    L_0x0031:
        defpackage.pzg.b = r1;	 Catch:{ all -> 0x0095 }
        r2 = r8.getPackageName();	 Catch:{ all -> 0x0095 }
        r3 = defpackage.qph.a(r8);	 Catch:{ all -> 0x0095 }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r3.a(r2, r4);	 Catch:{ NameNotFoundException -> 0x0055 }
        r2 = r2.metaData;	 Catch:{ NameNotFoundException -> 0x0055 }
        if (r2 == 0) goto L_0x0053;
    L_0x0045:
        r3 = "com.google.app.id";
        r2.getString(r3);	 Catch:{ NameNotFoundException -> 0x0055 }
        r3 = "com.google.android.gms.version";
        r2 = r2.getInt(r3);	 Catch:{ NameNotFoundException -> 0x0055 }
        defpackage.pzg.c = r2;	 Catch:{ NameNotFoundException -> 0x0055 }
        goto L_0x005d;
    L_0x0053:
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        goto L_0x005e;
    L_0x0055:
        r2 = move-exception;
        r3 = "MetadataValueReader";
        r4 = "This should never happen.";
        android.util.Log.wtf(r3, r4, r2);	 Catch:{ all -> 0x0095 }
    L_0x005d:
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
    L_0x005e:
        r0 = defpackage.pzg.c;
        if (r0 == 0) goto L_0x008d;
    L_0x0062:
        r2 = a;
        if (r0 != r2) goto L_0x0067;
    L_0x0066:
        goto L_0x0098;
    L_0x0067:
        r8 = new java.lang.IllegalStateException;
        r9 = new java.lang.StringBuilder;
        r1 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        r9.<init>(r1);
        r1 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ";
        r9.append(r1);
        r9.append(r2);
        r1 = " but found ";
        r9.append(r1);
        r9.append(r0);
        r0 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />";
        r9.append(r0);
        r9 = r9.toString();
        r8.<init>(r9);
        throw r8;
    L_0x008d:
        r8 = new java.lang.IllegalStateException;
        r9 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />";
        r8.<init>(r9);
        throw r8;
    L_0x0095:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0095 }
        throw r8;
    L_0x0098:
        r0 = defpackage.qbc.b(r8);
        r2 = 0;
        if (r0 != 0) goto L_0x00d0;
    L_0x009f:
        r0 = defpackage.qbc.a;
        if (r0 != 0) goto L_0x00c5;
    L_0x00a3:
        r0 = r8.getPackageManager();
        r3 = "android.hardware.type.iot";
        r0 = r0.hasSystemFeature(r3);
        if (r0 != 0) goto L_0x00be;
    L_0x00af:
        r0 = r8.getPackageManager();
        r3 = "android.hardware.type.embedded";
        r0 = r0.hasSystemFeature(r3);
        if (r0 == 0) goto L_0x00bc;
    L_0x00bb:
        goto L_0x00be;
    L_0x00bc:
        r0 = 0;
        goto L_0x00bf;
    L_0x00be:
        r0 = 1;
    L_0x00bf:
        r0 = java.lang.Boolean.valueOf(r0);
        defpackage.qbc.a = r0;
    L_0x00c5:
        r0 = defpackage.qbc.a;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x00ce;
    L_0x00cd:
        goto L_0x00d0;
    L_0x00ce:
        r0 = 1;
        goto L_0x00d1;
    L_0x00d0:
        r0 = 0;
    L_0x00d1:
        if (r9 < 0) goto L_0x00d5;
    L_0x00d3:
        r3 = 1;
        goto L_0x00d6;
    L_0x00d5:
        r3 = 0;
    L_0x00d6:
        defpackage.pzr.b(r3);
        r3 = r8.getPackageManager();
        r4 = 9;
        if (r0 == 0) goto L_0x00f5;
    L_0x00e1:
        r5 = "com.android.vending";
        r6 = 8256; // 0x2040 float:1.1569E-41 double:4.079E-320;
        r5 = r3.getPackageInfo(r5, r6);	 Catch:{ NameNotFoundException -> 0x00ea }
        goto L_0x00f6;
    L_0x00ea:
        r8 = "GooglePlayServicesUtil";
        r9 = "Google Play Store is missing.";
        android.util.Log.w(r8, r9);
    L_0x00f1:
        r1 = 9;
        goto L_0x0180;
    L_0x00f5:
        r5 = 0;
    L_0x00f6:
        r6 = "com.google.android.gms";
        r7 = 64;
        r6 = r3.getPackageInfo(r6, r7);	 Catch:{ NameNotFoundException -> 0x0179 }
        defpackage.psk.a(r8);
        r8 = defpackage.psk.a(r6, r1);
        if (r8 != 0) goto L_0x010f;
    L_0x0107:
        r8 = "GooglePlayServicesUtil";
        r9 = "Google Play services signature invalid.";
        android.util.Log.w(r8, r9);
        goto L_0x00f1;
    L_0x010f:
        if (r0 == 0) goto L_0x012d;
    L_0x0111:
        r8 = defpackage.psk.a(r5, r1);
        if (r8 == 0) goto L_0x0125;
    L_0x0117:
        r8 = r5.signatures;
        r8 = r8[r2];
        r0 = r6.signatures;
        r0 = r0[r2];
        r8 = r8.equals(r0);
        if (r8 != 0) goto L_0x012d;
    L_0x0125:
        r8 = "GooglePlayServicesUtil";
        r9 = "Google Play Store signature invalid.";
        android.util.Log.w(r8, r9);
        goto L_0x00f1;
    L_0x012d:
        r8 = r6.versionCode;
        r8 = defpackage.qbe.a(r8);
        r0 = defpackage.qbe.a(r9);
        if (r8 >= r0) goto L_0x015d;
    L_0x0139:
        r8 = r6.versionCode;
        r0 = new java.lang.StringBuilder;
        r1 = 77;
        r0.<init>(r1);
        r1 = "Google Play services out of date.  Requires ";
        r0.append(r1);
        r0.append(r9);
        r9 = " but found ";
        r0.append(r9);
        r0.append(r8);
        r8 = r0.toString();
        r9 = "GooglePlayServicesUtil";
        android.util.Log.w(r9, r8);
        r1 = 2;
        goto L_0x0180;
    L_0x015d:
        r8 = r6.applicationInfo;
        if (r8 != 0) goto L_0x0171;
    L_0x0161:
        r8 = "com.google.android.gms";
        r8 = r3.getApplicationInfo(r8, r2);	 Catch:{ NameNotFoundException -> 0x0168 }
        goto L_0x0171;
    L_0x0168:
        r8 = move-exception;
        r9 = "GooglePlayServicesUtil";
        r0 = "Google Play services missing when getting application info.";
        android.util.Log.wtf(r9, r0, r8);
        goto L_0x0180;
    L_0x0171:
        r8 = r8.enabled;
        if (r8 == 0) goto L_0x0177;
    L_0x0175:
        r1 = 0;
        goto L_0x0180;
    L_0x0177:
        r8 = 3;
        return r8;
    L_0x0179:
        r8 = "GooglePlayServicesUtil";
        r9 = "Google Play services is missing.";
        android.util.Log.w(r8, r9);
    L_0x0180:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psl.a(android.content.Context, int):int");
    }

    @Deprecated
    public static void b(Context context, int i) {
        i = psh.b(context, i);
        if (i != 0) {
            Intent a = psh.a(context, i, "e");
            StringBuilder stringBuilder = new StringBuilder(57);
            stringBuilder.append("GooglePlayServices not available due to error ");
            stringBuilder.append(i);
            Log.e("GooglePlayServicesUtil", stringBuilder.toString());
            if (a == null) {
                throw new psg(i);
            }
            throw new psj(i, "Google Play Services not available", a);
        }
    }

    public static boolean b(Context context) {
        if (!d) {
            try {
                PackageInfo b = qph.a(context).b("com.google.android.gms", 64);
                psk.a(context);
                if (b == null || psk.a(b, false) || !psk.a(b, true)) {
                    c = false;
                } else {
                    c = true;
                }
                d = true;
            } catch (NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                d = true;
            } catch (Throwable th) {
                d = true;
                throw th;
            }
        }
        if (!c) {
            if ("user".equals(Build.TYPE)) {
                return false;
            }
        }
        return true;
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static int d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static boolean c(Context context, int i) {
        if (i != 18) {
            return i == 1 ? psl.a(context, "com.google.android.gms") : false;
        } else {
            return true;
        }
    }

    public static boolean a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (qbf.b()) {
            try {
                for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled) {
                Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
                if (applicationRestrictions == null || !"true".equals(applicationRestrictions.getString("restricted_profile"))) {
                    return true;
                }
            }
            return false;
        } catch (NameNotFoundException unused2) {
        }
    }
}
