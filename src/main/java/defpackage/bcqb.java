package defpackage;

/* renamed from: bcqb */
public final class bcqb extends IllegalArgumentException {
    public static final long serialVersionUID = 2858712538216L;

    public bcqb(String str) {
        super(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ea  */
    public bcqb(long r17, java.lang.String r19) {
        /*
        r16 = this;
        r0 = r19;
        r1 = defpackage.bcsc.a;
        r2 = "yyyy-MM-dd'T'HH:mm:ss.SSS";
        r1 = r1.get(r2);
        r1 = (defpackage.bcsf) r1;
        r3 = 3;
        if (r1 != 0) goto L_0x01f6;
    L_0x000f:
        r1 = new bcse;
        r1.<init>();
        r4 = 25;
        r5 = 1;
        r6 = new int[r5];
        r7 = 0;
        r8 = 0;
    L_0x001b:
        if (r8 >= r4) goto L_0x01dc;
    L_0x001d:
        r6[r7] = r8;
        r8 = defpackage.bcsc.a(r2, r6);
        r9 = r6[r7];
        r10 = r8.length();
        if (r10 == 0) goto L_0x01dc;
    L_0x002b:
        r11 = r8.charAt(r7);
        r12 = 39;
        if (r11 == r12) goto L_0x01be;
    L_0x0033:
        r12 = 75;
        r13 = 2;
        if (r11 == r12) goto L_0x01b8;
    L_0x0038:
        r12 = 77;
        r14 = 4;
        if (r11 == r12) goto L_0x01a4;
    L_0x003d:
        r12 = 83;
        if (r11 == r12) goto L_0x01a0;
    L_0x0041:
        r12 = 97;
        if (r11 == r12) goto L_0x019a;
    L_0x0045:
        r12 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r11 == r12) goto L_0x0194;
    L_0x0049:
        r12 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        if (r11 == r12) goto L_0x018e;
    L_0x004d:
        r12 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r11 == r12) goto L_0x018a;
    L_0x0051:
        r12 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r11 == r12) goto L_0x0186;
    L_0x0055:
        r12 = 71;
        if (r11 == r12) goto L_0x0180;
    L_0x0059:
        r12 = 72;
        if (r11 == r12) goto L_0x017c;
    L_0x005d:
        r12 = 89;
        if (r11 == r12) goto L_0x00e6;
    L_0x0061:
        r15 = 90;
        if (r11 == r15) goto L_0x00cd;
    L_0x0065:
        r15 = 100;
        if (r11 == r15) goto L_0x00c8;
    L_0x0069:
        r15 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r11 == r15) goto L_0x00c3;
    L_0x006d:
        switch(r11) {
            case 67: goto L_0x00bc;
            case 68: goto L_0x00b7;
            case 69: goto L_0x00a7;
            default: goto L_0x0070;
        };
    L_0x0070:
        switch(r11) {
            case 119: goto L_0x00a2;
            case 120: goto L_0x00e6;
            case 121: goto L_0x00e6;
            case 122: goto L_0x008b;
            default: goto L_0x0073;
        };
    L_0x0073:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Illegal pattern component: ";
        r2 = r8.length();
        if (r2 != 0) goto L_0x0083;
    L_0x007d:
        r2 = new java.lang.String;
        r2.<init>(r1);
        goto L_0x0087;
    L_0x0083:
        r2 = r1.concat(r8);
    L_0x0087:
        r0.<init>(r2);
        throw r0;
    L_0x008b:
        if (r10 < r14) goto L_0x0098;
    L_0x008d:
        r8 = new bcsr;
        r8.<init>(r7);
        r10 = 0;
        r1.a(r8, r10);
        goto L_0x01d8;
    L_0x0098:
        r8 = new bcsr;
        r8.<init>(r5);
        r1.a(r8, r8);
        goto L_0x01d8;
    L_0x00a2:
        r1.g(r10);
        goto L_0x01d8;
    L_0x00a7:
        if (r10 < r14) goto L_0x00b0;
    L_0x00a9:
        r8 = defpackage.bcpm.l;
        r1.a(r8);
        goto L_0x01d8;
    L_0x00b0:
        r8 = defpackage.bcpm.l;
        r1.b(r8);
        goto L_0x01d8;
    L_0x00b7:
        r1.f(r10);
        goto L_0x01d8;
    L_0x00bc:
        r8 = defpackage.bcpm.c;
        r1.b(r8, r10, r10);
        goto L_0x01d8;
    L_0x00c3:
        r1.d(r10);
        goto L_0x01d8;
    L_0x00c8:
        r1.e(r10);
        goto L_0x01d8;
    L_0x00cd:
        r8 = "Z";
        if (r10 != r5) goto L_0x00d6;
    L_0x00d1:
        r1.a(r8, r7);
        goto L_0x01d8;
    L_0x00d6:
        if (r10 == r13) goto L_0x00e1;
    L_0x00d8:
        r8 = defpackage.bcso.a;
        r10 = defpackage.bcso.a;
        r1.a(r8, r10);
        goto L_0x01d8;
    L_0x00e1:
        r1.a(r8, r5);
        goto L_0x01d8;
    L_0x00e6:
        r8 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        if (r10 == r13) goto L_0x0123;
    L_0x00ea:
        r13 = r9 + 1;
        r14 = 9;
        if (r13 < r4) goto L_0x00f1;
    L_0x00f0:
        goto L_0x0108;
    L_0x00f1:
        r13 = r6[r7];
        r13 = r13 + r5;
        r6[r7] = r13;
        r13 = defpackage.bcsc.a(r2, r6);
        r13 = defpackage.bcsc.a(r13);
        if (r13 != 0) goto L_0x0101;
    L_0x0100:
        goto L_0x0102;
    L_0x0101:
        r14 = r10;
    L_0x0102:
        r13 = r6[r7];
        r13 = r13 + -1;
        r6[r7] = r13;
    L_0x0108:
        if (r11 == r12) goto L_0x011c;
    L_0x010a:
        if (r11 == r8) goto L_0x0117;
    L_0x010c:
        r8 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        if (r11 == r8) goto L_0x0112;
    L_0x0110:
        goto L_0x01d8;
    L_0x0112:
        r1.c(r10, r14);
        goto L_0x01d8;
    L_0x0117:
        r1.b(r10, r14);
        goto L_0x01d8;
    L_0x011c:
        r8 = defpackage.bcpm.b;
        r1.a(r8, r10, r14);
        goto L_0x01d8;
    L_0x0123:
        r10 = r9 + 1;
        if (r10 < r4) goto L_0x0129;
    L_0x0127:
        r10 = 1;
        goto L_0x013d;
    L_0x0129:
        r10 = r6[r7];
        r10 = r10 + r5;
        r6[r7] = r10;
        r10 = defpackage.bcsc.a(r2, r6);
        r10 = defpackage.bcsc.a(r10);
        r10 = r10 ^ r5;
        r12 = r6[r7];
        r12 = r12 + -1;
        r6[r7] = r12;
    L_0x013d:
        if (r11 == r8) goto L_0x015e;
    L_0x013f:
        r8 = new bcpk;
        r8.<init>();
        r11 = r8.b;
        r11 = r11.E();
        r12 = r8.a;
        r8 = r11.a(r12);
        r11 = new bcst;
        r12 = defpackage.bcpm.e;
        r8 = r8 + -30;
        r11.<init>(r12, r8, r10);
        r1.a(r11);
        goto L_0x01d8;
    L_0x015e:
        r8 = new bcpk;
        r8.<init>();
        r11 = r8.b;
        r11 = r11.z();
        r12 = r8.a;
        r8 = r11.a(r12);
        r11 = new bcst;
        r12 = defpackage.bcpm.j;
        r8 = r8 + -30;
        r11.<init>(r12, r8, r10);
        r1.a(r11);
        goto L_0x01d8;
    L_0x017c:
        r1.c(r10);
        goto L_0x01d8;
    L_0x0180:
        r8 = defpackage.bcpm.a;
        r1.a(r8);
        goto L_0x01d8;
    L_0x0186:
        r1.a(r10);
        goto L_0x01d8;
    L_0x018a:
        r1.b(r10);
        goto L_0x01d8;
    L_0x018e:
        r8 = defpackage.bcpm.p;
        r1.a(r8, r10, r13);
        goto L_0x01d8;
    L_0x0194:
        r8 = defpackage.bcpm.o;
        r1.a(r8, r10, r13);
        goto L_0x01d8;
    L_0x019a:
        r8 = defpackage.bcpm.m;
        r1.a(r8);
        goto L_0x01d8;
    L_0x01a0:
        r1.a(r10, r10);
        goto L_0x01d8;
    L_0x01a4:
        if (r10 >= r3) goto L_0x01aa;
    L_0x01a6:
        r1.h(r10);
        goto L_0x01d8;
    L_0x01aa:
        if (r10 < r14) goto L_0x01b2;
    L_0x01ac:
        r8 = defpackage.bcpm.g;
        r1.a(r8);
        goto L_0x01d8;
    L_0x01b2:
        r8 = defpackage.bcpm.g;
        r1.b(r8);
        goto L_0x01d8;
    L_0x01b8:
        r8 = defpackage.bcpm.n;
        r1.a(r8, r10, r13);
        goto L_0x01d8;
    L_0x01be:
        r8 = r8.substring(r5);
        r10 = r8.length();
        if (r10 != r5) goto L_0x01d0;
    L_0x01c8:
        r8 = r8.charAt(r7);
        r1.a(r8);
        goto L_0x01d8;
    L_0x01d0:
        r10 = new java.lang.String;
        r10.<init>(r8);
        r1.a(r10);
    L_0x01d8:
        r8 = r9 + 1;
        goto L_0x001b;
    L_0x01dc:
        r1 = r1.a();
        r4 = defpackage.bcsc.a;
        r4 = r4.size();
        r5 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r4 >= r5) goto L_0x01f6;
    L_0x01ea:
        r4 = defpackage.bcsc.a;
        r2 = r4.putIfAbsent(r2, r1);
        r2 = (defpackage.bcsf) r2;
        if (r2 != 0) goto L_0x01f5;
    L_0x01f4:
        goto L_0x01f6;
    L_0x01f5:
        r1 = r2;
    L_0x01f6:
        r2 = new bcqa;
        r4 = r17;
        r2.<init>(r4);
        r1 = r1.a(r2);
        if (r0 == 0) goto L_0x021f;
    L_0x0203:
        r2 = r19.length();
        r4 = new java.lang.StringBuilder;
        r2 = r2 + r3;
        r4.<init>(r2);
        r2 = " (";
        r4.append(r2);
        r4.append(r0);
        r0 = ")";
        r4.append(r0);
        r0 = r4.toString();
        goto L_0x0221;
    L_0x021f:
        r0 = "";
    L_0x0221:
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r4 = new java.lang.StringBuilder;
        r2 = r2 + 82;
        r2 = r2 + r3;
        r4.<init>(r2);
        r2 = "Illegal instant due to time zone offset transition (daylight savings time 'gap'): ";
        r4.append(r2);
        r4.append(r1);
        r4.append(r0);
        r0 = r4.toString();
        r1 = r16;
        r1.<init>(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcqb.<init>(long, java.lang.String):void");
    }
}
