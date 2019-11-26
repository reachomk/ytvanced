package defpackage;

import java.io.EOFException;

/* renamed from: ogv */
public final class ogv implements ofm {
    private static final omn a = ogu.a;
    private static final int b = ozp.f("Xing");
    private static final int c = ozp.f("Info");
    private static final int d = ozp.f("VBRI");
    private final int e;
    private final long f;
    private final oza g;
    private final ofs h;
    private final ofq i;
    private final oft j;
    private ofo k;
    private ofy l;
    private int m;
    private olj n;
    private ogx o;
    private long p;
    private long q;
    private int r;

    public ogv() {
        this((byte) 0);
    }

    private static boolean a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    public final void c() {
    }

    public ogv(byte b) {
        this.e = 0;
        this.f = -9223372036854775807L;
        this.g = new oza(10);
        this.h = new ofs();
        this.i = new ofq();
        this.p = -9223372036854775807L;
        this.j = new oft();
    }

    public final boolean a(ofp ofp) {
        return a(ofp, true);
    }

    public final void a(ofo ofo) {
        this.k = ofo;
        this.l = this.k.a(0, 1);
        this.k.a();
    }

    public final void a(long j, long j2) {
        this.m = 0;
        this.p = -9223372036854775807L;
        this.q = 0;
        this.r = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b0  */
    /* JADX WARNING: Missing block: B:22:0x005b, code skipped:
            if (r10 != c) goto L_0x005e;
     */
    public final int a(defpackage.ofp r39, defpackage.ofv r40) {
        /*
        r38 = this;
        r0 = r38;
        r1 = r39;
        r2 = r0.m;
        r3 = -1;
        r4 = 0;
        if (r2 != 0) goto L_0x000f;
    L_0x000a:
        r0.a(r1, r4);	 Catch:{ EOFException -> 0x000e }
        goto L_0x000f;
    L_0x000e:
        return r3;
    L_0x000f:
        r2 = r0.o;
        r7 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r9 = 1;
        if (r2 == 0) goto L_0x001a;
    L_0x0017:
        r3 = r1;
        goto L_0x02f6;
    L_0x001a:
        r2 = new oza;
        r10 = r0.h;
        r10 = r10.c;
        r2.<init>(r10);
        r10 = r2.a;
        r11 = r0.h;
        r11 = r11.c;
        r1.c(r10, r4, r11);
        r10 = r0.h;
        r11 = r10.a;
        r11 = r11 & r9;
        r12 = 36;
        r13 = 21;
        if (r11 == 0) goto L_0x003f;
    L_0x0037:
        r10 = r10.e;
        if (r10 != r9) goto L_0x003c;
    L_0x003b:
        goto L_0x0047;
    L_0x003c:
        r13 = 36;
        goto L_0x0047;
    L_0x003f:
        r10 = r10.e;
        if (r10 != r9) goto L_0x0047;
    L_0x0043:
        r10 = 13;
        r13 = 13;
    L_0x0047:
        r10 = r2.c;
        r11 = r13 + 4;
        if (r10 >= r11) goto L_0x004e;
    L_0x004d:
        goto L_0x005e;
    L_0x004e:
        r2.c(r13);
        r10 = r2.k();
        r11 = b;
        if (r10 == r11) goto L_0x0072;
    L_0x0059:
        r11 = c;
        if (r10 != r11) goto L_0x005e;
    L_0x005d:
        goto L_0x0072;
    L_0x005e:
        r10 = r2.c;
        r11 = 40;
        if (r10 < r11) goto L_0x0071;
    L_0x0064:
        r2.c(r12);
        r10 = r2.k();
        r11 = d;
        if (r10 != r11) goto L_0x0071;
    L_0x006f:
        r10 = r11;
        goto L_0x0072;
    L_0x0071:
        r10 = 0;
    L_0x0072:
        r11 = b;
        r16 = 0;
        if (r10 == r11) goto L_0x0162;
    L_0x0078:
        r11 = c;
        if (r10 == r11) goto L_0x0162;
    L_0x007c:
        r11 = d;
        if (r10 == r11) goto L_0x0088;
    L_0x0080:
        r39.a();
        r3 = r1;
        r1 = r16;
        goto L_0x024c;
    L_0x0088:
        r10 = r1;
        r10 = (defpackage.ofl) r10;
        r5 = r10.b;
        r10 = r10.c;
        r13 = r0.h;
        r3 = 10;
        r2.d(r3);
        r3 = r2.k();
        if (r3 <= 0) goto L_0x0153;
    L_0x009c:
        r4 = r13.d;
        r14 = (long) r3;
        r3 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        if (r4 < r3) goto L_0x00a6;
    L_0x00a3:
        r3 = 1152; // 0x480 float:1.614E-42 double:5.69E-321;
        goto L_0x00a8;
    L_0x00a6:
        r3 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
    L_0x00a8:
        r24 = r10;
        r9 = (long) r3;
        r20 = r9 * r7;
        r3 = (long) r4;
        r18 = r14;
        r22 = r3;
        r29 = defpackage.ozp.b(r18, r20, r22);
        r3 = r2.e();
        r4 = r2.e();
        r9 = r2.e();
        r10 = 2;
        r2.d(r10);
        r11 = r13.c;
        r13 = (long) r11;
        r13 = r24 + r13;
        r11 = new long[r3];
        r15 = new long[r3];
        r20 = r13;
        r12 = r24;
        r7 = 0;
    L_0x00d4:
        if (r7 >= r3) goto L_0x0117;
    L_0x00d6:
        r14 = r9;
        r8 = (long) r7;
        r8 = r8 * r29;
        r0 = (long) r3;
        r8 = r8 / r0;
        r11[r7] = r8;
        r0 = r20;
        r8 = java.lang.Math.max(r12, r0);
        r15[r7] = r8;
        r9 = r14;
        r8 = 1;
        if (r9 == r8) goto L_0x0102;
    L_0x00ea:
        if (r9 == r10) goto L_0x00fd;
    L_0x00ec:
        r8 = 3;
        if (r9 == r8) goto L_0x00f8;
    L_0x00ef:
        r14 = 4;
        if (r9 == r14) goto L_0x00f3;
    L_0x00f2:
        goto L_0x0153;
    L_0x00f3:
        r14 = r2.o();
        goto L_0x0106;
    L_0x00f8:
        r14 = r2.h();
        goto L_0x0106;
    L_0x00fd:
        r14 = r2.e();
        goto L_0x0106;
    L_0x0102:
        r14 = r2.d();
    L_0x0106:
        r14 = r14 * r4;
        r20 = r9;
        r8 = (long) r14;
        r12 = r12 + r8;
        r7 = r7 + 1;
        r9 = r20;
        r20 = r0;
        r0 = r38;
        r1 = r39;
        goto L_0x00d4;
    L_0x0117:
        r7 = -1;
        r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r0 != 0) goto L_0x011e;
    L_0x011d:
        goto L_0x0142;
    L_0x011e:
        r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1));
        if (r0 == 0) goto L_0x0142;
    L_0x0122:
        r0 = new java.lang.StringBuilder;
        r1 = 67;
        r0.<init>(r1);
        r1 = "VBRI data size mismatch: ";
        r0.append(r1);
        r0.append(r5);
        r1 = ", ";
        r0.append(r1);
        r0.append(r12);
        r0 = r0.toString();
        r1 = "VbriSeeker";
        defpackage.oyp.a(r1, r0);
    L_0x0142:
        r0 = new ogw;
        r26 = r0;
        r27 = r11;
        r28 = r15;
        r31 = r12;
        r26.<init>(r27, r28, r29, r31);
        r1 = r0;
        r0 = r38;
        goto L_0x0157;
    L_0x0153:
        r0 = r38;
        r1 = r16;
    L_0x0157:
        r2 = r0.h;
        r2 = r2.c;
        r3 = r39;
        r3.a(r2);
        goto L_0x024c;
    L_0x0162:
        r3 = r1;
        r1 = r3;
        r1 = (defpackage.ofl) r1;
        r4 = r1.b;
        r6 = r1.c;
        r1 = r0.h;
        r8 = r1.g;
        r9 = r1.d;
        r11 = r2.k();
        r12 = r11 & 1;
        r14 = 1;
        if (r12 != r14) goto L_0x01f9;
    L_0x0179:
        r12 = r2.o();
        if (r12 == 0) goto L_0x01f9;
    L_0x017f:
        r14 = (long) r12;
        r20 = r13;
        r12 = (long) r8;
        r18 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r26 = r12 * r18;
        r8 = (long) r9;
        r24 = r14;
        r28 = r8;
        r28 = defpackage.ozp.b(r24, r26, r28);
        r8 = 6;
        r9 = r11 & 6;
        if (r9 == r8) goto L_0x01a4;
    L_0x0196:
        r2 = new ogz;
        r1 = r1.c;
        r24 = r2;
        r25 = r6;
        r27 = r1;
        r24.<init>(r25, r27, r28);
        goto L_0x01fd;
    L_0x01a4:
        r8 = r2.o();
        r8 = (long) r8;
        r11 = 100;
        r12 = new long[r11];
        r13 = 0;
    L_0x01ae:
        if (r13 >= r11) goto L_0x01ba;
    L_0x01b0:
        r14 = r2.d();
        r14 = (long) r14;
        r12[r13] = r14;
        r13 = r13 + 1;
        goto L_0x01ae;
    L_0x01ba:
        r13 = -1;
        r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r2 != 0) goto L_0x01c1;
    L_0x01c0:
        goto L_0x01e7;
    L_0x01c1:
        r13 = r6 + r8;
        r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1));
        if (r2 == 0) goto L_0x01e7;
    L_0x01c7:
        r2 = new java.lang.StringBuilder;
        r11 = 67;
        r2.<init>(r11);
        r11 = "XING data size mismatch: ";
        r2.append(r11);
        r2.append(r4);
        r4 = ", ";
        r2.append(r4);
        r2.append(r13);
        r2 = r2.toString();
        r4 = "XingSeeker";
        defpackage.oyp.a(r4, r2);
    L_0x01e7:
        r2 = new ogz;
        r1 = r1.c;
        r24 = r2;
        r25 = r6;
        r27 = r1;
        r30 = r8;
        r32 = r12;
        r24.<init>(r25, r27, r28, r30, r32);
        goto L_0x01fd;
    L_0x01f9:
        r20 = r13;
        r2 = r16;
    L_0x01fd:
        if (r2 == 0) goto L_0x0233;
    L_0x01ff:
        r1 = r0.i;
        r1 = r1.a();
        if (r1 != 0) goto L_0x0233;
    L_0x0207:
        r39.a();
        r13 = r20;
        r13 = r13 + 141;
        r3.b(r13);
        r1 = r0.g;
        r1 = r1.a;
        r4 = 3;
        r5 = 0;
        r3.c(r1, r5, r4);
        r1 = r0.g;
        r1.c(r5);
        r1 = r0.i;
        r4 = r0.g;
        r4 = r4.h();
        r5 = r4 >> 12;
        r4 = r4 & 4095;
        if (r5 > 0) goto L_0x022f;
    L_0x022d:
        if (r4 <= 0) goto L_0x0233;
    L_0x022f:
        r1.a = r5;
        r1.b = r4;
    L_0x0233:
        r1 = r0.h;
        r1 = r1.c;
        r3.a(r1);
        if (r2 == 0) goto L_0x024b;
    L_0x023c:
        r1 = r2.aS_();
        if (r1 != 0) goto L_0x024b;
    L_0x0242:
        r1 = c;
        if (r10 != r1) goto L_0x024b;
    L_0x0246:
        r1 = r38.c(r39);
        goto L_0x024c;
    L_0x024b:
        r1 = r2;
    L_0x024c:
        r2 = r0.n;
        r4 = r3;
        r4 = (defpackage.ofl) r4;
        r4 = r4.c;
        if (r2 != 0) goto L_0x0258;
    L_0x0255:
        r2 = r16;
        goto L_0x02a3;
    L_0x0258:
        r6 = r2.a();
        r7 = 0;
    L_0x025d:
        if (r7 >= r6) goto L_0x0255;
    L_0x025f:
        r8 = r2.a(r7);
        r9 = r8 instanceof defpackage.omq;
        if (r9 == 0) goto L_0x02a0;
    L_0x0267:
        r8 = (defpackage.omq) r8;
        r2 = r8.c;
        r2 = r2.length;
        r6 = r2 + 1;
        r7 = new long[r6];
        r6 = new long[r6];
        r9 = 0;
        r7[r9] = r4;
        r10 = 0;
        r6[r9] = r10;
        r9 = r4;
        r4 = 1;
        r11 = 0;
    L_0x027d:
        if (r4 > r2) goto L_0x029a;
    L_0x027f:
        r5 = r4 + -1;
        r13 = r8.a;
        r14 = r8.c;
        r14 = r14[r5];
        r13 = r13 + r14;
        r13 = (long) r13;
        r9 = r9 + r13;
        r13 = r8.b;
        r14 = r8.e;
        r5 = r14[r5];
        r13 = r13 + r5;
        r13 = (long) r13;
        r11 = r11 + r13;
        r7[r4] = r9;
        r6[r4] = r11;
        r4 = r4 + 1;
        goto L_0x027d;
    L_0x029a:
        r2 = new ogs;
        r2.<init>(r7, r6);
        goto L_0x02a3;
    L_0x02a0:
        r7 = r7 + 1;
        goto L_0x025d;
    L_0x02a3:
        if (r2 == 0) goto L_0x02a8;
    L_0x02a5:
        r0.o = r2;
        goto L_0x02ac;
    L_0x02a8:
        if (r1 == 0) goto L_0x02ac;
    L_0x02aa:
        r0.o = r1;
    L_0x02ac:
        r1 = r0.o;
        if (r1 == 0) goto L_0x02b4;
    L_0x02b0:
        r1.aS_();
        goto L_0x02ba;
    L_0x02b4:
        r1 = r38.c(r39);
        r0.o = r1;
    L_0x02ba:
        r1 = r0.k;
        r2 = r0.o;
        r1.a(r2);
        r1 = r0.l;
        r2 = r0.h;
        r4 = r2.b;
        r5 = r2.e;
        r2 = r2.d;
        r6 = r0.i;
        r24 = 0;
        r26 = -1;
        r27 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r30 = -1;
        r7 = r6.a;
        r6 = r6.b;
        r33 = 0;
        r34 = 0;
        r35 = 0;
        r36 = 0;
        r8 = r0.n;
        r25 = r4;
        r28 = r5;
        r29 = r2;
        r31 = r7;
        r32 = r6;
        r37 = r8;
        r2 = defpackage.nzw.a(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37);
        r1.a(r2);
    L_0x02f6:
        r1 = r0.r;
        if (r1 != 0) goto L_0x0367;
    L_0x02fa:
        r39.a();
        r1 = r38.b(r39);
        if (r1 != 0) goto L_0x0364;
    L_0x0303:
        r1 = r0.g;
        r2 = 0;
        r1.c(r2);
        r1 = r0.g;
        r1 = r1.k();
        r2 = r0.m;
        r4 = (long) r2;
        r2 = defpackage.ogv.a(r1, r4);
        if (r2 == 0) goto L_0x035a;
    L_0x0318:
        r2 = defpackage.ofs.a(r1);
        r4 = -1;
        if (r2 != r4) goto L_0x0320;
    L_0x031f:
        goto L_0x035a;
    L_0x0320:
        r2 = r0.h;
        defpackage.ofs.a(r1, r2);
        r1 = r0.p;
        r4 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x0353;
    L_0x0330:
        r1 = r0.o;
        r2 = r3;
        r2 = (defpackage.ofl) r2;
        r6 = r2.c;
        r1 = r1.b(r6);
        r0.p = r1;
        r1 = r0.f;
        r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0353;
    L_0x0343:
        r1 = r0.o;
        r4 = 0;
        r1 = r1.b(r4);
        r4 = r0.p;
        r6 = r0.f;
        r6 = r6 - r1;
        r4 = r4 + r6;
        r0.p = r4;
    L_0x0353:
        r1 = r0.h;
        r1 = r1.c;
        r0.r = r1;
        goto L_0x0367;
    L_0x035a:
        r2 = 1;
        r3.a(r2);
        r1 = 0;
        r0.m = r1;
    L_0x0361:
        r17 = 0;
        goto L_0x03a2;
    L_0x0364:
        r17 = -1;
        goto L_0x03a2;
    L_0x0367:
        r2 = 1;
        r4 = r0.l;
        r1 = r4.a(r3, r1, r2);
        r2 = -1;
        if (r1 == r2) goto L_0x0364;
    L_0x0371:
        r2 = r0.r;
        r2 = r2 - r1;
        r0.r = r2;
        if (r2 <= 0) goto L_0x0379;
    L_0x0378:
        goto L_0x0361;
    L_0x0379:
        r1 = r0.p;
        r3 = r0.q;
        r5 = r0.h;
        r6 = r5.d;
        r7 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r3 = r3 * r7;
        r6 = (long) r6;
        r3 = r3 / r6;
        r6 = r0.l;
        r7 = r1 + r3;
        r9 = 1;
        r10 = r5.c;
        r11 = 0;
        r12 = 0;
        r6.a(r7, r9, r10, r11, r12);
        r1 = r0.q;
        r3 = r0.h;
        r3 = r3.g;
        r3 = (long) r3;
        r1 = r1 + r3;
        r0.q = r1;
        r1 = 0;
        r0.r = r1;
        return r1;
    L_0x03a2:
        return r17;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogv.a(ofp, ofv):int");
    }

    private final boolean a(ofp ofp, boolean z) {
        int b;
        int i;
        int i2;
        int i3;
        int i4 = !z ? 131072 : 16384;
        ofp.a();
        if (((ofl) ofp).c == 0) {
            this.n = this.j.a(ofp, null);
            olj olj = this.n;
            if (olj != null) {
                this.i.a(olj);
            }
            b = (int) ofp.b();
            if (!z) {
                ofp.a(b);
            }
            i = b;
            i2 = 0;
            b = 0;
            i3 = 0;
        } else {
            i2 = 0;
            b = 0;
            i3 = 0;
            i = 0;
        }
        while (!b(ofp)) {
            this.g.c(0);
            int k = this.g.k();
            if (b == 0 || ogv.a(k, (long) b)) {
                int a = ofs.a(k);
                if (a != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    }
                    ofs.a(k, this.h);
                    b = k;
                    ofp.b(a - 4);
                }
            }
            i2 = i3 + 1;
            if (i3 != i4) {
                if (z) {
                    ofp.a();
                    ofp.b(i + i2);
                } else {
                    ofp.a(1);
                }
                i3 = i2;
                i2 = 0;
                b = 0;
            } else if (z) {
                return false;
            } else {
                throw new oae("Searched too many bytes.");
            }
        }
        if (i2 <= 0) {
            throw new EOFException();
        }
        if (z) {
            ofp.a(i + i3);
        } else {
            ofp.a();
        }
        this.m = b;
        return true;
    }

    private final boolean b(ofp ofp) {
        ogx ogx = this.o;
        if (ogx != null) {
            long c = ogx.c();
            if (c != -1 && ofp.b() > c - 4) {
                return true;
            }
        }
        try {
            return ofp.b(this.g.a, 0, 4, true) ^ 1;
        } catch (EOFException unused) {
            return true;
        }
    }

    private final ogx c(ofp ofp) {
        ofp.c(this.g.a, 0, 4);
        this.g.c(0);
        ofs.a(this.g.k(), this.h);
        ofl ofl = (ofl) ofp;
        return new ogt(ofl.b, ofl.c, this.h);
    }
}
