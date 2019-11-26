package defpackage;

/* renamed from: aday */
final class aday extends Thread {
    private final /* synthetic */ adas a;

    aday(adas adas, String str) {
        this.a = adas;
        super(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    public final void run() {
        /*
        r6 = this;
        r0 = "Client disconnected, hanging get thread stopped";
    L_0x0002:
        r1 = r6.a;	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        r2 = r1.i;	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        r1 = r1.m;	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        r2.b(r1);	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        r1 = r6.a;	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        r1 = r1.n;	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        r1 = r1.get();	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        if (r1 == 0) goto L_0x001f;
    L_0x0015:
        r1 = r6.a;	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        r1 = r1.e;	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        r1 = r1.get();	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        if (r1 == 0) goto L_0x0002;
    L_0x001f:
        r1 = defpackage.adas.a;	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        defpackage.xtl.c(r1, r0);	 Catch:{ adbg -> 0x0070, InterruptedException -> 0x006f, IOException -> 0x0066, adbd | IOException -> 0x0064, adbi -> 0x0037, adbh -> 0x002e, Exception -> 0x0025 }
        return;
    L_0x0025:
        r1 = move-exception;
        r2 = defpackage.adas.a;
        r3 = "Unexpected exception on hanging get";
        defpackage.xtl.a(r2, r3, r1);
        goto L_0x0078;
    L_0x002e:
        r1 = move-exception;
        r2 = defpackage.adas.a;
        r3 = "Error on hanging get. No network connection: ";
        defpackage.xtl.a(r2, r3, r1);
        goto L_0x0078;
    L_0x0037:
        r1 = move-exception;
        r2 = defpackage.adas.a;
        r3 = r1.a;
        r4 = new java.lang.StringBuilder;
        r5 = 46;
        r4.<init>(r5);
        r5 = "Unexpected response on hanging get ";
        r4.append(r5);
        r4.append(r3);
        r3 = r4.toString();
        defpackage.xtl.a(r2, r3);
        r1 = r1.a;
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r1 == r2) goto L_0x005d;
    L_0x0058:
        r2 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r1 == r2) goto L_0x005d;
    L_0x005c:
        goto L_0x0078;
    L_0x005d:
        r0 = r6.a;
        r1 = 0;
        r0.a(r1);
        return;
    L_0x0064:
        r1 = move-exception;
        goto L_0x0067;
    L_0x0066:
        r1 = move-exception;
    L_0x0067:
        r2 = defpackage.adas.a;
        r3 = "Error on hanging get";
        defpackage.xtl.a(r2, r3, r1);
        goto L_0x0078;
    L_0x006f:
        return;
    L_0x0070:
        r1 = move-exception;
        r2 = defpackage.adas.a;
        r3 = "Error on hanging get: server not found.";
        defpackage.xtl.a(r2, r3, r1);
    L_0x0078:
        r1 = r6.a;
        r1 = r1.n;
        r1 = r1.get();
        if (r1 == 0) goto L_0x0092;
    L_0x0082:
        r1 = r6.a;
        r1 = r1.e;
        r1 = r1.get();
        if (r1 != 0) goto L_0x0092;
    L_0x008c:
        r0 = r6.a;
        r0.i();
        return;
    L_0x0092:
        r1 = defpackage.adas.a;
        defpackage.xtl.c(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aday.run():void");
    }
}
