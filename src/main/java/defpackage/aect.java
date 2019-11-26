package defpackage;

/* renamed from: aect */
public final class aect extends afiq {
    private final ovi a;
    private final oeo b;
    private aemr c;

    public final ovi a() {
        return this.a;
    }

    public final void a(aajj aajj, aeoj aeoj) {
        this.b.a = aajj.S();
        aemr aemr = this.c;
        if (aemr != null) {
            aemr.a.set(aeoj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e9 A:{LOOP_END, LOOP:0: B:62:0x00e7->B:63:0x00e9} */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0122 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e9 A:{LOOP_END, LOOP:0: B:62:0x00e7->B:63:0x00e9} */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0122 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARNING: Missing block: B:16:0x003d, code skipped:
            if (r5.c == false) goto L_0x003f;
     */
    /* JADX WARNING: Missing block: B:18:0x0041, code skipped:
            if (r1 != defpackage.aajl.CRONET_QUIC) goto L_0x0048;
     */
    /* JADX WARNING: Missing block: B:19:0x0044, code skipped:
            r1 = r30;
            r5 = true;
     */
    aect(java.lang.String r29, defpackage.aedf r30, defpackage.aajj r31, defpackage.zzl r32, defpackage.aeoj r33, defpackage.aajl r34, java.util.concurrent.Executor r35, defpackage.owt[] r36, defpackage.aeep r37, defpackage.aelg r38, defpackage.xsd r39, defpackage.afio r40, defpackage.aelh r41, java.util.concurrent.ScheduledExecutorService r42, defpackage.xsc r43, defpackage.afhi r44, defpackage.bcaa r45, defpackage.aenq r46, defpackage.xhv r47, defpackage.aeni r48, defpackage.aekt r49, int r50, boolean r51, defpackage.afjc r52, defpackage.afjv r53, defpackage.aeuy r54) {
        /*
        r28 = this;
        r0 = r28;
        r10 = r31;
        r1 = r34;
        r2 = r36;
        r3 = r37;
        r4 = r38;
        r11 = r40;
        r28.<init>();
        r5 = defpackage.aajl.OS_DEFAULT;
        r12 = 2;
        r13 = 1;
        if (r1 == r5) goto L_0x007b;
    L_0x0017:
        r5 = r31.i();
        if (r5 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0027;
    L_0x001e:
        r5 = defpackage.aajl.CRONET;
        if (r1 == r5) goto L_0x0027;
    L_0x0022:
        r5 = defpackage.aajl.CRONET_QUIC;
        if (r1 == r5) goto L_0x0027;
    L_0x0026:
        goto L_0x007b;
    L_0x0027:
        r5 = defpackage.aajl.OS_DEFAULT;
        if (r1 == r5) goto L_0x0048;
    L_0x002b:
        r5 = r10.c;
        r6 = r5.a;
        r7 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r6 = r6 & r7;
        if (r6 == 0) goto L_0x003f;
    L_0x0035:
        r5 = r5.k;
        if (r5 != 0) goto L_0x003b;
    L_0x0039:
        r5 = defpackage.avjo.d;
    L_0x003b:
        r5 = r5.c;
        if (r5 != 0) goto L_0x0044;
    L_0x003f:
        r5 = defpackage.aajl.CRONET_QUIC;
        if (r1 == r5) goto L_0x0044;
    L_0x0043:
        goto L_0x0048;
    L_0x0044:
        r1 = r30;
        r5 = 1;
        goto L_0x004b;
    L_0x0048:
        r1 = r30;
        r5 = 0;
    L_0x004b:
        r16 = r1.a(r5);
        if (r16 == 0) goto L_0x007b;
    L_0x0051:
        r19 = r31.F();
        r20 = r31.G();
        r1 = r10.c;
        r5 = r1.a;
        r5 = r5 & r12;
        if (r5 == 0) goto L_0x006e;
    L_0x0060:
        r1 = r1.d;
        if (r1 != 0) goto L_0x0066;
    L_0x0064:
        r1 = defpackage.arhh.bv;
    L_0x0066:
        r1 = r1.ae;
        if (r1 != 0) goto L_0x006b;
    L_0x006a:
        goto L_0x006e;
    L_0x006b:
        r21 = 1;
        goto L_0x0070;
    L_0x006e:
        r21 = 0;
    L_0x0070:
        r1 = new oep;
        r18 = defpackage.ovx.i;
        r15 = r1;
        r17 = r35;
        r15.<init>(r16, r17, r18, r19, r20, r21);
        goto L_0x0090;
    L_0x007b:
        r25 = r31.F();
        r26 = r31.G();
        r1 = new ovr;
        r24 = defpackage.ovx.i;
        r27 = 0;
        r22 = r1;
        r23 = r29;
        r22.<init>(r23, r24, r25, r26, r27);
    L_0x0090:
        r5 = r1;
        r1 = r48;
        r1 = r1.a(r5);
        if (r3 != 0) goto L_0x009a;
    L_0x0099:
        goto L_0x00a6;
    L_0x009a:
        if (r4 == 0) goto L_0x00a6;
    L_0x009c:
        r5 = r4.b;
        if (r5 == 0) goto L_0x00a6;
    L_0x00a0:
        r4 = r4.b;
        r1 = r3.a(r1, r4);
    L_0x00a6:
        r3 = r32.b();
        if (r3 != 0) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00c4;
    L_0x00ad:
        r3 = r3.k;
        if (r3 != 0) goto L_0x00b3;
    L_0x00b1:
        r3 = defpackage.auuo.k;
    L_0x00b3:
        r3 = r3.g;
        if (r3 != 0) goto L_0x00b9;
    L_0x00b7:
        r3 = defpackage.arhk.z;
    L_0x00b9:
        r3 = r3.c;
        if (r3 != 0) goto L_0x00be;
    L_0x00bd:
        goto L_0x00c4;
    L_0x00be:
        r3 = r49;
        r1 = r3.a(r1);
    L_0x00c4:
        r3 = new oeo;
        r4 = r50;
        if (r4 == r12) goto L_0x00cf;
    L_0x00ca:
        r4 = r31.S();
        goto L_0x00e0;
    L_0x00cf:
        r4 = r10.c;
        r5 = r4.a;
        r5 = r5 & r12;
        if (r5 == 0) goto L_0x00df;
    L_0x00d6:
        r4 = r4.d;
        if (r4 != 0) goto L_0x00dc;
    L_0x00da:
        r4 = defpackage.arhh.bv;
    L_0x00dc:
        r4 = r4.bj;
        goto L_0x00e0;
    L_0x00df:
        r4 = 0;
    L_0x00e0:
        r5 = -1;
        r3.<init>(r1, r4, r5);
        r1 = r2.length;
        r4 = 0;
    L_0x00e7:
        if (r4 >= r1) goto L_0x00f1;
    L_0x00e9:
        r5 = r2[r4];
        r3.a(r5);
        r4 = r4 + 1;
        goto L_0x00e7;
    L_0x00f1:
        r0.b = r3;
        r1 = new aela;
        r1.<init>(r3);
        r3 = new aekv;
        r2 = new aecw;
        r4 = r39;
        r15 = r44;
        r2.<init>(r4, r15);
        r9 = r47;
        r3.<init>(r1, r9, r10, r2);
        r1 = r10.c;
        r2 = r1.a;
        r2 = r2 & r12;
        if (r2 == 0) goto L_0x011d;
    L_0x010f:
        r1 = r1.d;
        if (r1 != 0) goto L_0x0115;
    L_0x0113:
        r1 = defpackage.arhh.bv;
    L_0x0115:
        r1 = r1.bp;
        if (r1 != 0) goto L_0x011a;
    L_0x0119:
        goto L_0x011d;
    L_0x011a:
        r16 = 1;
        goto L_0x011f;
    L_0x011d:
        r16 = 0;
    L_0x011f:
        if (r16 != 0) goto L_0x0122;
    L_0x0121:
        goto L_0x0141;
    L_0x0122:
        if (r51 == 0) goto L_0x0141;
    L_0x0124:
        r8 = new aemr;
        r1 = r45.get();
        r5 = r1;
        r5 = (defpackage.aemu) r5;
        r1 = r8;
        r2 = r46;
        r4 = r44;
        r6 = r42;
        r7 = r31;
        r14 = r8;
        r8 = r43;
        r9 = r33;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r0.c = r14;
        goto L_0x0142;
    L_0x0141:
        r14 = r3;
    L_0x0142:
        if (r11 == 0) goto L_0x014a;
    L_0x0144:
        r1 = r11.a(r14);
        r3 = r1;
        goto L_0x014b;
    L_0x014a:
        r3 = r14;
    L_0x014b:
        if (r51 != 0) goto L_0x0150;
    L_0x014d:
        r0.a = r3;
        return;
    L_0x0150:
        if (r16 != 0) goto L_0x0170;
    L_0x0152:
        r11 = new aemr;
        r1 = r45.get();
        r5 = r1;
        r5 = (defpackage.aemu) r5;
        r1 = r11;
        r2 = r46;
        r4 = r44;
        r6 = r42;
        r7 = r31;
        r8 = r43;
        r9 = r33;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r0.c = r11;
        r1 = r52;
        goto L_0x0173;
    L_0x0170:
        r1 = r52;
        r11 = r3;
    L_0x0173:
        r2 = r1.d;
        r2 = r2.b();
        if (r2 != 0) goto L_0x017e;
    L_0x017b:
        r3 = r43;
        goto L_0x0198;
    L_0x017e:
        r2 = r2.k;
        if (r2 != 0) goto L_0x0184;
    L_0x0182:
        r2 = defpackage.auuo.k;
    L_0x0184:
        r2 = r2.i;
        if (r2 != 0) goto L_0x018a;
    L_0x0188:
        r2 = defpackage.aorz.j;
    L_0x018a:
        r2 = r2.i;
        if (r2 == 0) goto L_0x017b;
    L_0x018e:
        r2 = new afgn;
        r3 = r43;
        r4 = r54;
        r2.<init>(r11, r4, r3);
        r11 = r2;
    L_0x0198:
        r2 = r32.b();
        if (r2 != 0) goto L_0x01a0;
    L_0x019e:
        r14 = 0;
        goto L_0x01ae;
    L_0x01a0:
        r2 = r2.k;
        if (r2 != 0) goto L_0x01a6;
    L_0x01a4:
        r2 = defpackage.auuo.k;
    L_0x01a6:
        r2 = r2.g;
        if (r2 != 0) goto L_0x01ac;
    L_0x01aa:
        r2 = defpackage.arhk.z;
    L_0x01ac:
        r14 = r2.d;
    L_0x01ae:
        if (r14 <= 0) goto L_0x01b6;
    L_0x01b0:
        r2 = new afiu;
        r2.<init>(r11, r14);
        r11 = r2;
    L_0x01b6:
        r2 = r32.b();
        if (r2 != 0) goto L_0x01bd;
    L_0x01bc:
        goto L_0x0205;
    L_0x01bd:
        r2 = r2.k;
        if (r2 != 0) goto L_0x01c3;
    L_0x01c1:
        r2 = defpackage.auuo.k;
    L_0x01c3:
        r2 = r2.g;
        if (r2 != 0) goto L_0x01c9;
    L_0x01c7:
        r2 = defpackage.arhk.z;
    L_0x01c9:
        r2 = r2.y;
        if (r2 == 0) goto L_0x0205;
    L_0x01cd:
        r2 = r10.c;
        r4 = r2.a;
        r4 = r4 & r13;
        if (r4 == 0) goto L_0x0205;
    L_0x01d4:
        r2 = r2.c;
        if (r2 != 0) goto L_0x01da;
    L_0x01d8:
        r2 = defpackage.aqhl.d;
    L_0x01da:
        r2 = r2.a;
        r2 = r2 & r12;
        if (r2 == 0) goto L_0x0205;
    L_0x01df:
        r2 = r10.c;
        r2 = r2.c;
        if (r2 != 0) goto L_0x01e7;
    L_0x01e5:
        r2 = defpackage.aqhl.d;
    L_0x01e7:
        r2 = r2.c;
        if (r2 != 0) goto L_0x01ed;
    L_0x01eb:
        r2 = defpackage.aqhn.c;
    L_0x01ed:
        r2 = r2.b;
        if (r2 == 0) goto L_0x0205;
    L_0x01f1:
        r2 = new afiv;
        r32 = r2;
        r33 = r11;
        r34 = r47;
        r35 = r31;
        r36 = r43;
        r37 = r53;
        r38 = r52;
        r32.<init>(r33, r34, r35, r36, r37, r38);
        r11 = r2;
    L_0x0205:
        r1 = new aeli;
        r2 = r41;
        r2 = r2.a;
        r1.<init>(r11, r2);
        r0.a = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aect.<init>(java.lang.String, aedf, aajj, zzl, aeoj, aajl, java.util.concurrent.Executor, owt[], aeep, aelg, xsd, afio, aelh, java.util.concurrent.ScheduledExecutorService, xsc, afhi, bcaa, aenq, xhv, aeni, aekt, int, boolean, afjc, afjv, aeuy):void");
    }
}
