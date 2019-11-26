package com.google.android.apps.youtube.app.application.log;

import android.os.Bundle;
import defpackage.aej;
import defpackage.fmu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LogCollectorActivity extends aej {
    private static final List g = new ArrayList(Arrays.asList(new String[]{"logcat", "-v", "time", "-d"}));
    private static final Set h;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        fmu.a(this);
        super.onCreate(bundle);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7 A:{SYNTHETIC, Splitter:B:47:0x00d7} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1 A:{SYNTHETIC, Splitter:B:52:0x00e1} */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee A:{SYNTHETIC, Splitter:B:59:0x00ee} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f8 A:{SYNTHETIC, Splitter:B:64:0x00f8} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7 A:{SYNTHETIC, Splitter:B:47:0x00d7} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1 A:{SYNTHETIC, Splitter:B:52:0x00e1} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee A:{SYNTHETIC, Splitter:B:59:0x00ee} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f8 A:{SYNTHETIC, Splitter:B:64:0x00f8} */
    public final void onStart() {
        /*
        r11 = this;
        r0 = "Could not close input stream.";
        r1 = "Could not close output stream.";
        super.onStart();
        r2 = r11.getCallingActivity();
        if (r2 == 0) goto L_0x0122;
    L_0x000d:
        r3 = h;
        r2 = r2.getPackageName();
        r2 = r3.contains(r2);
        if (r2 != 0) goto L_0x001b;
    L_0x0019:
        goto L_0x0122;
    L_0x001b:
        r2 = g;
        r3 = android.os.Environment.getExternalStorageState();
        r4 = "mounted";
        r4 = r4.equals(r3);
        r5 = 0;
        if (r4 != 0) goto L_0x004f;
    L_0x002a:
        r4 = java.lang.String.valueOf(r3);
        r4 = r4.length();
        r6 = new java.lang.StringBuilder;
        r4 = r4 + 76;
        r6.<init>(r4);
        r4 = "Unable to create log file. External storage not mounted. Current state is [";
        r6.append(r4);
        r6.append(r3);
        r3 = "]";
        r6.append(r3);
        r3 = r6.toString();
        defpackage.xtl.c(r3);
        r3 = r5;
        goto L_0x0074;
    L_0x004f:
        r3 = android.os.Environment.getExternalStorageDirectory();
        r4 = new java.io.File;
        r6 = "logs";
        r4.<init>(r3, r6);
        r3 = r4.isDirectory();
        if (r3 != 0) goto L_0x0063;
    L_0x0060:
        r4.mkdir();
    L_0x0063:
        r3 = new java.io.File;
        r6 = "ytlog.txt";
        r3.<init>(r4, r6);
        r3.createNewFile();	 Catch:{ IOException -> 0x006e }
        goto L_0x0074;
    L_0x006e:
        r4 = move-exception;
        r6 = "Error creating log file";
        defpackage.xtl.a(r6, r4);
    L_0x0074:
        r4 = -1;
        r6 = 0;
        if (r3 == 0) goto L_0x0101;
    L_0x0078:
        r7 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r7 = new byte[r7];
        r8 = java.lang.Runtime.getRuntime();	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r9 = new java.lang.String[r6];	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r2 = r2.toArray(r9);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r2 = (java.lang.String[]) r2;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r2 = r8.exec(r2);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r8 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r9 = r2.getInputStream();	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r8.<init>(r9);	 Catch:{ IOException -> 0x00cd, all -> 0x00ca }
        r9 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x00c7, all -> 0x00c5 }
        r10 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00c7, all -> 0x00c5 }
        r10.<init>(r3);	 Catch:{ IOException -> 0x00c7, all -> 0x00c5 }
        r9.<init>(r10);	 Catch:{ IOException -> 0x00c7, all -> 0x00c5 }
    L_0x009f:
        r10 = r8.read(r7);	 Catch:{ IOException -> 0x00c3 }
        if (r10 == r4) goto L_0x00a9;
    L_0x00a5:
        r9.write(r7, r6, r10);	 Catch:{ IOException -> 0x00c3 }
        goto L_0x009f;
    L_0x00a9:
        r2.destroy();	 Catch:{ IOException -> 0x00c3 }
        r9.close();	 Catch:{ IOException -> 0x00b0 }
        goto L_0x00b4;
    L_0x00b0:
        r2 = move-exception;
        defpackage.xtl.a(r1, r2);
    L_0x00b4:
        r8.close();	 Catch:{ IOException -> 0x00b8 }
        goto L_0x00bc;
    L_0x00b8:
        r1 = move-exception;
        defpackage.xtl.a(r0, r1);
    L_0x00bc:
        r0 = "com.google.android.youtube.fileprovider";
        r5 = defpackage.rc.a(r11, r0, r3);
        goto L_0x0101;
    L_0x00c3:
        r2 = move-exception;
        goto L_0x00d0;
    L_0x00c5:
        r2 = move-exception;
        goto L_0x00ec;
    L_0x00c7:
        r2 = move-exception;
        r9 = r5;
        goto L_0x00d0;
    L_0x00ca:
        r2 = move-exception;
        r8 = r5;
        goto L_0x00ec;
    L_0x00cd:
        r2 = move-exception;
        r8 = r5;
        r9 = r8;
    L_0x00d0:
        r3 = "Error collecting logs. Ironic, right?";
        defpackage.xtl.a(r3, r2);	 Catch:{ all -> 0x00ea }
        if (r9 == 0) goto L_0x00df;
    L_0x00d7:
        r9.close();	 Catch:{ IOException -> 0x00db }
        goto L_0x00df;
    L_0x00db:
        r2 = move-exception;
        defpackage.xtl.a(r1, r2);
    L_0x00df:
        if (r8 == 0) goto L_0x0101;
    L_0x00e1:
        r8.close();	 Catch:{ IOException -> 0x00e5 }
        goto L_0x0101;
    L_0x00e5:
        r1 = move-exception;
        defpackage.xtl.a(r0, r1);
        goto L_0x0101;
    L_0x00ea:
        r2 = move-exception;
        r5 = r9;
    L_0x00ec:
        if (r5 == 0) goto L_0x00f6;
    L_0x00ee:
        r5.close();	 Catch:{ IOException -> 0x00f2 }
        goto L_0x00f6;
    L_0x00f2:
        r3 = move-exception;
        defpackage.xtl.a(r1, r3);
    L_0x00f6:
        if (r8 == 0) goto L_0x0100;
    L_0x00f8:
        r8.close();	 Catch:{ IOException -> 0x00fc }
        goto L_0x0100;
    L_0x00fc:
        r1 = move-exception;
        defpackage.xtl.a(r0, r1);
    L_0x0100:
        throw r2;
    L_0x0101:
        r0 = new android.content.Intent;
        r0.<init>();
        if (r5 == 0) goto L_0x011b;
    L_0x0108:
        r1 = r11.getContentResolver();
        r1 = r1.getType(r5);
        r0.setDataAndType(r5, r1);
        r1 = 1;
        r0.addFlags(r1);
        r11.setResult(r4, r0);
        goto L_0x011e;
    L_0x011b:
        r11.setResult(r6);
    L_0x011e:
        r11.finish();
        return;
    L_0x0122:
        r11.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.application.log.LogCollectorActivity.onStart():void");
    }

    static {
        HashSet hashSet = new HashSet();
        h = hashSet;
        hashSet.add("com.google.android.apps.eureka");
        h.add("com.google.eureka.feedback");
    }
}
