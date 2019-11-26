package defpackage;

/* renamed from: saw */
final class saw implements pkh {
    private final /* synthetic */ sap a;

    saw(sap sap) {
        this.a = sap;
    }

    /* JADX WARNING: Missing block: B:19:0x0055, code skipped:
            if (r1 != 4) goto L_0x0057;
     */
    public final void a() {
        /*
        r7 = this;
        r0 = r7.a;
        r1 = r0.m;
        if (r1 == 0) goto L_0x0136;
    L_0x0006:
        r1 = r0.C;
        if (r1 == 0) goto L_0x0136;
    L_0x000a:
        r1 = r1.c();
        if (r1 == 0) goto L_0x0136;
    L_0x0010:
        r1 = r0.C;
        r1 = r1.c();
        r0.y = r1;
        r1 = r0.y;
        r2 = r1.n;
        r3 = 0;
        if (r2 == 0) goto L_0x002d;
    L_0x001f:
        r4 = r1.c;
        r1 = r1.a(r4);
        r4 = r0.y;
        r4 = r4.m;
        r0.a(r2, r1, r4);
        goto L_0x0031;
    L_0x002d:
        r1 = 0;
        r0.a(r1, r1, r3);
    L_0x0031:
        r1 = r0.y;
        r2 = r1.e;
        r0.E = r2;
        r1 = r1.f;
        r0.F = r1;
        r0.w();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r0.x();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1 = r0.E;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r2 = 2;
        r4 = 1;
        if (r1 == r2) goto L_0x00ac;
    L_0x0047:
        r5 = 3;
        if (r1 != r5) goto L_0x0052;
    L_0x004a:
        r0.c(r3);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r0.A();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        goto L_0x00dd;
    L_0x0052:
        r6 = 4;
        if (r1 == r4) goto L_0x005a;
    L_0x0055:
        if (r1 == r6) goto L_0x00dd;
    L_0x0057:
        r3 = 1;
        goto L_0x00dd;
    L_0x005a:
        r1 = r0.F;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r0.c(r3);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1 = r0.F;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        if (r1 == r4) goto L_0x00a1;
    L_0x0063:
        if (r1 == r2) goto L_0x009a;
    L_0x0065:
        if (r1 == r5) goto L_0x008f;
    L_0x0067:
        if (r1 == r6) goto L_0x0084;
    L_0x0069:
        r1 = defpackage.sap.r;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r2 = r0.F;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r5 = new java.lang.StringBuilder;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r6 = 70;
        r5.<init>(r6);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r6 = "onRemoteMediaPlayerStatusUpdated(): Unexpected Idle Reason ";
        r5.append(r6);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r5.append(r2);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r2 = r5.toString();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        defpackage.sdf.a(r1, r2);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        goto L_0x00dd;
    L_0x0084:
        r0.I();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1 = 2131952009; // 0x7f130189 float:1.9540449E38 double:1.053324246E-314;
        r2 = -1;
        r0.a(r1, r2);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        goto L_0x0057;
    L_0x008f:
        r1 = r0.y;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1 = r1.k;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        if (r1 == 0) goto L_0x0096;
    L_0x0095:
        goto L_0x00dd;
    L_0x0096:
        r0.I();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        goto L_0x0057;
    L_0x009a:
        r1 = r0.s();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r3 = r1 ^ 1;
        goto L_0x00dd;
    L_0x00a1:
        r1 = r0.y;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1 = r1.k;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        if (r1 == 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00dd;
    L_0x00a8:
        r0.I();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        goto L_0x0057;
    L_0x00ac:
        r0.c(r4);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1 = r0.q;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        if (r1 != 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00da;
    L_0x00b4:
        r2 = r1.d;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r5 = 8;
        r2 = r2.c(r5);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        if (r2 == 0) goto L_0x00da;
    L_0x00be:
        r2 = r1.a;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        if (r2 != 0) goto L_0x00da;
    L_0x00c2:
        r2 = new android.content.IntentFilter;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r2.<init>();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r5 = "android.net.wifi.STATE_CHANGE";
        r2.addAction(r5);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r5 = new scr;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r5.<init>(r1);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1.a = r5;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r5 = r1.c;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1 = r1.a;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r5.registerReceiver(r1, r2);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
    L_0x00da:
        r0.A();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
    L_0x00dd:
        if (r3 != 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x00e6;
    L_0x00e0:
        r0.n();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r0.B();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
    L_0x00e6:
        r1 = r3 ^ 1;
        r0.b(r1);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1 = r0.B;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        monitor-enter(r1);	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r2 = r0.B;	 Catch:{ all -> 0x0129 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0129 }
    L_0x00f4:
        r3 = r2.hasNext();	 Catch:{ all -> 0x0129 }
        if (r3 == 0) goto L_0x010f;
    L_0x00fa:
        r3 = r2.next();	 Catch:{ all -> 0x0129 }
        r3 = (defpackage.sdg) r3;	 Catch:{ all -> 0x0129 }
        r0.a(r3);	 Catch:{ sbv -> 0x0106, sbt | sbv -> 0x0104 }
        goto L_0x00f4;
    L_0x0104:
        r3 = move-exception;
        goto L_0x0107;
    L_0x0106:
        r3 = move-exception;
    L_0x0107:
        r4 = defpackage.sap.r;	 Catch:{ all -> 0x0129 }
        r5 = "updateMiniControllers() Failed to update mini controller";
        defpackage.sdf.a(r4, r5, r3);	 Catch:{ all -> 0x0129 }
        goto L_0x00f4;
    L_0x010f:
        monitor-exit(r1);	 Catch:{ all -> 0x0129 }
        r0 = r0.H;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r0 = r0.iterator();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
    L_0x0116:
        r1 = r0.hasNext();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        if (r1 == 0) goto L_0x0136;
    L_0x011c:
        r1 = r0.next();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1 = (defpackage.sbo) r1;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1.m();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        r1.k();	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
        goto L_0x0116;
    L_0x0129:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0129 }
        throw r0;	 Catch:{ sbv -> 0x012e, sbt | sbv -> 0x012c }
    L_0x012c:
        r0 = move-exception;
        goto L_0x012f;
    L_0x012e:
        r0 = move-exception;
    L_0x012f:
        r1 = defpackage.sap.r;
        r2 = "Failed to get volume state due to network issues";
        defpackage.sdf.a(r1, r2, r0);
    L_0x0136:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.saw.a():void");
    }
}
