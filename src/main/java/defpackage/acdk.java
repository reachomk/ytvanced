package defpackage;

/* renamed from: acdk */
final class acdk implements Runnable {
    public final /* synthetic */ acdg a;

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Missing block: B:98:0x032d, code skipped:
            if (r1.v >= 0) goto L_0x032f;
     */
    public final void run() {
        /*
        r30 = this;
        r0 = r30;
        r1 = r0.a;
        r1 = r1.c;
        r1 = r1.g();
        if (r1 < 0) goto L_0x0379;
    L_0x000c:
        r2 = r0.a;
        r2 = r2.c;
        r2 = r2.h();
        r3 = r2.first;
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r2 = r2.second;
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r4 = r0.a;
        r5 = r4.y;
        r7 = r3 << 3;
        r7 = (long) r7;
        r5 = r5 + r7;
        r4.y = r5;
        r5 = r3 - r2;
        r4 = r4.h;
        r6 = r4.b();
        r4 = r0.a;
        r8 = r4.r;
        r8 = r6 - r8;
        r10 = 1;
        r8 = java.lang.Math.max(r8, r10);
        r4 = r0.a;
        r4.r = r6;
        r10 = (double) r3;
        r12 = (double) r8;
        r14 = (double) r2;
        r16 = 4620693217682128896; // 0x4020000000000000 float:0.0 double:8.0;
        java.lang.Double.isNaN(r14);
        r14 = r14 * r16;
        java.lang.Double.isNaN(r12);
        r14 = r14 / r12;
        r18 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r14 = r14 / r18;
        r4 = 1;
        r20 = r6;
        r6 = new java.lang.Object[r4];
        java.lang.Double.isNaN(r10);
        r16 = r16 * r10;
        java.lang.Double.isNaN(r12);
        r16 = r16 / r12;
        r16 = r16 / r18;
        r7 = java.lang.Double.valueOf(r16);
        r4 = 0;
        r6[r4] = r7;
        r7 = "%.3f";
        r6 = java.lang.String.format(r7, r6);
        r22 = r12;
        r4 = 1;
        r12 = new java.lang.Object[r4];
        r4 = java.lang.Double.valueOf(r14);
        r13 = 0;
        r12[r13] = r4;
        r4 = java.lang.String.format(r7, r12);
        r6 = java.lang.String.valueOf(r6);
        r6.length();
        r4 = java.lang.String.valueOf(r4);
        r4.length();
        r4 = r0.a;
        r6 = r4.r;
        r12 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r26 = 0;
        r4 = (r6 > r26 ? 1 : (r6 == r26 ? 0 : -1));
        if (r4 <= 0) goto L_0x00b8;
    L_0x00a3:
        r6 = java.lang.Math.max(r8, r12);
        r6 = (double) r6;
        java.lang.Double.isNaN(r6);
        r24 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r6 = r6 * r24;
        java.lang.Double.isNaN(r10);
        r10 = r10 / r6;
        r4 = (int) r10;
        goto L_0x00b9;
    L_0x00b8:
        r4 = 0;
    L_0x00b9:
        r6 = r0.a;
        r7 = r6.n;
        r6 = r6.o;
        if (r1 == 0) goto L_0x00ff;
    L_0x00c1:
        r3 = r1 - r3;
        r10 = 0;
        r3 = java.lang.Math.max(r3, r10);
        if (r6 <= 0) goto L_0x00cd;
    L_0x00ca:
        if (r7 <= 0) goto L_0x00cd;
    L_0x00cc:
        goto L_0x00d2;
    L_0x00cd:
        if (r3 > 0) goto L_0x00d2;
    L_0x00cf:
        r6 = 0;
        goto L_0x00e8;
    L_0x00d2:
        r10 = (double) r3;
        r12 = (double) r7;
        java.lang.Double.isNaN(r12);
        r24 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r12 = r12 * r24;
        r6 = (double) r6;
        java.lang.Double.isNaN(r6);
        r12 = r12 / r6;
        java.lang.Double.isNaN(r10);
        r6 = r10 * r12;
    L_0x00e8:
        r3 = r1 - r3;
        r10 = 0;
        r3 = java.lang.Math.max(r3, r10);
        if (r4 <= 0) goto L_0x00fb;
    L_0x00f1:
        r10 = (double) r3;
        r3 = (double) r4;
        java.lang.Double.isNaN(r10);
        java.lang.Double.isNaN(r3);
        r10 = r10 / r3;
        r6 = r6 + r10;
    L_0x00fb:
        r6 = r6 * r18;
        r4 = (int) r6;
        goto L_0x0100;
    L_0x00ff:
        r4 = 0;
    L_0x0100:
        r3 = r0.a;
        r3.o = r1;
        r3.n = r4;
        r6 = (double) r1;
        r3 = r3.k;
        r10 = new java.lang.StringBuilder;
        r11 = 55;
        r10.<init>(r11);
        r11 = "Used Buffer: ";
        r10.append(r11);
        r10.append(r1);
        r11 = " Ratio:";
        r10.append(r11);
        r11 = (double) r3;
        java.lang.Double.isNaN(r6);
        java.lang.Double.isNaN(r11);
        r11 = r6 / r11;
        r10.append(r11);
        r10.toString();
        r3 = r0.a;
        r3 = r3.i;
        r3 = r3.size();
        r10 = 3;
        if (r3 != r10) goto L_0x013e;
    L_0x0137:
        r3 = r0.a;
        r3 = r3.i;
        r3.remove();
    L_0x013e:
        r3 = r0.a;
        r3 = r3.i;
        r11 = java.lang.Integer.valueOf(r5);
        r3.add(r11);
        r3 = r0.a;
        r3 = r3.i;
        r3 = r3.iterator();
        r11 = 0;
    L_0x0152:
        r12 = r3.hasNext();
        if (r12 == 0) goto L_0x016a;
    L_0x0158:
        r12 = r3.next();
        r12 = (java.lang.Integer) r12;
        r12 = r12.intValue();
        if (r12 <= 0) goto L_0x0167;
    L_0x0164:
        r11 = r11 + 1;
        goto L_0x0152;
    L_0x0167:
        r11 = r11 + -1;
        goto L_0x0152;
    L_0x016a:
        r3 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1));
        if (r3 <= 0) goto L_0x01ac;
    L_0x016e:
        r3 = r0.a;
        r3 = r3.g;
        r12 = r2 << 3;
        r12 = (double) r12;
        java.lang.Double.isNaN(r22);
        r18 = r18 / r22;
        java.lang.Double.isNaN(r12);
        r12 = r12 * r18;
        r19 = r11;
        r10 = r3.c;
        r22 = r14;
        r14 = r3.e;
        r15 = r3.d;
        r24 = r14[r15];
        r10 = r10 - r24;
        r3.c = r10;
        r24 = r1;
        r1 = r15 + 1;
        r3.d = r1;
        r14[r15] = r12;
        r10 = r10 + r12;
        r3.c = r10;
        r10 = r3.a;
        if (r1 < r10) goto L_0x01a2;
    L_0x019e:
        r1 = 0;
        r3.d = r1;
        goto L_0x01a3;
    L_0x01a2:
        r1 = 0;
    L_0x01a3:
        r11 = r3.b;
        if (r11 >= r10) goto L_0x01b3;
    L_0x01a7:
        r10 = 1;
        r11 = r11 + r10;
        r3.b = r11;
        goto L_0x01b4;
    L_0x01ac:
        r24 = r1;
        r19 = r11;
        r22 = r14;
        r1 = 0;
    L_0x01b3:
        r10 = 1;
    L_0x01b4:
        if (r2 <= 0) goto L_0x01f2;
    L_0x01b6:
        r2 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1));
        if (r2 <= 0) goto L_0x01f2;
    L_0x01ba:
        r2 = 2;
        r11 = r19;
        if (r11 >= r2) goto L_0x01c1;
    L_0x01bf:
        if (r5 <= 0) goto L_0x01f4;
    L_0x01c1:
        r2 = r0.a;
        r3 = r2.p;
        if (r3 < 0) goto L_0x01e8;
    L_0x01c7:
        r3 = r2.g;
        r8 = r3.b();
        r12 = 4599075939470750515; // 0x3fd3333333333333 float:4.172325E-8 double:0.3;
        r8 = r8 * r12;
        r3 = r0.a;
        r3 = r3.p;
        r12 = (double) r3;
        r14 = 4604480259023595110; // 0x3fe6666666666666 float:2.720083E23 double:0.7;
        java.lang.Double.isNaN(r12);
        r12 = r12 * r14;
        r8 = r8 + r12;
        r3 = (int) r8;
        r2.p = r3;
        goto L_0x01f4;
    L_0x01e8:
        r3 = r2.g;
        r8 = r3.b();
        r3 = (int) r8;
        r2.p = r3;
        goto L_0x01f4;
    L_0x01f2:
        r11 = r19;
    L_0x01f4:
        r2 = r0.a;
        r3 = r2.p;
        r5 = r2.k;
        r8 = (double) r5;
        r12 = 4605380978949069210; // 0x3fe999999999999a float:-1.5881868E-23 double:0.8;
        java.lang.Double.isNaN(r8);
        r8 = r8 * r12;
        r14 = (long) r4;
        r16 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r5 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r5 <= 0) goto L_0x0212;
    L_0x020c:
        r12 = r20;
        r2.q = r12;
        r5 = 1;
        goto L_0x0215;
    L_0x0212:
        r12 = r20;
        r5 = 0;
    L_0x0215:
        r19 = 4000; // 0xfa0 float:5.605E-42 double:1.9763E-320;
        r28 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r21 = (r14 > r28 ? 1 : (r14 == r28 ? 0 : -1));
        if (r21 >= 0) goto L_0x0229;
    L_0x021d:
        r14 = r2.q;
        r14 = r12 - r14;
        r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1));
        if (r21 <= 0) goto L_0x0229;
    L_0x0225:
        r2.q = r12;
        r12 = 1;
        goto L_0x022a;
    L_0x0229:
        r12 = 0;
    L_0x022a:
        r13 = 3;
        if (r11 != r13) goto L_0x022e;
    L_0x022d:
        goto L_0x0253;
    L_0x022e:
        if (r5 != 0) goto L_0x0253;
    L_0x0230:
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 > 0) goto L_0x0253;
    L_0x0234:
        if (r12 != 0) goto L_0x0237;
    L_0x0236:
        goto L_0x0251;
    L_0x0237:
        r5 = r2.j;
        if (r5 >= r3) goto L_0x023c;
    L_0x023b:
        goto L_0x0245;
    L_0x023c:
        if (r3 <= 0) goto L_0x0245;
    L_0x023e:
        r5 = (double) r5;
        r7 = 4607632778762754458; // 0x3ff199999999999a float:-1.5881868E-23 double:1.1;
        goto L_0x0248;
    L_0x0245:
        r5 = (double) r5;
        r7 = 4608308318706860032; // 0x3ff4000000000000 float:0.0 double:1.25;
    L_0x0248:
        java.lang.Double.isNaN(r5);
        r5 = r5 * r7;
        r3 = (int) r5;
        r2.j = r3;
        r1 = 1;
    L_0x0251:
        r10 = 0;
        goto L_0x026d;
    L_0x0253:
        r5 = r24 << 3;
        r6 = 3;
        r5 = r5 / r6;
        r3 = r3 - r5;
        r5 = r2.j;
        if (r3 < r5) goto L_0x026b;
    L_0x025c:
        r5 = (double) r5;
        java.lang.Double.isNaN(r5);
        r7 = 4605380978949069210; // 0x3fe999999999999a float:-1.5881868E-23 double:0.8;
        r5 = r5 * r7;
        r3 = (int) r5;
        r2.j = r3;
        goto L_0x026d;
    L_0x026b:
        r2.j = r3;
    L_0x026d:
        r3 = r2.j;
        r5 = r2.d;
        r3 = java.lang.Math.max(r3, r5);
        r5 = r0.a;
        r5 = r5.e;
        r3 = java.lang.Math.min(r3, r5);
        r2.j = r3;
        r2 = r0.a;
        r2 = r2.h;
        r2.b();
        r2 = r0.a;
        r2 = r2.j;
        r3 = new java.lang.StringBuilder;
        r5 = 87;
        r3.<init>(r5);
        r5 = "EncoderBitrate: ";
        r3.append(r5);
        r2 = r2 / 1000;
        r3.append(r2);
        r2 = "kbps Buffer: ";
        r3.append(r2);
        r3.append(r4);
        r2 = "ms Net: ";
        r3.append(r2);
        r14 = r22;
        r3.append(r14);
        r2 = "Mbps";
        r3.append(r2);
        r3.toString();
        r2 = r0.a;
        r3 = r2.j;
        r5 = r24;
        r3 = defpackage.acdg.a(r4, r5, r3);
        r2.k = r3;
        r2 = r0.a;
        r2 = r2.f;
        r3 = new acdn;
        r3.<init>(r0, r1, r10);
        r2.post(r3);
        r1 = r0.a;
        r2 = r1.l;
        if (r2 == 0) goto L_0x0379;
    L_0x02d3:
        r2 = r1.h;
        r2 = r2.b();
        r4 = r1.x;
        r2 = r2 - r4;
        r4 = 30;
        r5 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1));
        if (r5 < 0) goto L_0x036c;
    L_0x02e2:
        r2 = r1.h;
        r2 = r2.b();
        r5 = r1.g;
        r5 = r5.b();
        r5 = (int) r5;
        r6 = r1.d;
        r7 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        r8 = r6 + r7;
        r9 = -1;
        r11 = -1;
        if (r5 <= r8) goto L_0x0313;
    L_0x02fb:
        r12 = r1.v;
        r8 = (r12 > r26 ? 1 : (r12 == r26 ? 0 : -1));
        if (r8 <= 0) goto L_0x0313;
    L_0x0301:
        r14 = 1500; // 0x5dc float:2.102E-42 double:7.41E-321;
        r12 = r12 + r14;
        r8 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r8 <= 0) goto L_0x0313;
    L_0x0308:
        r1.v = r9;
        r12 = r1.u;
        r8 = (r12 > r26 ? 1 : (r12 == r26 ? 0 : -1));
        if (r8 < 0) goto L_0x0311;
    L_0x0310:
        goto L_0x0313;
    L_0x0311:
        r11 = 30;
    L_0x0313:
        r8 = r1.j;
        r12 = r1.t;
        r7 = r7 + r12;
        if (r8 <= r7) goto L_0x032f;
    L_0x031a:
        r13 = r1.u;
        r7 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1));
        if (r7 <= 0) goto L_0x032f;
    L_0x0320:
        r15 = 1500; // 0x5dc float:2.102E-42 double:7.41E-321;
        r13 = r13 + r15;
        r7 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1));
        if (r7 <= 0) goto L_0x032f;
    L_0x0327:
        r1.u = r9;
        r13 = r1.v;
        r7 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1));
        if (r7 < 0) goto L_0x0330;
    L_0x032f:
        r4 = r11;
    L_0x0330:
        if (r8 >= r12) goto L_0x0342;
    L_0x0332:
        r7 = r1.u;
        r11 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1));
        if (r11 >= 0) goto L_0x0342;
    L_0x0338:
        r7 = r1.v;
        r11 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1));
        if (r11 >= 0) goto L_0x0342;
    L_0x033e:
        r1.u = r2;
        r4 = 28;
    L_0x0342:
        if (r5 >= r6) goto L_0x0350;
    L_0x0344:
        r7 = r1.v;
        r11 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1));
        if (r11 >= 0) goto L_0x0350;
    L_0x034a:
        r1.v = r2;
        r1.u = r9;
        r4 = 29;
    L_0x0350:
        if (r5 >= r6) goto L_0x036a;
    L_0x0352:
        r5 = r1.w;
        r7 = (r5 > r26 ? 1 : (r5 == r26 ? 0 : -1));
        if (r7 < 0) goto L_0x0367;
    L_0x0358:
        r7 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        r5 = r5 + r7;
        r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x036c;
    L_0x035f:
        r2 = "Network health error detected";
        defpackage.xtl.c(r2);
        r4 = 12;
        goto L_0x036c;
    L_0x0367:
        r1.w = r2;
        goto L_0x036c;
    L_0x036a:
        r1.w = r9;
    L_0x036c:
        if (r4 <= 0) goto L_0x0379;
    L_0x036e:
        r2 = r1.s;
        if (r4 == r2) goto L_0x0379;
    L_0x0372:
        r1.s = r4;
        r1 = r1.l;
        r1.a(r4);
    L_0x0379:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acdk.run():void");
    }

    /* synthetic */ acdk(acdg acdg) {
        this.a = acdg;
    }
}
