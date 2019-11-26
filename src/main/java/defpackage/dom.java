package defpackage;

/* renamed from: dom */
final class dom implements Runnable {
    private final /* synthetic */ don a;

    dom(don don) {
        this.a = don;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00be */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:24|(2:26|27)|28|29|30|31|32) */
    public final void run() {
        /*
        r8 = this;
        r0 = r8.a;
        r1 = r0.a;
        r1.getApplicationContext();
        r1 = r0.c;
        if (r1 != 0) goto L_0x001a;
    L_0x000b:
        r1 = new eap;
        r2 = r0.a();
        r2 = r2.H();
        r1.<init>(r2);
        r0.c = r1;
    L_0x001a:
        r1 = r0.c;
        r1 = r1.a();
        if (r1 == 0) goto L_0x00ee;
    L_0x0022:
        r0 = r0.a();	 Catch:{ InterruptedException -> 0x00e5, InterruptedException | ExecutionException -> 0x00e3 }
        r0 = r0.e();	 Catch:{ InterruptedException -> 0x00e5, InterruptedException | ExecutionException -> 0x00e3 }
        r0 = r0.c();	 Catch:{ InterruptedException -> 0x00e5, InterruptedException | ExecutionException -> 0x00e3 }
        r0 = r0.get();	 Catch:{ InterruptedException -> 0x00e5, InterruptedException | ExecutionException -> 0x00e3 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ InterruptedException -> 0x00e5, InterruptedException | ExecutionException -> 0x00e3 }
        r0 = r0.booleanValue();	 Catch:{ InterruptedException -> 0x00e5, InterruptedException | ExecutionException -> 0x00e3 }
        if (r0 == 0) goto L_0x00ee;
    L_0x003a:
        r0 = r8.a;
        r0 = r0.a();
        r0 = r0.k();
        if (r0 == 0) goto L_0x00ee;
    L_0x0046:
        r1 = r0.exists();
        if (r1 == 0) goto L_0x00ee;
    L_0x004c:
        r1 = r0.isDirectory();	 Catch:{ all -> 0x00da }
        r2 = 0;
        r3 = 1;
        if (r1 == 0) goto L_0x00cb;
    L_0x0054:
        r1 = "_cleanup_mv0";
        r4 = new java.io.File;	 Catch:{ all -> 0x00da }
        r5 = r0.getParentFile();	 Catch:{ all -> 0x00da }
        r4.<init>(r5, r1);	 Catch:{ all -> 0x00da }
        r1 = 0;
    L_0x0060:
        r5 = r4.exists();	 Catch:{ all -> 0x00da }
        if (r5 == 0) goto L_0x0084;
    L_0x0066:
        r4 = new java.io.File;	 Catch:{ all -> 0x00da }
        r5 = r0.getParentFile();	 Catch:{ all -> 0x00da }
        r1 = r1 + r3;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00da }
        r7 = 22;
        r6.<init>(r7);	 Catch:{ all -> 0x00da }
        r7 = "_cleanup_mv";
        r6.append(r7);	 Catch:{ all -> 0x00da }
        r6.append(r1);	 Catch:{ all -> 0x00da }
        r6 = r6.toString();	 Catch:{ all -> 0x00da }
        r4.<init>(r5, r6);	 Catch:{ all -> 0x00da }
        goto L_0x0060;
    L_0x0084:
        r1 = r4.mkdir();	 Catch:{ all -> 0x00da }
        if (r1 != 0) goto L_0x008b;
    L_0x008a:
        r4 = 0;
    L_0x008b:
        if (r4 != 0) goto L_0x008e;
    L_0x008d:
        goto L_0x00d2;
    L_0x008e:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x00da }
        r1.<init>();	 Catch:{ all -> 0x00da }
        r3 = r0.listFiles();	 Catch:{ all -> 0x00da }
        r5 = r3.length;	 Catch:{ all -> 0x00da }
    L_0x0098:
        if (r2 >= r5) goto L_0x00a6;
    L_0x009a:
        r6 = r3[r2];	 Catch:{ all -> 0x00da }
        r6 = r6.getAbsolutePath();	 Catch:{ all -> 0x00da }
        r1.add(r6);	 Catch:{ all -> 0x00da }
        r2 = r2 + 1;
        goto L_0x0098;
    L_0x00a6:
        r2 = new java.util.ArrayList;	 Catch:{ IOException | InterruptedException -> 0x00be, IOException | InterruptedException -> 0x00be }
        r2.<init>();	 Catch:{ IOException | InterruptedException -> 0x00be, IOException | InterruptedException -> 0x00be }
        r3 = "mv";
        r2.add(r3);	 Catch:{ IOException | InterruptedException -> 0x00be, IOException | InterruptedException -> 0x00be }
        r2.addAll(r1);	 Catch:{ IOException | InterruptedException -> 0x00be, IOException | InterruptedException -> 0x00be }
        r1 = r4.getAbsolutePath();	 Catch:{ IOException | InterruptedException -> 0x00be, IOException | InterruptedException -> 0x00be }
        r2.add(r1);	 Catch:{ IOException | InterruptedException -> 0x00be, IOException | InterruptedException -> 0x00be }
        defpackage.xta.a(r2);	 Catch:{ IOException | InterruptedException -> 0x00be, IOException | InterruptedException -> 0x00be }
        goto L_0x00c3;
    L_0x00be:
        r1 = "Could not move the root to the temp location";
        defpackage.xtl.c(r1);	 Catch:{ all -> 0x00da }
    L_0x00c3:
        r1 = r4.getParentFile();	 Catch:{ all -> 0x00da }
        defpackage.xta.b(r1);	 Catch:{ all -> 0x00da }
        goto L_0x00d2;
    L_0x00cb:
        r1 = new java.io.File[r3];	 Catch:{ all -> 0x00da }
        r1[r2] = r0;	 Catch:{ all -> 0x00da }
        defpackage.xta.a(r1);	 Catch:{ all -> 0x00da }
    L_0x00d2:
        r0 = r0.getParentFile();
        defpackage.xta.b(r0);
        goto L_0x00ee;
    L_0x00da:
        r1 = move-exception;
        r0 = r0.getParentFile();
        defpackage.xta.b(r0);
        throw r1;
    L_0x00e3:
        r0 = move-exception;
        goto L_0x00e6;
    L_0x00e5:
        r0 = move-exception;
    L_0x00e6:
        r1 = 2;
        r2 = defpackage.afpf.initialization;
        r3 = "Failed to get the fail safe status";
        defpackage.afpc.a(r1, r2, r3, r0);
    L_0x00ee:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dom.run():void");
    }
}
