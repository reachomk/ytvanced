package defpackage;

/* renamed from: abnc */
public final class abnc implements abob {
    private final xhf a;
    private final wya b;
    private final abnd c;
    private final abnh d;
    private final abny e;
    private final wxy f;

    public abnc(xhf xhf, wya wya, abnd abnd, abnh abnh, abny abny) {
        this.a = (xhf) amqw.a((Object) xhf);
        this.b = (wya) amqw.a((Object) wya);
        this.c = (abnd) amqw.a((Object) abnd);
        this.d = (abnh) amqw.a((Object) abnh);
        this.e = (abny) amqw.a((Object) abny);
        this.f = new wxy(0, (int) abnd.j(), (int) abnd.k());
    }

    public final void a() {
        xtl.e("OnDeviceSuggestIndexFetcher: Created fetch task.");
        this.b.a("OnDeviceSuggestIndexFetcher", this.c.j(), this.c.k() - this.c.j(), true, 0, false, null, this.f, true, false);
        long j = this.c.j();
        StringBuilder stringBuilder = new StringBuilder(87);
        stringBuilder.append("OnDeviceSuggestIndexFetcher: Schedule a download task to run after ");
        stringBuilder.append(j);
        xtl.e(stringBuilder.toString());
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:96:0x0231=Splitter:B:96:0x0231, B:101:0x023d=Splitter:B:101:0x023d} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01e1=Splitter:B:69:0x01e1, B:80:0x0203=Splitter:B:80:0x0203} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x01e1=Splitter:B:69:0x01e1, B:80:0x0203=Splitter:B:80:0x0203} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0203 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:80|81|(1:83)(1:84)|85) */
    /* JADX WARNING: Missing block: B:16:0x0044, code skipped:
            if (defpackage.azye.a(r0).compareTo(defpackage.azye.a(r3)) <= 0) goto L_0x025d;
     */
    /* JADX WARNING: Missing block: B:81:?, code skipped:
            r1 = "OnDeviceSuggestIndexStore: The index URL is invalid: ";
            r0 = java.lang.String.valueOf(r0);
     */
    /* JADX WARNING: Missing block: B:82:0x020d, code skipped:
            if (r0.length() == 0) goto L_0x020f;
     */
    /* JADX WARNING: Missing block: B:83:0x020f, code skipped:
            r0 = new java.lang.String(r1);
     */
    /* JADX WARNING: Missing block: B:84:0x0215, code skipped:
            r0 = r1.concat(r0);
     */
    /* JADX WARNING: Missing block: B:85:0x0219, code skipped:
            defpackage.xtl.c(r0);
     */
    public final boolean b() {
        /*
        r12 = this;
        r0 = r12.c;
        r0 = r0.d();
        r1 = r0.a();
        r2 = 1;
        if (r1 != 0) goto L_0x0013;
    L_0x000d:
        r0 = "OnDeviceSuggestIndexFetcher: The fetching task is cancled because the latest index URL is not available.";
        defpackage.xtl.d(r0);
        return r2;
    L_0x0013:
        r0 = r0.b();
        r0 = (java.lang.String) r0;
        r1 = r12.c;
        r1 = r1.c();
        r3 = r1.a();	 Catch:{ azyh -> 0x026e }
        if (r3 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0049;
    L_0x0026:
        r3 = r1.b();	 Catch:{ azyh -> 0x026e }
        r3 = (java.lang.String) r3;	 Catch:{ azyh -> 0x026e }
        r4 = r0.isEmpty();	 Catch:{ azyh -> 0x026e }
        if (r4 != 0) goto L_0x025d;
    L_0x0032:
        r4 = r3.isEmpty();	 Catch:{ azyh -> 0x026e }
        if (r4 != 0) goto L_0x0049;
    L_0x0038:
        r4 = defpackage.azye.a(r0);	 Catch:{ azyh -> 0x026e }
        r3 = defpackage.azye.a(r3);	 Catch:{ azyh -> 0x0048 }
        r3 = r4.compareTo(r3);	 Catch:{ azyh -> 0x0048 }
        if (r3 > 0) goto L_0x0049;
    L_0x0046:
        goto L_0x025d;
    L_0x0049:
        r1 = "OnDeviceSuggestIndexFetcher: Add Request for the new index URL: ";
        r3 = java.lang.String.valueOf(r0);
        r4 = r3.length();
        if (r4 != 0) goto L_0x005b;
    L_0x0055:
        r3 = new java.lang.String;
        r3.<init>(r1);
        goto L_0x005f;
    L_0x005b:
        r3 = r1.concat(r3);
    L_0x005f:
        defpackage.xtl.e(r3);
        r1 = defpackage.bqr.a();
        r3 = new abnf;
        r3.<init>(r0, r1, r1);
        r4 = r12.a;
        r4.a();
        r4 = r12.e;
        r4.a();
        r4 = r12.a;
        r4.b(r3);
        r3 = 0;
        r1 = r1.get();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r1 = (byte[]) r1;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r4 = r12.e;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r4.b();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r4 = r12.d;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        if (r1 == 0) goto L_0x024a;
    L_0x008a:
        r5 = 47;
        r6 = defpackage.amqz.a(r5);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r6 = r6.c(r0);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r7 = r6.size();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r8 = 2;
        if (r7 < r8) goto L_0x0107;
    L_0x009b:
        r7 = r6.size();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r7 = r7 + -1;
        r7 = r6.get(r7);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r7 = (java.lang.String) r7;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r7 = r7.isEmpty();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        if (r7 != 0) goto L_0x0107;
    L_0x00ad:
        r7 = r4.b;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r7 = r7.getFilesDir();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r7 = java.lang.String.valueOf(r7);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r8 = java.io.File.separator;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r9 = java.io.File.separator;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r10 = r6.size();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r10 = r10 + -1;
        r6 = r6.get(r10);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r6 = (java.lang.String) r6;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r10 = r7.length();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r10 = r10 + 15;
        r11 = java.lang.String.valueOf(r8);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r11 = r11.length();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r10 = r10 + r11;
        r11 = java.lang.String.valueOf(r9);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r11 = r11.length();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r10 = r10 + r11;
        r11 = java.lang.String.valueOf(r6);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r11 = r11.length();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r10 = r10 + r11;
        r11 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r11.<init>(r10);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r11.append(r7);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r11.append(r8);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r7 = "ondevicesuggest";
        r11.append(r7);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r11.append(r9);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r11.append(r6);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r6 = r11.toString();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r6 = defpackage.amqp.b(r6);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        goto L_0x0109;
    L_0x0107:
        r6 = defpackage.ampo.a;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
    L_0x0109:
        r7 = r6.a();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        if (r7 != 0) goto L_0x012a;
    L_0x010f:
        r1 = "OnDeviceSuggestIndexStore: Cannot create the file path from the URL: ";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r4 = r0.length();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        if (r4 != 0) goto L_0x0121;
    L_0x011b:
        r0 = new java.lang.String;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r0.<init>(r1);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        goto L_0x0125;
    L_0x0121:
        r0 = r1.concat(r0);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
    L_0x0125:
        defpackage.xtl.c(r0);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        goto L_0x024a;
    L_0x012a:
        r7 = 0;
        r8 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x023c, FileNotFoundException | NullPointerException -> 0x023a, IOException -> 0x0230 }
        r9 = r6.b();	 Catch:{ FileNotFoundException -> 0x023c, FileNotFoundException | NullPointerException -> 0x023a, IOException -> 0x0230 }
        r9 = (java.lang.String) r9;	 Catch:{ FileNotFoundException -> 0x023c, FileNotFoundException | NullPointerException -> 0x023a, IOException -> 0x0230 }
        r8.<init>(r9);	 Catch:{ FileNotFoundException -> 0x023c, FileNotFoundException | NullPointerException -> 0x023a, IOException -> 0x0230 }
        r9 = r8.getParentFile();	 Catch:{ FileNotFoundException -> 0x023c, FileNotFoundException | NullPointerException -> 0x023a, IOException -> 0x0230 }
        r9.mkdirs();	 Catch:{ FileNotFoundException -> 0x023c, FileNotFoundException | NullPointerException -> 0x023a, IOException -> 0x0230 }
        r9 = new java.io.BufferedOutputStream;	 Catch:{ FileNotFoundException -> 0x023c, FileNotFoundException | NullPointerException -> 0x023a, IOException -> 0x0230 }
        r10 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x023c, FileNotFoundException | NullPointerException -> 0x023a, IOException -> 0x0230 }
        r10.<init>(r8);	 Catch:{ FileNotFoundException -> 0x023c, FileNotFoundException | NullPointerException -> 0x023a, IOException -> 0x0230 }
        r8 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r9.<init>(r10, r8);	 Catch:{ FileNotFoundException -> 0x023c, FileNotFoundException | NullPointerException -> 0x023a, IOException -> 0x0230 }
        r9.write(r1);	 Catch:{ FileNotFoundException -> 0x022b, FileNotFoundException | NullPointerException -> 0x0229, IOException -> 0x0226, all -> 0x0223 }
        defpackage.abnh.a(r9);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r1 = r6.b();	 Catch:{ NullPointerException | SecurityException -> 0x021d, NullPointerException | SecurityException -> 0x021d }
        r1 = (java.lang.String) r1;	 Catch:{ NullPointerException | SecurityException -> 0x021d, NullPointerException | SecurityException -> 0x021d }
        r1 = r4.a(r1);	 Catch:{ NullPointerException | SecurityException -> 0x021d, NullPointerException | SecurityException -> 0x021d }
        if (r1 != 0) goto L_0x0170;
    L_0x015b:
        r0 = "OnDeviceSuggestIndexStore: The new index file may be in wrong format or broken.";
        defpackage.xtl.c(r0);	 Catch:{ NullPointerException | SecurityException -> 0x021d, NullPointerException | SecurityException -> 0x021d }
        r0 = new java.io.File;	 Catch:{ NullPointerException | SecurityException -> 0x021d, NullPointerException | SecurityException -> 0x021d }
        r1 = r6.b();	 Catch:{ NullPointerException | SecurityException -> 0x021d, NullPointerException | SecurityException -> 0x021d }
        r1 = (java.lang.String) r1;	 Catch:{ NullPointerException | SecurityException -> 0x021d, NullPointerException | SecurityException -> 0x021d }
        r0.<init>(r1);	 Catch:{ NullPointerException | SecurityException -> 0x021d, NullPointerException | SecurityException -> 0x021d }
        r0.delete();	 Catch:{ NullPointerException | SecurityException -> 0x021d, NullPointerException | SecurityException -> 0x021d }
        goto L_0x024a;
    L_0x0170:
        r1 = r4.a;	 Catch:{ azyh -> 0x0203 }
        r5 = r0.lastIndexOf(r5);	 Catch:{ azyh -> 0x0203 }
        r5 = r5 + r2;
        r5 = r0.substring(r5);	 Catch:{ azyh -> 0x0203 }
        r7 = 95;
        r8 = r5.indexOf(r7);	 Catch:{ azyh -> 0x0203 }
        r9 = r8 + 1;
        r7 = r5.indexOf(r7, r9);	 Catch:{ azyh -> 0x0203 }
        if (r8 >= r7) goto L_0x01fd;
    L_0x0189:
        r5 = r5.substring(r9, r7);	 Catch:{ azyh -> 0x0203 }
        r7 = 45;
        r8 = r5.indexOf(r7);	 Catch:{ azyh -> 0x0203 }
        r7 = r5.lastIndexOf(r7);	 Catch:{ azyh -> 0x0203 }
        if (r8 >= r7) goto L_0x01f7;
    L_0x0199:
        r8 = r8 + r2;
        r5 = r5.substring(r8, r7);	 Catch:{ azyh -> 0x0203 }
        r1.c(r5);	 Catch:{ azyh -> 0x0203 }
        r1 = r4.a;	 Catch:{ azyh -> 0x0203 }
        r5 = r6.b();	 Catch:{ azyh -> 0x0203 }
        r5 = (java.lang.String) r5;	 Catch:{ azyh -> 0x0203 }
        r1.b(r5);	 Catch:{ azyh -> 0x0203 }
        r1 = r4.a;	 Catch:{ azyh -> 0x0203 }
        r1.a(r0);	 Catch:{ azyh -> 0x0203 }
        r1 = r6.b();	 Catch:{ azyh -> 0x0203 }
        r1 = (java.lang.String) r1;	 Catch:{ azyh -> 0x0203 }
        r4 = new java.io.File;	 Catch:{ SecurityException -> 0x01db, NullPointerException | SecurityException -> 0x01d9 }
        r4.<init>(r1);	 Catch:{ SecurityException -> 0x01db, NullPointerException | SecurityException -> 0x01d9 }
        r1 = r4.getParentFile();	 Catch:{ SecurityException -> 0x01db, NullPointerException | SecurityException -> 0x01d9 }
        if (r1 == 0) goto L_0x01e1;
    L_0x01c2:
        r1 = r1.listFiles();	 Catch:{ SecurityException -> 0x01db, NullPointerException | SecurityException -> 0x01d9 }
        r5 = r1.length;	 Catch:{ SecurityException -> 0x01db, NullPointerException | SecurityException -> 0x01d9 }
        r6 = 0;
    L_0x01c8:
        if (r6 >= r5) goto L_0x01e1;
    L_0x01ca:
        r7 = r1[r6];	 Catch:{ SecurityException -> 0x01db, NullPointerException | SecurityException -> 0x01d9 }
        r8 = r7.equals(r4);	 Catch:{ SecurityException -> 0x01db, NullPointerException | SecurityException -> 0x01d9 }
        if (r8 == 0) goto L_0x01d3;
    L_0x01d2:
        goto L_0x01d6;
    L_0x01d3:
        r7.delete();	 Catch:{ SecurityException -> 0x01db, NullPointerException | SecurityException -> 0x01d9 }
    L_0x01d6:
        r6 = r6 + 1;
        goto L_0x01c8;
    L_0x01d9:
        r1 = move-exception;
        goto L_0x01dc;
    L_0x01db:
        r1 = move-exception;
    L_0x01dc:
        r4 = "OnDeviceSuggestIndexStore: Failed to delete the old index files.";
        defpackage.xtl.b(r4, r1);	 Catch:{ azyh -> 0x0203 }
    L_0x01e1:
        r1 = "OnDeviceSuggestIndexStore: Successfully load the new model from ";
        r4 = r0.length();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        if (r4 != 0) goto L_0x01ef;
    L_0x01e9:
        r0 = new java.lang.String;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r0.<init>(r1);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        goto L_0x01f3;
    L_0x01ef:
        r0 = r1.concat(r0);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
    L_0x01f3:
        defpackage.xtl.e(r0);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        goto L_0x024a;
    L_0x01f7:
        r1 = new azyh;	 Catch:{ azyh -> 0x0203 }
        r1.<init>();	 Catch:{ azyh -> 0x0203 }
        throw r1;	 Catch:{ azyh -> 0x0203 }
    L_0x01fd:
        r1 = new azyh;	 Catch:{ azyh -> 0x0203 }
        r1.<init>();	 Catch:{ azyh -> 0x0203 }
        throw r1;	 Catch:{ azyh -> 0x0203 }
    L_0x0203:
        r1 = "OnDeviceSuggestIndexStore: The index URL is invalid: ";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r4 = r0.length();	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        if (r4 != 0) goto L_0x0215;
    L_0x020f:
        r0 = new java.lang.String;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        r0.<init>(r1);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        goto L_0x0219;
    L_0x0215:
        r0 = r1.concat(r0);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
    L_0x0219:
        defpackage.xtl.c(r0);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        goto L_0x024a;
    L_0x021d:
        r0 = "OnDeviceSuggestIndexStore: Fail to delete the broken new index file.";
        defpackage.xtl.c(r0);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        goto L_0x024a;
    L_0x0223:
        r0 = move-exception;
        r7 = r9;
        goto L_0x0246;
    L_0x0226:
        r0 = move-exception;
        r7 = r9;
        goto L_0x0231;
    L_0x0229:
        r0 = move-exception;
        goto L_0x022c;
    L_0x022b:
        r0 = move-exception;
    L_0x022c:
        r7 = r9;
        goto L_0x023d;
    L_0x022e:
        r0 = move-exception;
        goto L_0x0246;
    L_0x0230:
        r0 = move-exception;
    L_0x0231:
        r1 = "OnDeviceSuggestIndexStore: Error writing data to the new index file.";
        defpackage.xtl.a(r1, r0);	 Catch:{ all -> 0x022e }
        defpackage.abnh.a(r7);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        goto L_0x024a;
    L_0x023a:
        r0 = move-exception;
        goto L_0x023d;
    L_0x023c:
        r0 = move-exception;
    L_0x023d:
        r1 = "OnDeviceSuggestIndexStore: Error creating the new index file.";
        defpackage.xtl.a(r1, r0);	 Catch:{ all -> 0x022e }
        defpackage.abnh.a(r7);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        goto L_0x024a;
    L_0x0246:
        defpackage.abnh.a(r7);	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
        throw r0;	 Catch:{ InterruptedException -> 0x0252, ExecutionException -> 0x024b }
    L_0x024a:
        return r2;
    L_0x024b:
        r0 = move-exception;
        r1 = "OnDeviceSuggestIndexFetcher: The fetching task threw an exception: ";
        defpackage.xtl.b(r1, r0);
        goto L_0x0257;
    L_0x0252:
        r0 = "OnDeviceSuggestIndexFetcher: The fetching task is interrupted.";
        defpackage.xtl.d(r0);
    L_0x0257:
        r0 = r12.e;
        r0.c();
        return r3;
    L_0x025d:
        r3 = r1.b();	 Catch:{ azyh -> 0x026e }
        r3 = (java.lang.String) r3;	 Catch:{ azyh -> 0x026e }
        r0.length();	 Catch:{ azyh -> 0x026e }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ azyh -> 0x026e }
        r3.length();	 Catch:{ azyh -> 0x026e }
        return r2;
    L_0x026e:
        r1 = r1.b();
        r1 = (java.lang.String) r1;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r4 = java.lang.String.valueOf(r1);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r3 = r3 + 74;
        r3 = r3 + r4;
        r5.<init>(r3);
        r3 = "OnDeviceSuggestIndexFetcher: The index URL is invalid. Latest: ";
        r5.append(r3);
        r5.append(r0);
        r0 = ", current: ";
        r5.append(r0);
        r5.append(r1);
        r0 = r5.toString();
        defpackage.xtl.d(r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abnc.b():boolean");
    }
}
