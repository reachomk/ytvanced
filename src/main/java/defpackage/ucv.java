package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import java.util.List;

/* renamed from: ucv */
public final class ucv {
    private static volatile ActivityManager a;

    public static ActivityManager a(Context context) {
        if (a == null) {
            synchronized (ucv.class) {
                if (a == null) {
                    a = (ActivityManager) context.getSystemService("activity");
                }
            }
        }
        return a;
    }

    public static boolean b(Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.contains(context.getPackageName())) {
                    if (VERSION.SDK_INT >= 23 || ucv.c(context)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (VERSION.SDK_INT >= 20) {
            return powerManager.isInteractive();
        }
        return powerManager.isScreenOn();
    }

    public static String d(Context context) {
        String packageName = context.getPackageName();
        String a = ucv.a();
        if (!(a == null || packageName == null || !a.startsWith(packageName))) {
            int length = packageName.length();
            if (a.length() != length) {
                return a.substring(length + 1);
            }
            a = null;
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b A:{SYNTHETIC, Splitter:B:12:0x003b} */
    /* JADX WARNING: Missing block: B:18:0x0040, code skipped:
            if (r2 != null) goto L_0x0031;
     */
    public static java.lang.String a() {
        /*
        r0 = android.os.Process.myPid();
        r1 = 0;
        if (r0 <= 0) goto L_0x0043;
    L_0x0007:
        r2 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x003f, all -> 0x0038 }
        r3 = new java.io.FileReader;	 Catch:{ IOException -> 0x003f, all -> 0x0038 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x003f, all -> 0x0038 }
        r5 = 25;
        r4.<init>(r5);	 Catch:{ IOException -> 0x003f, all -> 0x0038 }
        r5 = "/proc/";
        r4.append(r5);	 Catch:{ IOException -> 0x003f, all -> 0x0038 }
        r4.append(r0);	 Catch:{ IOException -> 0x003f, all -> 0x0038 }
        r0 = "/cmdline";
        r4.append(r0);	 Catch:{ IOException -> 0x003f, all -> 0x0038 }
        r0 = r4.toString();	 Catch:{ IOException -> 0x003f, all -> 0x0038 }
        r3.<init>(r0);	 Catch:{ IOException -> 0x003f, all -> 0x0038 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x003f, all -> 0x0038 }
        r0 = r2.readLine();	 Catch:{ IOException -> 0x0040, all -> 0x0035 }
        r1 = r0.trim();	 Catch:{ IOException -> 0x0040, all -> 0x0035 }
    L_0x0031:
        r2.close();	 Catch:{ IOException -> 0x0043 }
        goto L_0x0043;
    L_0x0035:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0039;
    L_0x0038:
        r0 = move-exception;
    L_0x0039:
        if (r1 == 0) goto L_0x003e;
    L_0x003b:
        r1.close();	 Catch:{ IOException -> 0x003e }
    L_0x003e:
        throw r0;
    L_0x003f:
        r2 = r1;
    L_0x0040:
        if (r2 == 0) goto L_0x0043;
    L_0x0042:
        goto L_0x0031;
    L_0x0043:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucv.a():java.lang.String");
    }
}
