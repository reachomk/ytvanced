package defpackage;

import java.io.File;

/* renamed from: aboo */
public final class aboo {
    private abnq a;
    private final String b;

    public aboo(File file) {
        this.b = xvd.a(file.getAbsolutePath());
    }

    public final synchronized abnq a() {
        xak.b();
        if (this.a == null) {
            this.a = c();
        }
        return this.a;
    }

    public final synchronized void a(abnq abnq) {
        xak.b();
        this.a = abnq;
        b(abnq);
    }

    public final synchronized void b() {
        xak.b();
        this.a = null;
        d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0096 A:{SYNTHETIC, Splitter:B:84:0x0096} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0096 A:{SYNTHETIC, Splitter:B:84:0x0096} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0078 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0050 A:{Catch:{ IOException -> 0x0065 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0096 A:{SYNTHETIC, Splitter:B:84:0x0096} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x006b A:{SYNTHETIC, Splitter:B:55:0x006b} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0065 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0050 A:{Catch:{ IOException -> 0x0065 }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0096 A:{SYNTHETIC, Splitter:B:84:0x0096} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0096 A:{SYNTHETIC, Splitter:B:84:0x0096} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0075 A:{SYNTHETIC, Splitter:B:62:0x0075} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0050 A:{Catch:{ IOException -> 0x0065 }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0096 A:{SYNTHETIC, Splitter:B:84:0x0096} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x006b A:{SYNTHETIC, Splitter:B:55:0x006b} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x006b A:{SYNTHETIC, Splitter:B:55:0x006b} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x006e */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|(0)|57|58) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:60|(0)|64|65) */
    /* JADX WARNING: Missing block: B:45:0x0057, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:51:0x0063, code skipped:
            if (r0 == null) goto L_0x0065;
     */
    /* JADX WARNING: Missing block: B:59:0x006f, code skipped:
            r2 = r3;
     */
    /* JADX WARNING: Missing block: B:63:?, code skipped:
            r2.close();
     */
    private final synchronized defpackage.abnq c() {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = new java.io.File;	 Catch:{ all -> 0x009d }
        r1 = r8.b;	 Catch:{ all -> 0x009d }
        r2 = "zeroprefixparsed.cache";
        r0.<init>(r1, r2);	 Catch:{ all -> 0x009d }
        r1 = 0;
        r2 = 0;
        r3 = new java.io.BufferedInputStream;	 Catch:{ FileNotFoundException -> 0x0079, all -> 0x0071 }
        r4 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0079, all -> 0x0071 }
        r4.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0079, all -> 0x0071 }
        r3.<init>(r4);	 Catch:{ FileNotFoundException -> 0x0079, all -> 0x0071 }
        r0 = new java.io.ObjectInputStream;	 Catch:{ StreamCorruptedException -> 0x0059, IOException -> 0x004b, all -> 0x0045 }
        r0.<init>(r3);	 Catch:{ StreamCorruptedException -> 0x0059, IOException -> 0x004b, all -> 0x0045 }
        r4 = r0.readInt();	 Catch:{ StreamCorruptedException -> 0x0042, IOException -> 0x0040, all -> 0x003d }
        r5 = r0.readInt();	 Catch:{ StreamCorruptedException -> 0x003a, IOException -> 0x0038, all -> 0x0035 }
        r6 = new byte[r5];	 Catch:{ StreamCorruptedException -> 0x003a, IOException -> 0x0038, all -> 0x0035 }
        r0.readFully(r6, r1, r5);	 Catch:{ StreamCorruptedException -> 0x0033, IOException -> 0x0031 }
        r0.close();	 Catch:{ IOException -> 0x0065 }
        goto L_0x0065;
        goto L_0x007c;
    L_0x002f:
        r5 = move-exception;
        goto L_0x0069;
        goto L_0x004e;
    L_0x0033:
        r5 = move-exception;
        goto L_0x005e;
    L_0x0035:
        r5 = move-exception;
        r6 = r2;
        goto L_0x0069;
    L_0x0038:
        r6 = r2;
        goto L_0x004e;
    L_0x003a:
        r5 = move-exception;
        r6 = r2;
        goto L_0x005e;
    L_0x003d:
        r5 = move-exception;
        r6 = r2;
        goto L_0x0049;
    L_0x0040:
        r6 = r2;
        goto L_0x004d;
    L_0x0042:
        r5 = move-exception;
        r6 = r2;
        goto L_0x005d;
    L_0x0045:
        r0 = move-exception;
        r5 = r0;
        r0 = r2;
        r6 = r0;
    L_0x0049:
        r4 = 0;
        goto L_0x0069;
    L_0x004b:
        r0 = r2;
        r6 = r0;
    L_0x004d:
        r4 = 0;
    L_0x004e:
        if (r0 != 0) goto L_0x0053;
    L_0x0050:
        r6 = r2;
        r4 = 0;
        goto L_0x0065;
    L_0x0053:
        r0.close();	 Catch:{ IOException -> 0x0065 }
        goto L_0x0065;
    L_0x0057:
        r0 = move-exception;
        goto L_0x006f;
    L_0x0059:
        r0 = move-exception;
        r5 = r0;
        r0 = r2;
        r6 = r0;
    L_0x005d:
        r4 = 0;
    L_0x005e:
        r7 = "Stream corruption error in opening zero-prefix cache file.";
        defpackage.xtl.b(r7, r5);	 Catch:{ all -> 0x002f }
        if (r0 != 0) goto L_0x0053;
    L_0x0065:
        r3.close();	 Catch:{ IOException -> 0x0082 }
        goto L_0x0082;
    L_0x0069:
        if (r0 == 0) goto L_0x006e;
    L_0x006b:
        r0.close();	 Catch:{ IOException -> 0x006e }
    L_0x006e:
        throw r5;	 Catch:{ FileNotFoundException -> 0x002c, all -> 0x0057 }
    L_0x006f:
        r2 = r3;
        goto L_0x0072;
    L_0x0071:
        r0 = move-exception;
    L_0x0072:
        if (r2 != 0) goto L_0x0075;
    L_0x0074:
        goto L_0x0078;
    L_0x0075:
        r2.close();	 Catch:{ IOException -> 0x0078 }
    L_0x0078:
        throw r0;	 Catch:{ all -> 0x009d }
    L_0x0079:
        r3 = r2;
        r6 = r3;
        r4 = 0;
    L_0x007c:
        if (r3 != 0) goto L_0x007f;
    L_0x007e:
        goto L_0x0082;
    L_0x007f:
        r3.close();	 Catch:{ IOException -> 0x0082 }
    L_0x0082:
        r0 = 1;
        if (r4 == r0) goto L_0x0096;
    L_0x0085:
        r0 = 2;
        if (r4 == r0) goto L_0x008f;
    L_0x0088:
        r0 = "0-prefix cache: Invalid content type";
        defpackage.xtl.c(r0);	 Catch:{ all -> 0x009d }
        monitor-exit(r8);
        return r2;
    L_0x008f:
        r0 = new abnr;	 Catch:{ all -> 0x009d }
        r0.<init>(r6, r1);	 Catch:{ all -> 0x009d }
        monitor-exit(r8);
        return r0;
    L_0x0096:
        r0 = new abmy;	 Catch:{ all -> 0x009d }
        r0.<init>(r6);	 Catch:{ all -> 0x009d }
        monitor-exit(r8);
        return r0;
    L_0x009d:
        r0 = move-exception;
        monitor-exit(r8);
        goto L_0x00a1;
    L_0x00a0:
        throw r0;
    L_0x00a1:
        goto L_0x00a0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboo.c():abnq");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056 A:{SYNTHETIC, Splitter:B:27:0x0056} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A:{SYNTHETIC, Splitter:B:19:0x004f} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x007b A:{SYNTHETIC, Splitter:B:53:0x007b} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x007e */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:1|2|(1:4)|5|6|7|8|9|10|11|12|13|14|33|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:29|30|(0)|55|56) */
    /* JADX WARNING: Missing block: B:37:0x0065, code skipped:
            return;
     */
    private final synchronized void b(defpackage.abnq r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = new java.io.File;	 Catch:{ all -> 0x007f }
        r1 = r4.b;	 Catch:{ all -> 0x007f }
        r2 = "zeroprefix.cache";
        r0.<init>(r1, r2);	 Catch:{ all -> 0x007f }
        r1 = r0.exists();	 Catch:{ all -> 0x007f }
        if (r1 == 0) goto L_0x0013;
    L_0x0010:
        r0.delete();	 Catch:{ all -> 0x007f }
    L_0x0013:
        r0 = new java.io.File;	 Catch:{ all -> 0x007f }
        r1 = r4.b;	 Catch:{ all -> 0x007f }
        r2 = "zeroprefixparsed.cache";
        r0.<init>(r1, r2);	 Catch:{ all -> 0x007f }
        r1 = 0;
        r2 = new java.io.BufferedOutputStream;	 Catch:{ FileNotFoundException -> 0x0068 }
        r3 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0068 }
        r3.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0068 }
        r2.<init>(r3);	 Catch:{ FileNotFoundException -> 0x0068 }
        r0 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x0053, all -> 0x004b }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0053, all -> 0x004b }
        r1 = r5.a();	 Catch:{ IOException -> 0x0054, all -> 0x0049 }
        r0.writeInt(r1);	 Catch:{ IOException -> 0x0054, all -> 0x0049 }
        r1 = r5.b();	 Catch:{ IOException -> 0x0054, all -> 0x0049 }
        r1 = r1.length;	 Catch:{ IOException -> 0x0054, all -> 0x0049 }
        r0.writeInt(r1);	 Catch:{ IOException -> 0x0054, all -> 0x0049 }
        r5 = r5.b();	 Catch:{ IOException -> 0x0054, all -> 0x0049 }
        r0.write(r5);	 Catch:{ IOException -> 0x0054, all -> 0x0049 }
        r0.flush();	 Catch:{ IOException -> 0x0054, all -> 0x0049 }
        r0.close();	 Catch:{ IOException -> 0x0060 }
        goto L_0x0060;
    L_0x0049:
        r5 = move-exception;
        goto L_0x004d;
    L_0x004b:
        r5 = move-exception;
        r0 = r1;
    L_0x004d:
        if (r0 == 0) goto L_0x0052;
    L_0x004f:
        r0.close();	 Catch:{ IOException -> 0x0052 }
    L_0x0052:
        throw r5;	 Catch:{ FileNotFoundException -> 0x005d, all -> 0x005a }
    L_0x0053:
        r0 = r1;
    L_0x0054:
        if (r0 == 0) goto L_0x0060;
    L_0x0056:
        r0.close();	 Catch:{ IOException -> 0x0060 }
        goto L_0x0060;
    L_0x005a:
        r5 = move-exception;
        r1 = r2;
        goto L_0x0079;
    L_0x005d:
        r5 = move-exception;
        r1 = r2;
        goto L_0x0069;
    L_0x0060:
        r2.close();	 Catch:{ IOException -> 0x0064 }
        goto L_0x0077;
    L_0x0064:
        monitor-exit(r4);
        return;
    L_0x0066:
        r5 = move-exception;
        goto L_0x0079;
    L_0x0068:
        r5 = move-exception;
    L_0x0069:
        r0 = "Error creating zero-prefix cache file.";
        defpackage.xtl.b(r0, r5);	 Catch:{ all -> 0x0066 }
        if (r1 == 0) goto L_0x0077;
    L_0x0070:
        r1.close();	 Catch:{ IOException -> 0x0075 }
        monitor-exit(r4);
        return;
    L_0x0075:
        monitor-exit(r4);
        return;
    L_0x0077:
        monitor-exit(r4);
        return;
    L_0x0079:
        if (r1 == 0) goto L_0x007e;
    L_0x007b:
        r1.close();	 Catch:{ IOException -> 0x007e }
    L_0x007e:
        throw r5;	 Catch:{ all -> 0x007f }
    L_0x007f:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboo.b(abnq):void");
    }

    private final synchronized void d() {
        File file = new File(this.b, "zeroprefixparsed.cache");
        if (file.exists()) {
            file.delete();
        }
        file = new File(this.b, "zeroprefix.cache");
        if (file.exists()) {
            file.delete();
        }
    }
}
