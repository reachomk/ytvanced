package defpackage;

/* renamed from: ajkv */
public final class ajkv implements xcp {
    public ajkp a;
    private final ajko b;
    private final aiqh c;
    private final ajkr d;
    private final xci e;
    private boolean f;
    private ahkc g;
    private ajlc h;
    private ajkz i;

    public ajkv(ajko ajko, aiqh aiqh, ajkr ajkr, xci xci) {
        this.b = ajko;
        this.c = aiqh;
        this.d = ajkr;
        this.e = xci;
    }

    public final void a() {
        this.e.a((Object) this);
        this.c.c.a(new ajky(this));
    }

    public final void a(ajlc ajlc) {
        this.h = ajlc;
        this.b.e = ajlc;
        b();
    }

    public final void a(ajkz ajkz) {
        this.i = ajkz;
        this.b.f = ajkz;
        b();
    }

    private final void b() {
        ahkc ahkc = this.g;
        boolean z = true;
        boolean z2 = ahkc != null && ahkc.a;
        ajkp ajkp = this.a;
        ajlc ajlc = this.h;
        if (ajlc != null) {
            z2 = ajlc.a();
        }
        ajkz ajkz = this.i;
        if (ajkz != null) {
            z = ajkz.c();
        } else {
            ahkc ahkc2 = this.g;
            if (ahkc2 == null || !ahkc2.b) {
                z = false;
            }
        }
        ajkp.a(z2, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0121  */
    public final java.lang.Class[] a(java.lang.Class r7, java.lang.Object r8, int r9) {
        /*
        r6 = this;
        r7 = 8;
        r0 = 5;
        r1 = 0;
        r2 = 1;
        r3 = 0;
        switch(r9) {
            case -1: goto L_0x013c;
            case 0: goto L_0x0136;
            case 1: goto L_0x012e;
            case 2: goto L_0x00aa;
            case 3: goto L_0x003d;
            case 4: goto L_0x0032;
            case 5: goto L_0x0022;
            default: goto L_0x0009;
        };
    L_0x0009:
        r7 = new java.lang.IllegalStateException;
        r8 = new java.lang.StringBuilder;
        r0 = 32;
        r8.<init>(r0);
        r0 = "unsupported op code: ";
        r8.append(r0);
        r8.append(r9);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x0022:
        r8 = (defpackage.ahkr) r8;
        r7 = r6.f;
        if (r7 != 0) goto L_0x002a;
    L_0x0028:
        goto L_0x015a;
    L_0x002a:
        r7 = r6.a;
        r8 = r8.a;
        r7.b(r8);
        return r3;
    L_0x0032:
        r8 = (defpackage.ahkm) r8;
        r7 = r6.a;
        r8 = r8.a;
        r7.b(r8);
        goto L_0x015a;
    L_0x003d:
        r8 = (defpackage.ahkn) r8;
        r7 = r8.a;
        r9 = defpackage.airi.PLAYBACK_LOADED;
        r7 = r7.a(r9);
        r6.f = r7;
        r7 = r8.a;
        r9 = defpackage.airi.NEW;
        if (r7 != r9) goto L_0x005c;
    L_0x004f:
        r7 = r6.a;
        r7.c();
        r7 = r6.b;
        r7.e = r3;
        r7.f = r3;
        goto L_0x015a;
    L_0x005c:
        r7 = r8.a;
        r9 = defpackage.airi.PLAYBACK_LOADED;
        if (r7 != r9) goto L_0x015a;
    L_0x0062:
        r7 = r8.b;
        r9 = r6.a;
        r9.a();
        r9 = r6.a;
        r0 = r7.h();
        r0 = r0 * 1000;
        r4 = (long) r0;
        r9.a(r4);
        r9 = r6.a;
        r0 = r8.h;
        if (r0 == 0) goto L_0x0085;
    L_0x007b:
        r8 = r8.b;
        r8 = r8.i();
        if (r8 == 0) goto L_0x0084;
    L_0x0083:
        goto L_0x0085;
    L_0x0084:
        r2 = 0;
    L_0x0085:
        r9.b(r2);
        r8 = r6.a;
        r9 = r7.c();
        r8.a(r9, r3);
        r8 = r6.a;
        r9 = r7.g();
        r8.a(r9);
        r8 = r6.d;
        r7 = r7.g();
        r8.a(r7);
        r7 = r6.a;
        r7.b();
        goto L_0x015a;
    L_0x00aa:
        r8 = (defpackage.ahkf) r8;
        r9 = r8.e;
        if (r9 != r0) goto L_0x015a;
    L_0x00b0:
        r9 = r8.c;
        if (r9 != 0) goto L_0x00b6;
    L_0x00b4:
        goto L_0x015a;
    L_0x00b6:
        r0 = r9.b;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00c0;
    L_0x00be:
        goto L_0x015a;
    L_0x00c0:
        r9 = r9.a;
        if (r9 == 0) goto L_0x00ef;
    L_0x00c4:
        r0 = r9.k;
        r1 = 61479009; // 0x3aa1861 float:9.997299E-37 double:3.03746663E-316;
        if (r0 != 0) goto L_0x00e3;
    L_0x00cb:
        r9 = r9.a;
        if (r9 == 0) goto L_0x00ef;
    L_0x00cf:
        r9 = r9.a;
        if (r9 == 0) goto L_0x00ef;
    L_0x00d3:
        r9 = r9.d;
        if (r9 == 0) goto L_0x00ef;
    L_0x00d7:
        r0 = r9.a;
        if (r0 != r1) goto L_0x00e0;
    L_0x00db:
        r9 = r9.b;
        r9 = (defpackage.aukh) r9;
        goto L_0x00f0;
    L_0x00e0:
        r9 = defpackage.aukh.g;
        goto L_0x00f0;
    L_0x00e3:
        r9 = r0.a;
        if (r9 != r1) goto L_0x00ec;
    L_0x00e7:
        r9 = r0.b;
        r9 = (defpackage.aukh) r9;
        goto L_0x00f0;
    L_0x00ec:
        r9 = defpackage.aukh.g;
        goto L_0x00f0;
    L_0x00ef:
        r9 = r3;
    L_0x00f0:
        if (r9 == 0) goto L_0x0104;
    L_0x00f2:
        r0 = r9.a;
        r0 = r0 & r2;
        if (r0 == 0) goto L_0x00fe;
    L_0x00f7:
        r0 = r9.b;
        if (r0 != 0) goto L_0x00ff;
    L_0x00fb:
        r0 = defpackage.arml.f;
        goto L_0x00ff;
    L_0x00fe:
        r0 = r3;
    L_0x00ff:
        r0 = defpackage.ajqy.a(r0);
        goto L_0x0105;
    L_0x0104:
        r0 = r3;
    L_0x0105:
        if (r9 != 0) goto L_0x0109;
    L_0x0107:
        r7 = r3;
        goto L_0x011a;
    L_0x0109:
        r1 = r9.a;
        r7 = r7 & r1;
        if (r7 == 0) goto L_0x0115;
    L_0x010e:
        r7 = r9.d;
        if (r7 != 0) goto L_0x0116;
    L_0x0112:
        r7 = defpackage.arml.f;
        goto L_0x0116;
    L_0x0115:
        r7 = r3;
    L_0x0116:
        r7 = defpackage.ajqy.a(r7);
    L_0x011a:
        r9 = android.text.TextUtils.isEmpty(r0);
        if (r9 != 0) goto L_0x0121;
    L_0x0120:
        goto L_0x0128;
    L_0x0121:
        r7 = r8.b;
        r0 = r7.c();
        r7 = r3;
    L_0x0128:
        r8 = r6.a;
        r8.a(r0, r7);
        goto L_0x015a;
    L_0x012e:
        r8 = (defpackage.ahkc) r8;
        r6.g = r8;
        r6.b();
        goto L_0x015a;
    L_0x0136:
        r8 = r6.a;
        r8.b(r7);
        goto L_0x015a;
    L_0x013c:
        r7 = 6;
        r3 = new java.lang.Class[r7];
        r7 = defpackage.ahjc.class;
        r3[r1] = r7;
        r7 = defpackage.ahkc.class;
        r3[r2] = r7;
        r7 = 2;
        r8 = defpackage.ahkf.class;
        r3[r7] = r8;
        r7 = 3;
        r8 = defpackage.ahkn.class;
        r3[r7] = r8;
        r7 = 4;
        r8 = defpackage.ahkm.class;
        r3[r7] = r8;
        r7 = defpackage.ahkr.class;
        r3[r0] = r7;
    L_0x015a:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkv.a(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
