package defpackage;

/* renamed from: aitv */
final /* synthetic */ class aitv implements Runnable {
    private final aits a;

    aitv(aits aits) {
        this.a = aits;
    }

    /* JADX WARNING: Missing block: B:32:0x009b, code skipped:
            if (r10 != false) goto L_0x009d;
     */
    public final void run() {
        /*
        r17 = this;
        r0 = " animate:";
        r1 = "visible:";
        r2 = "onNotifyEnd";
        r3 = r17;
        r4 = r3.a;
        r5 = 32;
        r6 = 1;
        r7 = 0;
        r8 = "onNotify";
        r9 = new java.lang.Object[r7];	 Catch:{ all -> 0x00f4 }
        r4.a(r6, r8, r9);	 Catch:{ all -> 0x00f4 }
        r8 = r4.b;	 Catch:{ all -> 0x00f4 }
        r8 = (defpackage.aitw) r8;	 Catch:{ all -> 0x00f4 }
        r8 = r8.c();	 Catch:{ all -> 0x00f4 }
        r9 = r4.c();	 Catch:{ all -> 0x00f4 }
        if (r9 == 0) goto L_0x0024;
    L_0x0023:
        goto L_0x002f;
    L_0x0024:
        if (r8 != 0) goto L_0x002f;
    L_0x0026:
        r4.e(r5);
        r0 = new java.lang.Object[r7];
        r4.a(r6, r2, r0);
        return;
    L_0x002f:
        r4.a();	 Catch:{ all -> 0x00f4 }
        r9 = r4.d;	 Catch:{ all -> 0x00f4 }
        if (r9 == 0) goto L_0x0055;
    L_0x0036:
        r9 = r4.b();	 Catch:{ all -> 0x00f4 }
        if (r9 != 0) goto L_0x0055;
    L_0x003c:
        r0 = " `- notMeasured";
        r1 = new java.lang.Object[r7];	 Catch:{ all -> 0x00f4 }
        r4.a(r7, r0, r1);	 Catch:{ all -> 0x00f4 }
        r0 = r4.c();	 Catch:{ all -> 0x00f4 }
        if (r0 == 0) goto L_0x004c;
    L_0x0049:
        r4.g();	 Catch:{ all -> 0x00f4 }
    L_0x004c:
        r4.e(r5);
        r0 = new java.lang.Object[r7];
        r4.a(r6, r2, r0);
        return;
    L_0x0055:
        r9 = 4;
        r10 = r4.b(r9);	 Catch:{ all -> 0x00f4 }
        r11 = 2;
        r12 = r4.b(r11);	 Catch:{ all -> 0x00f4 }
        r13 = 16;
        r14 = 8;
        if (r8 != 0) goto L_0x0080;
    L_0x0065:
        r12 = r4.d();	 Catch:{ all -> 0x00f4 }
        if (r12 == 0) goto L_0x0099;
    L_0x006b:
        r4.e(r14);	 Catch:{ all -> 0x00f4 }
        r5 = r4.c;	 Catch:{ all -> 0x00f4 }
        r15 = 0;
        r8 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1));
        if (r8 > 0) goto L_0x0077;
    L_0x0076:
        goto L_0x007c;
    L_0x0077:
        if (r10 != 0) goto L_0x007c;
    L_0x0079:
        r4.d(r13);	 Catch:{ all -> 0x00f4 }
    L_0x007c:
        r4.d(r9);	 Catch:{ all -> 0x00f4 }
        goto L_0x009d;
    L_0x0080:
        if (r12 == 0) goto L_0x0099;
    L_0x0082:
        r5 = r4.b;	 Catch:{ all -> 0x00f4 }
        r5 = (defpackage.aitw) r5;	 Catch:{ all -> 0x00f4 }
        r6 = r4.a;	 Catch:{ all -> 0x00f4 }
        r12 = r4.e;	 Catch:{ all -> 0x00f4 }
        r5.a(r6, r12);	 Catch:{ all -> 0x00f4 }
        r5 = " `- bindView";
        r6 = new java.lang.Object[r7];	 Catch:{ all -> 0x00f4 }
        r4.a(r7, r5, r6);	 Catch:{ all -> 0x00f4 }
        r4.e(r11);	 Catch:{ all -> 0x00f4 }
        r4.f = r7;	 Catch:{ all -> 0x00f4 }
    L_0x0099:
        if (r8 == 0) goto L_0x00e8;
    L_0x009b:
        if (r10 == 0) goto L_0x00e8;
    L_0x009d:
        r5 = " `- visibility";
        r6 = new java.lang.Object[r7];	 Catch:{ all -> 0x00f4 }
        r4.a(r7, r5, r6);	 Catch:{ all -> 0x00f4 }
        r5 = r4.c();	 Catch:{ all -> 0x00f4 }
        if (r5 == 0) goto L_0x00e5;
    L_0x00aa:
        r5 = r4.b(r14);	 Catch:{ all -> 0x00f4 }
        r6 = r4.b(r13);	 Catch:{ all -> 0x00f4 }
        r8 = " `- setupVis";
        r10 = new java.lang.Object[r9];	 Catch:{ all -> 0x00f4 }
        r10[r7] = r1;	 Catch:{ all -> 0x00f4 }
        r12 = java.lang.Boolean.valueOf(r5);	 Catch:{ all -> 0x00f4 }
        r13 = 1;
        r10[r13] = r12;	 Catch:{ all -> 0x00f4 }
        r10[r11] = r0;	 Catch:{ all -> 0x00f4 }
        r13 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x00f4 }
        r14 = 3;
        r10[r14] = r13;	 Catch:{ all -> 0x00f4 }
        r4.a(r7, r8, r10);	 Catch:{ all -> 0x00f4 }
        r8 = r4.g;	 Catch:{ all -> 0x00f4 }
        r8.a(r5, r6);	 Catch:{ all -> 0x00f4 }
        r5 = 28;
        r4.e(r5);	 Catch:{ all -> 0x00f4 }
        r5 = " `- setupVisEnd";
        r6 = new java.lang.Object[r9];	 Catch:{ all -> 0x00f4 }
        r6[r7] = r1;	 Catch:{ all -> 0x00f4 }
        r1 = 1;
        r6[r1] = r12;	 Catch:{ all -> 0x00f4 }
        r6[r11] = r0;	 Catch:{ all -> 0x00f4 }
        r6[r14] = r13;	 Catch:{ all -> 0x00f4 }
        r4.a(r7, r5, r6);	 Catch:{ all -> 0x00f4 }
    L_0x00e5:
        r4.e(r9);	 Catch:{ all -> 0x00f4 }
    L_0x00e8:
        r1 = 32;
        r4.e(r1);
        r0 = new java.lang.Object[r7];
        r1 = 1;
        r4.a(r1, r2, r0);
        return;
    L_0x00f4:
        r0 = move-exception;
        r1 = 32;
        r4.e(r1);
        r1 = new java.lang.Object[r7];
        r5 = 1;
        r4.a(r5, r2, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aitv.run():void");
    }
}
