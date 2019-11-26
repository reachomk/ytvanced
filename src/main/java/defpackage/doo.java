package defpackage;

import android.app.Application;

/* renamed from: doo */
public abstract class doo extends Application implements diq, dti, wwz, xfc, zxa {
    public final don a = new don(this, new dor(this));
    public bcaa b;
    public bapu c;
    private long d;
    private boolean e;

    public abstract void c();

    public abstract boolean f();

    public abstract dtg g();

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032c A:{SYNTHETIC, Splitter:B:113:0x032c} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04b4 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0358 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0137 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x04d7 */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04d3 A:{SYNTHETIC, Splitter:B:156:0x04d3} */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04f3 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032c A:{SYNTHETIC, Splitter:B:113:0x032c} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0358 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04b4 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04d3 A:{SYNTHETIC, Splitter:B:156:0x04d3} */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04f3 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032c A:{SYNTHETIC, Splitter:B:113:0x032c} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04b4 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0358 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032c A:{SYNTHETIC, Splitter:B:113:0x032c} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0358 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04b4 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032c A:{SYNTHETIC, Splitter:B:113:0x032c} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04b4 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0358 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032c A:{SYNTHETIC, Splitter:B:113:0x032c} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0358 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04b4 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04d3 A:{SYNTHETIC, Splitter:B:156:0x04d3} */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04f3 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04d3 A:{SYNTHETIC, Splitter:B:156:0x04d3} */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04f3 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032c A:{SYNTHETIC, Splitter:B:113:0x032c} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04b4 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0358 A:{Catch:{ IOException -> 0x0330, all -> 0x050a }} */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:28|29|(2:31|(1:33)(5:34|(3:36|(2:38|179)(2:39|178)|40)|177|41|(1:43)(1:44)))|48|49|50|51|52|53|(12:54|55|56|57|58|59|(1:110)(9:64|65|(5:67|68|69|70|(13:72|73|74|75|76|77|78|79|80|81|(4:83|84|85|(1:87)(1:183))(2:182|88)|89|90)(3:181|99|100))|180|105|(2:113|114)|118|119|(4:121|(2:123|(2:125|(4:127|(2:130|128)|184|131)(1:132))(2:133|(6:135|(1:137)|185|138|(1:140)(1:141)|142)))|143|144)(1:145))|111|(0)|118|119|(0)(0))) */
    /* JADX WARNING: Missing block: B:164:0x04fa, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:165:0x04fb, code skipped:
            r11 = r9;
            android.util.Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", r0);
     */
    /* JADX WARNING: Missing block: B:167:0x0505, code skipped:
            return;
     */
    public final void attachBaseContext(android.content.Context r29) {
        /*
        r28 = this;
        r0 = android.os.SystemClock.elapsedRealtime();
        r8 = r28;
        r8.d = r0;
        java.lang.System.currentTimeMillis();
        super.attachBaseContext(r29);
        r0 = defpackage.mk.b;
        if (r0 != 0) goto L_0x0533;
    L_0x0012:
        r0 = r28.getApplicationInfo();	 Catch:{ RuntimeException -> 0x001b }
        r2 = r0;
        goto L_0x0025;
    L_0x0018:
        r0 = move-exception;
        goto L_0x050c;
    L_0x001b:
        r0 = move-exception;
        r2 = r0;
        r0 = "MultiDex";
        r3 = "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.";
        android.util.Log.w(r0, r3, r2);	 Catch:{ Exception -> 0x0018 }
        r2 = 0;
    L_0x0025:
        if (r2 != 0) goto L_0x0029;
    L_0x0027:
        goto L_0x0533;
    L_0x0029:
        r9 = defpackage.mk.a;	 Catch:{ Exception -> 0x0018 }
        monitor-enter(r9);	 Catch:{ Exception -> 0x0018 }
        r0 = r2.sourceDir;	 Catch:{ all -> 0x0506 }
        r3 = defpackage.mk.a;	 Catch:{ all -> 0x0506 }
        r3 = r3.contains(r0);	 Catch:{ all -> 0x0506 }
        if (r3 == 0) goto L_0x0038;
    L_0x0036:
        monitor-exit(r9);	 Catch:{ all -> 0x0506 }
        return;
    L_0x0038:
        r3 = defpackage.mk.a;	 Catch:{ all -> 0x0506 }
        r3.add(r0);	 Catch:{ all -> 0x0506 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0506 }
        r3 = 20;
        if (r0 <= r3) goto L_0x0080;
    L_0x0043:
        r0 = "MultiDex";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0506 }
        r4.<init>();	 Catch:{ all -> 0x0506 }
        r5 = "MultiDex is not guaranteed to work in SDK version ";
        r4.append(r5);	 Catch:{ all -> 0x0506 }
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0506 }
        r4.append(r5);	 Catch:{ all -> 0x0506 }
        r5 = ": SDK version higher than ";
        r4.append(r5);	 Catch:{ all -> 0x0506 }
        r4.append(r3);	 Catch:{ all -> 0x0506 }
        r3 = " should be backed by ";
        r4.append(r3);	 Catch:{ all -> 0x0506 }
        r3 = "runtime with built-in multidex capabilty but it's not the ";
        r4.append(r3);	 Catch:{ all -> 0x0506 }
        r3 = "case here: java.vm.version=\"";
        r4.append(r3);	 Catch:{ all -> 0x0506 }
        r3 = "java.vm.version";
        r3 = java.lang.System.getProperty(r3);	 Catch:{ all -> 0x0506 }
        r4.append(r3);	 Catch:{ all -> 0x0506 }
        r3 = "\"";
        r4.append(r3);	 Catch:{ all -> 0x0506 }
        r3 = r4.toString();	 Catch:{ all -> 0x0506 }
        android.util.Log.w(r0, r3);	 Catch:{ all -> 0x0506 }
    L_0x0080:
        r10 = r28.getClassLoader();	 Catch:{ RuntimeException -> 0x04fa }
        if (r10 != 0) goto L_0x0090;
    L_0x0086:
        r0 = "MultiDex";
        r1 = "Context class loader is null. Must be running in test mode. Skip patching.";
        android.util.Log.e(r0, r1);	 Catch:{ all -> 0x0506 }
        monitor-exit(r9);	 Catch:{ all -> 0x0506 }
        goto L_0x0533;
    L_0x0090:
        r0 = new java.io.File;	 Catch:{ all -> 0x0122 }
        r3 = r28.getFilesDir();	 Catch:{ all -> 0x0122 }
        r4 = "secondary-dexes";
        r0.<init>(r3, r4);	 Catch:{ all -> 0x0122 }
        r3 = r0.isDirectory();	 Catch:{ all -> 0x0122 }
        if (r3 == 0) goto L_0x012a;
    L_0x00a1:
        r0.getPath();	 Catch:{ all -> 0x0122 }
        r3 = r0.listFiles();	 Catch:{ all -> 0x0122 }
        if (r3 != 0) goto L_0x00ca;
    L_0x00aa:
        r3 = "MultiDex";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0122 }
        r4.<init>();	 Catch:{ all -> 0x0122 }
        r5 = "Failed to list secondary dex dir content (";
        r4.append(r5);	 Catch:{ all -> 0x0122 }
        r0 = r0.getPath();	 Catch:{ all -> 0x0122 }
        r4.append(r0);	 Catch:{ all -> 0x0122 }
        r0 = ").";
        r4.append(r0);	 Catch:{ all -> 0x0122 }
        r0 = r4.toString();	 Catch:{ all -> 0x0122 }
        android.util.Log.w(r3, r0);	 Catch:{ all -> 0x0122 }
        goto L_0x012a;
    L_0x00ca:
        r4 = r3.length;	 Catch:{ all -> 0x0122 }
        r5 = 0;
    L_0x00cc:
        if (r5 >= r4) goto L_0x00fd;
    L_0x00ce:
        r6 = r3[r5];	 Catch:{ all -> 0x0122 }
        r6.getPath();	 Catch:{ all -> 0x0122 }
        r6.length();	 Catch:{ all -> 0x0122 }
        r7 = r6.delete();	 Catch:{ all -> 0x0122 }
        if (r7 != 0) goto L_0x00f7;
    L_0x00dc:
        r7 = "MultiDex";
        r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0122 }
        r12.<init>();	 Catch:{ all -> 0x0122 }
        r13 = "Failed to delete old file ";
        r12.append(r13);	 Catch:{ all -> 0x0122 }
        r6 = r6.getPath();	 Catch:{ all -> 0x0122 }
        r12.append(r6);	 Catch:{ all -> 0x0122 }
        r6 = r12.toString();	 Catch:{ all -> 0x0122 }
        android.util.Log.w(r7, r6);	 Catch:{ all -> 0x0122 }
        goto L_0x00fa;
    L_0x00f7:
        r6.getPath();	 Catch:{ all -> 0x0122 }
    L_0x00fa:
        r5 = r5 + 1;
        goto L_0x00cc;
    L_0x00fd:
        r3 = r0.delete();	 Catch:{ all -> 0x0122 }
        if (r3 == 0) goto L_0x0107;
    L_0x0103:
        r0.getPath();	 Catch:{ all -> 0x0122 }
        goto L_0x012a;
    L_0x0107:
        r3 = "MultiDex";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0122 }
        r4.<init>();	 Catch:{ all -> 0x0122 }
        r5 = "Failed to delete secondary dex dir ";
        r4.append(r5);	 Catch:{ all -> 0x0122 }
        r0 = r0.getPath();	 Catch:{ all -> 0x0122 }
        r4.append(r0);	 Catch:{ all -> 0x0122 }
        r0 = r4.toString();	 Catch:{ all -> 0x0122 }
        android.util.Log.w(r3, r0);	 Catch:{ all -> 0x0122 }
        goto L_0x012a;
    L_0x0122:
        r0 = move-exception;
        r3 = "MultiDex";
        r4 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.";
        android.util.Log.w(r3, r4, r0);	 Catch:{ all -> 0x0506 }
    L_0x012a:
        r0 = new java.io.File;	 Catch:{ all -> 0x0506 }
        r3 = r2.dataDir;	 Catch:{ all -> 0x0506 }
        r4 = "code_cache";
        r0.<init>(r3, r4);	 Catch:{ all -> 0x0506 }
        defpackage.mk.a(r0);	 Catch:{ IOException -> 0x0137 }
        goto L_0x0145;
    L_0x0137:
        r0 = new java.io.File;	 Catch:{ all -> 0x0506 }
        r3 = r28.getFilesDir();	 Catch:{ all -> 0x0506 }
        r4 = "code_cache";
        r0.<init>(r3, r4);	 Catch:{ all -> 0x0506 }
        defpackage.mk.a(r0);	 Catch:{ all -> 0x0506 }
    L_0x0145:
        r12 = new java.io.File;	 Catch:{ all -> 0x0506 }
        r3 = "secondary-dexes";
        r12.<init>(r0, r3);	 Catch:{ all -> 0x0506 }
        defpackage.mk.a(r12);	 Catch:{ all -> 0x0506 }
        r0 = r2.sourceDir;	 Catch:{ all -> 0x0506 }
        r3 = new java.io.File;	 Catch:{ all -> 0x0506 }
        r0 = r2.sourceDir;	 Catch:{ all -> 0x0506 }
        r3.<init>(r0);	 Catch:{ all -> 0x0506 }
        r5 = defpackage.mj.b(r3);	 Catch:{ all -> 0x0506 }
        r13 = new java.io.File;	 Catch:{ all -> 0x0506 }
        r0 = "MultiDex.lock";
        r13.<init>(r12, r0);	 Catch:{ all -> 0x0506 }
        r14 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x0506 }
        r0 = "rw";
        r14.<init>(r13, r0);	 Catch:{ all -> 0x0506 }
        r15 = r14.getChannel();	 Catch:{ all -> 0x04c9 }
        r13.getPath();	 Catch:{ all -> 0x04c0 }
        r16 = r15.lock();	 Catch:{ all -> 0x04c0 }
        r13.getPath();	 Catch:{ all -> 0x04b7 }
        r0 = defpackage.mj.a(r28);	 Catch:{ all -> 0x04b7 }
        r2 = "timestamp";
        r17 = r12;
        r11 = -1;
        r18 = r0.getLong(r2, r11);	 Catch:{ all -> 0x04b7 }
        r20 = defpackage.mj.a(r3);	 Catch:{ all -> 0x04b7 }
        r4 = 1;
        r2 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1));
        if (r2 != 0) goto L_0x030c;
    L_0x018f:
        r2 = "crc";
        r18 = r0.getLong(r2, r11);	 Catch:{ all -> 0x04b7 }
        r0 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1));
        if (r0 != 0) goto L_0x030c;
    L_0x0199:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02e4 }
        r0.<init>();	 Catch:{ IOException -> 0x02e4 }
        r2 = r3.getName();	 Catch:{ IOException -> 0x02e4 }
        r0.append(r2);	 Catch:{ IOException -> 0x02e4 }
        r2 = ".classes";
        r0.append(r2);	 Catch:{ IOException -> 0x02e4 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x02e4 }
        r2 = defpackage.mj.a(r28);	 Catch:{ IOException -> 0x02e4 }
        r1 = "dex.number";
        r1 = r2.getInt(r1, r4);	 Catch:{ IOException -> 0x02e4 }
        r4 = new java.util.ArrayList;	 Catch:{ IOException -> 0x02e4 }
        r7 = r1 + -1;
        r4.<init>(r7);	 Catch:{ IOException -> 0x02e4 }
        r7 = 2;
    L_0x01c0:
        if (r7 > r1) goto L_0x02d6;
    L_0x01c2:
        r11 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02e4 }
        r11.<init>();	 Catch:{ IOException -> 0x02e4 }
        r11.append(r0);	 Catch:{ IOException -> 0x02e4 }
        r11.append(r7);	 Catch:{ IOException -> 0x02e4 }
        r12 = ".zip";
        r11.append(r12);	 Catch:{ IOException -> 0x02e4 }
        r11 = r11.toString();	 Catch:{ IOException -> 0x02e4 }
        r12 = new ml;	 Catch:{ IOException -> 0x02e4 }
        r23 = r1;
        r1 = r17;
        r12.<init>(r1, r11);	 Catch:{ IOException -> 0x02c9 }
        r11 = r12.isFile();	 Catch:{ IOException -> 0x02c9 }
        if (r11 == 0) goto L_0x029c;
    L_0x01e5:
        r11 = r9;
        r8 = defpackage.mj.b(r12);	 Catch:{ IOException -> 0x0296, all -> 0x0293 }
        r12.a = r8;	 Catch:{ IOException -> 0x0296, all -> 0x0293 }
        r8 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0296, all -> 0x0293 }
        r8.<init>();	 Catch:{ IOException -> 0x0296, all -> 0x0293 }
        r9 = "dex.crc.";
        r8.append(r9);	 Catch:{ IOException -> 0x0296, all -> 0x0293 }
        r8.append(r7);	 Catch:{ IOException -> 0x0296, all -> 0x0293 }
        r8 = r8.toString();	 Catch:{ IOException -> 0x0296, all -> 0x0293 }
        r17 = r10;
        r24 = r14;
        r25 = r15;
        r9 = -1;
        r14 = r2.getLong(r8, r9);	 Catch:{ IOException -> 0x028c }
        r8 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x028c }
        r8.<init>();	 Catch:{ IOException -> 0x028c }
        r9 = "dex.time.";
        r8.append(r9);	 Catch:{ IOException -> 0x028c }
        r8.append(r7);	 Catch:{ IOException -> 0x028c }
        r8 = r8.toString();	 Catch:{ IOException -> 0x028c }
        r21 = r5;
        r9 = -1;
        r5 = r2.getLong(r8, r9);	 Catch:{ IOException -> 0x0287 }
        r9 = r12.lastModified();	 Catch:{ IOException -> 0x0287 }
        r8 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r8 != 0) goto L_0x024c;
    L_0x022a:
        r8 = r0;
        r26 = r1;
        r0 = r12.a;	 Catch:{ IOException -> 0x02c7 }
        r27 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1));
        if (r27 != 0) goto L_0x024e;
    L_0x0233:
        r4.add(r12);	 Catch:{ IOException -> 0x02c7 }
        r7 = r7 + 1;
        r0 = r8;
        r9 = r11;
        r10 = r17;
        r5 = r21;
        r1 = r23;
        r14 = r24;
        r15 = r25;
        r17 = r26;
        r11 = -1;
        r8 = r28;
        goto L_0x01c0;
    L_0x024c:
        r26 = r1;
    L_0x024e:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x02c7 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02c7 }
        r1.<init>();	 Catch:{ IOException -> 0x02c7 }
        r2 = "Invalid extracted dex: ";
        r1.append(r2);	 Catch:{ IOException -> 0x02c7 }
        r1.append(r12);	 Catch:{ IOException -> 0x02c7 }
        r2 = ", expected modification time: ";
        r1.append(r2);	 Catch:{ IOException -> 0x02c7 }
        r1.append(r5);	 Catch:{ IOException -> 0x02c7 }
        r2 = ", modification time: ";
        r1.append(r2);	 Catch:{ IOException -> 0x02c7 }
        r1.append(r9);	 Catch:{ IOException -> 0x02c7 }
        r2 = ", expected crc: ";
        r1.append(r2);	 Catch:{ IOException -> 0x02c7 }
        r1.append(r14);	 Catch:{ IOException -> 0x02c7 }
        r2 = ", file crc: ";
        r1.append(r2);	 Catch:{ IOException -> 0x02c7 }
        r4 = r12.a;	 Catch:{ IOException -> 0x02c7 }
        r1.append(r4);	 Catch:{ IOException -> 0x02c7 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x02c7 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x02c7 }
        throw r0;	 Catch:{ IOException -> 0x02c7 }
    L_0x0287:
        r0 = move-exception;
        r26 = r1;
        goto L_0x02f0;
    L_0x028c:
        r0 = move-exception;
        r26 = r1;
        r21 = r5;
        goto L_0x02f0;
    L_0x0293:
        r0 = move-exception;
        goto L_0x04b9;
    L_0x0296:
        r0 = move-exception;
        r26 = r1;
        r21 = r5;
        goto L_0x02cf;
    L_0x029c:
        r26 = r1;
        r21 = r5;
        r11 = r9;
        r17 = r10;
        r24 = r14;
        r25 = r15;
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x02c7 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x02c7 }
        r1.<init>();	 Catch:{ IOException -> 0x02c7 }
        r2 = "Missing extracted secondary dex file '";
        r1.append(r2);	 Catch:{ IOException -> 0x02c7 }
        r2 = r12.getPath();	 Catch:{ IOException -> 0x02c7 }
        r1.append(r2);	 Catch:{ IOException -> 0x02c7 }
        r2 = "'";
        r1.append(r2);	 Catch:{ IOException -> 0x02c7 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x02c7 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x02c7 }
        throw r0;	 Catch:{ IOException -> 0x02c7 }
    L_0x02c7:
        r0 = move-exception;
        goto L_0x02f0;
    L_0x02c9:
        r0 = move-exception;
        r26 = r1;
        r21 = r5;
        r11 = r9;
    L_0x02cf:
        r17 = r10;
        r24 = r14;
        r25 = r15;
        goto L_0x02f0;
    L_0x02d6:
        r11 = r9;
        r24 = r14;
        r25 = r15;
        r26 = r17;
        r17 = r10;
        r1 = r26;
        r8 = 1;
        r9 = 2;
        goto L_0x032a;
    L_0x02e4:
        r0 = move-exception;
        r21 = r5;
        r11 = r9;
        r24 = r14;
        r25 = r15;
        r26 = r17;
        r17 = r10;
    L_0x02f0:
        r1 = "MultiDex";
        r2 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction";
        android.util.Log.w(r1, r2, r0);	 Catch:{ all -> 0x04b5 }
        r1 = r26;
        r0 = defpackage.mj.a(r3, r1);	 Catch:{ all -> 0x04b5 }
        r3 = defpackage.mj.a(r3);	 Catch:{ all -> 0x04b5 }
        r2 = r28;
        r8 = 1;
        r5 = r21;
        r9 = 2;
        r7 = r0;
        defpackage.mj.a(r2, r3, r5, r7);	 Catch:{ all -> 0x04b5 }
        goto L_0x0329;
    L_0x030c:
        r21 = r5;
        r11 = r9;
        r24 = r14;
        r25 = r15;
        r1 = r17;
        r8 = 1;
        r9 = 2;
        r17 = r10;
        r0 = defpackage.mj.a(r3, r1);	 Catch:{ all -> 0x04b5 }
        r3 = defpackage.mj.a(r3);	 Catch:{ all -> 0x04b5 }
        r2 = r28;
        r5 = r21;
        r7 = r0;
        defpackage.mj.a(r2, r3, r5, r7);	 Catch:{ all -> 0x04b5 }
    L_0x0329:
        r4 = r0;
    L_0x032a:
        if (r16 == 0) goto L_0x034e;
    L_0x032c:
        r16.release();	 Catch:{ IOException -> 0x0330 }
        goto L_0x034e;
    L_0x0330:
        r0 = move-exception;
        r2 = "MultiDex";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x050a }
        r3.<init>();	 Catch:{ all -> 0x050a }
        r5 = "Failed to release lock on ";
        r3.append(r5);	 Catch:{ all -> 0x050a }
        r5 = r13.getPath();	 Catch:{ all -> 0x050a }
        r3.append(r5);	 Catch:{ all -> 0x050a }
        r3 = r3.toString();	 Catch:{ all -> 0x050a }
        android.util.Log.e(r2, r3);	 Catch:{ all -> 0x050a }
        r18 = r0;
        goto L_0x0350;
    L_0x034e:
        r18 = 0;
    L_0x0350:
        defpackage.mj.a(r25);	 Catch:{ all -> 0x050a }
        defpackage.mj.a(r24);	 Catch:{ all -> 0x050a }
        if (r18 != 0) goto L_0x04b4;
    L_0x0358:
        r4.size();	 Catch:{ all -> 0x050a }
        r0 = r4.isEmpty();	 Catch:{ all -> 0x050a }
        if (r0 != 0) goto L_0x04b2;
    L_0x0361:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x050a }
        r2 = 19;
        if (r0 >= r2) goto L_0x0423;
    L_0x0367:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x050a }
        r2 = 14;
        if (r0 >= r2) goto L_0x03ed;
    L_0x036d:
        r0 = r4.size();	 Catch:{ all -> 0x050a }
        r1 = "path";
        r2 = r17;
        r1 = defpackage.mk.a(r2, r1);	 Catch:{ all -> 0x050a }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x050a }
        r5 = r1.get(r2);	 Catch:{ all -> 0x050a }
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x050a }
        r3.<init>(r5);	 Catch:{ all -> 0x050a }
        r5 = new java.lang.String[r0];	 Catch:{ all -> 0x050a }
        r6 = new java.io.File[r0];	 Catch:{ all -> 0x050a }
        r7 = new java.util.zip.ZipFile[r0];	 Catch:{ all -> 0x050a }
        r0 = new dalvik.system.DexFile[r0];	 Catch:{ all -> 0x050a }
        r4 = r4.listIterator();	 Catch:{ all -> 0x050a }
    L_0x0390:
        r8 = r4.hasNext();	 Catch:{ all -> 0x050a }
        if (r8 == 0) goto L_0x03d0;
    L_0x0396:
        r8 = r4.next();	 Catch:{ all -> 0x050a }
        r8 = (java.io.File) r8;	 Catch:{ all -> 0x050a }
        r9 = r8.getAbsolutePath();	 Catch:{ all -> 0x050a }
        r10 = 58;
        r3.append(r10);	 Catch:{ all -> 0x050a }
        r3.append(r9);	 Catch:{ all -> 0x050a }
        r10 = r4.previousIndex();	 Catch:{ all -> 0x050a }
        r5[r10] = r9;	 Catch:{ all -> 0x050a }
        r6[r10] = r8;	 Catch:{ all -> 0x050a }
        r12 = new java.util.zip.ZipFile;	 Catch:{ all -> 0x050a }
        r12.<init>(r8);	 Catch:{ all -> 0x050a }
        r7[r10] = r12;	 Catch:{ all -> 0x050a }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x050a }
        r8.<init>();	 Catch:{ all -> 0x050a }
        r8.append(r9);	 Catch:{ all -> 0x050a }
        r12 = ".dex";
        r8.append(r12);	 Catch:{ all -> 0x050a }
        r8 = r8.toString();	 Catch:{ all -> 0x050a }
        r12 = 0;
        r8 = dalvik.system.DexFile.loadDex(r9, r8, r12);	 Catch:{ all -> 0x050a }
        r0[r10] = r8;	 Catch:{ all -> 0x050a }
        goto L_0x0390;
    L_0x03d0:
        r3 = r3.toString();	 Catch:{ all -> 0x050a }
        r1.set(r2, r3);	 Catch:{ all -> 0x050a }
        r1 = "mPaths";
        defpackage.mk.a(r2, r1, r5);	 Catch:{ all -> 0x050a }
        r1 = "mFiles";
        defpackage.mk.a(r2, r1, r6);	 Catch:{ all -> 0x050a }
        r1 = "mZips";
        defpackage.mk.a(r2, r1, r7);	 Catch:{ all -> 0x050a }
        r1 = "mDexs";
        defpackage.mk.a(r2, r1, r0);	 Catch:{ all -> 0x050a }
        goto L_0x04b2;
    L_0x03ed:
        r2 = r17;
        r0 = "pathList";
        r0 = defpackage.mk.a(r2, r0);	 Catch:{ all -> 0x050a }
        r0 = r0.get(r2);	 Catch:{ all -> 0x050a }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x050a }
        r2.<init>(r4);	 Catch:{ all -> 0x050a }
        r3 = new java.lang.Class[r9];	 Catch:{ all -> 0x050a }
        r4 = java.util.ArrayList.class;
        r5 = 0;
        r3[r5] = r4;	 Catch:{ all -> 0x050a }
        r4 = java.io.File.class;
        r3[r8] = r4;	 Catch:{ all -> 0x050a }
        r4 = "makeDexElements";
        r3 = defpackage.mk.a(r0, r4, r3);	 Catch:{ all -> 0x050a }
        r4 = new java.lang.Object[r9];	 Catch:{ all -> 0x050a }
        r5 = 0;
        r4[r5] = r2;	 Catch:{ all -> 0x050a }
        r4[r8] = r1;	 Catch:{ all -> 0x050a }
        r1 = "dexElements";
        r2 = r3.invoke(r0, r4);	 Catch:{ all -> 0x050a }
        r2 = (java.lang.Object[]) r2;	 Catch:{ all -> 0x050a }
        defpackage.mk.a(r0, r1, r2);	 Catch:{ all -> 0x050a }
        goto L_0x04b2;
    L_0x0423:
        r2 = r17;
        r0 = "pathList";
        r0 = defpackage.mk.a(r2, r0);	 Catch:{ all -> 0x050a }
        r0 = r0.get(r2);	 Catch:{ all -> 0x050a }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x050a }
        r2.<init>();	 Catch:{ all -> 0x050a }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x050a }
        r3.<init>(r4);	 Catch:{ all -> 0x050a }
        r4 = 3;
        r5 = new java.lang.Class[r4];	 Catch:{ all -> 0x050a }
        r6 = java.util.ArrayList.class;
        r7 = 0;
        r5[r7] = r6;	 Catch:{ all -> 0x050a }
        r6 = java.io.File.class;
        r5[r8] = r6;	 Catch:{ all -> 0x050a }
        r6 = java.util.ArrayList.class;
        r5[r9] = r6;	 Catch:{ all -> 0x050a }
        r6 = "makeDexElements";
        r5 = defpackage.mk.a(r0, r6, r5);	 Catch:{ all -> 0x050a }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x050a }
        r6 = 0;
        r4[r6] = r3;	 Catch:{ all -> 0x050a }
        r4[r8] = r1;	 Catch:{ all -> 0x050a }
        r4[r9] = r2;	 Catch:{ all -> 0x050a }
        r1 = "dexElements";
        r3 = r5.invoke(r0, r4);	 Catch:{ all -> 0x050a }
        r3 = (java.lang.Object[]) r3;	 Catch:{ all -> 0x050a }
        defpackage.mk.a(r0, r1, r3);	 Catch:{ all -> 0x050a }
        r1 = r2.size();	 Catch:{ all -> 0x050a }
        if (r1 <= 0) goto L_0x04b2;
    L_0x0469:
        r1 = r2.size();	 Catch:{ all -> 0x050a }
        r3 = 0;
    L_0x046e:
        if (r3 >= r1) goto L_0x0480;
    L_0x0470:
        r4 = "MultiDex";
        r5 = "Exception in makeDexElement";
        r6 = r2.get(r3);	 Catch:{ all -> 0x050a }
        r6 = (java.io.IOException) r6;	 Catch:{ all -> 0x050a }
        android.util.Log.w(r4, r5, r6);	 Catch:{ all -> 0x050a }
        r3 = r3 + 1;
        goto L_0x046e;
    L_0x0480:
        r1 = "dexElementsSuppressedExceptions";
        r1 = defpackage.mk.a(r0, r1);	 Catch:{ all -> 0x050a }
        r3 = r1.get(r0);	 Catch:{ all -> 0x050a }
        r3 = (java.io.IOException[]) r3;	 Catch:{ all -> 0x050a }
        if (r3 != 0) goto L_0x049b;
    L_0x048e:
        r3 = r2.size();	 Catch:{ all -> 0x050a }
        r3 = new java.io.IOException[r3];	 Catch:{ all -> 0x050a }
        r2 = r2.toArray(r3);	 Catch:{ all -> 0x050a }
        r2 = (java.io.IOException[]) r2;	 Catch:{ all -> 0x050a }
        goto L_0x04af;
    L_0x049b:
        r4 = r2.size();	 Catch:{ all -> 0x050a }
        r5 = r3.length;	 Catch:{ all -> 0x050a }
        r4 = r4 + r5;
        r4 = new java.io.IOException[r4];	 Catch:{ all -> 0x050a }
        r2.toArray(r4);	 Catch:{ all -> 0x050a }
        r2 = r2.size();	 Catch:{ all -> 0x050a }
        r6 = 0;
        java.lang.System.arraycopy(r3, r6, r4, r2, r5);	 Catch:{ all -> 0x050a }
        r2 = r4;
    L_0x04af:
        r1.set(r0, r2);	 Catch:{ all -> 0x050a }
    L_0x04b2:
        monitor-exit(r11);	 Catch:{ all -> 0x050a }
        return;
    L_0x04b4:
        throw r18;	 Catch:{ all -> 0x050a }
    L_0x04b5:
        r0 = move-exception;
        goto L_0x04bd;
    L_0x04b7:
        r0 = move-exception;
        r11 = r9;
    L_0x04b9:
        r24 = r14;
        r25 = r15;
    L_0x04bd:
        r18 = r16;
        goto L_0x04d1;
    L_0x04c0:
        r0 = move-exception;
        r11 = r9;
        r24 = r14;
        r25 = r15;
        r18 = 0;
        goto L_0x04d1;
    L_0x04c9:
        r0 = move-exception;
        r11 = r9;
        r24 = r14;
        r18 = 0;
        r25 = 0;
    L_0x04d1:
        if (r18 == 0) goto L_0x04f1;
    L_0x04d3:
        r18.release();	 Catch:{ IOException -> 0x04d7 }
        goto L_0x04f1;
    L_0x04d7:
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x050a }
        r2.<init>();	 Catch:{ all -> 0x050a }
        r3 = "Failed to release lock on ";
        r2.append(r3);	 Catch:{ all -> 0x050a }
        r3 = r13.getPath();	 Catch:{ all -> 0x050a }
        r2.append(r3);	 Catch:{ all -> 0x050a }
        r2 = r2.toString();	 Catch:{ all -> 0x050a }
        android.util.Log.e(r1, r2);	 Catch:{ all -> 0x050a }
    L_0x04f1:
        if (r25 == 0) goto L_0x04f6;
    L_0x04f3:
        defpackage.mj.a(r25);	 Catch:{ all -> 0x050a }
    L_0x04f6:
        defpackage.mj.a(r24);	 Catch:{ all -> 0x050a }
        throw r0;	 Catch:{ all -> 0x050a }
    L_0x04fa:
        r0 = move-exception;
        r11 = r9;
        r1 = r0;
        r0 = "MultiDex";
        r2 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.";
        android.util.Log.w(r0, r2, r1);	 Catch:{ all -> 0x050a }
        monitor-exit(r11);	 Catch:{ all -> 0x050a }
        return;
    L_0x0506:
        r0 = move-exception;
        r11 = r9;
    L_0x0508:
        monitor-exit(r11);	 Catch:{ all -> 0x050a }
        throw r0;	 Catch:{ Exception -> 0x0018 }
    L_0x050a:
        r0 = move-exception;
        goto L_0x0508;
    L_0x050c:
        r1 = "MultiDex";
        r2 = "Multidex installation failure";
        android.util.Log.e(r1, r2, r0);
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Multi dex installation failed (";
        r2.append(r3);
        r0 = r0.getMessage();
        r2.append(r0);
        r0 = ").";
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0533:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doo.attachBaseContext(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x041e  */
    public final void onCreate() {
        /*
        r14 = this;
        super.onCreate();
        r0 = r14.f();
        if (r0 == 0) goto L_0x0424;
    L_0x0009:
        r0 = r14.e;
        if (r0 != 0) goto L_0x0424;
    L_0x000d:
        r0 = 1;
        r14.e = r0;
        r1 = r14.a;
        r2 = "YouTube";
        defpackage.xtl.a(r2);
        r2 = r1.a();
        r3 = r2.h();
        r1.b = r3;
        r3 = r2.e();
        r3.b();
        r3 = r2.a();
        r3.run();
        r3 = r2.J();
        r4 = new dom;
        r4.<init>(r1);
        r3.execute(r4);
        r1.b();
        r2 = r2.J();
        r3 = new dop;
        r3.<init>(r1);
        r2.execute(r3);
        r1 = r14.a;
        r1.b();
        r1 = r14.a;
        r1 = r1.a();
        r1 = r1.K();
        r2 = new doq;
        r2.<init>();
        r1.execute(r2);
        r1 = r14.a;
        r1 = r1.a();
        r1.b();
        r1 = r14.n();
        r1 = (defpackage.dot) r1;
        r1.pd();
        r1.pe();
        r1.pf();
        r1.pg();
        r1.ph();
        r1.pi();
        r1.pj();
        r1 = r14.a;
        r1.b();
        r14.c();
        r1 = r14.a;
        r1.b();
        r1 = r14.c;
        r1 = r1.get();
        r1 = (defpackage.dos) r1;
        r2 = r14.d();
        r3 = r2.h();
        r1.a = r3;
        r3 = new xaj;
        r3.<init>();
        r4 = r1.an;
        r4 = r4.get();
        r4 = (defpackage.wws) r4;
        r4.a(r3);
        r4 = r1.ao;
        r4 = r4.get();
        r4 = (defpackage.zxj) r4;
        r4.b();
        r4 = r1.d;
        r4 = r4.get();
        r4 = (defpackage.afla) r4;
        r4.b();
        r4 = r2.h();
        r1.a = r4;
        r1.a();
        r4 = r1.i;
        r4 = r4.get();
        r4 = (defpackage.xci) r4;
        r5 = new dqg;
        r5.<init>(r1, r4);
        r3.execute(r5);
        r5 = r1.W;
        r5 = r5.get();
        r5 = (defpackage.xaa) r5;
        r6 = r5.d;
        if (r6 == 0) goto L_0x00fe;
    L_0x00ef:
        r6 = r5.b;
        r7 = new xad;
        r7.<init>(r5);
        r5 = r5.e;
        r8 = (long) r5;
        r5 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r6.schedule(r7, r8, r5);
    L_0x00fe:
        r5 = r1.X;
        r5 = r5.get();
        r5 = (defpackage.wzp) r5;
        r6 = r2.f();
        r7 = r1.aj;
        r7 = r7.get();
        r7 = (defpackage.zyw) r7;
        r7 = r7.a();
        if (r7 != 0) goto L_0x0119;
    L_0x0118:
        goto L_0x0125;
    L_0x0119:
        r7 = r7.r;
        if (r7 != 0) goto L_0x011f;
    L_0x011d:
        r7 = defpackage.aycu.f;
    L_0x011f:
        r7 = r7.e;
        if (r7 == 0) goto L_0x0125;
    L_0x0123:
        r7 = r6;
        goto L_0x012d;
    L_0x0125:
        r7 = r1.aa;
        r7 = r7.get();
        r7 = (java.util.concurrent.Executor) r7;
    L_0x012d:
        r8 = new dpa;
        r8.<init>(r1, r2);
        r7.execute(r8);
        r8 = r1.L;
        r8.a(r6);
        r8 = r1.Y;
        r8 = r8.get();
        r8 = (defpackage.afvu) r8;
        r9 = r8.d;
        r10 = 0;
        if (r9 != 0) goto L_0x017f;
    L_0x0147:
        r9 = r8.c;
        r9 = r9.a();
        r11 = "1:269355966177:android:9d526f6607903f60";
        r9 = r9.a(r11);
        r11 = "414843287017";
        r9 = r9.b(r11);
        r9 = r9.c(r11);
        r9 = r9.a();
        r11 = r8.b;
        r12 = r8.a;
        r9 = r11.a(r12, r9);
        if (r9 == 0) goto L_0x0173;
    L_0x016b:
        r8.d = r0;
        r8 = "FirebaseApp initialization successful";
        defpackage.xtl.e(r8);
        goto L_0x017f;
    L_0x0173:
        r8.d = r10;
        r8 = "FirebaseApp initialization unsuccessful";
        defpackage.xtl.c(r8);
        r9 = defpackage.afpf.initialization;
        defpackage.afpc.a(r0, r9, r8);
    L_0x017f:
        r8 = new dpw;
        r8.<init>(r1, r4);
        r3.execute(r8);
        r8 = r1.E;
        r8 = r8.get();
        r8 = (defpackage.acya) r8;
        r9 = new eec;
        r9.<init>(r8, r4);
        r8 = r9.a;
        r11 = defpackage.edh.class;
        r12 = new edc;
        r12.<init>(r10);
        r8 = r8.a(r11, r12);
        r11 = defpackage.edj.class;
        r8.a(r11);
        r8 = r9.a;
        r11 = defpackage.edd.class;
        r12 = defpackage.edk.class;
        r13 = new edc;
        r13.<init>(r0);
        r8.a(r11, r12, r13);
        r8 = r9.a;
        r11 = defpackage.edh.class;
        r12 = "f_unknown";
        r8.a(r11, r12);
        r8 = r9.a;
        r11 = defpackage.edd.class;
        r12 = "f_proc";
        r8.a(r11, r12);
        r8 = r9.a;
        r11 = defpackage.edh.class;
        r12 = new eed;
        r12.<init>();
        r8.a(r11, r12);
        r8 = r1.aD;
        r8 = (android.app.Application) r8;
        r11 = r1.e;
        r12 = new eeh;
        r12.<init>(r9, r11);
        r8.registerActivityLifecycleCallbacks(r12);
        r8 = new dqh;
        r8.<init>(r1, r9);
        r6.execute(r8);
        r8 = new dpn;
        r8.<init>(r1, r4, r2);
        r6.execute(r8);
        r2 = r1.N;
        r8 = new dov;
        r8.<init>(r1);
        r9 = "system_health_cap_primes";
        r2.b(r9, r8);
        r8 = new dou;
        r8.<init>(r1);
        r9 = "system_health_delayed_event_metrics";
        r2.b(r9, r8);
        r8 = new dox;
        r8.<init>(r1);
        r9 = "system_health_capturer_battery";
        r2.b(r9, r8);
        r8 = new dow;
        r8.<init>(r1);
        r9 = "system_health_tx_gel";
        r2.a(r9, r8);
        r8 = new doz;
        r8.<init>(r1);
        r9 = "system_health_tx_perfgate";
        r2.a(r9, r8);
        r2 = r1.N;
        r2.a(r7);
        r2 = r1.K;
        r2.a(r7);
        r2 = r1.V;
        r2 = r2.get();
        r2 = (defpackage.ebq) r2;
        r8 = r1.aD;
        r8 = (defpackage.diq) r8;
        r8 = r8.a();
        r11 = r1.f;
        r11 = r11.get();
        r11 = (java.lang.Boolean) r11;
        r11 = r11.booleanValue();
        r12 = r1.g;
        r12 = r12.get();
        r12 = (java.lang.Boolean) r12;
        r12 = r12.booleanValue();
        r2 = r2.a;
        r13 = new edh;
        r13.<init>(r8, r11, r12);
        r2.c(r13);
        r1.a();
        r2 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_INIT_MEDIASESSION;
        r8 = new dqj;
        r8.<init>(r1);
        r5.a(r2, r8);
        r2 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_PLAYER_PREFETCH_CONFIGURATION;
        r8 = new dql;
        r8.<init>(r1);
        r5.a(r2, r8);
        r2 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_FEEDBACK_TRACKER;
        r8 = new dqk;
        r8.<init>(r1, r4);
        r5.a(r2, r8);
        r2 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_PLAYER;
        r8 = new dqi;
        r8.<init>(r1);
        r5.a(r2, r8);
        r1.a();
        r2 = new dpf;
        r2.<init>(r1);
        r6.execute(r2);
        r2 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_NETWORK_USAGE_MONITOR;
        r8 = new dpv;
        r8.<init>(r1);
        r5.a(r2, r8);
        r2 = new dpu;
        r2.<init>(r1);
        r6.execute(r2);
        r1.a();
        r2 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_AD_WORDS;
        r8 = new dpd;
        r8.<init>(r1);
        r5.a(r2, r8);
        r2 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_NET_VOLLEY_REQUEST_QUEUE;
        r8 = new dpc;
        r8.<init>(r1);
        r5.a(r2, r8);
        r1.a();
        r2 = new dph;
        r2.<init>(r1);
        r6.execute(r2);
        r2 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_SDCARD_SLOT_RECEIVER;
        r8 = new dpg;
        r8.<init>(r1);
        r5.a(r2, r8);
        r1.a();
        r2 = new dpo;
        r2.<init>(r1);
        r7.execute(r2);
        r2 = new dpj;
        r2.<init>(r1, r4);
        r7.execute(r2);
        r2 = new dpi;
        r2.<init>(r1, r4);
        r7.execute(r2);
        r1.a();
        r2 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_REGISTER_BACKGROUND_TASKS;
        r8 = new dpl;
        r8.<init>(r1);
        r5.a(r2, r8);
        r2 = new dpk;
        r2.<init>(r1);
        r7.execute(r2);
        r2 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_NOTIFICATION;
        r8 = new dpm;
        r8.<init>(r1);
        r5.a(r2, r8, r10);
        r2 = r1.M;
        r8 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_LOGGING_UI_ESSENTIALS;
        r9 = r2.i;
        if (r9 != r0) goto L_0x031e;
    L_0x0316:
        r0 = new wxq;
        r0.<init>(r2);
        r5.a(r8, r0);
    L_0x031e:
        r0 = r1.e;
        r0 = r0.get();
        r0 = (defpackage.acxl) r0;
        defpackage.xak.a();
        r2 = android.os.Looper.myQueue();
        r8 = r0.b;
        r2.removeIdleHandler(r8);
        r8 = r0.b;
        r2.addIdleHandler(r8);
        r0.c = r10;
        r0 = new dpr;
        r0.<init>();
        r3.execute(r0);
        r1.a();
        r0 = r1.ah;
        r0 = r0.get();
        r0 = (defpackage.zzf) r0;
        r0 = r0.o();
        r0 = r0.d;
        if (r0 == 0) goto L_0x035c;
    L_0x0354:
        r0 = new dpt;
        r0.<init>(r1);
        r6.execute(r0);
    L_0x035c:
        r1.a();
        r0 = new doy;
        r0.<init>();
        defpackage.anum.b = r0;
        r0 = new dpb;
        r0.<init>(r1);
        defpackage.anum.a = r0;
        r0 = new dpe;
        r0.<init>(r1);
        r6.execute(r0);
        r0 = defpackage.aotr.ANDROID_NON_CRITICAL_SCHEDULER_INITIALIZATION_BLOCK_MAINAPP_MOBILE_DATA_PLAN;
        r2 = new dps;
        r2.<init>(r1, r4);
        r5.a(r0, r2);
        r0 = r1.ab;
        r0.get();
        r0 = new dpq;
        r0.<init>();
        r7.execute(r0);
        r0 = new dpx;
        r0.<init>(r1);
        r7.execute(r0);
        r0 = new dpz;
        r0.<init>(r1);
        r7.execute(r0);
        r0 = new dqb;
        r0.<init>(r1);
        r7.execute(r0);
        r0 = new dpy;
        r0.<init>(r1);
        r7.execute(r0);
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 19;
        if (r0 > r2) goto L_0x03b5;
    L_0x03b2:
        defpackage.ael.s();
    L_0x03b5:
        r0 = r1.am;
        r0 = r0.get();
        r0 = (defpackage.zyt) r0;
        r2 = new acue;
        r3 = r1.au;
        r4 = r1.al;
        r4 = r4.get();
        r4 = (defpackage.xti) r4;
        r2.<init>(r3, r4);
        r0.a(r2);
        r0 = r1.aB;
        r0 = r0.get();
        r0 = (defpackage.eub) r0;
        r2 = r0.b;
        if (r2 == 0) goto L_0x03e7;
    L_0x03db:
        defpackage.xak.a();
        r2 = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        r0.a = r2;
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r0);
    L_0x03e7:
        r0 = new dpp;
        r0.<init>(r1);
        r7.execute(r0);
        r0 = new dqa;
        r0.<init>(r1);
        r7.execute(r0);
        r0 = r1.aC;
        r0 = r0.get();
        r0 = (defpackage.xfi) r0;
        r0.a();
        r0 = r1.V;
        r0 = r0.get();
        r0 = (defpackage.ebq) r0;
        r2 = android.os.Looper.myQueue();
        r0.b = r2;
        r2 = r0.a;
        r3 = new eem;
        r3.<init>();
        r2.d(r3);
        r2 = r0.b;
        if (r2 == 0) goto L_0x0421;
    L_0x041e:
        r2.addIdleHandler(r0);
    L_0x0421:
        r1.a();
    L_0x0424:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doo.onCreate():void");
    }

    public final long a() {
        return this.d;
    }

    public final www i() {
        return (www) n();
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        bcaa bcaa = this.b;
        if (bcaa != null) {
            dnz dnz = (dnz) bcaa.get();
            if (i == 15) {
                ((bqa) dnz.a.get()).b();
            }
            apxn a = dnz.d.a();
            if (a != null) {
                auya auya = a.i;
                if (auya == null) {
                    auya = auya.J;
                }
                aosh aosh = auya.r;
                if (aosh == null) {
                    aosh = aosh.n;
                }
                if (aosh.c && i >= 5) {
                    ((akkl) dnz.b.get()).a();
                }
            }
            aacx aacx = (aacx) dnz.c.get();
            a = aacx.c.a();
            if (a != null && (a.a & 2097152) != 0) {
                avam avam = a.n;
                if (avam == null) {
                    avam = avam.j;
                }
                arge arge = avam.i;
                if (arge == null) {
                    arge = arge.e;
                }
                if (arge.b && arge.d) {
                    aacx.b.execute(new aacw(aacx, i));
                }
            }
        }
    }
}
