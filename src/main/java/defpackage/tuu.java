package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: tuu */
final class tuu implements UncaughtExceptionHandler {
    public final UncaughtExceptionHandler a;
    private final /* synthetic */ tur b;

    tuu(tur tur, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = tur;
        this.a = uncaughtExceptionHandler;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0029 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026 A:{PHI: r3 r4 , Splitter:B:10:0x0029, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x021c A:{SYNTHETIC, Splitter:B:99:0x021c} */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0200 A:{SYNTHETIC, Splitter:B:87:0x0200} */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x021c A:{SYNTHETIC, Splitter:B:99:0x021c} */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x022e  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0181 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026 A:{PHI: r3 r4 , Splitter:B:10:0x0029, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026 A:{PHI: r3 r4 , Splitter:B:10:0x0029, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:9:0x0026, code skipped:
            r5 = th;
     */
    /* JADX WARNING: Missing block: B:49:0x0161, code skipped:
            r5 = move-exception;
     */
    /* JADX WARNING: Missing block: B:51:?, code skipped:
            defpackage.tyv.b(r1, "Failed to get process stats.", r5, new java.lang.Object[0]);
     */
    /* JADX WARNING: Missing block: B:78:0x01eb, code skipped:
            r5 = e;
     */
    /* JADX WARNING: Missing block: B:79:0x01ec, code skipped:
            r12 = r4;
            r4 = r3;
            r3 = r12;
     */
    /* JADX WARNING: Missing block: B:88:?, code skipped:
            r4.close();
     */
    /* JADX WARNING: Missing block: B:89:0x0204, code skipped:
            defpackage.tyv.d(r1, r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Missing block: B:92:0x020b, code skipped:
            android.os.StrictMode.setThreadPolicy(r3);
     */
    /* JADX WARNING: Missing block: B:95:0x0212, code skipped:
            r0.uncaughtException(r14, r15);
     */
    /* JADX WARNING: Missing block: B:100:?, code skipped:
            r3.close();
     */
    /* JADX WARNING: Missing block: B:101:0x0220, code skipped:
            defpackage.tyv.d(r1, r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Missing block: B:104:0x0227, code skipped:
            android.os.StrictMode.setThreadPolicy(r4);
     */
    /* JADX WARNING: Missing block: B:107:0x022e, code skipped:
            r0.uncaughtException(r14, r15);
     */
    /* JADX WARNING: Missing block: B:111:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:114:?, code skipped:
            return;
     */
    public final void uncaughtException(java.lang.Thread r14, java.lang.Throwable r15) {
        /*
        r13 = this;
        r0 = "Could not close file.";
        r1 = "CrashMetricService";
        r2 = 0;
        r3 = 0;
        r4 = r13.b;	 Catch:{ Exception -> 0x01f4, all -> 0x01f0 }
        r4 = r4.b();	 Catch:{ Exception -> 0x01f4, all -> 0x01f0 }
        if (r4 == 0) goto L_0x01c4;
    L_0x000e:
        r4 = r13.b;	 Catch:{ Exception -> 0x01f4, all -> 0x01f0 }
        r4 = r4.j;	 Catch:{ Exception -> 0x01f4, all -> 0x01f0 }
        if (r4 == 0) goto L_0x0031;
    L_0x0014:
        r4 = android.os.StrictMode.allowThreadDiskWrites();	 Catch:{ Exception -> 0x01f4, all -> 0x01f0 }
        r5 = r13.b;	 Catch:{ IOException -> 0x0029 }
        r5 = r5.a;	 Catch:{ IOException -> 0x0029 }
        r6 = "primes_crash";
        r3 = r5.openFileOutput(r6, r2);	 Catch:{ IOException -> 0x0029 }
        r3.flush();	 Catch:{ IOException -> 0x0029 }
        goto L_0x0032;
    L_0x0026:
        r5 = move-exception;
        goto L_0x021a;
    L_0x0029:
        r5 = "IO failure creating empty file.";
        r6 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        defpackage.tyv.d(r1, r5, r6);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        goto L_0x0032;
    L_0x0031:
        r4 = r3;
    L_0x0032:
        r5 = r13.b;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = r14.getName();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r7 = defpackage.bcdq.i;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r7 = r7.createBuilder();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r7 = (defpackage.bcdp) r7;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = r5.e;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = defpackage.twr.a(r8);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r9 = 4;
        if (r8 != 0) goto L_0x004a;
    L_0x0049:
        goto L_0x0058;
    L_0x004a:
        r7.copyOnWrite();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r10 = r7.instance;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r10 = (defpackage.bcdq) r10;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r11 = r10.a;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r11 = r11 | r9;
        r10.a = r11;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r10.d = r8;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
    L_0x0058:
        r7.a();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r7.copyOnWrite();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = r7.instance;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = (defpackage.bcdq) r8;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        if (r6 == 0) goto L_0x01be;
    L_0x0064:
        r10 = r8.a;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r10 = r10 | 8;
        r8.a = r10;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8.e = r6;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = r15.getClass();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = java.lang.OutOfMemoryError.class;
        r10 = 2;
        r11 = 1;
        if (r6 != r8) goto L_0x0078;
    L_0x0076:
        r9 = 3;
        goto L_0x0095;
    L_0x0078:
        r8 = java.lang.NullPointerException.class;
        r8 = r8.isAssignableFrom(r6);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        if (r8 != 0) goto L_0x0094;
    L_0x0080:
        r8 = java.lang.RuntimeException.class;
        r8 = r8.isAssignableFrom(r6);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        if (r8 != 0) goto L_0x0095;
    L_0x0088:
        r8 = java.lang.Error.class;
        r6 = r8.isAssignableFrom(r6);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        if (r6 != 0) goto L_0x0092;
    L_0x0090:
        r9 = 1;
        goto L_0x0095;
    L_0x0092:
        r9 = 5;
        goto L_0x0095;
    L_0x0094:
        r9 = 2;
    L_0x0095:
        r7.copyOnWrite();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = r7.instance;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = (defpackage.bcdq) r6;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = r6.a;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = r8 | 16;
        r6.a = r8;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r9 = r9 + -1;
        r6.f = r9;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = r15.getClass();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = r6.getName();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r7.copyOnWrite();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = r7.instance;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = (defpackage.bcdq) r8;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r9 = r8.a;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r9 = r9 | 64;
        r8.a = r9;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8.h = r6;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = new java.io.StringWriter;	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r6.<init>();	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r8 = new java.io.PrintWriter;	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r8.<init>(r6);	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        defpackage.ankx.a(r15, r8);	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r6 = r6.toString();	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r8.<init>();	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r9 = "([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+)(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?";
        r9 = java.util.regex.Pattern.compile(r9);	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r6 = r9.matcher(r6);	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r9 = r6.find();	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        if (r9 != 0) goto L_0x00e4;
    L_0x00e3:
        goto L_0x00fa;
    L_0x00e4:
        r9 = r6.groupCount();	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        if (r11 > r9) goto L_0x00fa;
    L_0x00ea:
        r9 = r6.group(r11);	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        if (r9 == 0) goto L_0x00fa;
    L_0x00f0:
        r9 = r6.group(r11);	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r8.append(r9);	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r11 = r11 + 1;
        goto L_0x00e4;
    L_0x00fa:
        r6 = r8.toString();	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r6 = defpackage.tuz.a(r6);	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        if (r6 == 0) goto L_0x0139;
    L_0x0104:
        r8 = r6.longValue();	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r7.copyOnWrite();	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r6 = r7.instance;	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r6 = (defpackage.bcdq) r6;	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r11 = r6.a;	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r11 = r11 | 32;
        r6.a = r11;	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        r6.g = r8;	 Catch:{ Exception -> 0x0118, all -> 0x0026 }
        goto L_0x0139;
    L_0x0118:
        r6 = move-exception;
        r6 = java.lang.String.valueOf(r6);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = r6.length();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r9 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = r8 + 38;
        r9.<init>(r8);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = "Failed to generate hashed stack trace.";
        r9.append(r8);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r9.append(r6);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = r9.toString();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r8 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        defpackage.tyv.d(r1, r6, r8);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
    L_0x0139:
        r6 = defpackage.bcdh.c;	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r6 = r6.createBuilder();	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r6 = (defpackage.bcdk) r6;	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r5 = r5.a;	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r5 = defpackage.ucu.a(r5);	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r6.a(r5);	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r7.copyOnWrite();	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r5 = r7.instance;	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r5 = (defpackage.bcdq) r5;	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r6 = r6.build();	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r6 = (defpackage.anxl) r6;	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r6 = (defpackage.bcdh) r6;	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r5.c = r6;	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r6 = r5.a;	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        r6 = r6 | r10;
        r5.a = r6;	 Catch:{ Exception -> 0x0161, all -> 0x0026 }
        goto L_0x0169;
    L_0x0161:
        r5 = move-exception;
        r6 = "Failed to get process stats.";
        r8 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        defpackage.tyv.b(r1, r6, r5, r8);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
    L_0x0169:
        r5 = r7.build();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5 = (defpackage.anxl) r5;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5 = (defpackage.bcdq) r5;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = r13.b;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = r6.j;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        if (r6 == 0) goto L_0x0188;
    L_0x0177:
        if (r3 == 0) goto L_0x0188;
    L_0x0179:
        r6 = r5.toByteArray();	 Catch:{ IOException -> 0x0181 }
        r3.write(r6);	 Catch:{ IOException -> 0x0181 }
        goto L_0x0188;
    L_0x0181:
        r6 = "IO failure storing crash.";
        r7 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        defpackage.tyv.d(r1, r6, r7);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
    L_0x0188:
        r6 = defpackage.bcfe.x;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = r6.createBuilder();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = (defpackage.bcfd) r6;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6.copyOnWrite();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r7 = r6.instance;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r7 = (defpackage.bcfe) r7;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        if (r5 == 0) goto L_0x01b8;
    L_0x0199:
        r7.h = r5;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5 = r7.a;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5 = r5 | 64;
        r7.a = r5;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5 = r13.b;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5.g();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5 = r13.b;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = r6.build();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = (defpackage.anxl) r6;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r6 = (defpackage.bcfe) r6;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5.a(r6);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5 = r13.b;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5 = r5.c;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        goto L_0x01c5;
    L_0x01b8:
        r5 = new java.lang.NullPointerException;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5.<init>();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        throw r5;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
    L_0x01be:
        r5 = new java.lang.NullPointerException;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5.<init>();	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        throw r5;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
    L_0x01c4:
        r4 = r3;
    L_0x01c5:
        r5 = r13.b;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5 = r5.a;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        defpackage.tyu.b(r5);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5 = r13.b;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        r5 = r5.a;	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        defpackage.tyu.d(r5);	 Catch:{ Exception -> 0x01eb, all -> 0x0026 }
        if (r3 == 0) goto L_0x01de;
    L_0x01d5:
        r3.close();	 Catch:{ IOException -> 0x01d9 }
        goto L_0x01de;
    L_0x01d9:
        r2 = new java.lang.Object[r2];
        defpackage.tyv.d(r1, r0, r2);
    L_0x01de:
        if (r4 == 0) goto L_0x01e3;
    L_0x01e0:
        android.os.StrictMode.setThreadPolicy(r4);
    L_0x01e3:
        r0 = r13.a;
        if (r0 == 0) goto L_0x0215;
    L_0x01e7:
        r0.uncaughtException(r14, r15);
        goto L_0x0215;
    L_0x01eb:
        r5 = move-exception;
        r12 = r4;
        r4 = r3;
        r3 = r12;
        goto L_0x01f7;
    L_0x01f0:
        r4 = move-exception;
        r5 = r4;
        r4 = r3;
        goto L_0x021a;
    L_0x01f4:
        r4 = move-exception;
        r5 = r4;
        r4 = r3;
    L_0x01f7:
        r6 = "Failed to record crash.";
        r7 = new java.lang.Object[r2];	 Catch:{ all -> 0x0216 }
        defpackage.tyv.b(r1, r6, r5, r7);	 Catch:{ all -> 0x0216 }
        if (r4 == 0) goto L_0x0209;
    L_0x0200:
        r4.close();	 Catch:{ IOException -> 0x0204 }
        goto L_0x0209;
    L_0x0204:
        r2 = new java.lang.Object[r2];
        defpackage.tyv.d(r1, r0, r2);
    L_0x0209:
        if (r3 == 0) goto L_0x020e;
    L_0x020b:
        android.os.StrictMode.setThreadPolicy(r3);
    L_0x020e:
        r0 = r13.a;
        if (r0 == 0) goto L_0x0215;
    L_0x0212:
        r0.uncaughtException(r14, r15);
    L_0x0215:
        return;
    L_0x0216:
        r5 = move-exception;
        r12 = r4;
        r4 = r3;
        r3 = r12;
    L_0x021a:
        if (r3 == 0) goto L_0x0225;
    L_0x021c:
        r3.close();	 Catch:{ IOException -> 0x0220 }
        goto L_0x0225;
    L_0x0220:
        r2 = new java.lang.Object[r2];
        defpackage.tyv.d(r1, r0, r2);
    L_0x0225:
        if (r4 == 0) goto L_0x022a;
    L_0x0227:
        android.os.StrictMode.setThreadPolicy(r4);
    L_0x022a:
        r0 = r13.a;
        if (r0 == 0) goto L_0x0231;
    L_0x022e:
        r0.uncaughtException(r14, r15);
    L_0x0231:
        goto L_0x0233;
    L_0x0232:
        throw r5;
    L_0x0233:
        goto L_0x0232;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tuu.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
