package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.os.Environment;
import defpackage.ankx;
import defpackage.bchn;
import defpackage.bchy;
import defpackage.bchz;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PathUtils {
    private PathUtils() {
    }

    private static String a(int i) {
        return bchy.a[i];
    }

    public static String getDataDirectory() {
        return a(0);
    }

    public static String getCacheDirectory() {
        return a(2);
    }

    public static String getThumbnailCacheDirectory() {
        return a(1);
    }

    /* JADX WARNING: Missing block: B:12:0x004c, code skipped:
            if (r0 != null) goto L_0x004f;
     */
    /* JADX WARNING: Missing block: B:13:0x004f, code skipped:
            a(r1, r0);
     */
    private static java.lang.String getDownloadsDirectory() {
        /*
        r0 = defpackage.bchz.b();
        r1 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0049 }
        r3 = android.os.Environment.DIRECTORY_DOWNLOADS;	 Catch:{ all -> 0x0049 }
        r3 = android.os.Environment.getExternalStoragePublicDirectory(r3);	 Catch:{ all -> 0x0049 }
        r3 = r3.getPath();	 Catch:{ all -> 0x0049 }
        r11 = "Android.StrictMode.DownloadsDir";
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0049 }
        r4 = r4 - r1;
        r1 = org.chromium.base.metrics.RecordHistogram.a(r11);	 Catch:{ all -> 0x0049 }
        r7 = org.chromium.base.metrics.RecordHistogram.a(r4);	 Catch:{ all -> 0x0049 }
        r4 = 1;
        r8 = org.chromium.base.metrics.RecordHistogram.a(r4);	 Catch:{ all -> 0x0049 }
        r4 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r9 = org.chromium.base.metrics.RecordHistogram.a(r4);	 Catch:{ all -> 0x0049 }
        r10 = 50;
        r4 = r11;
        r5 = r1;
        r4 = org.chromium.base.metrics.RecordHistogram.nativeRecordCustomTimesHistogramMilliseconds(r4, r5, r7, r8, r9, r10);	 Catch:{ all -> 0x0049 }
        r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r6 == 0) goto L_0x0042;
    L_0x0039:
        r1 = org.chromium.base.metrics.RecordHistogram.a;	 Catch:{ all -> 0x0049 }
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0049 }
        r1.put(r11, r2);	 Catch:{ all -> 0x0049 }
    L_0x0042:
        if (r0 == 0) goto L_0x0048;
    L_0x0044:
        r1 = 0;
        a(r1, r0);
    L_0x0048:
        return r3;
    L_0x0049:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x004b }
    L_0x004b:
        r2 = move-exception;
        if (r0 != 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0052;
    L_0x004f:
        a(r1, r0);
    L_0x0052:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.PathUtils.getDownloadsDirectory():java.lang.String");
    }

    /* JADX WARNING: Missing block: B:20:0x0046, code skipped:
            if (r0 != null) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:21:0x0049, code skipped:
            a(r1, r0);
     */
    public static java.lang.String[] getAllPrivateDownloadsDirectories() {
        /*
        r0 = defpackage.bchz.a();
        r1 = defpackage.bchn.a;	 Catch:{ all -> 0x0043 }
        r2 = android.os.Environment.DIRECTORY_DOWNLOADS;	 Catch:{ all -> 0x0043 }
        r1 = r1.getExternalFilesDirs(r2);	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x0012;
    L_0x000e:
        r2 = 0;
        a(r2, r0);
    L_0x0012:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r2 = 0;
    L_0x0018:
        r3 = r1.length;
        if (r2 >= r3) goto L_0x0036;
    L_0x001b:
        r3 = r1[r2];
        if (r3 != 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0033;
    L_0x0020:
        r3 = r3.getAbsolutePath();
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x0033;
    L_0x002a:
        r3 = r1[r2];
        r3 = r3.getAbsolutePath();
        r0.add(r3);
    L_0x0033:
        r2 = r2 + 1;
        goto L_0x0018;
    L_0x0036:
        r1 = r0.size();
        r1 = new java.lang.String[r1];
        r0 = r0.toArray(r1);
        r0 = (java.lang.String[]) r0;
        return r0;
    L_0x0043:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0045 }
    L_0x0045:
        r2 = move-exception;
        if (r0 != 0) goto L_0x0049;
    L_0x0048:
        goto L_0x004c;
    L_0x0049:
        a(r1, r0);
    L_0x004c:
        goto L_0x004e;
    L_0x004d:
        throw r2;
    L_0x004e:
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.PathUtils.getAllPrivateDownloadsDirectories():java.lang.String[]");
    }

    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = bchn.a.getApplicationInfo();
        if ((applicationInfo.flags & 128) != 0 || (applicationInfo.flags & 1) == 0) {
            return applicationInfo.nativeLibraryDir;
        }
        return "/system/lib/";
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static /* synthetic */ void a(Throwable th, bchz bchz) {
        if (th != null) {
            try {
                bchz.close();
                return;
            } catch (Throwable th2) {
                ankx.a(th, th2);
                return;
            }
        }
        bchz.close();
    }

    static {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
    }
}
