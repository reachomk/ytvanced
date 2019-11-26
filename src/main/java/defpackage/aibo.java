package defpackage;

/* renamed from: aibo */
public final class aibo implements ajan, xcp {
    private final /* synthetic */ aibd a;

    public aibo(aibd aibd) {
        this.a = aibd;
    }

    public final long e() {
        return 8192;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe  */
    public final void a(defpackage.ahkn r9) {
        /*
        r8 = this;
        r0 = r9.h;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r0 = r9.b;
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r0.i();
        if (r0 != 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0013;
    L_0x0011:
        r0 = 1;
        goto L_0x0014;
    L_0x0013:
        r0 = 0;
    L_0x0014:
        r3 = r9.a;
        r4 = r9.b;
        r5 = 2;
        if (r4 == 0) goto L_0x003c;
    L_0x001b:
        r4 = r4.n();
        r4 = r4.aq();
        if (r4 == 0) goto L_0x003c;
    L_0x0025:
        r4 = 3;
        r4 = new defpackage.airi[r4];
        r6 = defpackage.airi.INTERSTITIAL_REQUESTED;
        r4[r2] = r6;
        r6 = defpackage.airi.INTERSTITIAL_PLAYING;
        r4[r1] = r6;
        r6 = defpackage.airi.PLAYBACK_INTERRUPTED;
        r4[r5] = r6;
        r4 = r3.a(r4);
        if (r4 == 0) goto L_0x003c;
    L_0x003a:
        r3 = defpackage.airi.VIDEO_PLAYING;
    L_0x003c:
        r4 = r8.a;
        r6 = defpackage.airi.PLAYBACK_LOADED;
        r6 = r3.a(r6);
        r4.k = r6;
        r4 = r8.a;
        r6 = defpackage.airi.ENDED;
        if (r3 != r6) goto L_0x004e;
    L_0x004c:
        r6 = 1;
        goto L_0x004f;
    L_0x004e:
        r6 = 0;
    L_0x004f:
        r4.m = r6;
        r4 = defpackage.airi.NEW;
        if (r3 != r4) goto L_0x0091;
    L_0x0055:
        r4 = r8.a;
        r4.o = r2;
        r4.n = r2;
        r5 = 0;
        r4.p = r5;
        r6 = defpackage.airi.NEW;
        r4.q = r6;
        r4.k = r2;
        r4.l = r2;
        r4.m = r2;
        r6 = 0;
        r4.s = r6;
        r4.t = r6;
        r4.u = r6;
        r4.v = r6;
        r4.w = r6;
        r6 = r4.d;
        r6.h();
        r6 = r4.d;
        r7 = defpackage.aich.a();
        r6.a(r7);
        r6 = r4.z;
        r6.b();
        r6 = r4.x;
        monitor-enter(r6);
        r4.y = r5;	 Catch:{ all -> 0x008e }
        monitor-exit(r6);	 Catch:{ all -> 0x008e }
        goto L_0x00f8;
    L_0x008e:
        r9 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x008e }
        throw r9;
    L_0x0091:
        r4 = r8.a;
        r4 = r4.k;
        if (r4 == 0) goto L_0x00e0;
    L_0x0097:
        r4 = r3.c();
        if (r4 == 0) goto L_0x009e;
    L_0x009d:
        goto L_0x00e0;
    L_0x009e:
        r4 = defpackage.airi.PLAYBACK_INTERRUPTED;
        if (r3 != r4) goto L_0x00b1;
    L_0x00a2:
        r4 = r8.a;
        r4 = r4.d;
        r5 = new aich;
        r6 = defpackage.aicj.PAUSED;
        r5.<init>(r6, r1);
        r4.a(r5);
        goto L_0x00f8;
    L_0x00b1:
        r4 = new defpackage.airi[r5];
        r5 = defpackage.airi.INTERSTITIAL_REQUESTED;
        r4[r2] = r5;
        r5 = defpackage.airi.READY;
        r4[r1] = r5;
        r4 = r3.a(r4);
        if (r4 == 0) goto L_0x00cd;
    L_0x00c1:
        r4 = r8.a;
        r4 = r4.d;
        r5 = defpackage.aich.d();
        r4.a(r5);
        goto L_0x00f8;
    L_0x00cd:
        r4 = defpackage.airi.ENDED;
        if (r3 != r4) goto L_0x00f8;
    L_0x00d1:
        r4 = r8.a;
        r4 = r4.d;
        r5 = new aich;
        r6 = defpackage.aicj.ENDED;
        r5.<init>(r6, r2);
        r4.a(r5);
        goto L_0x00f8;
    L_0x00e0:
        r4 = r8.a;
        r5 = r4.d;
        r4 = r4.c;
        r4 = r4.c();
        if (r4 == 0) goto L_0x00f1;
    L_0x00ec:
        r4 = defpackage.aich.b();
        goto L_0x00f5;
    L_0x00f1:
        r4 = defpackage.aich.c();
    L_0x00f5:
        r5.a(r4);
    L_0x00f8:
        r4 = r3.d();
        if (r4 == 0) goto L_0x0105;
    L_0x00fe:
        r4 = r8.a;
        r4 = r4.z;
        r4.a();
    L_0x0105:
        r4 = r8.a;
        r4.q = r3;
        r4.p = r9;
        r4.e();
        r4 = defpackage.airi.READY;
        r3 = r3.a(r4);
        if (r3 == 0) goto L_0x011d;
    L_0x0116:
        r9 = r9.h;
        if (r9 != 0) goto L_0x011b;
    L_0x011a:
        goto L_0x011e;
    L_0x011b:
        if (r0 != 0) goto L_0x011e;
    L_0x011d:
        r1 = 0;
    L_0x011e:
        r9 = r8.a;
        r9 = r9.d;
        r9.c(r1);
        r9 = r8.a;
        r9.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aibo.a(ahkn):void");
    }

    /* JADX WARNING: Missing block: B:13:0x0019, code skipped:
            if (r1 != 6) goto L_0x0048;
     */
    public final void a(defpackage.ahkr r4) {
        /*
        r3 = this;
        r0 = r3.a;
        r1 = r0.k;
        if (r1 == 0) goto L_0x0048;
    L_0x0006:
        r1 = r0.m;
        if (r1 != 0) goto L_0x0048;
    L_0x000a:
        r1 = r4.a;
        r2 = 2;
        if (r1 == r2) goto L_0x003b;
    L_0x000f:
        r2 = 3;
        if (r1 == r2) goto L_0x0026;
    L_0x0012:
        r2 = 4;
        if (r1 == r2) goto L_0x0026;
    L_0x0015:
        r2 = 5;
        if (r1 == r2) goto L_0x001c;
    L_0x0018:
        r2 = 6;
        if (r1 == r2) goto L_0x0026;
    L_0x001b:
        goto L_0x0048;
    L_0x001c:
        r4 = r0.d;
        r0 = defpackage.aich.b();
        r4.a(r0);
        return;
    L_0x0026:
        r0 = r0.d;
        r4 = r4.c();
        if (r4 == 0) goto L_0x0033;
    L_0x002e:
        r4 = defpackage.aich.c();
        goto L_0x0037;
    L_0x0033:
        r4 = defpackage.aich.d();
    L_0x0037:
        r0.a(r4);
        return;
    L_0x003b:
        r4 = r0.d;
        r0 = new aich;
        r1 = defpackage.aicj.PLAYING;
        r2 = 0;
        r0.<init>(r1, r2);
        r4.a(r0);
    L_0x0048:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aibo.a(ahkr):void");
    }

    public final void a(ahkm ahkm) {
        aibd aibd = this.a;
        aibd.s = ahkm.a;
        aibd.t = ahkm.c;
        aibd.u = ahkm.d;
        aibd.v = ahkm.e;
        aibd.d();
    }

    public final void a(aetv aetv) {
        if (aetv.b != null) {
            this.a.d.g();
        }
        aibd aibd = this.a;
        aibd.v = 0;
        aibd.w = 0;
        aahr aahr = aetv.c;
        aahr aahr2 = aetv.b;
        synchronized (aibd.x) {
            aahr[] aahrArr;
            if (aahr != null && aahr2 != null) {
                try {
                    aahr[] aahrArr2 = new aahr[]{aahr, aahr2};
                    this.a.y = aahrArr2;
                } catch (Throwable th) {
                    while (true) {
                    }
                }
            } else if (aahr != null) {
                aahrArr = new aahr[]{aahr};
                this.a.y = aahrArr;
            } else if (aahr2 != null) {
                aahrArr = new aahr[]{aahr2};
                this.a.y = aahrArr;
            }
        }
        this.a.z.a();
    }

    public final void a(ahjc ahjc) {
        if (ahje.a(ahjc.h)) {
            this.a.d.a(ahjc.c, ahjc.a);
        }
    }

    public final void a(ahjn ahjn) {
        boolean z = true;
        boolean z2 = ahjn.b == airc.FULLSCREEN;
        aibd aibd = this.a;
        if (aibd.j != z2) {
            aibd.j = z2;
            aibd.d.h_(z2);
        }
        aibd aibd2 = this.a;
        if (ahjn.a != airc.REMOTE) {
            z = false;
        }
        aibd2.i = z;
    }

    public final void a() {
        this.a.l = true;
    }

    public final void a(ahkf ahkf) {
        if (ahkf.e == 5) {
            aafv aafv = ahkf.c;
            if (aafv != null) {
                ajxs ajxs = aafv.j;
                if (ajxs != null) {
                    arml arml = ajxs.l;
                    if (arml != null) {
                        this.a.d.a(ajqy.a(arml));
                    }
                }
            }
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 8192)).a(ajcg.a(ajam.O(), 8192, 1)).a(new aibn(this), aibq.a), ajam.Q().b.a(ajcg.b(ajam.O(), 8192)).a(ajcg.a(ajam.O(), 8192, 1)).a(new aibv(this), aiby.a), ajam.Q().e.a(ajcg.b(ajam.O(), 8192)).a(ajcg.a(ajam.O(), 8192, 1)).a(new aibx(this), aica.a), ajam.Q().d.a(ajcg.b(ajam.O(), 8192)).a(ajcg.a(ajam.O(), 8192, 1)).a(new aibz(this), aicc.a), ajam.Q().c.a(ajcg.b(ajam.O(), 8192)).a(ajcg.a(ajam.O(), 8192, 1)).a(new aicb(this), aice.a), ajam.P().b.a(ajcg.b(ajam.O(), 8192)).a(ajcg.a(ajam.O(), 8192, 0)).a(new aibp(this), aibs.a), ajam.u().a(ajcg.b(ajam.O(), 8192)).a(ajcg.a(ajam.O(), 8192, 1)).a(new aibr(this), aibu.a), ajam.t().a(ajcg.b(ajam.O(), 8192)).a(ajcg.a(ajam.O(), 8192, 1)).a(new aibt(this), aibw.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{aetv.class, ahjc.class, ahjn.class, ahkf.class, ahkj.class, ahkn.class, ahkm.class, ahkr.class};
            case 0:
                a((aetv) obj);
                return null;
            case 1:
                a((ahjc) obj);
                return null;
            case 2:
                a((ahjn) obj);
                return null;
            case 3:
                a((ahkf) obj);
                return null;
            case 4:
                a();
                return null;
            case 5:
                a((ahkn) obj);
                return null;
            case 6:
                a((ahkm) obj);
                return null;
            case 7:
                a((ahkr) obj);
                return null;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
