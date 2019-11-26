package defpackage;

/* renamed from: tsn */
final class tsn extends tsf {
    private final /* synthetic */ tsl a;

    tsn(tsl tsl) {
        this.a = tsl;
    }

    /* JADX WARNING: Missing block: B:35:0x015e, code skipped:
            if (defpackage.tsj.a(r19, r6.a, r6.i, r6.j) == false) goto L_0x0160;
     */
    /* JADX WARNING: Missing block: B:37:0x0164, code skipped:
            if (r6.b() != false) goto L_0x0166;
     */
    /* JADX WARNING: Missing block: B:39:0x016a, code skipped:
            if (r6.a <= 0.0d) goto L_0x0173;
     */
    /* JADX WARNING: Missing block: B:40:0x016c, code skipped:
            r2 = r6.j;
            r6.i = r2;
            r6.f = r2;
     */
    /* JADX WARNING: Missing block: B:41:0x0173, code skipped:
            r2 = r6.f;
            r6.j = r2;
            r6.i = r2;
     */
    /* JADX WARNING: Missing block: B:42:0x0179, code skipped:
            r6.g = 0.0d;
            r6.m = 0.0d;
            r7 = true;
     */
    /* JADX WARNING: Missing block: B:43:0x017e, code skipped:
            r0 = r6.k;
            r6.k = r7;
            r1 = r6.c.iterator();
     */
    /* JADX WARNING: Missing block: B:45:0x018c, code skipped:
            if (r1.hasNext() == false) goto L_0x01a4;
     */
    /* JADX WARNING: Missing block: B:46:0x018e, code skipped:
            r2 = (defpackage.tsi) r1.next();
     */
    /* JADX WARNING: Missing block: B:47:0x0194, code skipped:
            if (r0 == false) goto L_0x0199;
     */
    /* JADX WARNING: Missing block: B:48:0x0196, code skipped:
            r2.a();
     */
    /* JADX WARNING: Missing block: B:49:0x0199, code skipped:
            r2.a(r6.f);
     */
    /* JADX WARNING: Missing block: B:50:0x019e, code skipped:
            if (r7 == false) goto L_0x0188;
     */
    /* JADX WARNING: Missing block: B:51:0x01a0, code skipped:
            r2.b();
     */
    /* JADX WARNING: Missing block: B:53:0x01a6, code skipped:
            if ((r7 ^ 1) != 0) goto L_0x01c1;
     */
    /* JADX WARNING: Missing block: B:54:0x01a8, code skipped:
            r0 = r18;
     */
    /* JADX WARNING: Missing block: B:56:0x01c1, code skipped:
            r0 = r39;
            r5 = r41;
            r2 = r16;
            r1 = r18;
     */
    public final void a(long r40) {
        /*
        r39 = this;
        r0 = r39;
        r1 = r0.a;
        r2 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r2 = r40 / r2;
        r4 = 0;
        r1.e = r4;
        r5 = r1.d;
        r7 = -1;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 != 0) goto L_0x0017;
    L_0x0014:
        r1.d = r2;
        r5 = r2;
    L_0x0017:
        r5 = r2 - r5;
        r5 = (double) r5;
        r7 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r5);
        r5 = r5 / r7;
        r1.d = r2;
        r2 = r1.c;
        if (r2 == 0) goto L_0x01d6;
    L_0x0029:
        r2 = 4589276106681592316; // 0x3fb0624dd2f1a9fc float:-5.18969491E11 double:0.064;
        r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r7 > 0) goto L_0x0033;
    L_0x0032:
        r2 = r5;
    L_0x0033:
        r5 = r1.a;
        r5 = r5.iterator();
    L_0x0039:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x01d2;
    L_0x003f:
        r6 = r5.next();
        r6 = (defpackage.tsj) r6;
        r7 = r1.b;
        r7 = r7.get(r6);
        r7 = (java.lang.Boolean) r7;
        if (r7 == 0) goto L_0x01cc;
    L_0x004f:
        r7 = r7.booleanValue();
        if (r7 == 0) goto L_0x01cc;
    L_0x0055:
        r7 = r6.b();
        if (r7 == 0) goto L_0x0067;
    L_0x005b:
        r8 = r6.k;
        if (r8 != 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0067;
    L_0x0060:
        r0 = r1;
        r16 = r2;
        r41 = r5;
        goto L_0x01aa;
    L_0x0067:
        r8 = r6.m;
        r8 = r8 + r2;
        r6.m = r8;
        r8 = r6.f;
        r10 = r6.g;
        r12 = r6.h;
        r14 = r6.d;
        r41 = r5;
        r4 = r6.e;
        r16 = r2;
        r35 = r8;
        r8 = r14;
        r14 = r35;
        r37 = r4;
        r4 = r10;
        r10 = r37;
    L_0x0084:
        r2 = r6.m;
        r18 = r1;
        r0 = 0;
        r19 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r21 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1));
        if (r21 < 0) goto L_0x0127;
    L_0x0093:
        r8 = -4661117527937406468; // 0xbf50624dd2f1a9fc float:-5.18969491E11 double:-0.001;
        r2 = r2 + r8;
        r6.m = r2;
        r2 = r6.a;
        r8 = r6.j;
        r10 = r6.b;
        r12 = r8 - r14;
        r12 = r12 * r2;
        r21 = r10 * r4;
        r12 = r12 - r21;
        r21 = r12 * r19;
        r23 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r21 = r21 * r23;
        r21 = r4 + r21;
        r25 = r4 * r19;
        r25 = r25 * r23;
        r25 = r14 + r25;
        r25 = r8 - r25;
        r25 = r25 * r2;
        r27 = r10 * r21;
        r25 = r25 - r27;
        r27 = r25 * r19;
        r27 = r27 * r23;
        r27 = r4 + r27;
        r29 = r21 * r19;
        r29 = r29 * r23;
        r29 = r14 + r29;
        r23 = r8 - r29;
        r23 = r23 * r2;
        r29 = r10 * r27;
        r23 = r23 - r29;
        r29 = r27 * r19;
        r29 = r14 + r29;
        r31 = r23 * r19;
        r31 = r4 + r31;
        r21 = r21 + r27;
        r25 = r25 + r23;
        r21 = r21 + r21;
        r21 = r4 + r21;
        r21 = r21 + r31;
        r23 = 4618441417868443648; // 0x4018000000000000 float:0.0 double:6.0;
        r21 = r21 / r23;
        r21 = r21 * r19;
        r33 = r14 + r21;
        r25 = r25 + r25;
        r12 = r12 + r25;
        r21 = r8 - r29;
        r21 = r21 * r2;
        r10 = r10 * r31;
        r21 = r21 - r10;
        r12 = r12 + r21;
        r12 = r12 / r23;
        r12 = r12 * r19;
        r10 = r4 + r12;
        r12 = r6.l;
        if (r12 == 0) goto L_0x0117;
    L_0x0105:
        r12 = r6.i;
        r21 = r33;
        r23 = r2;
        r25 = r12;
        r27 = r8;
        r2 = defpackage.tsj.a(r21, r23, r25, r27);
        if (r2 == 0) goto L_0x0117;
    L_0x0115:
        r6.m = r0;
    L_0x0117:
        r0 = r39;
        r8 = r14;
        r1 = r18;
        r12 = r29;
        r14 = r33;
        r35 = r4;
        r4 = r10;
        r10 = r35;
        goto L_0x0084;
    L_0x0127:
        r6.h = r12;
        r6.f = r14;
        r6.g = r4;
        r6.d = r8;
        r6.e = r10;
        r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r12 <= 0) goto L_0x0148;
    L_0x0135:
        r2 = r2 / r19;
        r12 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r12 = r12 - r2;
        r14 = r14 * r2;
        r8 = r8 * r12;
        r14 = r14 + r8;
        r6.f = r14;
        r4 = r4 * r2;
        r10 = r10 * r12;
        r4 = r4 + r10;
        r6.g = r4;
    L_0x0148:
        r19 = r14;
        r2 = r6.l;
        if (r2 == 0) goto L_0x0160;
    L_0x014e:
        r2 = r6.a;
        r4 = r6.i;
        r8 = r6.j;
        r21 = r2;
        r23 = r4;
        r25 = r8;
        r2 = defpackage.tsj.a(r19, r21, r23, r25);
        if (r2 != 0) goto L_0x0166;
    L_0x0160:
        r2 = r6.b();
        if (r2 == 0) goto L_0x017e;
    L_0x0166:
        r2 = r6.a;
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 <= 0) goto L_0x0173;
    L_0x016c:
        r2 = r6.j;
        r6.i = r2;
        r6.f = r2;
        goto L_0x0179;
    L_0x0173:
        r2 = r6.f;
        r6.j = r2;
        r6.i = r2;
    L_0x0179:
        r6.g = r0;
        r6.m = r0;
        r7 = 1;
    L_0x017e:
        r0 = r6.k;
        r6.k = r7;
        r1 = r6.c;
        r1 = r1.iterator();
    L_0x0188:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x01a4;
    L_0x018e:
        r2 = r1.next();
        r2 = (defpackage.tsi) r2;
        if (r0 == 0) goto L_0x0199;
    L_0x0196:
        r2.a();
    L_0x0199:
        r3 = r6.f;
        r2.a(r3);
        if (r7 == 0) goto L_0x0188;
    L_0x01a0:
        r2.b();
        goto L_0x0188;
    L_0x01a4:
        r0 = r7 ^ 1;
        if (r0 != 0) goto L_0x01c1;
    L_0x01a8:
        r0 = r18;
    L_0x01aa:
        r1 = r0.b;
        r2 = 0;
        r3 = java.lang.Boolean.valueOf(r2);
        r1.put(r6, r3);
        r1 = r0.c;
        r1 = r1 + -1;
        r0.c = r1;
        r5 = r41;
        r1 = r0;
        r2 = r16;
        r4 = 0;
        goto L_0x01ce;
    L_0x01c1:
        r0 = r39;
        r5 = r41;
        r2 = r16;
        r1 = r18;
        r4 = 0;
        goto L_0x0039;
    L_0x01cc:
        r16 = r2;
    L_0x01ce:
        r0 = r39;
        goto L_0x0039;
    L_0x01d2:
        r0 = r1;
        r0.c();
    L_0x01d6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsn.a(long):void");
    }
}
