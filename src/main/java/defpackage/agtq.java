package defpackage;

/* renamed from: agtq */
final class agtq extends aivf {
    private final xsc a;
    private final afhg b;

    agtq(xsc xsc, afhg afhg) {
        this.a = (xsc) amqw.a((Object) xsc);
        this.b = (afhg) amqw.a((Object) afhg);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|(3:23|24|25)) */
    /* JADX WARNING: Missing block: B:19:0x007b, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:20:0x007c, code skipped:
            r2 = r0;
     */
    /* JADX WARNING: Missing block: B:22:?, code skipped:
            defpackage.xtl.d("Offlined video not found on disk.");
            r2.setStatusCode(404);
     */
    /* JADX WARNING: Missing block: B:24:?, code skipped:
            r4.a();
     */
    /* JADX WARNING: Missing block: B:25:0x0089, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:26:0x008a, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:27:0x008b, code skipped:
            defpackage.xtl.b(r3, r0);
     */
    /* JADX WARNING: Missing block: B:28:0x008f, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:30:?, code skipped:
            r4.a();
     */
    /* JADX WARNING: Missing block: B:31:0x0094, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:32:0x0095, code skipped:
            defpackage.xtl.b(r3, r0);
     */
    public final void a(android.net.Uri r19, org.apache.http.Header r20, org.apache.http.HttpResponse r21) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r19;
        r2 = r21;
        r3 = "IOException trying to close offline data source";
        r4 = defpackage.aive.a(r19);
        r5 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        if (r4 == 0) goto L_0x009a;
    L_0x0010:
        r6 = "e";
        r7 = r0.getQueryParameter(r6);
        if (r7 == 0) goto L_0x009a;
    L_0x0018:
        r0 = r0.getQueryParameter(r6);
        r6 = java.lang.Long.parseLong(r0);
        r0 = r1.a;
        r8 = r0.b();
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x0035;
    L_0x002a:
        r0 = "Offline URL has expired. Not allowed to access content.";
        defpackage.xtl.d(r0);
        r0 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        r2.setStatusCode(r0);
        return;
    L_0x0035:
        r6 = r4.d;
        r0 = r20;
        r6 = defpackage.aivh.a(r0, r6);
        r0 = r4.a;
        r7 = r4.b;
        r8 = r4.c;
        r9 = r4.e;
        r17 = defpackage.aeey.a(r0, r7, r8, r9);
        r0 = r1.b;
        r4 = r0.a();
        r7 = new ovm;
        r12 = android.net.Uri.EMPTY;
        r13 = r6.a;
        r8 = r6.b;
        r8 = r8 - r13;
        r10 = 1;
        r15 = r8 + r10;
        r11 = r7;
        r11.<init>(r12, r13, r15, r17);
        r4.a(r7);	 Catch:{ IOException -> 0x007e }
        r4.a();	 Catch:{ IOException -> 0x0067 }
        goto L_0x006c;
    L_0x0067:
        r0 = move-exception;
        r5 = r0;
        defpackage.xtl.b(r3, r5);
    L_0x006c:
        r0 = r6.a(r2);
        if (r0 == 0) goto L_0x007a;
    L_0x0072:
        r0 = new aivr;
        r0.<init>(r4, r7);
        r2.setEntity(r0);
    L_0x007a:
        return;
    L_0x007b:
        r0 = move-exception;
        r2 = r0;
        goto L_0x0090;
    L_0x007e:
        r0 = "Offlined video not found on disk.";
        defpackage.xtl.d(r0);	 Catch:{ all -> 0x007b }
        r2.setStatusCode(r5);	 Catch:{ all -> 0x007b }
        r4.a();	 Catch:{ IOException -> 0x008a }
        return;
    L_0x008a:
        r0 = move-exception;
        r2 = r0;
        defpackage.xtl.b(r3, r2);
        return;
    L_0x0090:
        r4.a();	 Catch:{ IOException -> 0x0094 }
        goto L_0x0099;
    L_0x0094:
        r0 = move-exception;
        r4 = r0;
        defpackage.xtl.b(r3, r4);
    L_0x0099:
        throw r2;
    L_0x009a:
        r2.setStatusCode(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agtq.a(android.net.Uri, org.apache.http.Header, org.apache.http.HttpResponse):void");
    }
}
