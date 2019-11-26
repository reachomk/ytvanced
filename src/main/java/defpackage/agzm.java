package defpackage;

/* renamed from: agzm */
public final class agzm implements agya {
    private final xsc a;
    private final agps b;
    private final aajx c;
    private final agvz d;
    private final agxz e;
    private final agqz f;
    private final ahad g;
    private final Object h = new Object();
    private boolean i = false;
    private final String j;
    private boolean k = false;
    private String l;
    private int m = 1;
    private int n = 1;
    private int o = 1;

    public agzm(xsc xsc, agps agps, aajx aajx, agvz agvz, agxz agxz, agqz agqz, ahad ahad, ajgv ajgv) {
        this.a = (xsc) amqw.a((Object) xsc);
        this.b = (agps) amqw.a((Object) agps);
        this.c = (aajx) amqw.a((Object) aajx);
        this.d = (agvz) amqw.a((Object) agvz);
        this.e = (agxz) amqw.a((Object) agxz);
        this.f = (agqz) amqw.a((Object) agqz);
        this.g = (ahad) amqw.a((Object) ahad);
        amqw.a((Object) ajgv);
        this.j = agxj.b(agqz.f);
    }

    public final void a(int i) {
        synchronized (this.h) {
            this.i = true;
        }
    }

    /* JADX WARNING: Missing block: B:36:0x00e1, code skipped:
            if (r5 == 1) goto L_0x00e3;
     */
    public final void run() {
        /*
        r17 = this;
        r1 = r17;
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
        r2 = r1.h;
        monitor-enter(r2);
        r0 = r1.i;	 Catch:{ all -> 0x0297 }
        if (r0 == 0) goto L_0x0010;
    L_0x000e:
        goto L_0x0291;
    L_0x0010:
        r3 = r1.e;	 Catch:{ agyc -> 0x027f }
        r0 = r1.f;	 Catch:{ agyc -> 0x027f }
        r4 = r0.a;	 Catch:{ agyc -> 0x027f }
        r5 = 0;
        r7 = 0;
        r9 = 0;
        r3.a(r4, r5, r7, r9);	 Catch:{ agyc -> 0x027f }
        r0 = r1.f;	 Catch:{ agyc -> 0x027f }
        r0 = r0.f;	 Catch:{ agyc -> 0x027f }
        r0 = defpackage.agxj.b(r0);	 Catch:{ agyc -> 0x027f }
        r3 = r1.f;	 Catch:{ agyc -> 0x027f }
        r3 = r3.f;	 Catch:{ agyc -> 0x027f }
        r6 = defpackage.agxj.f(r3);	 Catch:{ agyc -> 0x027f }
        r3 = r1.f;	 Catch:{ agyc -> 0x027f }
        r3 = r3.f;	 Catch:{ agyc -> 0x027f }
        r3 = defpackage.agxj.z(r3);	 Catch:{ agyc -> 0x027f }
        r4 = r1.d;	 Catch:{ agyc -> 0x027f }
        r4 = r4.h();	 Catch:{ agyc -> 0x027f }
        r4 = r4.j(r0);	 Catch:{ agyc -> 0x027f }
        r5 = r1.d;	 Catch:{ agyc -> 0x027f }
        r5 = r5.p();	 Catch:{ agyc -> 0x027f }
        r7 = 0;
        r5 = r5.a(r0, r7);	 Catch:{ agyc -> 0x027f }
        r7 = 21;
        r11 = 0;
        if (r4 == 0) goto L_0x026f;
    L_0x0051:
        r8 = r4.l;	 Catch:{ agyc -> 0x027f }
        r9 = defpackage.agqf.REQUIRES_CONTENT_VERIFICATION;	 Catch:{ agyc -> 0x027f }
        if (r8 != r9) goto L_0x026f;
    L_0x0057:
        if (r5 == 0) goto L_0x026f;
    L_0x0059:
        r8 = r5.a;	 Catch:{ agyc -> 0x027f }
        if (r8 == 0) goto L_0x026f;
    L_0x005d:
        r8 = r1.d;	 Catch:{ agyc -> 0x027f }
        r8 = r8.k();	 Catch:{ agyc -> 0x027f }
        r8 = r8.o(r0);	 Catch:{ agyc -> 0x027f }
        if (r8 != 0) goto L_0x006e;
    L_0x0069:
        r8 = "ContentVerificationTask: Failed to update video metadata, but still resuming content verification.";
        defpackage.xtl.c(r8);	 Catch:{ agyc -> 0x027f }
    L_0x006e:
        r12 = r5.a;	 Catch:{ agyc -> 0x027f }
        r5 = r5.b;	 Catch:{ agyc -> 0x027f }
        r13 = defpackage.amqp.c(r5);	 Catch:{ agyc -> 0x027f }
        r5 = r12.k();	 Catch:{ agyc -> 0x027f }
        r1.l = r5;	 Catch:{ agyc -> 0x027f }
        r5 = r12.p();	 Catch:{ agyc -> 0x027f }
        r1.o = r5;	 Catch:{ agyc -> 0x027f }
        r5 = defpackage.ampo.a;	 Catch:{ agyc -> 0x027f }
        r8 = r1.f;	 Catch:{ agyc -> 0x027f }
        r8 = r8.f;	 Catch:{ agyc -> 0x027f }
        r8 = defpackage.agxj.E(r8);	 Catch:{ agyc -> 0x027f }
        r14 = 1;
        r15 = 2;
        if (r8 == 0) goto L_0x00ba;
    L_0x0090:
        r1.m = r15;	 Catch:{ agyc -> 0x027f }
        r4 = r12.j();	 Catch:{ agyc -> 0x027f }
        if (r4 != 0) goto L_0x00b6;
    L_0x0098:
        r0 = "Tried to use cached disco key for content verification, but did not find one.";
        r3 = "ContentVerificationTask: ";
        r4 = r0.length();	 Catch:{ agyc -> 0x027f }
        if (r4 != 0) goto L_0x00a8;
    L_0x00a2:
        r4 = new java.lang.String;	 Catch:{ agyc -> 0x027f }
        r4.<init>(r3);	 Catch:{ agyc -> 0x027f }
        goto L_0x00ac;
    L_0x00a8:
        r4 = r3.concat(r0);	 Catch:{ agyc -> 0x027f }
    L_0x00ac:
        defpackage.xtl.c(r4);	 Catch:{ agyc -> 0x027f }
        r3 = defpackage.agqf.CONTENT_VERIFICATION_FAILED;	 Catch:{ agyc -> 0x027f }
        r0 = defpackage.agyc.a(r0, r11, r3, r7);	 Catch:{ agyc -> 0x027f }
        throw r0;	 Catch:{ agyc -> 0x027f }
    L_0x00b6:
        r16 = r5;
        goto L_0x0182;
    L_0x00ba:
        r8 = r12.h();	 Catch:{ agyc -> 0x027f }
        r4 = r4.m;	 Catch:{ agyc -> 0x027f }
        r9 = r4.a();	 Catch:{ agyc -> 0x027f }
        r10 = r12.p();	 Catch:{ agyc -> 0x027f }
        r4 = r1.g;	 Catch:{ agyc -> 0x026a }
        r5 = r1.j;	 Catch:{ agyc -> 0x026a }
        r7 = r1.f;	 Catch:{ agyc -> 0x026a }
        r4 = r4.a(r5, r6, r7, r8, r9, r10);	 Catch:{ agyc -> 0x026a }
        r5 = r4.l();	 Catch:{ agyc -> 0x027f }
        if (r5 == 0) goto L_0x025c;
    L_0x00d8:
        r5 = r5.b;	 Catch:{ agyc -> 0x027f }
        r5 = defpackage.awah.a(r5);	 Catch:{ agyc -> 0x027f }
        if (r5 != 0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00e3;
    L_0x00e1:
        if (r5 != r14) goto L_0x025c;
    L_0x00e3:
        r5 = r4.u();	 Catch:{ agyc -> 0x027f }
        r6 = 7;
        if (r5 == 0) goto L_0x0250;
    L_0x00ea:
        r7 = r5.a;	 Catch:{ agyc -> 0x027f }
        r7 = r7 & 8;
        if (r7 == 0) goto L_0x0250;
    L_0x00f0:
        r5 = r5.e;	 Catch:{ agyc -> 0x027f }
        r5 = defpackage.avqe.a(r5);	 Catch:{ agyc -> 0x027f }
        if (r5 == 0) goto L_0x0250;
    L_0x00f8:
        if (r5 != r15) goto L_0x0250;
    L_0x00fa:
        r1.m = r15;	 Catch:{ agyc -> 0x027f }
        r5 = defpackage.amqp.b(r4);	 Catch:{ agyc -> 0x027f }
        r4 = r5.b();	 Catch:{ agyc -> 0x027f }
        r4 = (defpackage.aakj) r4;	 Catch:{ agyc -> 0x027f }
        r7 = r4.u();	 Catch:{ agyc -> 0x027f }
        if (r7 == 0) goto L_0x0121;
    L_0x010c:
        r7 = r4.u();	 Catch:{ agyc -> 0x027f }
        r7 = r7.a;	 Catch:{ agyc -> 0x027f }
        r7 = r7 & 128;
        if (r7 == 0) goto L_0x0121;
    L_0x0116:
        r4 = r4.u();	 Catch:{ agyc -> 0x027f }
        r4 = r4.i;	 Catch:{ agyc -> 0x027f }
        r4 = r4.d();	 Catch:{ agyc -> 0x027f }
        goto L_0x0122;
    L_0x0121:
        r4 = r11;
    L_0x0122:
        if (r4 == 0) goto L_0x0247;
    L_0x0124:
        r7 = r4.length;	 Catch:{ agyc -> 0x027f }
        if (r7 == 0) goto L_0x0247;
    L_0x0127:
        r6 = defpackage.azxz.c;	 Catch:{ agyc -> 0x027f }
        r6 = r6.createBuilder();	 Catch:{ agyc -> 0x027f }
        r6 = (defpackage.azxy) r6;	 Catch:{ agyc -> 0x027f }
        r7 = defpackage.anxa.c();	 Catch:{ anyg -> 0x023c }
        r6.mergeFrom(r4, r7);	 Catch:{ anyg -> 0x023c }
        r4 = r6.build();	 Catch:{ agyc -> 0x027f }
        r4 = (defpackage.anxl) r4;	 Catch:{ agyc -> 0x027f }
        r4 = (defpackage.azxz) r4;	 Catch:{ agyc -> 0x027f }
        r6 = r12.y();	 Catch:{ agyc -> 0x027f }
        r6 = r6.a(r4);	 Catch:{ agyc -> 0x027f }
        r12 = r6.a();	 Catch:{ agyc -> 0x027f }
        r6 = r1.d;	 Catch:{ agyc -> 0x027f }
        r6 = r6.p();	 Catch:{ agyc -> 0x027f }
        r6.b(r12);	 Catch:{ agyc -> 0x027f }
        r6 = r13.a();	 Catch:{ agyc -> 0x027f }
        if (r6 != 0) goto L_0x015b;
    L_0x0159:
        goto L_0x00b6;
    L_0x015b:
        r6 = r13.b();	 Catch:{ agyc -> 0x027f }
        r6 = (defpackage.agql) r6;	 Catch:{ agyc -> 0x027f }
        r6 = r6.y();	 Catch:{ agyc -> 0x027f }
        r4 = r6.a(r4);	 Catch:{ agyc -> 0x027f }
        r4 = r4.a();	 Catch:{ agyc -> 0x027f }
        r13 = defpackage.amqp.b(r4);	 Catch:{ agyc -> 0x027f }
        r4 = r1.d;	 Catch:{ agyc -> 0x027f }
        r4 = r4.p();	 Catch:{ agyc -> 0x027f }
        r6 = r13.b();	 Catch:{ agyc -> 0x027f }
        r6 = (defpackage.agql) r6;	 Catch:{ agyc -> 0x027f }
        r4.b(r6);	 Catch:{ agyc -> 0x027f }
        goto L_0x00b6;
    L_0x0182:
        r4 = r1.g;	 Catch:{ agyc -> 0x027f }
        r5 = r12.a();	 Catch:{ agyc -> 0x027f }
        r4 = r4.a(r5, r3);	 Catch:{ agyc -> 0x027f }
        r1.n = r4;	 Catch:{ agyc -> 0x027f }
        if (r4 != r15) goto L_0x01a8;
    L_0x0190:
        r4 = r13.a();	 Catch:{ agyc -> 0x027f }
        if (r4 == 0) goto L_0x01a8;
    L_0x0196:
        r4 = r1.g;	 Catch:{ agyc -> 0x027f }
        r5 = r13.b();	 Catch:{ agyc -> 0x027f }
        r5 = (defpackage.agql) r5;	 Catch:{ agyc -> 0x027f }
        r5 = r5.a();	 Catch:{ agyc -> 0x027f }
        r3 = r4.a(r5, r3);	 Catch:{ agyc -> 0x027f }
        r1.n = r3;	 Catch:{ agyc -> 0x027f }
    L_0x01a8:
        r3 = r1.n;	 Catch:{ agyc -> 0x027f }
        if (r3 != r15) goto L_0x0216;
    L_0x01ac:
        r3 = r16.a();	 Catch:{ agyc -> 0x027f }
        if (r3 == 0) goto L_0x01f6;
    L_0x01b2:
        r3 = r1.g;	 Catch:{ agyc -> 0x027f }
        r4 = r1.f;	 Catch:{ agyc -> 0x027f }
        r4 = r4.a;	 Catch:{ agyc -> 0x027f }
        r5 = r16.b();	 Catch:{ agyc -> 0x027f }
        r6 = r5;
        r6 = (defpackage.aakj) r6;	 Catch:{ agyc -> 0x027f }
        r5 = r1.d;	 Catch:{ agyc -> 0x027f }
        r7 = r5.h();	 Catch:{ agyc -> 0x027f }
        r5 = r1.a;	 Catch:{ agyc -> 0x027f }
        r8 = r5.a();	 Catch:{ agyc -> 0x027f }
        r10 = r1.c;	 Catch:{ agyc -> 0x027f }
        r5 = r0;
        r3.a(r4, r5, r6, r7, r8, r10);	 Catch:{ agyc -> 0x027f }
        r3 = r1.d;	 Catch:{ agyc -> 0x027f }
        r3 = r3.h();	 Catch:{ agyc -> 0x027f }
        r3 = r3.o(r0);	 Catch:{ agyc -> 0x027f }
        r3 = r3.isEmpty();	 Catch:{ agyc -> 0x027f }
        if (r3 == 0) goto L_0x01f6;
    L_0x01e1:
        r3 = r16.b();	 Catch:{ agyc -> 0x027f }
        r3 = (defpackage.aakj) r3;	 Catch:{ agyc -> 0x027f }
        r4 = r1.d;	 Catch:{ agyc -> 0x027f }
        r4 = r4.i();	 Catch:{ agyc -> 0x027f }
        r5 = r1.d;	 Catch:{ agyc -> 0x027f }
        r5 = r5.h();	 Catch:{ agyc -> 0x027f }
        defpackage.ahad.a(r3, r4, r5);	 Catch:{ agyc -> 0x027f }
    L_0x01f6:
        r3 = r1.d;	 Catch:{ agyc -> 0x027f }
        r3 = r3.h();	 Catch:{ agyc -> 0x027f }
        r4 = defpackage.agqf.COMPLETE;	 Catch:{ agyc -> 0x027f }
        r3.a(r0, r4);	 Catch:{ agyc -> 0x027f }
        r1.k = r14;	 Catch:{ agyc -> 0x027f }
        r0 = r1.e;	 Catch:{ agyc -> 0x027f }
        r3 = r1.f;	 Catch:{ agyc -> 0x027f }
        r3 = r3.a;	 Catch:{ agyc -> 0x027f }
        r4 = new agpw;	 Catch:{ agyc -> 0x027f }
        r4.<init>();	 Catch:{ agyc -> 0x027f }
        r0.a(r3, r4);	 Catch:{ agyc -> 0x027f }
        r17.a();	 Catch:{ all -> 0x0297 }
        goto L_0x0291;
    L_0x0216:
        r0 = r3 + -1;
        if (r3 == 0) goto L_0x023b;
    L_0x021a:
        r3 = new java.lang.StringBuilder;	 Catch:{ agyc -> 0x027f }
        r4 = 57;
        r3.<init>(r4);	 Catch:{ agyc -> 0x027f }
        r4 = "Content verification failed with unlock error ";
        r3.append(r4);	 Catch:{ agyc -> 0x027f }
        r3.append(r0);	 Catch:{ agyc -> 0x027f }
        r0 = r3.toString();	 Catch:{ agyc -> 0x027f }
        r3 = defpackage.agqf.CONTENT_VERIFICATION_FAILED;	 Catch:{ agyc -> 0x027f }
        r4 = 9;
        r0 = defpackage.agyc.a(r0, r11, r3, r4);	 Catch:{ agyc -> 0x027f }
        r3 = "ContentVerificationTask: Unlock error";
        defpackage.xtl.a(r3, r0);	 Catch:{ agyc -> 0x027f }
        throw r0;	 Catch:{ agyc -> 0x027f }
    L_0x023b:
        throw r11;	 Catch:{ agyc -> 0x027f }
    L_0x023c:
        r0 = "Content verification cannot proceed because parsing decryption key failed";
        r3 = defpackage.agqf.CONTENT_VERIFICATION_FAILED;	 Catch:{ agyc -> 0x027f }
        r4 = 17;
        r0 = defpackage.agyc.a(r0, r11, r3, r4);	 Catch:{ agyc -> 0x027f }
        throw r0;	 Catch:{ agyc -> 0x027f }
    L_0x0247:
        r0 = "Content verification cannot proceed because player response has no decryption key";
        r3 = defpackage.agqf.CONTENT_VERIFICATION_FAILED;	 Catch:{ agyc -> 0x027f }
        r0 = defpackage.agyc.a(r0, r11, r3, r6);	 Catch:{ agyc -> 0x027f }
        throw r0;	 Catch:{ agyc -> 0x027f }
    L_0x0250:
        r0 = 4;
        r1.m = r0;	 Catch:{ agyc -> 0x027f }
        r0 = "Content verification cannot proceed because video is not offlineable";
        r3 = defpackage.agqf.CANNOT_OFFLINE;	 Catch:{ agyc -> 0x027f }
        r0 = defpackage.agyc.a(r0, r11, r3, r6);	 Catch:{ agyc -> 0x027f }
        throw r0;	 Catch:{ agyc -> 0x027f }
    L_0x025c:
        r3 = 3;
        r1.m = r3;	 Catch:{ agyc -> 0x027f }
        r0 = "Content verification cannot proceed because video is not playable";
        r3 = defpackage.agqf.CANNOT_OFFLINE;	 Catch:{ agyc -> 0x027f }
        r4 = 11;
        r0 = defpackage.agyc.a(r0, r11, r3, r4);	 Catch:{ agyc -> 0x027f }
        throw r0;	 Catch:{ agyc -> 0x027f }
    L_0x026a:
        r0 = move-exception;
        r3 = 3;
        r1.m = r3;	 Catch:{ agyc -> 0x027f }
        throw r0;	 Catch:{ agyc -> 0x027f }
    L_0x026f:
        r0 = "Content verification cannot proceed because video is not in correct state";
        r3 = defpackage.agqf.CONTENT_VERIFICATION_FAILED;	 Catch:{ agyc -> 0x027f }
        r0 = defpackage.agyc.b(r0, r11, r3, r7);	 Catch:{ agyc -> 0x027f }
        r3 = "ContentVerificationTask: DB entries not found";
        defpackage.xtl.a(r3, r0);	 Catch:{ agyc -> 0x027f }
        throw r0;	 Catch:{ agyc -> 0x027f }
    L_0x027d:
        r0 = move-exception;
        goto L_0x0293;
    L_0x027f:
        r0 = move-exception;
        r3 = r1.e;	 Catch:{ all -> 0x027d }
        r4 = r1.f;	 Catch:{ all -> 0x027d }
        r4 = r4.a;	 Catch:{ all -> 0x027d }
        r5 = new agpw;	 Catch:{ all -> 0x027d }
        r5.<init>();	 Catch:{ all -> 0x027d }
        r3.a(r4, r0, r5);	 Catch:{ all -> 0x027d }
        r17.a();	 Catch:{ all -> 0x0297 }
    L_0x0291:
        monitor-exit(r2);	 Catch:{ all -> 0x0297 }
        return;
    L_0x0293:
        r17.a();	 Catch:{ all -> 0x0297 }
        throw r0;	 Catch:{ all -> 0x0297 }
    L_0x0297:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0297 }
        goto L_0x029b;
    L_0x029a:
        throw r0;
    L_0x029b:
        goto L_0x029a;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agzm.run():void");
    }

    private final void a() {
        this.b.a(this.j, this.k, this.m, this.n, this.a.a(), this.l, agxj.m(this.f.f), this.o, agxj.E(this.f.f));
    }
}
