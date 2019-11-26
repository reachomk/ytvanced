package defpackage;

import android.util.Pair;

/* renamed from: nsh */
final class nsh {
    private static final int a = nxf.c("cenc");

    /* JADX WARNING: Removed duplicated region for block: B:157:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08b3  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x088a  */
    /* JADX WARNING: Missing block: B:31:0x0084, code skipped:
            if (r10 != 0) goto L_0x008b;
     */
    /* JADX WARNING: Missing block: B:33:0x008a, code skipped:
            r10 = -1;
     */
    public static defpackage.nsx a(defpackage.nsf r45, defpackage.nsi r46, long r47, boolean r49) {
        /*
        r0 = r45;
        r1 = defpackage.nsg.H;
        r1 = r0.b(r1);
        r2 = defpackage.nsg.V;
        r2 = r1.a(r2);
        r2 = r2.a;
        r3 = 16;
        r2.c(r3);
        r6 = r2.j();
        r2 = defpackage.nsx.b;
        r4 = 0;
        if (r6 == r2) goto L_0x0034;
    L_0x001e:
        r2 = defpackage.nsx.a;
        if (r6 == r2) goto L_0x0034;
    L_0x0022:
        r2 = defpackage.nsx.c;
        if (r6 == r2) goto L_0x0034;
    L_0x0026:
        r2 = defpackage.nsx.d;
        if (r6 == r2) goto L_0x0034;
    L_0x002a:
        r2 = defpackage.nsx.e;
        if (r6 == r2) goto L_0x0034;
    L_0x002e:
        r2 = defpackage.nsx.f;
        if (r6 != r2) goto L_0x0033;
    L_0x0032:
        goto L_0x0034;
    L_0x0033:
        return r4;
    L_0x0034:
        r2 = defpackage.nsg.R;
        r2 = r0.a(r2);
        r2 = r2.a;
        r5 = 8;
        r2.c(r5);
        r7 = r2.j();
        r7 = defpackage.nsg.c(r7);
        if (r7 != 0) goto L_0x004e;
    L_0x004b:
        r8 = 8;
        goto L_0x0050;
    L_0x004e:
        r8 = 16;
    L_0x0050:
        r2.d(r8);
        r8 = r2.j();
        r9 = 4;
        r2.d(r9);
        r10 = r2.b;
        if (r7 != 0) goto L_0x0061;
    L_0x005f:
        r11 = 4;
        goto L_0x0063;
    L_0x0061:
        r11 = 8;
    L_0x0063:
        r13 = 0;
    L_0x0064:
        r14 = -1;
        r4 = -1;
        if (r13 >= r11) goto L_0x0087;
    L_0x0069:
        r12 = r2.a;
        r16 = r10 + r13;
        r12 = r12[r16];
        if (r12 != r4) goto L_0x0075;
    L_0x0071:
        r13 = r13 + 1;
        r4 = 0;
        goto L_0x0064;
    L_0x0075:
        if (r7 == 0) goto L_0x007c;
    L_0x0077:
        r10 = r2.p();
        goto L_0x0080;
    L_0x007c:
        r10 = r2.h();
    L_0x0080:
        r12 = 0;
        r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r7 == 0) goto L_0x008a;
    L_0x0086:
        goto L_0x008b;
    L_0x0087:
        r2.d(r11);
    L_0x008a:
        r10 = r14;
    L_0x008b:
        r2.d(r3);
        r7 = r2.j();
        r12 = r2.j();
        r2.d(r9);
        r13 = r2.j();
        r2 = r2.j();
        r9 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        if (r7 != 0) goto L_0x00b0;
    L_0x00a5:
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r12 != r4) goto L_0x00b0;
    L_0x00a9:
        if (r13 != r9) goto L_0x00b0;
    L_0x00ab:
        if (r2 != 0) goto L_0x00b0;
    L_0x00ad:
        r12 = 90;
        goto L_0x00cb;
    L_0x00b0:
        if (r7 != 0) goto L_0x00be;
    L_0x00b2:
        if (r12 != r9) goto L_0x00be;
    L_0x00b4:
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r13 != r4) goto L_0x00be;
    L_0x00b8:
        if (r2 == 0) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00be;
    L_0x00bb:
        r12 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x00cb;
    L_0x00be:
        if (r7 != r9) goto L_0x00ca;
    L_0x00c0:
        if (r12 != 0) goto L_0x00ca;
    L_0x00c2:
        if (r13 != 0) goto L_0x00ca;
    L_0x00c4:
        if (r2 == r9) goto L_0x00c7;
    L_0x00c6:
        goto L_0x00ca;
    L_0x00c7:
        r12 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        goto L_0x00cb;
    L_0x00ca:
        r12 = 0;
    L_0x00cb:
        r2 = new nsq;
        r2.<init>(r8, r10, r12);
        r4 = (r47 > r14 ? 1 : (r47 == r14 ? 0 : -1));
        if (r4 != 0) goto L_0x00d9;
    L_0x00d4:
        r7 = r2.b;
        r4 = r46;
        goto L_0x00dd;
    L_0x00d9:
        r4 = r46;
        r7 = r47;
    L_0x00dd:
        r4 = r4.a;
        r4.c(r5);
        r9 = r4.j();
        r9 = defpackage.nsg.c(r9);
        if (r9 != 0) goto L_0x00ef;
    L_0x00ec:
        r9 = 8;
        goto L_0x00f1;
    L_0x00ef:
        r9 = 16;
    L_0x00f1:
        r4.d(r9);
        r17 = r4.h();
        r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1));
        if (r4 == 0) goto L_0x0105;
    L_0x00fc:
        r9 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r11 = r17;
        r14 = defpackage.nxf.a(r7, r9, r11);
    L_0x0105:
        r4 = defpackage.nsg.I;
        r4 = r1.b(r4);
        r7 = defpackage.nsg.J;
        r4 = r4.b(r7);
        r7 = defpackage.nsg.U;
        r1 = r1.a(r7);
        r1 = r1.a;
        r1.c(r5);
        r7 = r1.j();
        r7 = defpackage.nsg.c(r7);
        if (r7 != 0) goto L_0x0129;
    L_0x0126:
        r8 = 8;
        goto L_0x012b;
    L_0x0129:
        r8 = 16;
    L_0x012b:
        r1.d(r8);
        r8 = r1.h();
        if (r7 != 0) goto L_0x0136;
    L_0x0134:
        r7 = 4;
        goto L_0x0138;
    L_0x0136:
        r7 = 8;
    L_0x0138:
        r1.d(r7);
        r1 = r1.e();
        r7 = new java.lang.StringBuilder;
        r13 = 3;
        r7.<init>(r13);
        r10 = r1 >> 10;
        r10 = r10 & 31;
        r10 = r10 + 96;
        r10 = (char) r10;
        r7.append(r10);
        r10 = r1 >> 5;
        r10 = r10 & 31;
        r10 = r10 + 96;
        r10 = (char) r10;
        r7.append(r10);
        r1 = r1 & 31;
        r1 = r1 + 96;
        r1 = (char) r1;
        r7.append(r1);
        r1 = r7.toString();
        r7 = java.lang.Long.valueOf(r8);
        r1 = android.util.Pair.create(r7, r1);
        r7 = defpackage.nsg.W;
        r4 = r4.a(r7);
        r4 = r4.a;
        r12 = r2.a;
        r10 = r2.c;
        r7 = r1.second;
        r11 = r7;
        r11 = (java.lang.String) r11;
        r7 = 12;
        r4.c(r7);
        r9 = r4.j();
        r8 = new nsl;
        r8.<init>(r9);
        r7 = 0;
    L_0x018d:
        if (r7 >= r9) goto L_0x0800;
    L_0x018f:
        r13 = r4.b;
        r3 = r4.j();
        if (r3 <= 0) goto L_0x019b;
    L_0x0197:
        r19 = r7;
        r5 = 1;
        goto L_0x019e;
    L_0x019b:
        r19 = r7;
        r5 = 0;
    L_0x019e:
        r7 = "childAtomSize should be positive";
        defpackage.nwf.a(r5, r7);
        r5 = r4.j();
        r20 = r8;
        r8 = defpackage.nsg.e;
        if (r5 == r8) goto L_0x04b5;
    L_0x01ad:
        r8 = defpackage.nsg.f;
        if (r5 == r8) goto L_0x04b5;
    L_0x01b1:
        r8 = defpackage.nsg.ac;
        if (r5 == r8) goto L_0x04b5;
    L_0x01b5:
        r8 = defpackage.nsg.an;
        if (r5 == r8) goto L_0x04b5;
    L_0x01b9:
        r8 = defpackage.nsg.g;
        if (r5 == r8) goto L_0x04b5;
    L_0x01bd:
        r8 = defpackage.nsg.h;
        if (r5 == r8) goto L_0x04b5;
    L_0x01c1:
        r8 = defpackage.nsg.i;
        if (r5 == r8) goto L_0x04b5;
    L_0x01c5:
        r8 = defpackage.nsg.aL;
        if (r5 == r8) goto L_0x04b5;
    L_0x01c9:
        r8 = defpackage.nsg.aM;
        if (r5 == r8) goto L_0x04b5;
    L_0x01cd:
        r8 = defpackage.nsg.l;
        if (r5 == r8) goto L_0x028c;
    L_0x01d1:
        r8 = defpackage.nsg.ad;
        if (r5 == r8) goto L_0x028c;
    L_0x01d5:
        r8 = defpackage.nsg.q;
        if (r5 == r8) goto L_0x028c;
    L_0x01d9:
        r8 = defpackage.nsg.s;
        if (r5 == r8) goto L_0x028c;
    L_0x01dd:
        r8 = defpackage.nsg.u;
        if (r5 == r8) goto L_0x028c;
    L_0x01e1:
        r8 = defpackage.nsg.x;
        if (r5 == r8) goto L_0x028c;
    L_0x01e5:
        r8 = defpackage.nsg.v;
        if (r5 == r8) goto L_0x028c;
    L_0x01e9:
        r8 = defpackage.nsg.w;
        if (r5 == r8) goto L_0x028c;
    L_0x01ed:
        r8 = defpackage.nsg.az;
        if (r5 == r8) goto L_0x028c;
    L_0x01f1:
        r8 = defpackage.nsg.aA;
        if (r5 == r8) goto L_0x028c;
    L_0x01f5:
        r8 = defpackage.nsg.o;
        if (r5 == r8) goto L_0x028c;
    L_0x01f9:
        r8 = defpackage.nsg.p;
        if (r5 == r8) goto L_0x028c;
    L_0x01fd:
        r8 = defpackage.nsg.m;
        if (r5 == r8) goto L_0x028c;
    L_0x0201:
        r7 = defpackage.nsg.am;
        if (r5 != r7) goto L_0x022c;
    L_0x0205:
        r7 = java.lang.Integer.toString(r12);
        r5 = -1;
        r8 = "application/ttml+xml";
        r33 = r19;
        r34 = r6;
        r6 = r20;
        r35 = r9;
        r9 = r5;
        r36 = r10;
        r5 = r11;
        r10 = r14;
        r37 = r12;
        r12 = r5;
        r7 = defpackage.nmx.a(r7, r8, r9, r10, r12);
        r6.b = r7;
    L_0x0222:
        r38 = r1;
        r39 = r2;
        r41 = r3;
        r16 = r5;
        goto L_0x02e7;
    L_0x022c:
        r34 = r6;
        r35 = r9;
        r36 = r10;
        r37 = r12;
        r33 = r19;
        r6 = r20;
        r12 = r11;
        r7 = defpackage.nsg.aw;
        if (r5 != r7) goto L_0x024d;
    L_0x023d:
        r7 = java.lang.Integer.toString(r37);
        r9 = -1;
        r8 = "application/x-quicktime-tx3g";
        r10 = r14;
        r5 = r12;
        r7 = defpackage.nmx.a(r7, r8, r9, r10, r12);
        r6.b = r7;
        goto L_0x0222;
    L_0x024d:
        r7 = defpackage.nsg.ax;
        if (r5 != r7) goto L_0x0261;
    L_0x0251:
        r7 = java.lang.Integer.toString(r37);
        r9 = -1;
        r8 = "application/x-mp4vtt";
        r10 = r14;
        r5 = r12;
        r7 = defpackage.nmx.a(r7, r8, r9, r10, r12);
        r6.b = r7;
        goto L_0x0222;
    L_0x0261:
        r8 = r12;
        r7 = defpackage.nsg.ay;
        if (r5 != r7) goto L_0x027b;
    L_0x0266:
        r19 = java.lang.Integer.toString(r37);
        r21 = -1;
        r25 = 0;
        r20 = "application/ttml+xml";
        r22 = r14;
        r24 = r8;
        r5 = defpackage.nmx.a(r19, r20, r21, r22, r24, r25);
        r6.b = r5;
        goto L_0x02df;
    L_0x027b:
        r7 = defpackage.nsg.aO;
        if (r5 != r7) goto L_0x02df;
    L_0x027f:
        r5 = java.lang.Integer.toString(r37);
        r7 = "application/x-camera-motion";
        r5 = defpackage.nmx.a(r5, r7, r14);
        r6.b = r5;
        goto L_0x02df;
    L_0x028c:
        r34 = r6;
        r35 = r9;
        r36 = r10;
        r8 = r11;
        r37 = r12;
        r33 = r19;
        r6 = r20;
        r9 = r13 + 8;
        r4.c(r9);
        if (r49 == 0) goto L_0x02b0;
    L_0x02a0:
        r9 = 8;
        r4.d(r9);
        r12 = r4.e();
        r9 = 6;
        r4.d(r9);
        r9 = 16;
        goto L_0x02b6;
    L_0x02b0:
        r9 = 16;
        r4.d(r9);
        r12 = 0;
    L_0x02b6:
        if (r12 != 0) goto L_0x02b9;
    L_0x02b8:
        goto L_0x02f1;
    L_0x02b9:
        r10 = 1;
        if (r12 == r10) goto L_0x02f1;
    L_0x02bc:
        r10 = 2;
        if (r12 != r10) goto L_0x02df;
    L_0x02bf:
        r4.d(r9);
        r9 = r4.l();
        r9 = java.lang.Double.longBitsToDouble(r9);
        r9 = java.lang.Math.round(r9);
        r10 = (int) r9;
        r9 = r4.n();
        r11 = 20;
        r4.d(r11);
        r38 = r1;
        r19 = r9;
    L_0x02dc:
        r1 = 16;
        goto L_0x0323;
    L_0x02df:
        r38 = r1;
        r39 = r2;
        r41 = r3;
        r16 = r8;
    L_0x02e7:
        r42 = r13;
        r43 = r14;
        r40 = r33;
        r8 = 3;
        r14 = 0;
        goto L_0x07df;
    L_0x02f1:
        r9 = r4.e();
        r10 = 6;
        r4.d(r10);
        r10 = r4.a;
        r11 = r4.b;
        r19 = r9;
        r9 = r11 + 1;
        r4.b = r9;
        r11 = r10[r11];
        r38 = r1;
        r1 = r9 + 1;
        r4.b = r1;
        r11 = r11 & 255;
        r20 = 8;
        r11 = r11 << 8;
        r9 = r10[r9];
        r9 = r9 & 255;
        r10 = r11 | r9;
        r9 = 2;
        r1 = r1 + r9;
        r4.b = r1;
        r1 = 1;
        if (r12 != r1) goto L_0x02dc;
    L_0x031e:
        r1 = 16;
        r4.d(r1);
    L_0x0323:
        r9 = r4.b;
        r11 = defpackage.nsg.ad;
        if (r5 != r11) goto L_0x0333;
    L_0x0329:
        r11 = r33;
        r5 = defpackage.nsh.a(r4, r13, r3, r6, r11);
        r4.c(r9);
        goto L_0x0335;
    L_0x0333:
        r11 = r33;
    L_0x0335:
        r12 = defpackage.nsg.q;
        if (r5 != r12) goto L_0x033c;
    L_0x0339:
        r5 = "audio/ac3";
        goto L_0x037f;
    L_0x033c:
        r12 = defpackage.nsg.s;
        if (r5 != r12) goto L_0x0343;
    L_0x0340:
        r5 = "audio/eac3";
        goto L_0x037f;
    L_0x0343:
        r12 = defpackage.nsg.u;
        if (r5 != r12) goto L_0x034a;
    L_0x0347:
        r5 = "audio/vnd.dts";
        goto L_0x037f;
    L_0x034a:
        r12 = defpackage.nsg.v;
        if (r5 != r12) goto L_0x034f;
    L_0x034e:
        goto L_0x037d;
    L_0x034f:
        r12 = defpackage.nsg.w;
        if (r5 == r12) goto L_0x037d;
    L_0x0353:
        r12 = defpackage.nsg.x;
        if (r5 != r12) goto L_0x035a;
    L_0x0357:
        r5 = "audio/vnd.dts.hd;profile=lbr";
        goto L_0x037f;
    L_0x035a:
        r12 = defpackage.nsg.az;
        if (r5 != r12) goto L_0x0361;
    L_0x035e:
        r5 = "audio/3gpp";
        goto L_0x037f;
    L_0x0361:
        r12 = defpackage.nsg.aA;
        if (r5 != r12) goto L_0x0368;
    L_0x0365:
        r5 = "audio/amr-wb";
        goto L_0x037f;
    L_0x0368:
        r12 = defpackage.nsg.o;
        if (r5 != r12) goto L_0x036d;
    L_0x036c:
        goto L_0x037a;
    L_0x036d:
        r12 = defpackage.nsg.p;
        if (r5 == r12) goto L_0x037a;
    L_0x0371:
        r12 = defpackage.nsg.m;
        if (r5 != r12) goto L_0x0378;
    L_0x0375:
        r5 = "audio/mpeg";
        goto L_0x037f;
    L_0x0378:
        r5 = 0;
        goto L_0x037f;
    L_0x037a:
        r5 = "audio/raw";
        goto L_0x037f;
    L_0x037d:
        r5 = "audio/vnd.dts.hd";
    L_0x037f:
        r12 = r10;
        r16 = r19;
        r10 = 0;
    L_0x0383:
        r1 = r9 - r13;
        if (r1 >= r3) goto L_0x046c;
    L_0x0387:
        r4.c(r9);
        r1 = r4.j();
        if (r1 <= 0) goto L_0x0394;
    L_0x0390:
        r39 = r2;
        r2 = 1;
        goto L_0x0397;
    L_0x0394:
        r39 = r2;
        r2 = 0;
    L_0x0397:
        defpackage.nwf.a(r2, r7);
        r2 = r4.j();
        r0 = defpackage.nsg.M;
        if (r2 != r0) goto L_0x03a3;
    L_0x03a2:
        goto L_0x03f7;
    L_0x03a3:
        if (r49 != 0) goto L_0x03a6;
    L_0x03a5:
        goto L_0x03aa;
    L_0x03a6:
        r0 = defpackage.nsg.n;
        if (r2 == r0) goto L_0x03f7;
    L_0x03aa:
        r0 = defpackage.nsg.r;
        if (r2 != r0) goto L_0x03be;
    L_0x03ae:
        r0 = r9 + 8;
        r4.c(r0);
        r0 = java.lang.Integer.toString(r37);
        r0 = defpackage.nwg.a(r4, r0, r14, r8);
        r6.b = r0;
        goto L_0x03f0;
    L_0x03be:
        r0 = defpackage.nsg.t;
        if (r2 != r0) goto L_0x03d2;
    L_0x03c2:
        r0 = r9 + 8;
        r4.c(r0);
        r0 = java.lang.Integer.toString(r37);
        r0 = defpackage.nwg.b(r4, r0, r14, r8);
        r6.b = r0;
        goto L_0x03f0;
    L_0x03d2:
        r0 = defpackage.nsg.y;
        if (r2 != r0) goto L_0x03f0;
    L_0x03d6:
        r19 = java.lang.Integer.toString(r37);
        r21 = -1;
        r22 = -1;
        r27 = 0;
        r20 = r5;
        r23 = r14;
        r25 = r16;
        r26 = r12;
        r28 = r8;
        r0 = defpackage.nmx.a(r19, r20, r21, r22, r23, r25, r26, r27, r28);
        r6.b = r0;
    L_0x03f0:
        r40 = r3;
        r19 = r7;
        r2 = -1;
        goto L_0x0461;
    L_0x03f7:
        r0 = defpackage.nsg.M;
        if (r2 != r0) goto L_0x0402;
    L_0x03fb:
        r40 = r3;
        r19 = r7;
        r0 = r9;
    L_0x0400:
        r2 = -1;
        goto L_0x0431;
    L_0x0402:
        r0 = r4.b;
    L_0x0404:
        r2 = r0 - r9;
        if (r2 >= r1) goto L_0x042b;
    L_0x0408:
        r4.c(r0);
        r2 = r4.j();
        if (r2 <= 0) goto L_0x0415;
    L_0x0411:
        r40 = r3;
        r3 = 1;
        goto L_0x0418;
    L_0x0415:
        r40 = r3;
        r3 = 0;
    L_0x0418:
        defpackage.nwf.a(r3, r7);
        r3 = r4.j();
        r19 = r7;
        r7 = defpackage.nsg.M;
        if (r3 == r7) goto L_0x0400;
    L_0x0425:
        r0 = r0 + r2;
        r7 = r19;
        r3 = r40;
        goto L_0x0404;
    L_0x042b:
        r40 = r3;
        r19 = r7;
        r0 = -1;
        goto L_0x0400;
    L_0x0431:
        if (r0 != r2) goto L_0x0434;
    L_0x0433:
        goto L_0x0461;
    L_0x0434:
        r0 = defpackage.nsh.a(r4, r0);
        r3 = r0.first;
        r3 = (java.lang.String) r3;
        r0 = r0.second;
        r10 = r0;
        r10 = (byte[]) r10;
        r0 = "audio/mp4a-latm";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0460;
    L_0x0449:
        r0 = defpackage.nwh.a(r10);
        r5 = r0.first;
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        r0 = r0.second;
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r16 = r0;
        r12 = r5;
    L_0x0460:
        r5 = r3;
    L_0x0461:
        r9 = r9 + r1;
        r0 = r45;
        r7 = r19;
        r2 = r39;
        r3 = r40;
        goto L_0x0383;
    L_0x046c:
        r39 = r2;
        r40 = r3;
        r2 = -1;
        r0 = r6.b;
        if (r0 != 0) goto L_0x04a7;
    L_0x0475:
        if (r5 == 0) goto L_0x04a7;
    L_0x0477:
        r0 = "audio/raw";
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x0482;
    L_0x047f:
        r29 = -1;
        goto L_0x0484;
    L_0x0482:
        r29 = 2;
    L_0x0484:
        r19 = java.lang.Integer.toString(r37);
        if (r10 == 0) goto L_0x0491;
    L_0x048a:
        r0 = java.util.Collections.singletonList(r10);
        r27 = r0;
        goto L_0x0493;
    L_0x0491:
        r27 = 0;
    L_0x0493:
        r21 = -1;
        r22 = -1;
        r20 = r5;
        r23 = r14;
        r25 = r16;
        r26 = r12;
        r28 = r8;
        r0 = defpackage.nmx.a(r19, r20, r21, r22, r23, r25, r26, r27, r28, r29);
        r6.b = r0;
    L_0x04a7:
        r16 = r8;
        r42 = r13;
        r43 = r14;
        r41 = r40;
        r8 = 3;
        r14 = 0;
        r40 = r11;
        goto L_0x07df;
    L_0x04b5:
        r38 = r1;
        r39 = r2;
        r40 = r3;
        r34 = r6;
        r35 = r9;
        r36 = r10;
        r8 = r11;
        r37 = r12;
        r11 = r19;
        r6 = r20;
        r2 = -1;
        r19 = r7;
        r0 = r13 + 8;
        r4.c(r0);
        r0 = 24;
        r4.d(r0);
        r25 = r4.e();
        r26 = r4.e();
        r0 = 50;
        r4.d(r0);
        r0 = r4.b;
        r1 = defpackage.nsg.ac;
        if (r5 != r1) goto L_0x04f1;
    L_0x04e8:
        r1 = r40;
        defpackage.nsh.a(r4, r13, r1, r6, r11);
        r4.c(r0);
        goto L_0x04f3;
    L_0x04f1:
        r1 = r40;
    L_0x04f3:
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r20 = 0;
        r27 = 0;
        r29 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r30 = 0;
        r31 = -1;
    L_0x0500:
        r7 = r0 - r13;
        if (r7 >= r1) goto L_0x07bd;
    L_0x0504:
        r4.c(r0);
        r7 = r4.b;
        r9 = r4.j();
        if (r9 != 0) goto L_0x0514;
    L_0x050f:
        r10 = r4.b;
        r10 = r10 - r13;
        if (r10 == r1) goto L_0x07bd;
    L_0x0514:
        if (r9 <= 0) goto L_0x051a;
    L_0x0516:
        r12 = r19;
        r10 = 1;
        goto L_0x051d;
    L_0x051a:
        r12 = r19;
        r10 = 0;
    L_0x051d:
        defpackage.nwf.a(r10, r12);
        r10 = r4.j();
        r2 = defpackage.nsg.K;
        if (r10 == r2) goto L_0x0722;
    L_0x0528:
        r2 = defpackage.nsg.L;
        if (r10 == r2) goto L_0x0651;
    L_0x052c:
        r2 = defpackage.nsg.j;
        if (r10 == r2) goto L_0x0633;
    L_0x0530:
        r2 = defpackage.nsg.M;
        if (r10 == r2) goto L_0x060e;
    L_0x0534:
        r2 = defpackage.nsg.al;
        if (r10 == r2) goto L_0x05ed;
    L_0x0538:
        r2 = defpackage.nsg.aN;
        if (r10 == r2) goto L_0x05d7;
    L_0x053c:
        r2 = defpackage.nsg.aJ;
        if (r10 != r2) goto L_0x0572;
    L_0x0540:
        r2 = r7 + 8;
    L_0x0542:
        r10 = r2 - r7;
        if (r10 >= r9) goto L_0x0567;
    L_0x0546:
        r4.c(r2);
        r10 = r4.j();
        r16 = r8;
        r8 = r4.j();
        r19 = r12;
        r12 = defpackage.nsg.aK;
        if (r8 != r12) goto L_0x0561;
    L_0x0559:
        r7 = r4.a;
        r10 = r10 + r2;
        r2 = java.util.Arrays.copyOfRange(r7, r2, r10);
        goto L_0x056c;
    L_0x0561:
        r2 = r2 + r10;
        r8 = r16;
        r12 = r19;
        goto L_0x0542;
    L_0x0567:
        r16 = r8;
        r19 = r12;
        r2 = 0;
    L_0x056c:
        r41 = r1;
        r30 = r2;
        goto L_0x0645;
    L_0x0572:
        r16 = r8;
        r19 = r12;
        r2 = defpackage.nsg.aI;
        if (r10 != r2) goto L_0x05d3;
    L_0x057a:
        r2 = r4.d();
        r7 = 3;
        r4.d(r7);
        if (r2 != 0) goto L_0x05d3;
    L_0x0584:
        r2 = r4.d();
        if (r2 == 0) goto L_0x05c3;
    L_0x058a:
        r8 = 1;
        if (r2 == r8) goto L_0x05b3;
    L_0x058d:
        r8 = 2;
        if (r2 == r8) goto L_0x05a3;
    L_0x0590:
        if (r2 == r7) goto L_0x0593;
    L_0x0592:
        goto L_0x05d3;
    L_0x0593:
        r41 = r1;
        r21 = r5;
        r40 = r11;
        r42 = r13;
        r43 = r14;
        r8 = 3;
        r14 = 0;
        r31 = 3;
        goto L_0x07a7;
    L_0x05a3:
        r41 = r1;
        r21 = r5;
        r40 = r11;
        r42 = r13;
        r43 = r14;
        r8 = 3;
        r14 = 0;
        r31 = 2;
        goto L_0x07a7;
    L_0x05b3:
        r41 = r1;
        r21 = r5;
        r40 = r11;
        r42 = r13;
        r43 = r14;
        r8 = 3;
        r14 = 0;
        r31 = 1;
        goto L_0x07a7;
    L_0x05c3:
        r41 = r1;
        r21 = r5;
        r40 = r11;
        r42 = r13;
        r43 = r14;
        r8 = 3;
        r14 = 0;
        r31 = 0;
        goto L_0x07a7;
    L_0x05d3:
        r41 = r1;
        goto L_0x0645;
    L_0x05d7:
        r16 = r8;
        r19 = r12;
        if (r20 != 0) goto L_0x05df;
    L_0x05dd:
        r2 = 1;
        goto L_0x05e0;
    L_0x05df:
        r2 = 0;
    L_0x05e0:
        defpackage.nwf.b(r2);
        r2 = defpackage.nsg.aL;
        if (r5 == r2) goto L_0x05ea;
    L_0x05e7:
        r2 = "video/x-vnd.on2.vp9";
        goto L_0x0641;
    L_0x05ea:
        r2 = "video/x-vnd.on2.vp8";
        goto L_0x0641;
    L_0x05ed:
        r16 = r8;
        r19 = r12;
        r7 = r7 + 8;
        r4.c(r7);
        r2 = r4.n();
        r2 = (float) r2;
        r3 = r4.n();
        r3 = (float) r3;
        r29 = r2 / r3;
        r41 = r1;
        r21 = r5;
        r40 = r11;
        r42 = r13;
        r43 = r14;
        r3 = 1;
        goto L_0x064d;
    L_0x060e:
        r16 = r8;
        r19 = r12;
        if (r20 != 0) goto L_0x0616;
    L_0x0614:
        r2 = 1;
        goto L_0x0617;
    L_0x0616:
        r2 = 0;
    L_0x0617:
        defpackage.nwf.b(r2);
        r2 = defpackage.nsh.a(r4, r7);
        r7 = r2.first;
        r7 = (java.lang.String) r7;
        r2 = r2.second;
        r2 = (byte[]) r2;
        r2 = java.util.Collections.singletonList(r2);
        r41 = r1;
        r27 = r2;
        r21 = r5;
        r20 = r7;
        goto L_0x0647;
    L_0x0633:
        r16 = r8;
        r19 = r12;
        if (r20 != 0) goto L_0x063b;
    L_0x0639:
        r2 = 1;
        goto L_0x063c;
    L_0x063b:
        r2 = 0;
    L_0x063c:
        defpackage.nwf.b(r2);
        r2 = "video/3gpp";
    L_0x0641:
        r41 = r1;
        r20 = r2;
    L_0x0645:
        r21 = r5;
    L_0x0647:
        r40 = r11;
        r42 = r13;
        r43 = r14;
    L_0x064d:
        r8 = 3;
        r14 = 0;
        goto L_0x07a7;
    L_0x0651:
        r16 = r8;
        r19 = r12;
        if (r20 != 0) goto L_0x0659;
    L_0x0657:
        r2 = 1;
        goto L_0x065a;
    L_0x0659:
        r2 = 0;
    L_0x065a:
        defpackage.nwf.b(r2);
        r7 = r7 + 29;
        r4.c(r7);
        r2 = r4.d();
        r7 = 3;
        r2 = r2 & r7;
        r7 = r4.d();
        r8 = r4.b;
        r10 = 0;
        r12 = 0;
    L_0x0670:
        if (r10 >= r7) goto L_0x069a;
    L_0x0672:
        r21 = r5;
        r5 = 1;
        r4.d(r5);
        r5 = r4.e();
        r20 = r12;
        r12 = 0;
    L_0x067f:
        if (r12 >= r5) goto L_0x0693;
    L_0x0681:
        r22 = r5;
        r5 = r4.e();
        r23 = r5 + 4;
        r20 = r20 + r23;
        r4.d(r5);
        r12 = r12 + 1;
        r5 = r22;
        goto L_0x067f;
    L_0x0693:
        r10 = r10 + 1;
        r12 = r20;
        r5 = r21;
        goto L_0x0670;
    L_0x069a:
        r21 = r5;
        r4.c(r8);
        r5 = new byte[r12];
        r8 = 0;
        r10 = 0;
    L_0x06a3:
        if (r8 >= r7) goto L_0x06f2;
    L_0x06a5:
        r20 = r7;
        r7 = 1;
        r4.d(r7);
        r7 = r4.e();
        r40 = r11;
        r11 = r10;
        r10 = 0;
    L_0x06b3:
        if (r10 >= r7) goto L_0x06e4;
    L_0x06b5:
        r22 = r7;
        r7 = r4.e();
        r41 = r1;
        r1 = defpackage.nwv.a;
        r42 = r13;
        r13 = defpackage.nwv.a;
        r13 = r13.length;
        r43 = r14;
        r14 = 0;
        java.lang.System.arraycopy(r1, r14, r5, r11, r13);
        r1 = defpackage.nwv.a;
        r1 = r1.length;
        r11 = r11 + r1;
        r1 = r4.a;
        r13 = r4.b;
        java.lang.System.arraycopy(r1, r13, r5, r11, r7);
        r11 = r11 + r7;
        r4.d(r7);
        r10 = r10 + 1;
        r7 = r22;
        r1 = r41;
        r13 = r42;
        r14 = r43;
        goto L_0x06b3;
    L_0x06e4:
        r41 = r1;
        r42 = r13;
        r43 = r14;
        r8 = r8 + 1;
        r10 = r11;
        r7 = r20;
        r11 = r40;
        goto L_0x06a3;
    L_0x06f2:
        r41 = r1;
        r40 = r11;
        r42 = r13;
        r43 = r14;
        if (r12 == 0) goto L_0x0701;
    L_0x06fc:
        r1 = java.util.Collections.singletonList(r5);
        goto L_0x0702;
    L_0x0701:
        r1 = 0;
    L_0x0702:
        r5 = 1;
        r2 = r2 + r5;
        r2 = java.lang.Integer.valueOf(r2);
        r1 = android.util.Pair.create(r1, r2);
        r2 = r1.first;
        r2 = (java.util.List) r2;
        r1 = r1.second;
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        r6.c = r1;
        r1 = "video/hevc";
        r20 = r1;
        r27 = r2;
        goto L_0x064d;
    L_0x0722:
        r41 = r1;
        r21 = r5;
        r16 = r8;
        r40 = r11;
        r19 = r12;
        r42 = r13;
        r43 = r14;
        if (r20 != 0) goto L_0x0734;
    L_0x0732:
        r1 = 1;
        goto L_0x0735;
    L_0x0734:
        r1 = 0;
    L_0x0735:
        defpackage.nwf.b(r1);
        r7 = r7 + 12;
        r4.c(r7);
        r1 = r4.d();
        r2 = 3;
        r1 = r1 & r2;
        r5 = 1;
        r1 = r1 + r5;
        if (r1 == r2) goto L_0x07b7;
    L_0x0747:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r5 = r4.d();
        r5 = r5 & 31;
        r7 = 0;
    L_0x0753:
        if (r7 >= r5) goto L_0x075f;
    L_0x0755:
        r8 = defpackage.nwv.a(r4);
        r2.add(r8);
        r7 = r7 + 1;
        goto L_0x0753;
    L_0x075f:
        r7 = r4.d();
        r8 = 0;
    L_0x0764:
        if (r8 >= r7) goto L_0x0770;
    L_0x0766:
        r10 = defpackage.nwv.a(r4);
        r2.add(r10);
        r8 = r8 + 1;
        goto L_0x0764;
    L_0x0770:
        if (r5 <= 0) goto L_0x078c;
    L_0x0772:
        r5 = new nxa;
        r14 = 0;
        r7 = r2.get(r14);
        r7 = (byte[]) r7;
        r5.<init>(r7);
        r7 = r1 + 1;
        r8 = 3;
        r7 = r7 << r8;
        r5.a(r7);
        r5 = defpackage.nwv.a(r5);
        r5 = r5.d;
        goto L_0x0790;
    L_0x078c:
        r8 = 3;
        r14 = 0;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0790:
        r7 = new nsk;
        r7.<init>(r2, r1, r5);
        r1 = r7.a;
        r2 = r7.b;
        r6.c = r2;
        if (r3 != 0) goto L_0x07a1;
    L_0x079d:
        r2 = r7.c;
        r29 = r2;
    L_0x07a1:
        r2 = "video/avc";
        r27 = r1;
        r20 = r2;
    L_0x07a7:
        r0 = r0 + r9;
        r8 = r16;
        r5 = r21;
        r11 = r40;
        r1 = r41;
        r13 = r42;
        r14 = r43;
        r2 = -1;
        goto L_0x0500;
    L_0x07b7:
        r0 = new java.lang.IllegalStateException;
        r0.<init>();
        throw r0;
    L_0x07bd:
        r41 = r1;
        r16 = r8;
        r40 = r11;
        r42 = r13;
        r43 = r14;
        r8 = 3;
        r14 = 0;
        if (r20 == 0) goto L_0x07df;
    L_0x07cb:
        r19 = java.lang.Integer.toString(r37);
        r21 = -1;
        r22 = -1;
        r32 = 0;
        r23 = r43;
        r28 = r36;
        r0 = defpackage.nmx.a(r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32);
        r6.b = r0;
    L_0x07df:
        r13 = r42 + r41;
        r4.c(r13);
        r7 = r40 + 1;
        r8 = r6;
        r11 = r16;
        r6 = r34;
        r9 = r35;
        r10 = r36;
        r12 = r37;
        r1 = r38;
        r2 = r39;
        r14 = r43;
        r3 = 16;
        r5 = 8;
        r13 = 3;
        r0 = r45;
        goto L_0x018d;
    L_0x0800:
        r38 = r1;
        r39 = r2;
        r34 = r6;
        r6 = r8;
        r14 = 0;
        r0 = defpackage.nsg.S;
        r1 = r45;
        r0 = r1.b(r0);
        if (r0 == 0) goto L_0x0880;
    L_0x0812:
        r1 = defpackage.nsg.T;
        r0 = r0.a(r1);
        if (r0 != 0) goto L_0x081b;
    L_0x081a:
        goto L_0x0880;
    L_0x081b:
        r0 = r0.a;
        r1 = 8;
        r0.c(r1);
        r1 = r0.j();
        r1 = defpackage.nsg.c(r1);
        r2 = r0.n();
        r3 = new long[r2];
        r4 = new long[r2];
    L_0x0832:
        if (r14 < r2) goto L_0x0839;
    L_0x0834:
        r0 = android.util.Pair.create(r3, r4);
        goto L_0x0886;
    L_0x0839:
        r5 = 1;
        if (r1 == r5) goto L_0x0841;
    L_0x083c:
        r7 = r0.h();
        goto L_0x0845;
    L_0x0841:
        r7 = r0.p();
    L_0x0845:
        r3[r14] = r7;
        if (r1 == r5) goto L_0x084f;
    L_0x0849:
        r5 = r0.j();
        r7 = (long) r5;
        goto L_0x0853;
    L_0x084f:
        r7 = r0.l();
    L_0x0853:
        r4[r14] = r7;
        r5 = r0.a;
        r7 = r0.b;
        r8 = r7 + 1;
        r0.b = r8;
        r7 = r5[r7];
        r9 = r8 + 1;
        r0.b = r9;
        r7 = r7 & 255;
        r9 = 8;
        r7 = r7 << r9;
        r5 = r5[r8];
        r5 = r5 & 255;
        r5 = r5 | r7;
        r5 = (short) r5;
        r7 = 1;
        if (r5 != r7) goto L_0x0878;
    L_0x0871:
        r5 = 2;
        r0.d(r5);
        r14 = r14 + 1;
        goto L_0x0832;
    L_0x0878:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Unsupported media rate.";
        r0.<init>(r1);
        throw r0;
    L_0x0880:
        r0 = 0;
        r1 = android.util.Pair.create(r0, r0);
        r0 = r1;
    L_0x0886:
        r1 = r6.b;
        if (r1 == 0) goto L_0x08b3;
    L_0x088a:
        r1 = new nsx;
        r2 = r39;
        r5 = r2.a;
        r2 = r38;
        r2 = r2.first;
        r2 = (java.lang.Long) r2;
        r7 = r2.longValue();
        r11 = r6.b;
        r12 = r6.a;
        r13 = r6.c;
        r2 = r0.first;
        r14 = r2;
        r14 = (long[]) r14;
        r0 = r0.second;
        r15 = r0;
        r15 = (long[]) r15;
        r4 = r1;
        r6 = r34;
        r9 = r17;
        r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15);
        return r1;
    L_0x08b3:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsh.a(nsf, nsi, long, boolean):nsx");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0185 A:{LOOP_START, PHI: r9 r10 r21 r25 , LOOP:5: B:57:0x0185->B:58:0x0187} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x028b  */
    public static defpackage.ntc a(defpackage.nsx r40, defpackage.nsf r41) {
        /*
        r0 = r40;
        r1 = r41;
        r2 = defpackage.nsg.as;
        r2 = r1.a(r2);
        if (r2 == 0) goto L_0x0012;
    L_0x000c:
        r3 = new nso;
        r3.<init>(r2);
        goto L_0x001f;
    L_0x0012:
        r2 = defpackage.nsg.at;
        r2 = r1.a(r2);
        if (r2 == 0) goto L_0x03f8;
    L_0x001a:
        r3 = new nsn;
        r3.<init>(r2);
    L_0x001f:
        r2 = r3.a();
        r4 = 0;
        if (r2 != 0) goto L_0x0036;
    L_0x0026:
        r0 = new ntc;
        r6 = new long[r4];
        r7 = new int[r4];
        r8 = 0;
        r9 = new long[r4];
        r10 = new int[r4];
        r5 = r0;
        r5.<init>(r6, r7, r8, r9, r10);
        return r0;
    L_0x0036:
        r5 = defpackage.nsg.au;
        r5 = r1.a(r5);
        if (r5 != 0) goto L_0x0046;
    L_0x003e:
        r5 = defpackage.nsg.av;
        r5 = r1.a(r5);
        r7 = 1;
        goto L_0x0047;
    L_0x0046:
        r7 = 0;
    L_0x0047:
        r5 = r5.a;
        r8 = defpackage.nsg.ar;
        r8 = r1.a(r8);
        r8 = r8.a;
        r9 = defpackage.nsg.ao;
        r9 = r1.a(r9);
        r9 = r9.a;
        r10 = defpackage.nsg.ap;
        r10 = r1.a(r10);
        r11 = 0;
        if (r10 == 0) goto L_0x0065;
    L_0x0062:
        r10 = r10.a;
        goto L_0x0066;
    L_0x0065:
        r10 = r11;
    L_0x0066:
        r12 = defpackage.nsg.aq;
        r1 = r1.a(r12);
        if (r1 == 0) goto L_0x0071;
    L_0x006e:
        r1 = r1.a;
        goto L_0x0072;
    L_0x0071:
        r1 = r11;
    L_0x0072:
        r12 = new nsj;
        r12.<init>(r8, r5, r7);
        r5 = 12;
        r9.c(r5);
        r7 = r9.n();
        r8 = -1;
        r7 = r7 + r8;
        r13 = r9.n();
        r14 = r9.n();
        if (r1 == 0) goto L_0x0094;
    L_0x008c:
        r1.c(r5);
        r15 = r1.n();
        goto L_0x0095;
    L_0x0094:
        r15 = 0;
    L_0x0095:
        if (r10 == 0) goto L_0x00a8;
    L_0x0097:
        r10.c(r5);
        r5 = r10.n();
        if (r5 <= 0) goto L_0x00a6;
    L_0x00a0:
        r11 = r10.n();
        r11 = r11 + r8;
        goto L_0x00aa;
    L_0x00a6:
        r10 = r11;
        goto L_0x00a9;
    L_0x00a8:
        r5 = 0;
    L_0x00a9:
        r11 = -1;
    L_0x00aa:
        r16 = r3.c();
        r17 = 0;
        if (r16 == 0) goto L_0x0162;
    L_0x00b2:
        r4 = r0.k;
        r4 = r4.b;
        r8 = "audio/raw";
        r4 = r8.equals(r4);
        if (r4 != 0) goto L_0x00c0;
    L_0x00be:
        goto L_0x0162;
    L_0x00c0:
        if (r7 != 0) goto L_0x0162;
    L_0x00c2:
        if (r15 != 0) goto L_0x0162;
    L_0x00c4:
        if (r5 != 0) goto L_0x0162;
    L_0x00c6:
        r1 = r12.a;
        r4 = new long[r1];
        r1 = new int[r1];
    L_0x00cc:
        r5 = r12.a();
        if (r5 == 0) goto L_0x00dd;
    L_0x00d2:
        r5 = r12.b;
        r7 = r12.d;
        r4[r5] = r7;
        r7 = r12.c;
        r1[r5] = r7;
        goto L_0x00cc;
    L_0x00dd:
        r3 = r3.b();
        r7 = (long) r14;
        r5 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r5 = r5 / r3;
        r9 = r1.length;
        r10 = 0;
        r11 = 0;
    L_0x00e8:
        if (r10 >= r9) goto L_0x00f4;
    L_0x00ea:
        r12 = r1[r10];
        r12 = defpackage.nxf.a(r12, r5);
        r11 = r11 + r12;
        r10 = r10 + 1;
        goto L_0x00e8;
    L_0x00f4:
        r9 = new long[r11];
        r10 = new int[r11];
        r12 = new long[r11];
        r11 = new int[r11];
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r22 = 0;
    L_0x0101:
        r6 = r1.length;
        if (r13 >= r6) goto L_0x0145;
    L_0x0104:
        r6 = r1[r13];
        r19 = r4[r13];
        r20 = r19;
        r19 = r1;
        r1 = r22;
    L_0x010e:
        if (r6 <= 0) goto L_0x013a;
    L_0x0110:
        r22 = java.lang.Math.min(r5, r6);
        r9[r15] = r20;
        r23 = r4;
        r4 = r3 * r22;
        r10[r15] = r4;
        r1 = java.lang.Math.max(r1, r4);
        r41 = r3;
        r3 = (long) r14;
        r3 = r3 * r7;
        r12[r15] = r3;
        r3 = 1;
        r11[r15] = r3;
        r3 = r10[r15];
        r3 = (long) r3;
        r20 = r20 + r3;
        r14 = r14 + r22;
        r6 = r6 - r22;
        r15 = r15 + 1;
        r3 = r41;
        r4 = r23;
        goto L_0x010e;
    L_0x013a:
        r41 = r3;
        r23 = r4;
        r13 = r13 + 1;
        r22 = r1;
        r1 = r19;
        goto L_0x0101;
    L_0x0145:
        r1 = new nss;
        r19 = r1;
        r20 = r9;
        r21 = r10;
        r23 = r12;
        r24 = r11;
        r19.<init>(r20, r21, r22, r23, r24);
        r3 = r1.a;
        r4 = r1.b;
        r5 = r1.c;
        r6 = r1.d;
        r1 = r1.e;
        r33 = r5;
        goto L_0x0287;
    L_0x0162:
        r4 = new long[r2];
        r6 = new int[r2];
        r8 = new long[r2];
        r19 = r5;
        r5 = new int[r2];
        r27 = r9;
        r0 = r13;
        r9 = r14;
        r21 = r17;
        r23 = r21;
        r14 = 0;
        r20 = 0;
        r25 = 0;
        r26 = 0;
        r13 = r7;
        r7 = 0;
        r39 = r19;
        r19 = r15;
        r15 = r39;
    L_0x0183:
        if (r7 >= r2) goto L_0x0214;
    L_0x0185:
        if (r25 != 0) goto L_0x019f;
    L_0x0187:
        r21 = r12.a();
        defpackage.nwf.b(r21);
        r29 = r9;
        r28 = r10;
        r9 = r12.d;
        r21 = r9;
        r9 = r12.c;
        r25 = r9;
        r10 = r28;
        r9 = r29;
        goto L_0x0185;
    L_0x019f:
        r29 = r9;
        r28 = r10;
        if (r1 == 0) goto L_0x01b7;
    L_0x01a5:
        if (r26 == 0) goto L_0x01a8;
    L_0x01a7:
        goto L_0x01b5;
    L_0x01a8:
        if (r19 <= 0) goto L_0x01b5;
    L_0x01aa:
        r26 = r1.n();
        r20 = r1.j();
        r19 = r19 + -1;
        goto L_0x01a5;
    L_0x01b5:
        r26 = r26 + -1;
    L_0x01b7:
        r9 = r20;
        r4[r7] = r21;
        r10 = r3.b();
        r6[r7] = r10;
        if (r10 <= r14) goto L_0x01c8;
    L_0x01c3:
        r20 = r4;
        r14 = r10;
        r10 = r3;
        goto L_0x01cb;
    L_0x01c8:
        r10 = r3;
        r20 = r4;
    L_0x01cb:
        r3 = (long) r9;
        r3 = r23 + r3;
        r8[r7] = r3;
        if (r28 != 0) goto L_0x01d4;
    L_0x01d2:
        r3 = 1;
        goto L_0x01d5;
    L_0x01d4:
        r3 = 0;
    L_0x01d5:
        r5[r7] = r3;
        if (r7 != r11) goto L_0x01e7;
    L_0x01d9:
        r3 = 1;
        r5[r7] = r3;
        r15 = r15 + -1;
        if (r15 <= 0) goto L_0x01e7;
    L_0x01e0:
        r3 = r28.n();
        r4 = -1;
        r3 = r3 + r4;
        r11 = r3;
    L_0x01e7:
        r3 = r29;
        r29 = r5;
        r4 = (long) r3;
        r23 = r23 + r4;
        r0 = r0 + -1;
        if (r0 == 0) goto L_0x01f3;
    L_0x01f2:
        goto L_0x01ff;
    L_0x01f3:
        if (r13 <= 0) goto L_0x01ff;
    L_0x01f5:
        r0 = r27.n();
        r3 = r27.n();
        r13 = r13 + -1;
    L_0x01ff:
        r4 = r6[r7];
        r4 = (long) r4;
        r21 = r21 + r4;
        r25 = r25 + -1;
        r7 = r7 + 1;
        r4 = r20;
        r5 = r29;
        r20 = r9;
        r9 = r3;
        r3 = r10;
        r10 = r28;
        goto L_0x0183;
    L_0x0214:
        r20 = r4;
        r29 = r5;
        if (r26 != 0) goto L_0x021c;
    L_0x021a:
        r3 = 1;
        goto L_0x021d;
    L_0x021c:
        r3 = 0;
    L_0x021d:
        defpackage.nwf.a(r3);
    L_0x0220:
        if (r19 <= 0) goto L_0x0234;
    L_0x0222:
        r3 = r1.n();
        if (r3 != 0) goto L_0x022a;
    L_0x0228:
        r3 = 1;
        goto L_0x022b;
    L_0x022a:
        r3 = 0;
    L_0x022b:
        defpackage.nwf.a(r3);
        r1.j();
        r19 = r19 + -1;
        goto L_0x0220;
    L_0x0234:
        if (r15 == 0) goto L_0x023a;
    L_0x0236:
        r1 = r0;
        r0 = r40;
        goto L_0x0243;
    L_0x023a:
        if (r0 != 0) goto L_0x0236;
    L_0x023c:
        if (r25 != 0) goto L_0x0236;
    L_0x023e:
        if (r13 != 0) goto L_0x0236;
    L_0x0240:
        r0 = r40;
        goto L_0x027f;
    L_0x0243:
        r3 = r0.g;
        r4 = new java.lang.StringBuilder;
        r5 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r4.<init>(r5);
        r5 = "Inconsistent stbl box for track ";
        r4.append(r5);
        r4.append(r3);
        r3 = ": remainingSynchronizationSamples ";
        r4.append(r3);
        r4.append(r15);
        r3 = ", remainingSamplesAtTimestampDelta ";
        r4.append(r3);
        r4.append(r1);
        r1 = ", remainingSamplesInChunk ";
        r4.append(r1);
        r1 = r25;
        r4.append(r1);
        r1 = ", remainingTimestampDeltaChanges ";
        r4.append(r1);
        r4.append(r13);
        r1 = r4.toString();
        r3 = "AtomParsers";
        android.util.Log.w(r3, r1);
    L_0x027f:
        r4 = r6;
        r6 = r8;
        r33 = r14;
        r3 = r20;
        r1 = r29;
    L_0x0287:
        r5 = r0.m;
        if (r5 != 0) goto L_0x02a0;
    L_0x028b:
        r7 = r0.i;
        defpackage.nxf.a(r6, r7);
        r0 = new ntc;
        r30 = r0;
        r31 = r3;
        r32 = r4;
        r34 = r6;
        r35 = r1;
        r30.<init>(r31, r32, r33, r34, r35);
        return r0;
    L_0x02a0:
        r7 = r5.length;
        r8 = 1;
        if (r7 == r8) goto L_0x02a9;
    L_0x02a4:
        r5 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        goto L_0x02b1;
    L_0x02a9:
        r7 = 0;
        r8 = r5[r7];
        r5 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1));
        if (r5 == 0) goto L_0x03cb;
    L_0x02b0:
        goto L_0x02a4;
    L_0x02b1:
        r10 = r0.m;
        r11 = r10.length;
        r12 = -1;
        if (r5 >= r11) goto L_0x02e7;
    L_0x02b8:
        r11 = r0.n;
        r14 = r11[r5];
        r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r11 == 0) goto L_0x02e4;
    L_0x02c0:
        r19 = r10[r5];
        r10 = r0.i;
        r12 = r0.j;
        r21 = r10;
        r23 = r12;
        r10 = defpackage.nxf.a(r19, r21, r23);
        r12 = 1;
        r13 = defpackage.nxf.b(r6, r14, r12);
        r14 = r14 + r10;
        r10 = 0;
        r11 = defpackage.nxf.b(r6, r14, r10);
        r10 = r11 - r13;
        r7 = r7 + r10;
        if (r8 == r13) goto L_0x02e0;
    L_0x02de:
        r8 = 1;
        goto L_0x02e1;
    L_0x02e0:
        r8 = 0;
    L_0x02e1:
        r8 = r8 | r9;
        r9 = r8;
        r8 = r11;
    L_0x02e4:
        r5 = r5 + 1;
        goto L_0x02b1;
    L_0x02e7:
        if (r7 == r2) goto L_0x02eb;
    L_0x02e9:
        r2 = 1;
        goto L_0x02ec;
    L_0x02eb:
        r2 = 0;
    L_0x02ec:
        r2 = r2 | r9;
        if (r2 == 0) goto L_0x02f2;
    L_0x02ef:
        r5 = new long[r7];
        goto L_0x02f3;
    L_0x02f2:
        r5 = r3;
    L_0x02f3:
        if (r2 == 0) goto L_0x02f8;
    L_0x02f5:
        r8 = new int[r7];
        goto L_0x02f9;
    L_0x02f8:
        r8 = r4;
    L_0x02f9:
        if (r2 != 0) goto L_0x02fc;
    L_0x02fb:
        goto L_0x02fe;
    L_0x02fc:
        r33 = 0;
    L_0x02fe:
        if (r2 == 0) goto L_0x0303;
    L_0x0300:
        r9 = new int[r7];
        goto L_0x0304;
    L_0x0303:
        r9 = r1;
    L_0x0304:
        r7 = new long[r7];
        r22 = r33;
        r10 = 0;
        r11 = 0;
    L_0x030a:
        r14 = r0.m;
        r15 = r14.length;
        if (r10 >= r15) goto L_0x039e;
    L_0x030f:
        r15 = r0.n;
        r23 = r7;
        r21 = r8;
        r7 = r15[r10];
        r19 = r14[r10];
        r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1));
        if (r14 == 0) goto L_0x038b;
    L_0x031d:
        r14 = r0.i;
        r12 = r0.j;
        r25 = r19;
        r27 = r14;
        r29 = r12;
        r12 = defpackage.nxf.a(r25, r27, r29);
        r14 = 1;
        r15 = defpackage.nxf.b(r6, r7, r14);
        r12 = r12 + r7;
        r14 = 0;
        r12 = defpackage.nxf.b(r6, r12, r14);
        if (r2 == 0) goto L_0x0346;
    L_0x0338:
        r13 = r12 - r15;
        java.lang.System.arraycopy(r3, r15, r5, r11, r13);
        r14 = r21;
        java.lang.System.arraycopy(r4, r15, r14, r11, r13);
        java.lang.System.arraycopy(r1, r15, r9, r11, r13);
        goto L_0x0348;
    L_0x0346:
        r14 = r21;
    L_0x0348:
        r13 = r22;
    L_0x034a:
        if (r15 >= r12) goto L_0x0384;
    L_0x034c:
        r27 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r24 = r9;
        r21 = r10;
        r9 = r0.j;
        r25 = r17;
        r29 = r9;
        r9 = defpackage.nxf.a(r25, r27, r29);
        r25 = r6[r15];
        r33 = r25 - r7;
        r35 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r25 = r7;
        r7 = r0.i;
        r37 = r7;
        r7 = defpackage.nxf.a(r33, r35, r37);
        r9 = r9 + r7;
        r23[r11] = r9;
        if (r2 == 0) goto L_0x0379;
    L_0x0373:
        r7 = r14[r11];
        if (r7 <= r13) goto L_0x0379;
    L_0x0377:
        r13 = r4[r15];
    L_0x0379:
        r11 = r11 + 1;
        r15 = r15 + 1;
        r10 = r21;
        r9 = r24;
        r7 = r25;
        goto L_0x034a;
    L_0x0384:
        r24 = r9;
        r21 = r10;
        r22 = r13;
        goto L_0x0391;
    L_0x038b:
        r24 = r9;
        r14 = r21;
        r21 = r10;
    L_0x0391:
        r17 = r17 + r19;
        r10 = r21 + 1;
        r8 = r14;
        r7 = r23;
        r9 = r24;
        r12 = -1;
        goto L_0x030a;
    L_0x039e:
        r23 = r7;
        r14 = r8;
        r1 = r9;
        r0 = 0;
        r16 = 0;
    L_0x03a5:
        r2 = r1.length;
        if (r0 < r2) goto L_0x03b3;
    L_0x03a8:
        if (r16 == 0) goto L_0x03ab;
    L_0x03aa:
        goto L_0x03bd;
    L_0x03ab:
        r0 = new nnc;
        r1 = "The edited sample sequence does not contain a sync sample.";
        r0.<init>(r1);
        throw r0;
    L_0x03b3:
        if (r16 != 0) goto L_0x03bd;
    L_0x03b5:
        r2 = r1[r0];
        r3 = 1;
        r16 = r2 & 1;
        r0 = r0 + 1;
        goto L_0x03a5;
    L_0x03bd:
        r0 = new ntc;
        r19 = r0;
        r20 = r5;
        r21 = r14;
        r24 = r1;
        r19.<init>(r20, r21, r22, r23, r24);
        return r0;
    L_0x03cb:
        r2 = 0;
    L_0x03cc:
        r5 = r6.length;
        if (r2 >= r5) goto L_0x03e8;
    L_0x03cf:
        r7 = r6[r2];
        r5 = r0.n;
        r9 = 0;
        r10 = r5[r9];
        r12 = r7 - r10;
        r14 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r7 = r0.i;
        r16 = r7;
        r7 = defpackage.nxf.a(r12, r14, r16);
        r6[r2] = r7;
        r2 = r2 + 1;
        goto L_0x03cc;
    L_0x03e8:
        r0 = new ntc;
        r30 = r0;
        r31 = r3;
        r32 = r4;
        r34 = r6;
        r35 = r1;
        r30.<init>(r31, r32, r33, r34, r35);
        return r0;
    L_0x03f8:
        r0 = new nnc;
        r1 = "Track has no sample table size information";
        r0.<init>(r1);
        goto L_0x0401;
    L_0x0400:
        throw r0;
    L_0x0401:
        goto L_0x0400;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsh.a(nsx, nsf):ntc");
    }

    public static nrj a(nsi nsi, boolean z) {
        if (z) {
            return null;
        }
        nwz nwz = nsi.a;
        nwz.c(8);
        while (nwz.b() >= 8) {
            int j = nwz.j();
            if (nwz.j() != nsg.aC) {
                nwz.d(j - 8);
            } else {
                nwz.c(nwz.b - 8);
                nwz.b(nwz.b + j);
                nwz.d(12);
                nwz nwz2 = new nwz();
                while (nwz.b() >= 8) {
                    int j2 = nwz.j() - 8;
                    if (nwz.j() == nsg.aD) {
                        nrj a;
                        nwz2.a(nwz.a, nwz.b + j2);
                        nwz2.c(nwz.b);
                        while (nwz2.b() > 0) {
                            int j3 = nwz2.b + nwz2.j();
                            if (nwz2.j() == nsg.aP) {
                                String str = null;
                                String str2 = str;
                                Object obj = str2;
                                while (nwz2.b < j3) {
                                    int j4 = nwz2.j() - 12;
                                    int j5 = nwz2.j();
                                    nwz2.d(4);
                                    if (j5 == nsg.aE) {
                                        obj = nwz2.e(j4);
                                    } else if (j5 == nsg.aF) {
                                        str = nwz2.e(j4);
                                    } else if (j5 == nsg.aG) {
                                        nwz2.d(4);
                                        str2 = nwz2.e(j4 - 4);
                                    } else {
                                        nwz2.d(j4);
                                    }
                                }
                                if (!(str == null || str2 == null || !"com.apple.iTunes".equals(obj))) {
                                    a = nrj.a(str, str2);
                                    break;
                                }
                            }
                            nwz2.c(j3);
                        }
                        a = null;
                        if (a != null) {
                            return a;
                        }
                    }
                    nwz.d(j2);
                }
                return null;
            }
        }
        return null;
    }

    private static Pair a(nwz nwz, int i) {
        nwz.c(i + 12);
        nwz.d(1);
        nsh.a(nwz);
        nwz.d(2);
        int d = nwz.d();
        if ((d & 128) != 0) {
            nwz.d(2);
        }
        if ((d & 64) != 0) {
            nwz.d(nwz.e());
        }
        if ((d & 32) != 0) {
            nwz.d(2);
        }
        nwz.d(1);
        nsh.a(nwz);
        int d2 = nwz.d();
        Object obj = null;
        if (d2 == 32) {
            obj = "video/mp4v-es";
        } else if (d2 == 33) {
            obj = "video/avc";
        } else if (d2 != 35) {
            if (d2 != 64) {
                if (d2 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (d2 == 165) {
                    obj = "audio/ac3";
                } else if (d2 != 166) {
                    switch (d2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (d2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                            break;
                    }
                } else {
                    obj = "audio/eac3";
                }
            }
            obj = "audio/mp4a-latm";
        } else {
            obj = "video/hevc";
        }
        nwz.d(12);
        nwz.d(1);
        i = nsh.a(nwz);
        byte[] bArr = new byte[i];
        nwz.a(bArr, 0, i);
        return Pair.create(obj, bArr);
    }

    private static int a(nwz nwz, int i, int i2, nsl nsl, int i3) {
        int i4 = nwz.b;
        while (true) {
            boolean z = false;
            if (i4 - i >= i2) {
                return 0;
            }
            nwz.c(i4);
            int j = nwz.j();
            nwf.a(j > 0, "childAtomSize should be positive");
            if (nwz.j() == nsg.Y) {
                int i5 = i4 + 8;
                Pair pair = null;
                Object obj = null;
                Object obj2 = obj;
                Object obj3 = null;
                while (i5 - i4 < j) {
                    nwz.c(i5);
                    int j2 = nwz.j();
                    int j3 = nwz.j();
                    if (j3 == nsg.ae) {
                        obj = Integer.valueOf(nwz.j());
                    } else if (j3 == nsg.Z) {
                        nwz.d(4);
                        obj3 = nwz.j() == a ? 1 : null;
                    } else if (j3 == nsg.aa) {
                        nta nta;
                        int i6 = i5 + 8;
                        while (i6 - i5 < j2) {
                            nwz.c(i6);
                            j3 = nwz.j();
                            if (nwz.j() == nsg.ab) {
                                nwz.d(6);
                                nwz.d();
                                i6 = nwz.d();
                                byte[] bArr = new byte[16];
                                nwz.a(bArr, 0, 16);
                                nta = new nta(i6, bArr);
                                break;
                            }
                            i6 += j3;
                        }
                        nta = null;
                        obj2 = nta;
                    }
                    i5 += j2;
                }
                if (obj3 != null) {
                    nwf.a(obj != null, "frma atom is mandatory");
                    if (obj2 != null) {
                        z = true;
                    }
                    nwf.a(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(obj, obj2);
                }
                if (pair != null) {
                    nsl.a[i3] = (nta) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            nsl nsl2 = nsl;
            i4 += j;
        }
    }

    private static int a(nwz nwz) {
        int d = nwz.d();
        int i = d & 127;
        while ((d & 128) == 128) {
            d = nwz.d();
            i = (i << 7) | (d & 127);
        }
        return i;
    }
}
