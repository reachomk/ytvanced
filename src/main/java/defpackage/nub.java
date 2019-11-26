package defpackage;

/* renamed from: nub */
final class nub extends ntv {
    private boolean a;
    private final nuj c;
    private final boolean[] d = new boolean[3];
    private final nuf e = new nuf(32);
    private final nuf f = new nuf(33);
    private final nuf g = new nuf(34);
    private final nuf h = new nuf(39);
    private final nuf i = new nuf(40);
    private final nue j;
    private long k;
    private long l;
    private final nwz m;

    public nub(nrs nrs, nuj nuj) {
        super(nrs);
        this.c = nuj;
        this.j = new nue(nrs);
        this.m = new nwz();
    }

    public final void b() {
    }

    public final void a() {
        nwv.a(this.d);
        this.e.a();
        this.f.a();
        this.g.a();
        this.h.a();
        this.i.a();
        nue nue = this.j;
        nue.e = false;
        nue.f = false;
        nue.g = false;
        nue.h = false;
        nue.i = false;
        this.k = 0;
    }

    public final void a(long j, boolean z) {
        this.l = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x039e  */
    public final void a(defpackage.nwz r31) {
        /*
        r30 = this;
        r0 = r30;
    L_0x0002:
        r1 = r31;
        r2 = r31.b();
        if (r2 <= 0) goto L_0x03c1;
    L_0x000a:
        r2 = r1.b;
        r3 = r1.c;
        r4 = r1.a;
        r5 = r0.k;
        r7 = r31.b();
        r7 = (long) r7;
        r5 = r5 + r7;
        r0.k = r5;
        r5 = r0.b;
        r6 = r31.b();
        r5.a(r1, r6);
    L_0x0023:
        if (r2 >= r3) goto L_0x0002;
    L_0x0025:
        r5 = r0.d;
        r5 = defpackage.nwv.a(r4, r2, r3, r5);
        if (r5 != r3) goto L_0x0031;
    L_0x002d:
        r0.a(r4, r2, r3);
        return;
    L_0x0031:
        r6 = defpackage.nwv.c(r4, r5);
        r7 = r5 - r2;
        if (r7 > 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003d;
    L_0x003a:
        r0.a(r4, r2, r5);
    L_0x003d:
        r2 = r3 - r5;
        r8 = r0.k;
        r10 = (long) r2;
        r8 = r8 - r10;
        r10 = 0;
        if (r7 >= 0) goto L_0x0048;
    L_0x0046:
        r7 = -r7;
        goto L_0x0049;
    L_0x0048:
        r7 = 0;
    L_0x0049:
        r11 = r0.l;
        r13 = r0.a;
        r14 = 1;
        if (r13 == 0) goto L_0x0091;
    L_0x0050:
        r13 = r0.j;
        r15 = r13.i;
        if (r15 == 0) goto L_0x0061;
    L_0x0056:
        r15 = r13.f;
        if (r15 == 0) goto L_0x0061;
    L_0x005a:
        r15 = r13.b;
        r13.l = r15;
        r13.i = r10;
        goto L_0x006a;
    L_0x0061:
        r15 = r13.g;
        if (r15 != 0) goto L_0x0072;
    L_0x0065:
        r15 = r13.f;
        if (r15 == 0) goto L_0x006a;
    L_0x0069:
        goto L_0x0072;
    L_0x006a:
        r20 = r3;
        r18 = r4;
        r16 = r11;
        goto L_0x02fe;
    L_0x0072:
        r15 = r13.h;
        r16 = r11;
        if (r15 == 0) goto L_0x0081;
    L_0x0078:
        r10 = r13.a;
        r10 = r8 - r10;
        r11 = (int) r10;
        r11 = r11 + r2;
        r13.a(r11);
    L_0x0081:
        r10 = r13.a;
        r13.j = r10;
        r10 = r13.d;
        r13.k = r10;
        r13.h = r14;
        r10 = r13.b;
        r13.l = r10;
        goto L_0x02fa;
    L_0x0091:
        r16 = r11;
        r10 = r0.e;
        r10.b(r7);
        r10 = r0.f;
        r10.b(r7);
        r10 = r0.g;
        r10.b(r7);
        r10 = r0.e;
        r11 = r10.a;
        if (r11 == 0) goto L_0x02fa;
    L_0x00a8:
        r11 = r0.f;
        r12 = r11.a;
        if (r12 == 0) goto L_0x02fa;
    L_0x00ae:
        r12 = r0.g;
        r13 = r12.a;
        if (r13 == 0) goto L_0x02fa;
    L_0x00b4:
        r13 = r0.b;
        r15 = r10.c;
        r14 = r11.c;
        r14 = r14 + r15;
        r1 = r12.c;
        r14 = r14 + r1;
        r1 = new byte[r14];
        r14 = r10.b;
        r20 = r3;
        r3 = 0;
        java.lang.System.arraycopy(r14, r3, r1, r3, r15);
        r14 = r11.b;
        r15 = r10.c;
        r18 = r4;
        r4 = r11.c;
        java.lang.System.arraycopy(r14, r3, r1, r15, r4);
        r4 = r12.b;
        r10 = r10.c;
        r14 = r11.c;
        r10 = r10 + r14;
        r12 = r12.c;
        java.lang.System.arraycopy(r4, r3, r1, r10, r12);
        r3 = r11.b;
        r4 = r11.c;
        defpackage.nwv.a(r3, r4);
        r3 = new nxa;
        r4 = r11.b;
        r3.<init>(r4);
        r4 = 44;
        r3.b(r4);
        r14 = 3;
        r10 = r3.c(r14);
        r4 = 1;
        r3.b(r4);
        r4 = 88;
        r3.b(r4);
        r4 = 8;
        r3.b(r4);
        r11 = 0;
        r12 = 0;
    L_0x0107:
        if (r11 >= r10) goto L_0x011c;
    L_0x0109:
        r21 = r3.b();
        if (r21 == 0) goto L_0x0111;
    L_0x010f:
        r12 = r12 + 89;
    L_0x0111:
        r21 = r3.b();
        if (r21 == 0) goto L_0x0119;
    L_0x0117:
        r12 = r12 + 8;
    L_0x0119:
        r11 = r11 + 1;
        goto L_0x0107;
    L_0x011c:
        r3.b(r12);
        if (r10 <= 0) goto L_0x0127;
    L_0x0121:
        r11 = 8 - r10;
        r11 = r11 + r11;
        r3.b(r11);
    L_0x0127:
        r3.e();
        r11 = r3.e();
        if (r11 == r14) goto L_0x0132;
    L_0x0130:
        r12 = 1;
        goto L_0x0136;
    L_0x0132:
        r12 = 1;
        r3.b(r12);
    L_0x0136:
        r21 = r3.e();
        r22 = r3.e();
        r19 = r3.b();
        r15 = 2;
        if (r19 == 0) goto L_0x0170;
    L_0x0145:
        r23 = r3.e();
        r24 = r3.e();
        r25 = r3.e();
        r26 = r3.e();
        if (r11 != r12) goto L_0x015a;
    L_0x0157:
        r27 = 2;
        goto L_0x015f;
    L_0x015a:
        if (r11 != r15) goto L_0x015d;
    L_0x015c:
        goto L_0x0157;
    L_0x015d:
        r27 = 1;
    L_0x015f:
        if (r11 != r12) goto L_0x0163;
    L_0x0161:
        r11 = 2;
        goto L_0x0164;
    L_0x0163:
        r11 = 1;
    L_0x0164:
        r23 = r23 + r24;
        r27 = r27 * r23;
        r21 = r21 - r27;
        r25 = r25 + r26;
        r11 = r11 * r25;
        r22 = r22 - r11;
    L_0x0170:
        r26 = r21;
        r27 = r22;
        r3.e();
        r3.e();
        r11 = r3.e();
        r12 = r3.b();
        if (r12 != 0) goto L_0x0186;
    L_0x0184:
        r12 = r10;
        goto L_0x0187;
    L_0x0186:
        r12 = 0;
    L_0x0187:
        if (r12 <= r10) goto L_0x02e4;
    L_0x0189:
        r3.e();
        r3.e();
        r3.e();
        r3.e();
        r3.e();
        r3.e();
        r10 = r3.b();
        if (r10 == 0) goto L_0x01e3;
    L_0x01a1:
        r10 = r3.b();
        if (r10 != 0) goto L_0x01a8;
    L_0x01a7:
        goto L_0x01e3;
    L_0x01a8:
        r10 = 0;
    L_0x01a9:
        r12 = 4;
        if (r10 >= r12) goto L_0x01e3;
    L_0x01ac:
        r4 = 0;
    L_0x01ad:
        r15 = 6;
        if (r4 < r15) goto L_0x01b6;
    L_0x01b0:
        r10 = r10 + 1;
        r4 = 8;
        r15 = 2;
        goto L_0x01a9;
    L_0x01b6:
        r15 = r3.b();
        if (r15 == 0) goto L_0x01d7;
    L_0x01bc:
        r15 = 64;
        r23 = r10 + r10;
        r23 = r23 + 4;
        r12 = 1;
        r14 = r12 << r23;
        r14 = java.lang.Math.min(r15, r14);
        if (r10 <= r12) goto L_0x01ce;
    L_0x01cb:
        r3.d();
    L_0x01ce:
        r12 = 0;
    L_0x01cf:
        if (r12 >= r14) goto L_0x01da;
    L_0x01d1:
        r3.d();
        r12 = r12 + 1;
        goto L_0x01cf;
    L_0x01d7:
        r3.e();
    L_0x01da:
        r14 = 3;
        if (r10 != r14) goto L_0x01df;
    L_0x01dd:
        r12 = 3;
        goto L_0x01e0;
    L_0x01df:
        r12 = 1;
    L_0x01e0:
        r4 = r4 + r12;
        r12 = 4;
        goto L_0x01ad;
    L_0x01e3:
        r4 = 2;
        r3.b(r4);
        r4 = r3.b();
        if (r4 == 0) goto L_0x01fc;
    L_0x01ed:
        r4 = 8;
        r3.b(r4);
        r3.e();
        r3.e();
        r4 = 1;
        r3.b(r4);
    L_0x01fc:
        r4 = r3.e();
        r10 = 0;
        r12 = 0;
        r15 = 0;
    L_0x0203:
        if (r15 < r4) goto L_0x0287;
    L_0x0205:
        r4 = r3.b();
        if (r4 != 0) goto L_0x020d;
    L_0x020b:
        r14 = 2;
        goto L_0x021d;
    L_0x020d:
        r4 = 0;
    L_0x020e:
        r10 = r3.e();
        if (r4 >= r10) goto L_0x020b;
    L_0x0214:
        r10 = 5;
        r15 = r11 + 5;
        r3.b(r15);
        r4 = r4 + 1;
        goto L_0x020e;
    L_0x021d:
        r3.b(r14);
        r4 = r3.b();
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r4 == 0) goto L_0x0271;
    L_0x0228:
        r4 = r3.b();
        if (r4 == 0) goto L_0x0271;
    L_0x022e:
        r4 = 8;
        r4 = r3.c(r4);
        r11 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r4 != r11) goto L_0x024d;
    L_0x0238:
        r11 = 16;
        r4 = r3.c(r11);
        r3 = r3.c(r11);
        if (r4 != 0) goto L_0x0245;
    L_0x0244:
        goto L_0x0271;
    L_0x0245:
        if (r3 == 0) goto L_0x0271;
    L_0x0247:
        r4 = (float) r4;
        r3 = (float) r3;
        r4 = r4 / r3;
        r29 = r4;
        goto L_0x0273;
    L_0x024d:
        r3 = defpackage.nwv.b;
        r3 = r3.length;
        if (r4 >= r3) goto L_0x0259;
    L_0x0252:
        r3 = defpackage.nwv.b;
        r3 = r3[r4];
        r29 = r3;
        goto L_0x0273;
    L_0x0259:
        r3 = new java.lang.StringBuilder;
        r11 = 46;
        r3.<init>(r11);
        r11 = "Unexpected aspect_ratio_idc value: ";
        r3.append(r11);
        r3.append(r4);
        r3 = r3.toString();
        r4 = "H265Reader";
        android.util.Log.w(r4, r3);
    L_0x0271:
        r29 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0273:
        r24 = -1;
        r28 = java.util.Collections.singletonList(r1);
        r23 = "video/hevc";
        r1 = defpackage.nmx.a(r23, r24, r26, r27, r28, r29);
        r13.a(r1);
        r1 = 1;
        r0.a = r1;
        goto L_0x02fe;
    L_0x0287:
        r14 = 1;
        r21 = 8;
        if (r15 == 0) goto L_0x0290;
    L_0x028c:
        r10 = r3.b();
    L_0x0290:
        r23 = r10;
        if (r23 == 0) goto L_0x02af;
    L_0x0294:
        r3.b(r14);
        r3.e();
        r10 = 0;
    L_0x029b:
        if (r10 > r12) goto L_0x02ab;
    L_0x029d:
        r19 = r3.b();
        if (r19 != 0) goto L_0x02a4;
    L_0x02a3:
        goto L_0x02a7;
    L_0x02a4:
        r3.b(r14);
    L_0x02a7:
        r10 = r10 + 1;
        r14 = 1;
        goto L_0x029b;
    L_0x02ab:
        r25 = r1;
        r1 = 1;
        goto L_0x02d2;
    L_0x02af:
        r10 = r3.e();
        r12 = r3.e();
        r24 = r10 + r12;
        r14 = 0;
    L_0x02ba:
        if (r14 >= r10) goto L_0x02ca;
    L_0x02bc:
        r3.e();
        r25 = r1;
        r1 = 1;
        r3.b(r1);
        r14 = r14 + 1;
        r1 = r25;
        goto L_0x02ba;
    L_0x02ca:
        r25 = r1;
        r1 = 1;
        r10 = 0;
    L_0x02ce:
        if (r10 < r12) goto L_0x02da;
    L_0x02d0:
        r12 = r24;
    L_0x02d2:
        r15 = r15 + 1;
        r10 = r23;
        r1 = r25;
        goto L_0x0203;
    L_0x02da:
        r3.e();
        r3.b(r1);
        r10 = r10 + 1;
        r1 = 1;
        goto L_0x02ce;
    L_0x02e4:
        r25 = r1;
        r21 = 8;
        r22 = 2;
        r3.e();
        r3.e();
        r3.e();
        r12 = r12 + 1;
        r4 = 8;
        r15 = 2;
        goto L_0x0187;
    L_0x02fa:
        r20 = r3;
        r18 = r4;
    L_0x02fe:
        r1 = r0.h;
        r1 = r1.b(r7);
        if (r1 == 0) goto L_0x0329;
    L_0x0306:
        r1 = r0.h;
        r3 = r1.b;
        r1 = r1.c;
        r1 = defpackage.nwv.a(r3, r1);
        r3 = r0.m;
        r4 = r0.h;
        r4 = r4.b;
        r3.a(r4, r1);
        r1 = r0.m;
        r3 = 5;
        r1.d(r3);
        r1 = r0.c;
        r3 = r0.m;
        r10 = r16;
        r1.a(r10, r3);
        goto L_0x032b;
    L_0x0329:
        r10 = r16;
    L_0x032b:
        r1 = r0.i;
        r1 = r1.b(r7);
        if (r1 == 0) goto L_0x0353;
    L_0x0333:
        r1 = r0.i;
        r3 = r1.b;
        r1 = r1.c;
        r1 = defpackage.nwv.a(r3, r1);
        r3 = r0.m;
        r4 = r0.i;
        r4 = r4.b;
        r3.a(r4, r1);
        r1 = r0.m;
        r3 = 5;
        r1.d(r3);
        r1 = r0.c;
        r3 = r0.m;
        r1.a(r10, r3);
    L_0x0353:
        r3 = r0.l;
        r1 = r0.a;
        if (r1 == 0) goto L_0x039e;
    L_0x0359:
        r1 = r0.j;
        r7 = 0;
        r1.f = r7;
        r1.g = r7;
        r1.d = r3;
        r1.c = r7;
        r1.a = r8;
        r3 = 32;
        if (r6 < r3) goto L_0x0384;
    L_0x036a:
        r3 = r1.i;
        if (r3 != 0) goto L_0x0377;
    L_0x036e:
        r3 = r1.h;
        if (r3 == 0) goto L_0x0377;
    L_0x0372:
        r1.a(r2);
        r1.h = r7;
    L_0x0377:
        r2 = 34;
        if (r6 > r2) goto L_0x0384;
    L_0x037b:
        r2 = r1.i;
        r3 = 1;
        r2 = r2 ^ r3;
        r1.g = r2;
        r1.i = r3;
        goto L_0x0385;
    L_0x0384:
        r3 = 1;
    L_0x0385:
        r2 = 16;
        if (r6 < r2) goto L_0x0390;
    L_0x0389:
        r2 = 21;
        if (r6 <= r2) goto L_0x038e;
    L_0x038d:
        goto L_0x0390;
    L_0x038e:
        r2 = 1;
        goto L_0x0391;
    L_0x0390:
        r2 = 0;
    L_0x0391:
        r1.b = r2;
        if (r2 != 0) goto L_0x039b;
    L_0x0395:
        r2 = 9;
        if (r6 > r2) goto L_0x039a;
    L_0x0399:
        goto L_0x039b;
    L_0x039a:
        r3 = 0;
    L_0x039b:
        r1.e = r3;
        goto L_0x03ad;
    L_0x039e:
        r1 = r0.e;
        r1.a(r6);
        r1 = r0.f;
        r1.a(r6);
        r1 = r0.g;
        r1.a(r6);
    L_0x03ad:
        r1 = r0.h;
        r1.a(r6);
        r1 = r0.i;
        r1.a(r6);
        r2 = r5 + 3;
        r1 = r31;
        r4 = r18;
        r3 = r20;
        goto L_0x0023;
    L_0x03c1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nub.a(nwz):void");
    }

    private final void a(byte[] bArr, int i, int i2) {
        if (this.a) {
            nue nue = this.j;
            if (nue.e) {
                int i3 = nue.c;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    nue.f = (bArr[i4] & 128) != 0;
                    nue.e = false;
                } else {
                    nue.c = i3 + (i2 - i);
                }
            }
        } else {
            this.e.a(bArr, i, i2);
            this.f.a(bArr, i, i2);
            this.g.a(bArr, i, i2);
        }
        this.h.a(bArr, i, i2);
        this.i.a(bArr, i, i2);
    }
}
