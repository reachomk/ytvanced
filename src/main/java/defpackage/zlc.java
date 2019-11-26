package defpackage;

import android.os.AsyncTask;
import java.io.File;

/* renamed from: zlc */
final class zlc extends AsyncTask {
    private final /* synthetic */ bada a;
    private final /* synthetic */ File b;
    private final /* synthetic */ zkz c;

    zlc(zkz zkz, bada bada, File file) {
        this.c = zkz;
        this.a = bada;
        this.b = file;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079 A:{SYNTHETIC} */
    public final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r6) {
        /*
        r5 = this;
        r6 = r5.a;
        r6 = r6.toByteArray();
        r0 = 0;
        r1 = r5.b;	 Catch:{ IOException -> 0x006b }
        r1 = r1.getParentFile();	 Catch:{ IOException -> 0x006b }
        r1 = r1.exists();	 Catch:{ IOException -> 0x006b }
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x0023;
    L_0x0015:
        r1 = r5.b;	 Catch:{ IOException -> 0x006b }
        r1 = r1.getParentFile();	 Catch:{ IOException -> 0x006b }
        r1 = r1.mkdirs();	 Catch:{ IOException -> 0x006b }
        if (r1 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0023;
    L_0x0022:
        r2 = 0;
    L_0x0023:
        r1 = r5.b;	 Catch:{ IOException -> 0x006b }
        r1 = r1.exists();	 Catch:{ IOException -> 0x006b }
        if (r1 == 0) goto L_0x0035;
    L_0x002b:
        r1 = r5.b;	 Catch:{ IOException -> 0x006b }
        r1 = r1.delete();	 Catch:{ IOException -> 0x006b }
        if (r1 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x0035;
    L_0x0034:
        r2 = 0;
    L_0x0035:
        if (r6 == 0) goto L_0x0073;
    L_0x0037:
        r1 = r6.length;	 Catch:{ IOException -> 0x006b }
        if (r1 > 0) goto L_0x003b;
    L_0x003a:
        goto L_0x0073;
    L_0x003b:
        if (r2 == 0) goto L_0x0073;
    L_0x003d:
        r1 = r5.b;	 Catch:{ IOException -> 0x006b }
        r1 = r1.createNewFile();	 Catch:{ IOException -> 0x006b }
        if (r1 == 0) goto L_0x0073;
    L_0x0045:
        r1 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x006b }
        r1.<init>(r6);	 Catch:{ IOException -> 0x006b }
        r6 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x006b }
        r2 = r5.b;	 Catch:{ IOException -> 0x006b }
        r6.<init>(r2);	 Catch:{ IOException -> 0x006b }
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r2 = new byte[r2];	 Catch:{ IOException -> 0x006b }
    L_0x0055:
        r4 = r1.read(r2);	 Catch:{ IOException -> 0x006b }
        if (r4 <= 0) goto L_0x0062;
    L_0x005b:
        r6.write(r2, r3, r4);	 Catch:{ IOException -> 0x006b }
        java.util.Arrays.fill(r2, r3);	 Catch:{ IOException -> 0x006b }
        goto L_0x0055;
    L_0x0062:
        r1.close();	 Catch:{ IOException -> 0x006b }
        r6.close();	 Catch:{ IOException -> 0x006b }
        r6 = r5.b;	 Catch:{ IOException -> 0x006b }
        goto L_0x0074;
    L_0x006b:
        r6 = move-exception;
        r6 = r6.getMessage();
        defpackage.xtl.c(r6);
    L_0x0073:
        r6 = r0;
    L_0x0074:
        r1 = r5.c;
        r1 = r1.c;
        monitor-enter(r1);
        r2 = r5.c;	 Catch:{ all -> 0x009c }
        r2 = r2.a;	 Catch:{ all -> 0x009c }
        r2 = r2.iterator();	 Catch:{ all -> 0x009c }
    L_0x0081:
        r3 = r2.hasNext();	 Catch:{ all -> 0x009c }
        if (r3 == 0) goto L_0x0093;
    L_0x0087:
        r3 = r2.next();	 Catch:{ all -> 0x009c }
        r3 = (defpackage.zlz) r3;	 Catch:{ all -> 0x009c }
        r4 = r5.a;	 Catch:{ all -> 0x009c }
        r3.a(r6, r4);	 Catch:{ all -> 0x009c }
        goto L_0x0081;
    L_0x0093:
        r6 = r5.c;	 Catch:{ all -> 0x009c }
        r6 = r6.a;	 Catch:{ all -> 0x009c }
        r6.clear();	 Catch:{ all -> 0x009c }
        monitor-exit(r1);	 Catch:{ all -> 0x009c }
        return r0;
    L_0x009c:
        r6 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x009c }
        goto L_0x00a0;
    L_0x009f:
        throw r6;
    L_0x00a0:
        goto L_0x009f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlc.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
