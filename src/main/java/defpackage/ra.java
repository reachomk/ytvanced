package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: ra */
public class ra {
    public static boolean a(Context context, Intent[] intentArr) {
        context.startActivities(intentArr, null);
        return true;
    }

    public static void a(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static File a(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.getDataDir();
        }
        String str = context.getApplicationInfo().dataDir;
        return str != null ? new File(str) : null;
    }

    public static File[] b(Context context) {
        return context.getExternalFilesDirs(null);
    }

    public static File[] c(Context context) {
        return context.getExternalCacheDirs();
    }

    public static Drawable a(Context context, int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        return context.getResources().getDrawable(i);
    }

    public static ColorStateList b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static int c(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static File d(Context context) {
        if (VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        return ra.a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* JADX WARNING: Missing block: B:16:0x0035, code skipped:
            return r3;
     */
    private static synchronized java.io.File a(java.io.File r3) {
        /*
        r0 = defpackage.ra.class;
        monitor-enter(r0);
        r1 = r3.exists();	 Catch:{ all -> 0x0036 }
        if (r1 != 0) goto L_0x0034;
    L_0x0009:
        r1 = r3.mkdirs();	 Catch:{ all -> 0x0036 }
        if (r1 != 0) goto L_0x0034;
    L_0x000f:
        r1 = r3.exists();	 Catch:{ all -> 0x0036 }
        if (r1 != 0) goto L_0x0032;
    L_0x0015:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0036 }
        r1.<init>();	 Catch:{ all -> 0x0036 }
        r2 = "Unable to create files subdir ";
        r1.append(r2);	 Catch:{ all -> 0x0036 }
        r3 = r3.getPath();	 Catch:{ all -> 0x0036 }
        r1.append(r3);	 Catch:{ all -> 0x0036 }
        r3 = "ContextCompat";
        r1 = r1.toString();	 Catch:{ all -> 0x0036 }
        android.util.Log.w(r3, r1);	 Catch:{ all -> 0x0036 }
        r3 = 0;
        monitor-exit(r0);
        return r3;
    L_0x0032:
        monitor-exit(r0);
        return r3;
    L_0x0034:
        monitor-exit(r0);
        return r3;
    L_0x0036:
        r3 = move-exception;
        monitor-exit(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra.a(java.io.File):java.io.File");
    }

    public static Context e(Context context) {
        if (VERSION.SDK_INT < 24) {
            return null;
        }
        return context.createDeviceProtectedStorageContext();
    }

    public static boolean f(Context context) {
        if (VERSION.SDK_INT < 24) {
            return false;
        }
        return context.isDeviceProtectedStorage();
    }

    public static Executor g(Context context) {
        if (VERSION.SDK_INT >= 28) {
            return context.getMainExecutor();
        }
        return new rd(new Handler(context.getMainLooper()));
    }

    static {
        Object obj = new Object();
    }
}
