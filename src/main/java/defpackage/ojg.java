package defpackage;

/* renamed from: ojg */
public final class ojg implements ojf {
    private final ojz a;
    private final boolean b;
    private final boolean c;
    private final ojo d = new ojo(7);
    private final ojo e = new ojo(8);
    private final ojo f = new ojo(6);
    private long g;
    private final boolean[] h = new boolean[3];
    private String i;
    private ofy j;
    private ojj k;
    private boolean l;
    private long m;
    private boolean n;
    private final oza o = new oza();

    public ojg(ojz ojz, boolean z, boolean z2) {
        this.a = ojz;
        this.b = z;
        this.c = z2;
    }

    public final void b() {
    }

    public final void a() {
        oyw.a(this.h);
        this.d.a();
        this.e.a();
        this.f.a();
        this.k.a();
        this.g = 0;
        this.n = false;
    }

    public final void a(ofo ofo, okl okl) {
        okl.a();
        this.i = okl.c();
        this.j = ofo.a(okl.b(), 2);
        this.k = new ojj(this.j, this.b, this.c);
        this.a.a(ofo, okl);
    }

    public final void a(long j, int i) {
        this.m = j;
        this.n |= (i & 2) != 0 ? 1 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027e A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0264 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0264 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027e A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0223 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027e A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0264 A:{SKIP} */
    /* JADX WARNING: Missing block: B:78:0x01d3, code skipped:
            if (r4.l == r6.l) goto L_0x0205;
     */
    /* JADX WARNING: Missing block: B:112:0x025d, code skipped:
            if (r5 != 1) goto L_0x025f;
     */
    public final void a(defpackage.oza r26) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r26;
        r2 = r1.b;
        r3 = r1.c;
        r4 = r1.a;
        r5 = r0.g;
        r7 = r26.b();
        r7 = (long) r7;
        r5 = r5 + r7;
        r0.g = r5;
        r5 = r0.j;
        r6 = r26.b();
        r5.a(r1, r6);
    L_0x001d:
        r1 = r0.h;
        r1 = defpackage.oyw.a(r4, r2, r3, r1);
        if (r1 != r3) goto L_0x0029;
    L_0x0025:
        r0.a(r4, r2, r3);
        return;
    L_0x0029:
        r5 = defpackage.oyw.b(r4, r1);
        r6 = r1 - r2;
        if (r6 > 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0035;
    L_0x0032:
        r0.a(r4, r2, r1);
    L_0x0035:
        r2 = r3 - r1;
        r7 = r0.g;
        r9 = (long) r2;
        r7 = r7 - r9;
        if (r6 >= 0) goto L_0x003f;
    L_0x003d:
        r6 = -r6;
        goto L_0x0040;
    L_0x003f:
        r6 = 0;
    L_0x0040:
        r10 = r0.m;
        r12 = r0.l;
        if (r12 == 0) goto L_0x0054;
    L_0x0046:
        r12 = r0.k;
        r12 = r12.c;
        if (r12 != 0) goto L_0x0054;
    L_0x004c:
        r24 = r1;
        r22 = r3;
        r23 = r4;
        goto L_0x0123;
    L_0x0054:
        r12 = r0.d;
        r12.b(r6);
        r12 = r0.e;
        r12.b(r6);
        r12 = r0.l;
        r14 = 3;
        if (r12 != 0) goto L_0x00ec;
    L_0x0063:
        r12 = r0.d;
        r12 = r12.a;
        if (r12 == 0) goto L_0x004c;
    L_0x0069:
        r12 = r0.e;
        r12 = r12.a;
        if (r12 == 0) goto L_0x004c;
    L_0x006f:
        r12 = new java.util.ArrayList;
        r12.<init>();
        r15 = r0.d;
        r9 = r15.b;
        r15 = r15.c;
        r9 = java.util.Arrays.copyOf(r9, r15);
        r12.add(r9);
        r9 = r0.e;
        r15 = r9.b;
        r9 = r9.c;
        r9 = java.util.Arrays.copyOf(r15, r9);
        r12.add(r9);
        r9 = r0.d;
        r15 = r9.b;
        r9 = r9.c;
        r9 = defpackage.oyw.a(r15, r14, r9);
        r14 = r0.e;
        r15 = r14.b;
        r14 = r14.c;
        r14 = defpackage.oyw.d(r15, r14);
        r15 = r0.j;
        r13 = r0.i;
        r22 = r3;
        r3 = r9.a;
        r23 = r4;
        r4 = r9.b;
        r16 = r15;
        r15 = r9.c;
        r17 = defpackage.oyd.a(r3, r4, r15);
        r3 = r9.e;
        r4 = r9.f;
        r15 = r9.g;
        r18 = "video/avc";
        r24 = r1;
        r21 = r15;
        r1 = r16;
        r15 = r13;
        r16 = r18;
        r18 = r3;
        r19 = r4;
        r20 = r12;
        r3 = defpackage.nzw.a(r15, r16, r17, r18, r19, r20, r21);
        r1.a(r3);
        r1 = 1;
        r0.l = r1;
        r1 = r0.k;
        r1.a(r9);
        r1 = r0.k;
        r1.a(r14);
        r1 = r0.d;
        r1.a();
        r1 = r0.e;
        r1.a();
        goto L_0x0123;
    L_0x00ec:
        r24 = r1;
        r22 = r3;
        r23 = r4;
        r1 = r0.d;
        r3 = r1.a;
        if (r3 == 0) goto L_0x010b;
    L_0x00f8:
        r3 = r1.b;
        r1 = r1.c;
        r1 = defpackage.oyw.a(r3, r14, r1);
        r3 = r0.k;
        r3.a(r1);
        r1 = r0.d;
        r1.a();
        goto L_0x0123;
    L_0x010b:
        r1 = r0.e;
        r3 = r1.a;
        if (r3 == 0) goto L_0x0123;
    L_0x0111:
        r3 = r1.b;
        r1 = r1.c;
        r1 = defpackage.oyw.d(r3, r1);
        r3 = r0.k;
        r3.a(r1);
        r1 = r0.e;
        r1.a();
    L_0x0123:
        r1 = r0.f;
        r1 = r1.b(r6);
        if (r1 == 0) goto L_0x014b;
    L_0x012b:
        r1 = r0.f;
        r3 = r1.b;
        r1 = r1.c;
        r1 = defpackage.oyw.a(r3, r1);
        r3 = r0.o;
        r4 = r0.f;
        r4 = r4.b;
        r3.a(r4, r1);
        r1 = r0.o;
        r3 = 4;
        r1.c(r3);
        r1 = r0.a;
        r3 = r0.o;
        r1.a(r10, r3);
    L_0x014b:
        r1 = r0.k;
        r3 = r0.l;
        r9 = r0.n;
        r4 = r1.i;
        r6 = 9;
        if (r4 == r6) goto L_0x01d5;
    L_0x0157:
        r4 = r1.c;
        if (r4 == 0) goto L_0x0205;
    L_0x015b:
        r4 = r1.n;
        r6 = r1.m;
        r10 = r4.a;
        if (r10 == 0) goto L_0x0205;
    L_0x0163:
        r10 = r6.a;
        if (r10 == 0) goto L_0x01d5;
    L_0x0167:
        r10 = r4.f;
        r11 = r6.f;
        if (r10 != r11) goto L_0x01d5;
    L_0x016d:
        r10 = r4.g;
        r11 = r6.g;
        if (r10 != r11) goto L_0x01d5;
    L_0x0173:
        r10 = r4.h;
        r11 = r6.h;
        if (r10 != r11) goto L_0x01d5;
    L_0x0179:
        r10 = r4.i;
        if (r10 != 0) goto L_0x017e;
    L_0x017d:
        goto L_0x0189;
    L_0x017e:
        r10 = r6.i;
        if (r10 == 0) goto L_0x0189;
    L_0x0182:
        r10 = r4.j;
        r11 = r6.j;
        if (r10 == r11) goto L_0x0189;
    L_0x0188:
        goto L_0x01d5;
    L_0x0189:
        r10 = r4.d;
        r11 = r6.d;
        if (r10 != r11) goto L_0x0190;
    L_0x018f:
        goto L_0x0195;
    L_0x0190:
        if (r10 == 0) goto L_0x01d5;
    L_0x0192:
        if (r11 != 0) goto L_0x0195;
    L_0x0194:
        goto L_0x01d5;
    L_0x0195:
        r10 = r4.c;
        r10 = r10.k;
        if (r10 != 0) goto L_0x01ae;
    L_0x019b:
        r10 = r6.c;
        r10 = r10.k;
        if (r10 != 0) goto L_0x01c4;
    L_0x01a1:
        r10 = r4.m;
        r11 = r6.m;
        if (r10 != r11) goto L_0x01d5;
    L_0x01a7:
        r10 = r4.n;
        r11 = r6.n;
        if (r10 != r11) goto L_0x01d5;
    L_0x01ad:
        goto L_0x01c4;
    L_0x01ae:
        r11 = 1;
        if (r10 != r11) goto L_0x01c4;
    L_0x01b1:
        r10 = r6.c;
        r10 = r10.k;
        if (r10 != r11) goto L_0x01c4;
    L_0x01b7:
        r10 = r4.o;
        r11 = r6.o;
        if (r10 != r11) goto L_0x01d5;
    L_0x01bd:
        r10 = r4.p;
        r11 = r6.p;
        if (r10 == r11) goto L_0x01c4;
    L_0x01c3:
        goto L_0x01d5;
    L_0x01c4:
        r10 = r4.k;
        r11 = r6.k;
        if (r10 != r11) goto L_0x01d5;
    L_0x01ca:
        if (r10 != 0) goto L_0x01cd;
    L_0x01cc:
        goto L_0x0205;
    L_0x01cd:
        if (r11 == 0) goto L_0x0205;
    L_0x01cf:
        r4 = r4.l;
        r6 = r6.l;
        if (r4 == r6) goto L_0x0205;
    L_0x01d5:
        if (r3 != 0) goto L_0x01d8;
    L_0x01d7:
        goto L_0x01f7;
    L_0x01d8:
        r3 = r1.o;
        if (r3 == 0) goto L_0x01f7;
    L_0x01dc:
        r3 = r1.j;
        r13 = r1.r;
        r10 = r1.p;
        r6 = r1.a;
        r14 = r1.q;
        r10 = r3 - r10;
        r11 = (int) r10;
        r3 = r7 - r3;
        r4 = (int) r3;
        r2 = r2 + r4;
        r16 = 0;
        r10 = r6;
        r3 = r11;
        r11 = r14;
        r14 = r3;
        r15 = r2;
        r10.a(r11, r13, r14, r15, r16);
    L_0x01f7:
        r2 = r1.j;
        r1.p = r2;
        r2 = r1.l;
        r1.q = r2;
        r2 = 0;
        r1.r = r2;
        r2 = 1;
        r1.o = r2;
    L_0x0205:
        r2 = r1.b;
        r3 = 2;
        if (r2 == 0) goto L_0x021a;
    L_0x020a:
        r2 = r1.n;
        r4 = r2.b;
        if (r4 == 0) goto L_0x0219;
    L_0x0210:
        r2 = r2.e;
        r4 = 7;
        if (r2 != r4) goto L_0x0217;
    L_0x0215:
        r9 = 1;
        goto L_0x021a;
    L_0x0217:
        if (r2 == r3) goto L_0x0215;
    L_0x0219:
        r9 = 0;
    L_0x021a:
        r2 = r1.r;
        r4 = r1.i;
        r6 = 5;
        if (r4 != r6) goto L_0x0223;
    L_0x0221:
        r4 = 1;
        goto L_0x022a;
    L_0x0223:
        if (r9 == 0) goto L_0x0229;
    L_0x0225:
        r9 = 1;
        if (r4 != r9) goto L_0x0229;
    L_0x0228:
        goto L_0x0221;
    L_0x0229:
        r4 = 0;
    L_0x022a:
        r2 = r2 | r4;
        r1.r = r2;
        if (r2 == 0) goto L_0x0232;
    L_0x022f:
        r1 = 0;
        r0.n = r1;
    L_0x0232:
        r1 = r0.m;
        r4 = r0.l;
        if (r4 == 0) goto L_0x023f;
    L_0x0238:
        r4 = r0.k;
        r4 = r4.c;
        if (r4 != 0) goto L_0x023f;
    L_0x023e:
        goto L_0x0249;
    L_0x023f:
        r4 = r0.d;
        r4.a(r5);
        r4 = r0.e;
        r4.a(r5);
    L_0x0249:
        r4 = r0.f;
        r4.a(r5);
        r4 = r0.k;
        r4.i = r5;
        r4.l = r1;
        r4.j = r7;
        r1 = r4.b;
        if (r1 != 0) goto L_0x025c;
    L_0x025a:
        r1 = 1;
        goto L_0x025f;
    L_0x025c:
        r1 = 1;
        if (r5 == r1) goto L_0x026b;
    L_0x025f:
        r2 = r4.c;
        if (r2 != 0) goto L_0x0264;
    L_0x0263:
        goto L_0x027e;
    L_0x0264:
        if (r5 != r6) goto L_0x0267;
    L_0x0266:
        goto L_0x026b;
    L_0x0267:
        if (r5 == r1) goto L_0x026b;
    L_0x0269:
        if (r5 != r3) goto L_0x027e;
    L_0x026b:
        r1 = r4.m;
        r2 = r4.n;
        r4.m = r2;
        r4.n = r1;
        r1 = r4.n;
        r1.a();
        r1 = 0;
        r4.h = r1;
        r1 = 1;
        r4.k = r1;
    L_0x027e:
        r2 = r24 + 3;
        r3 = r22;
        r4 = r23;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojg.a(oza):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0125  */
    private final void a(byte[] r17, int r18, int r19) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r2 = r18;
        r3 = r19;
        r4 = r0.l;
        if (r4 == 0) goto L_0x0013;
    L_0x000c:
        r4 = r0.k;
        r4 = r4.c;
        if (r4 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x001d;
    L_0x0013:
        r4 = r0.d;
        r4.a(r1, r2, r3);
        r4 = r0.e;
        r4.a(r1, r2, r3);
    L_0x001d:
        r4 = r0.f;
        r4.a(r1, r2, r3);
        r4 = r0.k;
        r5 = r4.k;
        if (r5 == 0) goto L_0x01a9;
    L_0x0028:
        r3 = r3 - r2;
        r5 = r4.g;
        r6 = r5.length;
        r7 = r4.h;
        r7 = r7 + r3;
        if (r6 >= r7) goto L_0x0038;
    L_0x0031:
        r7 = r7 + r7;
        r5 = java.util.Arrays.copyOf(r5, r7);
        r4.g = r5;
    L_0x0038:
        r5 = r4.g;
        r6 = r4.h;
        java.lang.System.arraycopy(r1, r2, r5, r6, r3);
        r1 = r4.h;
        r1 = r1 + r3;
        r4.h = r1;
        r2 = r4.f;
        r3 = r4.g;
        r5 = 0;
        r2.a(r3, r5, r1);
        r1 = r4.f;
        r2 = 8;
        r1 = r1.b(r2);
        if (r1 == 0) goto L_0x01a9;
    L_0x0056:
        r1 = r4.f;
        r1.a();
        r1 = r4.f;
        r2 = 2;
        r1 = r1.c(r2);
        r3 = r4.f;
        r6 = 5;
        r3.a(r6);
        r3 = r4.f;
        r3 = r3.c();
        if (r3 == 0) goto L_0x01a9;
    L_0x0070:
        r3 = r4.f;
        r3.e();
        r3 = r4.f;
        r3 = r3.c();
        if (r3 == 0) goto L_0x01a9;
    L_0x007d:
        r3 = r4.f;
        r3 = r3.e();
        r7 = r4.c;
        r8 = 1;
        if (r7 != 0) goto L_0x0092;
    L_0x0088:
        r4.k = r5;
        r1 = r4.n;
        r1.e = r3;
        r1.b = r8;
        goto L_0x01a9;
    L_0x0092:
        r7 = r4.f;
        r7 = r7.c();
        if (r7 == 0) goto L_0x01a9;
    L_0x009a:
        r7 = r4.f;
        r7 = r7.e();
        r9 = r4.e;
        r9 = r9.indexOfKey(r7);
        if (r9 >= 0) goto L_0x00ab;
    L_0x00a8:
        r4.k = r5;
        return;
    L_0x00ab:
        r9 = r4.e;
        r9 = r9.get(r7);
        r9 = (defpackage.oyv) r9;
        r10 = r4.d;
        r11 = r9.b;
        r10 = r10.get(r11);
        r10 = (defpackage.oyy) r10;
        r11 = r10.h;
        if (r11 == 0) goto L_0x00ce;
    L_0x00c1:
        r11 = r4.f;
        r11 = r11.b(r2);
        if (r11 == 0) goto L_0x01a9;
    L_0x00c9:
        r11 = r4.f;
        r11.a(r2);
    L_0x00ce:
        r2 = r4.f;
        r11 = r10.j;
        r2 = r2.b(r11);
        if (r2 == 0) goto L_0x01a9;
    L_0x00d8:
        r2 = r4.f;
        r11 = r10.j;
        r2 = r2.c(r11);
        r11 = r10.i;
        if (r11 == 0) goto L_0x00e8;
    L_0x00e4:
        r11 = 0;
    L_0x00e5:
        r12 = 0;
        r13 = 0;
        goto L_0x0108;
    L_0x00e8:
        r11 = r4.f;
        r11 = r11.b(r8);
        if (r11 == 0) goto L_0x01a9;
    L_0x00f0:
        r11 = r4.f;
        r11 = r11.b();
        if (r11 == 0) goto L_0x00e5;
    L_0x00f8:
        r12 = r4.f;
        r12 = r12.b(r8);
        if (r12 == 0) goto L_0x01a9;
    L_0x0100:
        r12 = r4.f;
        r12 = r12.b();
        r13 = r12;
        r12 = 1;
    L_0x0108:
        r14 = r4.i;
        if (r14 != r6) goto L_0x010e;
    L_0x010c:
        r6 = 1;
        goto L_0x010f;
    L_0x010e:
        r6 = 0;
    L_0x010f:
        if (r6 == 0) goto L_0x0120;
    L_0x0111:
        r14 = r4.f;
        r14 = r14.c();
        if (r14 == 0) goto L_0x01a9;
    L_0x0119:
        r14 = r4.f;
        r14 = r14.e();
        goto L_0x0121;
    L_0x0120:
        r14 = 0;
    L_0x0121:
        r15 = r10.k;
        if (r15 != 0) goto L_0x014e;
    L_0x0125:
        r15 = r4.f;
        r5 = r10.l;
        r5 = r15.b(r5);
        if (r5 == 0) goto L_0x01a9;
    L_0x012f:
        r5 = r4.f;
        r15 = r10.l;
        r5 = r5.c(r15);
        r9 = r9.c;
        if (r9 != 0) goto L_0x013c;
    L_0x013b:
        goto L_0x0180;
    L_0x013c:
        if (r11 != 0) goto L_0x0180;
    L_0x013e:
        r9 = r4.f;
        r9 = r9.c();
        if (r9 == 0) goto L_0x01a9;
    L_0x0146:
        r9 = r4.f;
        r9 = r9.d();
        r8 = 0;
        goto L_0x0182;
    L_0x014e:
        if (r15 != r8) goto L_0x017f;
    L_0x0150:
        r5 = r10.m;
        if (r5 != 0) goto L_0x017f;
    L_0x0154:
        r5 = r4.f;
        r5 = r5.c();
        if (r5 == 0) goto L_0x01a9;
    L_0x015c:
        r5 = r4.f;
        r5 = r5.d();
        r9 = r9.c;
        if (r9 == 0) goto L_0x017a;
    L_0x0166:
        if (r11 != 0) goto L_0x017a;
    L_0x0168:
        r9 = r4.f;
        r9 = r9.c();
        if (r9 == 0) goto L_0x01a9;
    L_0x0170:
        r9 = r4.f;
        r9 = r9.d();
        r15 = r5;
        r8 = r9;
        r5 = 0;
        goto L_0x017d;
    L_0x017a:
        r15 = r5;
        r5 = 0;
        r8 = 0;
    L_0x017d:
        r9 = 0;
        goto L_0x0183;
    L_0x017f:
        r5 = 0;
    L_0x0180:
        r8 = 0;
        r9 = 0;
    L_0x0182:
        r15 = 0;
    L_0x0183:
        r0 = r4.n;
        r0.c = r10;
        r0.d = r1;
        r0.e = r3;
        r0.f = r2;
        r0.g = r7;
        r0.h = r11;
        r0.i = r12;
        r0.j = r13;
        r0.k = r6;
        r0.l = r14;
        r0.m = r5;
        r0.n = r9;
        r0.o = r15;
        r0.p = r8;
        r1 = 1;
        r0.a = r1;
        r0.b = r1;
        r0 = 0;
        r4.k = r0;
    L_0x01a9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojg.a(byte[], int, int):void");
    }
}
