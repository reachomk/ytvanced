package defpackage;

/* renamed from: ojl */
public final class ojl implements ojf {
    private final ojz a;
    private String b;
    private ofy c;
    private ojk d;
    private boolean e;
    private final boolean[] f = new boolean[3];
    private final ojo g = new ojo(32);
    private final ojo h = new ojo(33);
    private final ojo i = new ojo(34);
    private final ojo j = new ojo(39);
    private final ojo k = new ojo(40);
    private long l;
    private long m;
    private final oza n = new oza();

    public ojl(ojz ojz) {
        this.a = ojz;
    }

    public final void b() {
    }

    public final void a() {
        oyw.a(this.f);
        this.g.a();
        this.h.a();
        this.i.a();
        this.j.a();
        this.k.a();
        ojk ojk = this.d;
        ojk.e = false;
        ojk.f = false;
        ojk.g = false;
        ojk.h = false;
        ojk.i = false;
        this.l = 0;
    }

    public final void a(ofo ofo, okl okl) {
        okl.a();
        this.b = okl.c();
        this.c = ofo.a(okl.b(), 2);
        this.d = new ojk(this.c);
        this.a.a(ofo, okl);
    }

    public final void a(long j, int i) {
        this.m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x038c  */
    public final void a(defpackage.oza r29) {
        /*
        r28 = this;
        r0 = r28;
    L_0x0002:
        r1 = r29;
        r2 = r29.b();
        if (r2 <= 0) goto L_0x03af;
    L_0x000a:
        r2 = r1.b;
        r3 = r1.c;
        r4 = r1.a;
        r5 = r0.l;
        r7 = r29.b();
        r7 = (long) r7;
        r5 = r5 + r7;
        r0.l = r5;
        r5 = r0.c;
        r6 = r29.b();
        r5.a(r1, r6);
    L_0x0023:
        if (r2 >= r3) goto L_0x0002;
    L_0x0025:
        r5 = r0.f;
        r5 = defpackage.oyw.a(r4, r2, r3, r5);
        if (r5 != r3) goto L_0x0031;
    L_0x002d:
        r0.a(r4, r2, r3);
        return;
    L_0x0031:
        r6 = defpackage.oyw.c(r4, r5);
        r7 = r5 - r2;
        if (r7 > 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003d;
    L_0x003a:
        r0.a(r4, r2, r5);
    L_0x003d:
        r2 = r3 - r5;
        r8 = r0.l;
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
        r11 = r0.m;
        r13 = r0.e;
        r14 = 1;
        if (r13 == 0) goto L_0x0093;
    L_0x0050:
        r13 = r0.d;
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
        if (r15 != 0) goto L_0x0074;
    L_0x0065:
        r15 = r13.f;
        if (r15 == 0) goto L_0x006a;
    L_0x0069:
        goto L_0x0074;
    L_0x006a:
        r25 = r3;
        r26 = r4;
        r27 = r5;
        r16 = r11;
        goto L_0x02ec;
    L_0x0074:
        r15 = r13.h;
        r16 = r11;
        if (r15 == 0) goto L_0x0083;
    L_0x007a:
        r10 = r13.a;
        r10 = r8 - r10;
        r11 = (int) r10;
        r11 = r11 + r2;
        r13.a(r11);
    L_0x0083:
        r10 = r13.a;
        r13.j = r10;
        r10 = r13.d;
        r13.k = r10;
        r13.h = r14;
        r10 = r13.b;
        r13.l = r10;
        goto L_0x02e6;
    L_0x0093:
        r16 = r11;
        r10 = r0.g;
        r10.b(r7);
        r10 = r0.h;
        r10.b(r7);
        r10 = r0.i;
        r10.b(r7);
        r10 = r0.g;
        r11 = r10.a;
        if (r11 == 0) goto L_0x02e6;
    L_0x00aa:
        r11 = r0.h;
        r12 = r11.a;
        if (r12 == 0) goto L_0x02e6;
    L_0x00b0:
        r12 = r0.i;
        r13 = r12.a;
        if (r13 == 0) goto L_0x02e6;
    L_0x00b6:
        r13 = r0.c;
        r15 = r0.b;
        r14 = r10.c;
        r1 = r11.c;
        r1 = r1 + r14;
        r25 = r3;
        r3 = r12.c;
        r1 = r1 + r3;
        r1 = new byte[r1];
        r3 = r10.b;
        r26 = r4;
        r4 = 0;
        java.lang.System.arraycopy(r3, r4, r1, r4, r14);
        r3 = r11.b;
        r14 = r10.c;
        r27 = r5;
        r5 = r11.c;
        java.lang.System.arraycopy(r3, r4, r1, r14, r5);
        r3 = r12.b;
        r5 = r10.c;
        r10 = r11.c;
        r5 = r5 + r10;
        r10 = r12.c;
        java.lang.System.arraycopy(r3, r4, r1, r5, r10);
        r3 = new oyz;
        r5 = r11.b;
        r10 = r11.c;
        r3.<init>(r5, r4, r10);
        r5 = 44;
        r3.a(r5);
        r14 = 3;
        r10 = r3.c(r14);
        r3.a();
        r5 = 88;
        r3.a(r5);
        r5 = 8;
        r3.a(r5);
        r11 = 0;
        r12 = 0;
    L_0x0107:
        if (r11 >= r10) goto L_0x011c;
    L_0x0109:
        r18 = r3.b();
        if (r18 == 0) goto L_0x0111;
    L_0x010f:
        r12 = r12 + 89;
    L_0x0111:
        r18 = r3.b();
        if (r18 == 0) goto L_0x0119;
    L_0x0117:
        r12 = r12 + 8;
    L_0x0119:
        r11 = r11 + 1;
        goto L_0x0107;
    L_0x011c:
        r3.a(r12);
        if (r10 <= 0) goto L_0x0127;
    L_0x0121:
        r11 = 8 - r10;
        r11 = r11 + r11;
        r3.a(r11);
    L_0x0127:
        r3.e();
        r11 = r3.e();
        if (r11 == r14) goto L_0x0131;
    L_0x0130:
        goto L_0x0134;
    L_0x0131:
        r3.a();
    L_0x0134:
        r12 = r3.e();
        r18 = r3.e();
        r19 = r3.b();
        r4 = 2;
        if (r19 == 0) goto L_0x016f;
    L_0x0143:
        r19 = r3.e();
        r20 = r3.e();
        r21 = r3.e();
        r22 = r3.e();
        r5 = 1;
        if (r11 != r5) goto L_0x0159;
    L_0x0156:
        r24 = 2;
        goto L_0x015e;
    L_0x0159:
        if (r11 != r4) goto L_0x015c;
    L_0x015b:
        goto L_0x0156;
    L_0x015c:
        r24 = 1;
    L_0x015e:
        if (r11 != r5) goto L_0x0162;
    L_0x0160:
        r5 = 2;
        goto L_0x0163;
    L_0x0162:
        r5 = 1;
    L_0x0163:
        r19 = r19 + r20;
        r24 = r24 * r19;
        r12 = r12 - r24;
        r21 = r21 + r22;
        r5 = r5 * r21;
        r18 = r18 - r5;
    L_0x016f:
        r21 = r12;
        r22 = r18;
        r3.e();
        r3.e();
        r5 = r3.e();
        r11 = r3.b();
        if (r11 != 0) goto L_0x0185;
    L_0x0183:
        r11 = r10;
        goto L_0x0186;
    L_0x0185:
        r11 = 0;
    L_0x0186:
        if (r11 <= r10) goto L_0x02d2;
    L_0x0188:
        r3.e();
        r3.e();
        r3.e();
        r3.e();
        r3.e();
        r3.e();
        r10 = r3.b();
        if (r10 == 0) goto L_0x01e1;
    L_0x01a0:
        r10 = r3.b();
        if (r10 != 0) goto L_0x01a7;
    L_0x01a6:
        goto L_0x01e1;
    L_0x01a7:
        r10 = 0;
    L_0x01a8:
        r11 = 4;
        if (r10 >= r11) goto L_0x01e1;
    L_0x01ab:
        r12 = 0;
    L_0x01ac:
        r4 = 6;
        if (r12 < r4) goto L_0x01b3;
    L_0x01af:
        r10 = r10 + 1;
        r4 = 2;
        goto L_0x01a8;
    L_0x01b3:
        r4 = r3.b();
        if (r4 == 0) goto L_0x01d4;
    L_0x01b9:
        r4 = 64;
        r19 = r10 + r10;
        r19 = r19 + 4;
        r11 = 1;
        r14 = r11 << r19;
        r4 = java.lang.Math.min(r4, r14);
        if (r10 <= r11) goto L_0x01cb;
    L_0x01c8:
        r3.d();
    L_0x01cb:
        r11 = 0;
    L_0x01cc:
        if (r11 >= r4) goto L_0x01d7;
    L_0x01ce:
        r3.d();
        r11 = r11 + 1;
        goto L_0x01cc;
    L_0x01d4:
        r3.e();
    L_0x01d7:
        r4 = 3;
        if (r10 != r4) goto L_0x01dc;
    L_0x01da:
        r11 = 3;
        goto L_0x01dd;
    L_0x01dc:
        r11 = 1;
    L_0x01dd:
        r12 = r12 + r11;
        r11 = 4;
        r14 = 3;
        goto L_0x01ac;
    L_0x01e1:
        r3.a(r4);
        r4 = r3.b();
        if (r4 == 0) goto L_0x01f8;
    L_0x01ea:
        r4 = 8;
        r3.a(r4);
        r3.e();
        r3.e();
        r3.a();
    L_0x01f8:
        r12 = r3.e();
        r4 = 0;
        r10 = 0;
        r14 = 0;
    L_0x01ff:
        if (r14 < r12) goto L_0x0285;
    L_0x0201:
        r4 = r3.b();
        if (r4 != 0) goto L_0x0209;
    L_0x0207:
        r11 = 2;
        goto L_0x0219;
    L_0x0209:
        r4 = 0;
    L_0x020a:
        r10 = r3.e();
        if (r4 >= r10) goto L_0x0207;
    L_0x0210:
        r10 = 5;
        r11 = r5 + 5;
        r3.a(r11);
        r4 = r4 + 1;
        goto L_0x020a;
    L_0x0219:
        r3.a(r11);
        r4 = r3.b();
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r4 == 0) goto L_0x026d;
    L_0x0224:
        r4 = r3.b();
        if (r4 == 0) goto L_0x026d;
    L_0x022a:
        r4 = 8;
        r4 = r3.c(r4);
        r10 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r4 != r10) goto L_0x0249;
    L_0x0234:
        r10 = 16;
        r4 = r3.c(r10);
        r3 = r3.c(r10);
        if (r4 != 0) goto L_0x0241;
    L_0x0240:
        goto L_0x026d;
    L_0x0241:
        if (r3 == 0) goto L_0x026d;
    L_0x0243:
        r4 = (float) r4;
        r3 = (float) r3;
        r4 = r4 / r3;
        r24 = r4;
        goto L_0x026f;
    L_0x0249:
        r3 = defpackage.oyw.b;
        r3 = r3.length;
        if (r4 >= r3) goto L_0x0255;
    L_0x024e:
        r3 = defpackage.oyw.b;
        r3 = r3[r4];
        r24 = r3;
        goto L_0x026f;
    L_0x0255:
        r3 = new java.lang.StringBuilder;
        r10 = 46;
        r3.<init>(r10);
        r10 = "Unexpected aspect_ratio_idc value: ";
        r3.append(r10);
        r3.append(r4);
        r3 = r3.toString();
        r4 = "H265Reader";
        defpackage.oyp.a(r4, r3);
    L_0x026d:
        r24 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x026f:
        r20 = 0;
        r23 = java.util.Collections.singletonList(r1);
        r19 = "video/hevc";
        r18 = r15;
        r1 = defpackage.nzw.a(r18, r19, r20, r21, r22, r23, r24);
        r13.a(r1);
        r1 = 1;
        r0.e = r1;
        goto L_0x02ec;
    L_0x0285:
        r11 = 2;
        r18 = 8;
        if (r14 == 0) goto L_0x028e;
    L_0x028a:
        r4 = r3.b();
    L_0x028e:
        r19 = r4;
        if (r19 == 0) goto L_0x02a8;
    L_0x0292:
        r3.a();
        r3.e();
        r4 = 0;
    L_0x0299:
        if (r4 > r10) goto L_0x02c3;
    L_0x029b:
        r20 = r3.b();
        if (r20 != 0) goto L_0x02a2;
    L_0x02a1:
        goto L_0x02a5;
    L_0x02a2:
        r3.a();
    L_0x02a5:
        r4 = r4 + 1;
        goto L_0x0299;
    L_0x02a8:
        r4 = r3.e();
        r10 = r3.e();
        r20 = r4 + r10;
        r11 = 0;
    L_0x02b3:
        if (r11 >= r4) goto L_0x02be;
    L_0x02b5:
        r3.e();
        r3.a();
        r11 = r11 + 1;
        goto L_0x02b3;
    L_0x02be:
        r4 = 0;
    L_0x02bf:
        if (r4 < r10) goto L_0x02c9;
    L_0x02c1:
        r10 = r20;
    L_0x02c3:
        r14 = r14 + 1;
        r4 = r19;
        goto L_0x01ff;
    L_0x02c9:
        r3.e();
        r3.a();
        r4 = r4 + 1;
        goto L_0x02bf;
    L_0x02d2:
        r4 = 3;
        r18 = 8;
        r24 = 2;
        r3.e();
        r3.e();
        r3.e();
        r11 = r11 + 1;
        r4 = 2;
        r14 = 3;
        goto L_0x0186;
    L_0x02e6:
        r25 = r3;
        r26 = r4;
        r27 = r5;
    L_0x02ec:
        r1 = r0.j;
        r1 = r1.b(r7);
        if (r1 == 0) goto L_0x0317;
    L_0x02f4:
        r1 = r0.j;
        r3 = r1.b;
        r1 = r1.c;
        r1 = defpackage.oyw.a(r3, r1);
        r3 = r0.n;
        r4 = r0.j;
        r4 = r4.b;
        r3.a(r4, r1);
        r1 = r0.n;
        r3 = 5;
        r1.d(r3);
        r1 = r0.a;
        r3 = r0.n;
        r4 = r16;
        r1.a(r4, r3);
        goto L_0x0319;
    L_0x0317:
        r4 = r16;
    L_0x0319:
        r1 = r0.k;
        r1 = r1.b(r7);
        if (r1 == 0) goto L_0x0341;
    L_0x0321:
        r1 = r0.k;
        r3 = r1.b;
        r1 = r1.c;
        r1 = defpackage.oyw.a(r3, r1);
        r3 = r0.n;
        r7 = r0.k;
        r7 = r7.b;
        r3.a(r7, r1);
        r1 = r0.n;
        r3 = 5;
        r1.d(r3);
        r1 = r0.a;
        r3 = r0.n;
        r1.a(r4, r3);
    L_0x0341:
        r3 = r0.m;
        r1 = r0.e;
        if (r1 == 0) goto L_0x038c;
    L_0x0347:
        r1 = r0.d;
        r5 = 0;
        r1.f = r5;
        r1.g = r5;
        r1.d = r3;
        r1.c = r5;
        r1.a = r8;
        r3 = 32;
        if (r6 < r3) goto L_0x0372;
    L_0x0358:
        r3 = r1.i;
        if (r3 != 0) goto L_0x0365;
    L_0x035c:
        r3 = r1.h;
        if (r3 == 0) goto L_0x0365;
    L_0x0360:
        r1.a(r2);
        r1.h = r5;
    L_0x0365:
        r2 = 34;
        if (r6 > r2) goto L_0x0372;
    L_0x0369:
        r2 = r1.i;
        r4 = 1;
        r2 = r2 ^ r4;
        r1.g = r2;
        r1.i = r4;
        goto L_0x0373;
    L_0x0372:
        r4 = 1;
    L_0x0373:
        r2 = 16;
        if (r6 < r2) goto L_0x037e;
    L_0x0377:
        r2 = 21;
        if (r6 <= r2) goto L_0x037c;
    L_0x037b:
        goto L_0x037e;
    L_0x037c:
        r2 = 1;
        goto L_0x037f;
    L_0x037e:
        r2 = 0;
    L_0x037f:
        r1.b = r2;
        if (r2 != 0) goto L_0x0389;
    L_0x0383:
        r2 = 9;
        if (r6 > r2) goto L_0x0388;
    L_0x0387:
        goto L_0x0389;
    L_0x0388:
        r4 = 0;
    L_0x0389:
        r1.e = r4;
        goto L_0x039b;
    L_0x038c:
        r1 = r0.g;
        r1.a(r6);
        r1 = r0.h;
        r1.a(r6);
        r1 = r0.i;
        r1.a(r6);
    L_0x039b:
        r1 = r0.j;
        r1.a(r6);
        r1 = r0.k;
        r1.a(r6);
        r2 = r27 + 3;
        r1 = r29;
        r3 = r25;
        r4 = r26;
        goto L_0x0023;
    L_0x03af:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojl.a(oza):void");
    }

    private final void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            ojk ojk = this.d;
            if (ojk.e) {
                int i3 = ojk.c;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    ojk.f = (bArr[i4] & 128) != 0;
                    ojk.e = false;
                } else {
                    ojk.c = i3 + (i2 - i);
                }
            }
        } else {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }
}
