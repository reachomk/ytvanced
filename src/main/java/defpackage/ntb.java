package defpackage;

/* renamed from: ntb */
final class ntb extends ntk {
    private nwl e;
    private nwj f;
    private boolean g;

    ntb() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fd A:{LOOP_START, PHI: r4 r13 , LOOP:2: B:34:0x00fd->B:37:0x010c} */
    public final int a(defpackage.nrb r24, defpackage.nrm r25) {
        /*
        r23 = this;
        r0 = r23;
        r1 = r24;
        r2 = r1;
        r2 = (defpackage.nqx) r2;
        r7 = r2.c;
        r2 = r0.b;
        r3 = r0.a;
        r1 = r2.a(r1, r3);
        r2 = -1;
        if (r1 == 0) goto L_0x0172;
    L_0x0014:
        r1 = r0.a;
        r3 = r1.a;
        r4 = r0.e;
        r9 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r11 = 4;
        r12 = 0;
        if (r4 != 0) goto L_0x0061;
    L_0x0021:
        r1 = new nwl;
        r1.<init>(r3);
        r0.e = r1;
        r1 = 9;
        r2 = r0.a;
        r2 = r2.c;
        r1 = java.util.Arrays.copyOfRange(r3, r1, r2);
        r2 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        r1[r11] = r2;
        r21 = java.util.Collections.singletonList(r1);
        r1 = r0.e;
        r2 = r1.e;
        r3 = r1.c;
        r4 = r1.f;
        r4 = r4 * r9;
        r6 = (long) r3;
        r17 = r4 / r6;
        r1 = r1.d;
        r13 = 0;
        r15 = r2 * r3;
        r16 = -1;
        r22 = 0;
        r14 = "audio/x-flac";
        r19 = r1;
        r20 = r3;
        r1 = defpackage.nmx.a(r13, r14, r15, r16, r17, r19, r20, r21, r22);
        r2 = r0.c;
        r2.a(r1);
        goto L_0x0153;
    L_0x0061:
        r3 = r3[r12];
        r13 = 1;
        if (r3 == r2) goto L_0x009b;
    L_0x0066:
        r2 = r3 & 127;
        r3 = 3;
        if (r2 != r3) goto L_0x0153;
    L_0x006b:
        r2 = r0.f;
        if (r2 != 0) goto L_0x0153;
    L_0x006f:
        r1.d(r13);
        r2 = r1.g();
        r2 = r2 / 18;
        r3 = new long[r2];
        r4 = new long[r2];
        r5 = 0;
    L_0x007d:
        if (r5 >= r2) goto L_0x0092;
    L_0x007f:
        r6 = r1.l();
        r3[r5] = r6;
        r6 = r1.l();
        r4[r5] = r6;
        r6 = 2;
        r1.d(r6);
        r5 = r5 + 1;
        goto L_0x007d;
    L_0x0092:
        r1 = new nwj;
        r1.<init>(r3, r4);
        r0.f = r1;
        goto L_0x0153;
    L_0x009b:
        r1 = r0.g;
        if (r1 != 0) goto L_0x00bf;
    L_0x009f:
        r1 = r0.f;
        if (r1 == 0) goto L_0x00b6;
    L_0x00a3:
        r14 = r0.d;
        r3 = r4.c;
        r15 = new nwm;
        r5 = (long) r3;
        r3 = r15;
        r4 = r1;
        r3.<init>(r4, r5, r7);
        r14.a(r15);
        r1 = 0;
        r0.f = r1;
        goto L_0x00bd;
    L_0x00b6:
        r1 = r0.d;
        r3 = defpackage.nrq.f;
        r1.a(r3);
    L_0x00bd:
        r0.g = r13;
    L_0x00bf:
        r1 = r0.c;
        r3 = r0.a;
        r4 = r3.c;
        r1.a(r3, r4);
        r1 = r0.a;
        r1.c(r12);
        r1 = r0.e;
        r3 = r0.a;
        r3.d(r11);
        r4 = r3.a;
        r5 = r3.b;
        r4 = r4[r5];
        r4 = (long) r4;
        r6 = 7;
        r7 = 7;
    L_0x00dd:
        r8 = 6;
        if (r7 < 0) goto L_0x00fa;
    L_0x00e0:
        r11 = r13 << r7;
        r14 = (long) r11;
        r14 = r14 & r4;
        r16 = 0;
        r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r18 == 0) goto L_0x00ed;
    L_0x00ea:
        r7 = r7 + -1;
        goto L_0x00dd;
    L_0x00ed:
        if (r7 >= r8) goto L_0x00f5;
    L_0x00ef:
        r11 = r11 + r2;
        r14 = (long) r11;
        r4 = r4 & r14;
        r2 = 7 - r7;
        goto L_0x00fb;
    L_0x00f5:
        if (r7 == r6) goto L_0x00f8;
    L_0x00f7:
        goto L_0x00fa;
    L_0x00f8:
        r2 = 1;
        goto L_0x00fb;
    L_0x00fa:
        r2 = 0;
    L_0x00fb:
        if (r2 == 0) goto L_0x0159;
    L_0x00fd:
        if (r13 >= r2) goto L_0x012d;
    L_0x00ff:
        r6 = r3.a;
        r7 = r3.b;
        r7 = r7 + r13;
        r6 = r6[r7];
        r7 = r6 & 192;
        r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r7 != r11) goto L_0x0114;
    L_0x010c:
        r4 = r4 << r8;
        r6 = r6 & 63;
        r6 = (long) r6;
        r4 = r4 | r6;
        r13 = r13 + 1;
        goto L_0x00fd;
    L_0x0114:
        r1 = new java.lang.NumberFormatException;
        r2 = new java.lang.StringBuilder;
        r3 = 62;
        r2.<init>(r3);
        r3 = "Invalid UTF-8 sequence continuation byte: ";
        r2.append(r3);
        r2.append(r4);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x012d:
        r6 = r3.b;
        r6 = r6 + r2;
        r3.b = r6;
        r2 = r1.a;
        r3 = r1.b;
        if (r2 != r3) goto L_0x013b;
    L_0x0138:
        r2 = (long) r2;
        r4 = r4 * r2;
    L_0x013b:
        r1 = r1.c;
        r4 = r4 * r9;
        r1 = (long) r1;
        r14 = r4 / r1;
        r13 = r0.c;
        r16 = 1;
        r1 = r0.a;
        r1 = r1.c;
        r18 = 0;
        r19 = 0;
        r17 = r1;
        r13.a(r14, r16, r17, r18, r19);
    L_0x0153:
        r1 = r0.a;
        r1.a();
        return r12;
    L_0x0159:
        r1 = new java.lang.NumberFormatException;
        r2 = new java.lang.StringBuilder;
        r3 = 55;
        r2.<init>(r3);
        r3 = "Invalid UTF-8 sequence first byte: ";
        r2.append(r3);
        r2.append(r4);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x0172:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntb.a(nrb, nrm):int");
    }
}
