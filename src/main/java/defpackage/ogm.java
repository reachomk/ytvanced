package defpackage;

/* renamed from: ogm */
final class ogm implements ogl {
    private final /* synthetic */ ogn a;

    public final int a(int i) {
        return this.a.a(i);
    }

    public final boolean b(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public final void a(int i, long j, long j2) {
        this.a.a(i, j, j2);
    }

    public final void c(int i) {
        this.a.b(i);
    }

    /* JADX WARNING: Missing block: B:35:0x0059, code skipped:
            if (r10 != 7) goto L_0x021c;
     */
    public final void a(int r10, long r11) {
        /*
        r9 = this;
        r0 = r9.a;
        r1 = 20529; // 0x5031 float:2.8767E-41 double:1.01427E-319;
        r2 = 55;
        r3 = " not supported";
        if (r10 == r1) goto L_0x0216;
    L_0x000a:
        r1 = 20530; // 0x5032 float:2.8769E-41 double:1.0143E-319;
        r4 = 1;
        if (r10 == r1) goto L_0x01f7;
    L_0x0010:
        r1 = 50;
        r2 = 0;
        r6 = 3;
        r7 = 2;
        r8 = 1;
        switch(r10) {
            case 131: goto L_0x01f1;
            case 136: goto L_0x01e7;
            case 155: goto L_0x01e0;
            case 159: goto L_0x01da;
            case 176: goto L_0x01d4;
            case 179: goto L_0x01ca;
            case 186: goto L_0x01c4;
            case 215: goto L_0x01be;
            case 231: goto L_0x01b7;
            case 241: goto L_0x01ab;
            case 251: goto L_0x01a8;
            case 16980: goto L_0x0186;
            case 17029: goto L_0x015e;
            case 17143: goto L_0x013e;
            case 18401: goto L_0x011a;
            case 18408: goto L_0x00f8;
            case 21420: goto L_0x00f2;
            case 21432: goto L_0x00d1;
            case 21680: goto L_0x00cb;
            case 21682: goto L_0x00c5;
            case 21690: goto L_0x00bf;
            case 21930: goto L_0x00b5;
            case 22186: goto L_0x00b0;
            case 22203: goto L_0x00ab;
            case 25188: goto L_0x00a5;
            case 30321: goto L_0x0086;
            case 2352003: goto L_0x0080;
            case 2807729: goto L_0x007d;
            default: goto L_0x0019;
        };
    L_0x0019:
        r1 = 7;
        r2 = 6;
        switch(r10) {
            case 21945: goto L_0x006c;
            case 21946: goto L_0x004c;
            case 21947: goto L_0x002c;
            case 21948: goto L_0x0026;
            case 21949: goto L_0x0020;
            default: goto L_0x001e;
        };
    L_0x001e:
        goto L_0x021c;
    L_0x0020:
        r10 = r0.i;
        r12 = (int) r11;
        r10.A = r12;
        return;
    L_0x0026:
        r10 = r0.i;
        r12 = (int) r11;
        r10.z = r12;
        return;
    L_0x002c:
        r10 = r0.i;
        r10.v = r8;
        r12 = (int) r11;
        if (r12 == r8) goto L_0x0049;
    L_0x0033:
        r11 = 9;
        if (r12 == r11) goto L_0x0046;
    L_0x0037:
        r11 = 4;
        if (r12 == r11) goto L_0x0043;
    L_0x003a:
        r11 = 5;
        if (r12 == r11) goto L_0x0043;
    L_0x003d:
        if (r12 == r2) goto L_0x0043;
    L_0x003f:
        if (r12 == r1) goto L_0x0043;
    L_0x0041:
        goto L_0x021c;
    L_0x0043:
        r10.w = r7;
        return;
    L_0x0046:
        r10.w = r2;
        return;
    L_0x0049:
        r10.w = r8;
        return;
    L_0x004c:
        r10 = (int) r11;
        if (r10 == r8) goto L_0x0067;
    L_0x004f:
        r11 = 16;
        if (r10 == r11) goto L_0x0062;
    L_0x0053:
        r11 = 18;
        if (r10 == r11) goto L_0x005d;
    L_0x0057:
        if (r10 == r2) goto L_0x0067;
    L_0x0059:
        if (r10 == r1) goto L_0x0067;
    L_0x005b:
        goto L_0x021c;
    L_0x005d:
        r10 = r0.i;
        r10.x = r1;
        return;
    L_0x0062:
        r10 = r0.i;
        r10.x = r2;
        return;
    L_0x0067:
        r10 = r0.i;
        r10.x = r6;
        return;
    L_0x006c:
        r10 = (int) r11;
        if (r10 == r8) goto L_0x0078;
    L_0x006f:
        if (r10 == r7) goto L_0x0073;
    L_0x0071:
        goto L_0x021c;
    L_0x0073:
        r10 = r0.i;
        r10.y = r8;
        return;
    L_0x0078:
        r10 = r0.i;
        r10.y = r7;
        return;
    L_0x007d:
        r0.g = r11;
        return;
    L_0x0080:
        r10 = r0.i;
        r12 = (int) r11;
        r10.e = r12;
        return;
    L_0x0086:
        r10 = (int) r11;
        if (r10 == 0) goto L_0x00a0;
    L_0x0089:
        if (r10 == r8) goto L_0x009b;
    L_0x008b:
        if (r10 == r7) goto L_0x0096;
    L_0x008d:
        if (r10 == r6) goto L_0x0091;
    L_0x008f:
        goto L_0x021c;
    L_0x0091:
        r10 = r0.i;
        r10.p = r6;
        return;
    L_0x0096:
        r10 = r0.i;
        r10.p = r7;
        return;
    L_0x009b:
        r10 = r0.i;
        r10.p = r8;
        return;
    L_0x00a0:
        r10 = r0.i;
        r10.p = r2;
        return;
    L_0x00a5:
        r10 = r0.i;
        r12 = (int) r11;
        r10.M = r12;
        return;
    L_0x00ab:
        r10 = r0.i;
        r10.P = r11;
        return;
    L_0x00b0:
        r10 = r0.i;
        r10.O = r11;
        return;
    L_0x00b5:
        r10 = r0.i;
        r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x00bc;
    L_0x00bb:
        r2 = 1;
    L_0x00bc:
        r10.R = r2;
        return;
    L_0x00bf:
        r10 = r0.i;
        r12 = (int) r11;
        r10.n = r12;
        return;
    L_0x00c5:
        r10 = r0.i;
        r12 = (int) r11;
        r10.o = r12;
        return;
    L_0x00cb:
        r10 = r0.i;
        r12 = (int) r11;
        r10.m = r12;
        return;
    L_0x00d1:
        r10 = (int) r11;
        if (r10 == 0) goto L_0x00ed;
    L_0x00d4:
        if (r10 == r8) goto L_0x00e8;
    L_0x00d6:
        if (r10 == r6) goto L_0x00e3;
    L_0x00d8:
        r11 = 15;
        if (r10 == r11) goto L_0x00de;
    L_0x00dc:
        goto L_0x021c;
    L_0x00de:
        r10 = r0.i;
        r10.u = r6;
        return;
    L_0x00e3:
        r10 = r0.i;
        r10.u = r8;
        return;
    L_0x00e8:
        r10 = r0.i;
        r10.u = r7;
        return;
    L_0x00ed:
        r10 = r0.i;
        r10.u = r2;
        return;
    L_0x00f2:
        r1 = r0.f;
        r11 = r11 + r1;
        r0.k = r11;
        return;
    L_0x00f8:
        r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1));
        if (r10 != 0) goto L_0x00fe;
    L_0x00fc:
        goto L_0x021c;
    L_0x00fe:
        r10 = new oae;
        r0 = new java.lang.StringBuilder;
        r1 = 56;
        r0.<init>(r1);
        r1 = "AESSettingsCipherMode ";
        r0.append(r1);
        r0.append(r11);
        r0.append(r3);
        r11 = r0.toString();
        r10.<init>(r11);
        throw r10;
    L_0x011a:
        r0 = 5;
        r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r10 != 0) goto L_0x0122;
    L_0x0120:
        goto L_0x021c;
    L_0x0122:
        r10 = new oae;
        r0 = new java.lang.StringBuilder;
        r1 = 49;
        r0.<init>(r1);
        r1 = "ContentEncAlgo ";
        r0.append(r1);
        r0.append(r11);
        r0.append(r3);
        r11 = r0.toString();
        r10.<init>(r11);
        throw r10;
    L_0x013e:
        r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1));
        if (r10 != 0) goto L_0x0144;
    L_0x0142:
        goto L_0x021c;
    L_0x0144:
        r10 = new oae;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r1);
        r1 = "EBMLReadVersion ";
        r0.append(r1);
        r0.append(r11);
        r0.append(r3);
        r11 = r0.toString();
        r10.<init>(r11);
        throw r10;
    L_0x015e:
        r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1));
        if (r10 < 0) goto L_0x016a;
    L_0x0162:
        r0 = 2;
        r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r10 > 0) goto L_0x016a;
    L_0x0168:
        goto L_0x021c;
    L_0x016a:
        r10 = new oae;
        r0 = new java.lang.StringBuilder;
        r1 = 53;
        r0.<init>(r1);
        r1 = "DocTypeReadVersion ";
        r0.append(r1);
        r0.append(r11);
        r0.append(r3);
        r11 = r0.toString();
        r10.<init>(r11);
        throw r10;
    L_0x0186:
        r4 = 3;
        r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1));
        if (r10 != 0) goto L_0x018e;
    L_0x018c:
        goto L_0x021c;
    L_0x018e:
        r10 = new oae;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r1);
        r1 = "ContentCompAlgo ";
        r0.append(r1);
        r0.append(r11);
        r0.append(r3);
        r11 = r0.toString();
        r10.<init>(r11);
        throw r10;
    L_0x01a8:
        r0.y = r8;
        return;
    L_0x01ab:
        r10 = r0.o;
        if (r10 != 0) goto L_0x021c;
    L_0x01af:
        r10 = r0.n;
        r10.a(r11);
        r0.o = r8;
        return;
    L_0x01b7:
        r10 = r0.a(r11);
        r0.l = r10;
        return;
    L_0x01be:
        r10 = r0.i;
        r12 = (int) r11;
        r10.c = r12;
        return;
    L_0x01c4:
        r10 = r0.i;
        r12 = (int) r11;
        r10.l = r12;
        return;
    L_0x01ca:
        r10 = r0.m;
        r11 = r0.a(r11);
        r10.a(r11);
        return;
    L_0x01d4:
        r10 = r0.i;
        r12 = (int) r11;
        r10.k = r12;
        return;
    L_0x01da:
        r10 = r0.i;
        r12 = (int) r11;
        r10.L = r12;
        return;
    L_0x01e0:
        r10 = r0.a(r11);
        r0.r = r10;
        return;
    L_0x01e7:
        r10 = r0.i;
        r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x01ee;
    L_0x01ed:
        r2 = 1;
    L_0x01ee:
        r10.S = r2;
        return;
    L_0x01f1:
        r10 = r0.i;
        r12 = (int) r11;
        r10.d = r12;
        return;
    L_0x01f7:
        r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1));
        if (r10 != 0) goto L_0x01fc;
    L_0x01fb:
        goto L_0x021c;
    L_0x01fc:
        r10 = new oae;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r2);
        r1 = "ContentEncodingScope ";
        r0.append(r1);
        r0.append(r11);
        r0.append(r3);
        r11 = r0.toString();
        r10.<init>(r11);
        throw r10;
    L_0x0216:
        r0 = 0;
        r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r10 != 0) goto L_0x021d;
    L_0x021c:
        return;
    L_0x021d:
        r10 = new oae;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r2);
        r1 = "ContentEncodingOrder ";
        r0.append(r1);
        r0.append(r11);
        r0.append(r3);
        r11 = r0.toString();
        r10.<init>(r11);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogm.a(int, long):void");
    }

    public final void a(int i, double d) {
        ogn ogn = this.a;
        if (i == 181) {
            ogn.i.N = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    ogn.i.B = (float) d;
                    return;
                case 21970:
                    ogn.i.C = (float) d;
                    return;
                case 21971:
                    ogn.i.D = (float) d;
                    return;
                case 21972:
                    ogn.i.E = (float) d;
                    return;
                case 21973:
                    ogn.i.F = (float) d;
                    return;
                case 21974:
                    ogn.i.G = (float) d;
                    return;
                case 21975:
                    ogn.i.H = (float) d;
                    return;
                case 21976:
                    ogn.i.I = (float) d;
                    return;
                case 21977:
                    ogn.i.J = (float) d;
                    return;
                case 21978:
                    ogn.i.K = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            ogn.i.q = (float) d;
                            return;
                        case 30324:
                            ogn.i.r = (float) d;
                            return;
                        case 30325:
                            ogn.i.s = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            ogn.h = (long) d;
        }
    }

    public final void a(int i, String str) {
        this.a.a(i, str);
    }

    /* JADX WARNING: Missing block: B:77:0x01fc, code skipped:
            throw new defpackage.oae("EBML lacing sample size out of range.");
     */
    public final void a(int r20, int r21, defpackage.ofp r22) {
        /*
        r19 = this;
        r0 = r20;
        r1 = r21;
        r2 = r19;
        r3 = r22;
        r4 = r2.a;
        r5 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r6 = 4;
        r7 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r8 = 1;
        r9 = 0;
        if (r0 == r5) goto L_0x0093;
    L_0x0013:
        if (r0 == r7) goto L_0x0093;
    L_0x0015:
        r5 = 16981; // 0x4255 float:2.3795E-41 double:8.3897E-320;
        if (r0 == r5) goto L_0x0087;
    L_0x0019:
        r5 = 18402; // 0x47e2 float:2.5787E-41 double:9.092E-320;
        if (r0 == r5) goto L_0x0078;
    L_0x001d:
        r5 = 21419; // 0x53ab float:3.0014E-41 double:1.05824E-319;
        if (r0 == r5) goto L_0x005a;
    L_0x0021:
        r5 = 25506; // 0x63a2 float:3.5742E-41 double:1.26016E-319;
        if (r0 == r5) goto L_0x004e;
    L_0x0025:
        r5 = 30322; // 0x7672 float:4.249E-41 double:1.4981E-319;
        if (r0 != r5) goto L_0x0035;
    L_0x0029:
        r0 = r4.i;
        r4 = new byte[r1];
        r0.t = r4;
        r0 = r0.t;
        r3.b(r0, r9, r1);
        return;
    L_0x0035:
        r1 = new oae;
        r3 = new java.lang.StringBuilder;
        r4 = 26;
        r3.<init>(r4);
        r4 = "Unexpected id: ";
        r3.append(r4);
        r3.append(r0);
        r0 = r3.toString();
        r1.<init>(r0);
        throw r1;
    L_0x004e:
        r0 = r4.i;
        r4 = new byte[r1];
        r0.i = r4;
        r0 = r0.i;
        r3.b(r0, r9, r1);
        return;
    L_0x005a:
        r0 = r4.e;
        r0 = r0.a;
        java.util.Arrays.fill(r0, r9);
        r0 = r4.e;
        r0 = r0.a;
        r6 = r6 - r1;
        r3.b(r0, r6, r1);
        r0 = r4.e;
        r0.c(r9);
        r0 = r4.e;
        r0 = r0.i();
        r1 = (int) r0;
        r4.j = r1;
        return;
    L_0x0078:
        r0 = new byte[r1];
        r3.b(r0, r9, r1);
        r1 = r4.i;
        r3 = new ogb;
        r3.<init>(r8, r0, r9, r9);
        r1.h = r3;
        return;
    L_0x0087:
        r0 = r4.i;
        r4 = new byte[r1];
        r0.g = r4;
        r0 = r0.g;
        r3.b(r0, r9, r1);
        return;
    L_0x0093:
        r5 = r4.p;
        r10 = 8;
        if (r5 != 0) goto L_0x00b6;
    L_0x0099:
        r5 = r4.b;
        r11 = r5.a(r3, r9, r8, r10);
        r5 = (int) r11;
        r4.v = r5;
        r5 = r4.b;
        r5 = r5.a;
        r4.w = r5;
        r11 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r4.r = r11;
        r4.p = r8;
        r5 = r4.d;
        r5.a();
    L_0x00b6:
        r5 = r4.c;
        r11 = r4.v;
        r5 = r5.get(r11);
        r5 = (defpackage.ogp) r5;
        if (r5 != 0) goto L_0x00cc;
    L_0x00c2:
        r0 = r4.w;
        r0 = r1 - r0;
        r3.a(r0);
        r4.p = r9;
        return;
    L_0x00cc:
        r11 = r4.p;
        if (r11 != r8) goto L_0x0260;
    L_0x00d0:
        r11 = 3;
        r4.a(r3, r11);
        r12 = r4.d;
        r12 = r12.a;
        r13 = 2;
        r12 = r12[r13];
        r12 = r12 & 6;
        r12 = r12 >> r8;
        r14 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r12 != 0) goto L_0x00f7;
    L_0x00e2:
        r4.t = r8;
        r6 = r4.u;
        r6 = defpackage.ogn.a(r6, r8);
        r4.u = r6;
        r6 = r4.u;
        r11 = r4.w;
        r1 = r1 - r11;
        r1 = r1 + -3;
        r6[r9] = r1;
        goto L_0x020f;
    L_0x00f7:
        if (r0 != r7) goto L_0x0258;
    L_0x00f9:
        r4.a(r3, r6);
        r15 = r4.d;
        r15 = r15.a;
        r15 = r15[r11];
        r15 = r15 & r14;
        r15 = r15 + r8;
        r4.t = r15;
        r6 = r4.u;
        r6 = defpackage.ogn.a(r6, r15);
        r4.u = r6;
        if (r12 != r13) goto L_0x011f;
    L_0x0110:
        r6 = r4.w;
        r11 = r4.t;
        r1 = r1 - r6;
        r1 = r1 + -4;
        r1 = r1 / r11;
        r6 = r4.u;
        java.util.Arrays.fill(r6, r9, r11, r1);
        goto L_0x020f;
    L_0x011f:
        if (r12 != r8) goto L_0x0161;
    L_0x0121:
        r6 = 0;
        r11 = 0;
        r16 = 4;
    L_0x0125:
        r12 = r4.t;
        r12 = r12 + -1;
        if (r6 >= r12) goto L_0x0155;
    L_0x012b:
        r12 = r4.u;
        r12[r6] = r9;
    L_0x012f:
        r12 = r16 + 1;
        r4.a(r3, r12);
        r15 = r4.d;
        r15 = r15.a;
        r16 = r12 + -1;
        r15 = r15[r16];
        r15 = r15 & r14;
        r7 = r4.u;
        r16 = r7[r6];
        r16 = r16 + r15;
        r7[r6] = r16;
        if (r15 == r14) goto L_0x0150;
    L_0x0147:
        r11 = r11 + r16;
        r6 = r6 + 1;
        r16 = r12;
        r7 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        goto L_0x0125;
    L_0x0150:
        r16 = r12;
        r7 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        goto L_0x012f;
    L_0x0155:
        r6 = r4.u;
        r7 = r4.w;
        r1 = r1 - r7;
        r1 = r1 - r16;
        r1 = r1 - r11;
        r6[r12] = r1;
        goto L_0x020f;
    L_0x0161:
        if (r12 != r11) goto L_0x0250;
    L_0x0163:
        r6 = 0;
        r7 = 0;
        r16 = 4;
    L_0x0167:
        r11 = r4.t;
        r11 = r11 + -1;
        if (r6 >= r11) goto L_0x0205;
    L_0x016d:
        r11 = r4.u;
        r11[r6] = r9;
        r11 = r16 + 1;
        r4.a(r3, r11);
        r12 = r11 + -1;
        r15 = r4.d;
        r15 = r15.a;
        r15 = r15[r12];
        if (r15 == 0) goto L_0x01fd;
    L_0x0180:
        r15 = 0;
    L_0x0181:
        if (r15 >= r10) goto L_0x01ce;
    L_0x0183:
        r16 = 7 - r15;
        r16 = r8 << r16;
        r13 = r4.d;
        r13 = r13.a;
        r13 = r13[r12];
        r13 = r13 & r16;
        if (r13 == 0) goto L_0x01c5;
    L_0x0191:
        r11 = r11 + r15;
        r4.a(r3, r11);
        r13 = r12 + 1;
        r8 = r4.d;
        r8 = r8.a;
        r8 = r8[r12];
        r8 = r8 & r14;
        r12 = r16 ^ -1;
        r8 = r8 & r12;
        r16 = r15;
        r14 = (long) r8;
    L_0x01a4:
        if (r13 >= r11) goto L_0x01b6;
    L_0x01a6:
        r8 = r13 + 1;
        r14 = r14 << r10;
        r12 = r4.d;
        r12 = r12.a;
        r12 = r12[r13];
        r13 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r12 = r12 & r13;
        r12 = (long) r12;
        r14 = r14 | r12;
        r13 = r8;
        goto L_0x01a4;
    L_0x01b6:
        if (r6 <= 0) goto L_0x01d0;
    L_0x01b8:
        r12 = 1;
        r8 = r16 * 7;
        r8 = r8 + 6;
        r12 = r12 << r8;
        r17 = -1;
        r12 = r12 + r17;
        r14 = r14 - r12;
        goto L_0x01d0;
    L_0x01c5:
        r16 = r15;
        r15 = r16 + 1;
        r8 = 1;
        r13 = 2;
        r14 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        goto L_0x0181;
    L_0x01ce:
        r14 = 0;
    L_0x01d0:
        r16 = r11;
        r11 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r8 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1));
        if (r8 < 0) goto L_0x01f5;
    L_0x01d9:
        r11 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1));
        if (r8 > 0) goto L_0x01f5;
    L_0x01e0:
        r8 = (int) r14;
        r11 = r4.u;
        if (r6 == 0) goto L_0x01ea;
    L_0x01e5:
        r12 = r6 + -1;
        r12 = r11[r12];
        r8 = r8 + r12;
    L_0x01ea:
        r11[r6] = r8;
        r7 = r7 + r8;
        r6 = r6 + 1;
        r8 = 1;
        r13 = 2;
        r14 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        goto L_0x0167;
    L_0x01f5:
        r0 = new oae;
        r1 = "EBML lacing sample size out of range.";
        r0.<init>(r1);
        throw r0;
    L_0x01fd:
        r0 = new oae;
        r1 = "No valid varint length mask found";
        r0.<init>(r1);
        throw r0;
    L_0x0205:
        r6 = r4.u;
        r8 = r4.w;
        r1 = r1 - r8;
        r1 = r1 - r16;
        r1 = r1 - r7;
        r6[r11] = r1;
    L_0x020f:
        r1 = r4.d;
        r1 = r1.a;
        r6 = r1[r9];
        r7 = 1;
        r1 = r1[r7];
        r7 = r4.l;
        r6 = r6 << r10;
        r11 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r1 = r1 & r11;
        r1 = r1 | r6;
        r11 = (long) r1;
        r11 = r4.a(r11);
        r7 = r7 + r11;
        r4.q = r7;
        r1 = r4.d;
        r1 = r1.a;
        r6 = 2;
        r1 = r1[r6];
        r7 = r1 & 8;
        r8 = r5.d;
        if (r8 != r6) goto L_0x0236;
    L_0x0234:
        r1 = 1;
        goto L_0x0241;
    L_0x0236:
        r6 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        if (r0 != r6) goto L_0x0240;
    L_0x023a:
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r1 = r1 & r6;
        if (r1 != r6) goto L_0x0240;
    L_0x023f:
        goto L_0x0234;
    L_0x0240:
        r1 = 0;
    L_0x0241:
        if (r7 != r10) goto L_0x0246;
    L_0x0243:
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        goto L_0x0247;
    L_0x0246:
        r6 = 0;
    L_0x0247:
        r1 = r1 | r6;
        r4.x = r1;
        r1 = 2;
        r4.p = r1;
        r4.s = r9;
        goto L_0x0260;
    L_0x0250:
        r0 = new oae;
        r1 = "Unexpected lacing value: 2";
        r0.<init>(r1);
        throw r0;
    L_0x0258:
        r0 = new oae;
        r1 = "Lacing only supported in SimpleBlocks.";
        r0.<init>(r1);
        throw r0;
    L_0x0260:
        r1 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        if (r0 != r1) goto L_0x028a;
    L_0x0264:
        r0 = r4.s;
        r1 = r4.t;
        if (r0 >= r1) goto L_0x0287;
    L_0x026a:
        r1 = r4.u;
        r0 = r1[r0];
        r4.a(r3, r5, r0);
        r0 = r4.q;
        r6 = r4.s;
        r7 = r5.e;
        r6 = r6 * r7;
        r6 = r6 / 1000;
        r6 = (long) r6;
        r0 = r0 + r6;
        r4.a(r5, r0);
        r0 = r4.s;
        r1 = 1;
        r0 = r0 + r1;
        r4.s = r0;
        goto L_0x0264;
    L_0x0287:
        r4.p = r9;
        return;
    L_0x028a:
        r0 = r4.u;
        r0 = r0[r9];
        r4.a(r3, r5, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogm.a(int, int, ofp):void");
    }

    /* synthetic */ ogm(ogn ogn) {
        this.a = ogn;
    }
}
