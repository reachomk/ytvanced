package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: gnb */
final class gnb implements OnGlobalLayoutListener {
    private final /* synthetic */ gmp a;

    gnb(gmp gmp) {
        this.a = gmp;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0122  */
    public final void onGlobalLayout() {
        /*
        r9 = this;
        r0 = r9.a;
        r1 = r0.ai;
        r2 = new efs;
        r2.<init>();
        r1.c(r2);
        r1 = r0.aq;
        r2 = r0.aO;
        r1.a(r2);
        r1 = r0.al;
        defpackage.xak.a();
        r1 = r1.g;
        r2 = 0;
        if (r1 == 0) goto L_0x001f;
    L_0x001d:
        r1.b = r2;
    L_0x001f:
        r1 = r0.al;
        r3 = r0.aL;
        r3 = r3.b;
        r4 = new aiqd;
        r0.p();
        r5 = defpackage.aiqc.a;
        r6 = r0.a;
        r7 = defpackage.aiqc.a;
        r8 = defpackage.aiqc.a;
        r4.<init>(r5, r6, r7, r8);
        r1.a(r3, r4);
        r1 = r0.al;
        r3 = 1;
        r1.d(r3);
        r1 = r0.al;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.a(r4);
        r1 = r0.aM;
        r4 = 0;
        if (r1 == 0) goto L_0x005e;
    L_0x004a:
        r5 = r0.al;
        r5.a(r1);
        r1 = r0.ad;
        r5 = r0.al;
        r5 = r5.k();
        r1.a(r5);
        r0.aM = r4;
    L_0x005c:
        r1 = r4;
        goto L_0x00a3;
    L_0x005e:
        r1 = r0.aN;
        if (r1 != 0) goto L_0x0063;
    L_0x0062:
        goto L_0x005c;
    L_0x0063:
        r5 = r0.aH;
        r1 = r1.b;
        r1 = defpackage.acxm.a(r1);
        r5.a = r1;
        r1 = r0.aN;
        r5 = r1.b;
        r5 = defpackage.ggf.a(r5);
        if (r5 == 0) goto L_0x007a;
    L_0x0077:
        r5 = r5.c;
        goto L_0x007b;
    L_0x007a:
        r5 = -1;
    L_0x007b:
        r1 = defpackage.ggf.a(r1, r5);
        r0.aN = r1;
        r1 = r0.aN;
        r5 = r1.b;
        r0.aP = r5;
        r1 = r1.c();
        r5 = r0.ad;
        r6 = r0.aN;
        r6 = r6.b();
        r5.a(r6);
        r5 = r0.al;
        r6 = r0.aN;
        r7 = r0.ad;
        r7 = r7.a();
        r5.a(r6, r7);
    L_0x00a3:
        r5 = r0.aa;
        r5.a();
        if (r1 != 0) goto L_0x00b0;
    L_0x00aa:
        r1 = r0.al;
        r1 = r1.m();
    L_0x00b0:
        if (r1 == 0) goto L_0x00de;
    L_0x00b2:
        r3 = r0.aa;
        r5 = r3.e;
        if (r5 != 0) goto L_0x00b9;
    L_0x00b8:
        goto L_0x010f;
    L_0x00b9:
        r5 = r3.f;
        r5 = r5.c;
    L_0x00bd:
        r6 = r5.size();
        if (r2 >= r6) goto L_0x010f;
    L_0x00c3:
        r6 = r5.get(r2);
        r6 = (defpackage.gmj) r6;
        r6 = r6.a;
        r6 = r6.c;
        r6 = r1.equals(r6);
        if (r6 == 0) goto L_0x00db;
    L_0x00d3:
        r3.i = r2;
        r1 = r3.k;
        r1.c(r2);
        goto L_0x010f;
    L_0x00db:
        r2 = r2 + 1;
        goto L_0x00bd;
    L_0x00de:
        r1 = defpackage.afpf.reels;
        r5 = r0.aM;
        if (r5 == 0) goto L_0x00e6;
    L_0x00e4:
        r5 = 1;
        goto L_0x00e7;
    L_0x00e6:
        r5 = 0;
    L_0x00e7:
        r6 = r0.aN;
        if (r6 == 0) goto L_0x00ec;
    L_0x00eb:
        r2 = 1;
    L_0x00ec:
        r6 = new java.lang.StringBuilder;
        r7 = 82;
        r6.<init>(r7);
        r7 = "initiatePlayback lacking a playlistId (Has RestoredState=";
        r6.append(r7);
        r6.append(r5);
        r5 = ", Has PBSDesc=";
        r6.append(r5);
        r6.append(r2);
        r2 = ")";
        r6.append(r2);
        r2 = r6.toString();
        defpackage.afpc.a(r3, r1, r2);
    L_0x010f:
        r1 = r0.aa;
        r1.b();
        r1 = r0.al;
        r1.a();
        r0.aN = r4;
        r1 = r0.ag;
        r1 = r1.a;
        if (r1 > 0) goto L_0x0122;
    L_0x0121:
        goto L_0x0127;
    L_0x0122:
        r0 = r0.al;
        r0.b();
    L_0x0127:
        r0 = r9.a;
        r0 = r0.aL;
        r0 = r0.getViewTreeObserver();
        r0.removeOnGlobalLayoutListener(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnb.onGlobalLayout():void");
    }
}
