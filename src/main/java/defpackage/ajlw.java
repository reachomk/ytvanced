package defpackage;

/* renamed from: ajlw */
abstract class ajlw implements ajlm {
    ajlw() {
    }

    public abstract ajln a();

    /* renamed from: b */
    public ajln a(aiqq aiqq, aiqw aiqw) {
        String a;
        ajln a2 = a();
        a2.s();
        if (aipo.f(a2.f) && aiqq != null) {
            a = aiqq.a(a2.e);
            aiqq.c = null;
        } else {
            a = a2.e.a();
        }
        a2.h = a2.a(a, aiqq, aiqw);
        a2.c.c(a2.h.a);
        a2.l = a2.h;
        if (aiqq != null) {
            a2.a(aiqq.p());
            a2.D().T().c = aiqq.g();
            int a3 = nkl.a(aiqq.a.v);
            if (a3 == 0) {
                a3 = 1;
            }
            aiqf aiqf = a2.d;
            aiqf.s = a3;
            aiqf.a.c.e_(new ahiz(a3));
            if (a2.m.a(airi.VIDEO_REQUESTED)) {
                if (a2.I()) {
                    a2.b(true);
                } else if (a2.H()) {
                    a2.b(a2.l);
                }
            }
        }
        a2.d(0);
        a2.a(false, 0, a2.l.a);
        a2.a(a2.h.a, 4, 0);
        a2.d.g();
        a2.h.a.a().b();
        a2.c(airi.PLAYBACK_PENDING);
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* renamed from: b */
    public defpackage.ajln a(defpackage.ajpz r21, defpackage.aiqw r22) {
        /*
        r20 = this;
        r0 = r21;
        r6 = r20.a();
        r1 = r0.c;
        if (r1 == 0) goto L_0x004c;
    L_0x000a:
        r1 = r1.n();
        r1 = r1.c;
        r2 = r1.b;
        r2 = r2 & 64;
        if (r2 == 0) goto L_0x004c;
    L_0x0016:
        r1 = r1.x;
        if (r1 != 0) goto L_0x001c;
    L_0x001a:
        r1 = defpackage.awgk.c;
    L_0x001c:
        r1 = r1.b;
        if (r1 == 0) goto L_0x004c;
    L_0x0020:
        r1 = new ajpz;
        r2 = r0.a;
        r8 = defpackage.ajqb.a(r2);
        r2 = r0.b;
        r9 = defpackage.ajqb.a(r2);
        r10 = r0.c;
        r11 = r0.d;
        r12 = r0.e;
        r13 = r0.f;
        r14 = r0.g;
        r2 = r0.h;
        r4 = r0.i;
        r5 = r0.j;
        r15 = r0.k;
        r7 = r1;
        r19 = r15;
        r15 = r2;
        r17 = r4;
        r18 = r5;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19);
        goto L_0x004d;
    L_0x004c:
        r7 = r0;
    L_0x004d:
        r6.s();
        r1 = r7.i;
        if (r1 != 0) goto L_0x005a;
    L_0x0054:
        r1 = r6.e;
        r1 = r1.a();
    L_0x005a:
        r2 = r7.d;
        r3 = r22;
        r1 = r6.a(r1, r2, r3);
        r6.h = r1;
        r1 = r6.h;
        r6.l = r1;
        r2 = r6.c;
        r1 = r1.a;
        r2.c(r1);
        r0 = r0.k;
        r6.n = r0;
        r0 = 0;
        r6.d(r0);
        r1 = r6.l;
        r1 = r1.a;
        r6.a(r0, r0, r1);
        r1 = r6.h;
        r1 = r1.a;
        r2 = 4;
        r6.a(r1, r2, r0);
        r0 = defpackage.airi.PLAYBACK_PENDING;
        r6.c(r0);
        r0 = r7.f;
        r1 = 0;
        if (r0 != 0) goto L_0x0092;
    L_0x0090:
        r2 = r1;
        goto L_0x00a5;
    L_0x0092:
        r0 = r0.c;
        if (r0 == 0) goto L_0x0090;
    L_0x0096:
        r2 = r6.b;
        r2 = r2.b();
        r0 = r0.a(r2);
        if (r0 != 0) goto L_0x0090;
    L_0x00a2:
        r0 = r7.f;
        r2 = r0;
    L_0x00a5:
        if (r2 == 0) goto L_0x00a9;
    L_0x00a7:
        r1 = r7.g;
    L_0x00a9:
        r0 = r7.b;
        r6.k = r0;
        r0 = r7.a;
        r3 = r0.a;
        if (r3 == 0) goto L_0x00b7;
    L_0x00b3:
        r0 = r0.b;
        if (r0 == 0) goto L_0x00c3;
    L_0x00b7:
        r0 = new ahjp;
        r0.<init>();
        r3 = r6.l;
        r3 = r3.a;
        defpackage.ajll.a(r0, r3);
    L_0x00c3:
        if (r1 == 0) goto L_0x00c8;
    L_0x00c5:
        r6.b(r1);
    L_0x00c8:
        r1 = r7.a;
        r3 = r7.h;
        r5 = r7.j;
        r0 = r6;
        r0.a(r1, r2, r3, r5);
        r0 = r7.c;
        if (r0 != 0) goto L_0x00e6;
    L_0x00d6:
        r0 = r7.e;
        if (r0 != 0) goto L_0x00f5;
    L_0x00da:
        r0 = r6.c;
        r1 = defpackage.ainz.NAVIGATION;
        r2 = r6.l;
        r2 = r2.a;
        r0.a(r1, r2);
        goto L_0x00f5;
    L_0x00e6:
        r0 = r7.e;
        if (r0 != 0) goto L_0x00f5;
    L_0x00ea:
        r0 = r6.c;
        r1 = defpackage.ainz.PLAYER_CONTROL;
        r2 = r6.l;
        r2 = r2.a;
        r0.a(r1, r2);
    L_0x00f5:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajlw.a(ajpz, aiqw):ajln");
    }
}
