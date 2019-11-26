package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ohd */
final class ohd {
    private static final int a = ozp.f("vide");
    private static final int b = ozp.f("soun");
    private static final int c = ozp.f("text");
    private static final int d = ozp.f("sbtl");
    private static final int e = ozp.f("subt");
    private static final int f = ozp.f("clcp");
    private static final int g = ozp.f("meta");
    private static final int h = ozp.f("mdta");
    private static final byte[] i = ozp.c("OpusHead");

    /* JADX WARNING: Removed duplicated region for block: B:515:0x07d7 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x078e  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x08d1  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x08a6  */
    /* JADX WARNING: Missing block: B:41:0x009a, code skipped:
            r6 = -9223372036854775807L;
     */
    public static defpackage.ohx a(defpackage.ohb r43, defpackage.oha r44, long r45, defpackage.odq r47, boolean r48, boolean r49) {
        /*
        r0 = r43;
        r1 = r47;
        r2 = defpackage.ogy.T;
        r2 = r0.e(r2);
        r3 = defpackage.ogy.af;
        r3 = r2.d(r3);
        r3 = r3.bg;
        r3 = defpackage.ohd.a(r3);
        r4 = b;
        r5 = 4;
        r6 = -1;
        r8 = 3;
        if (r3 == r4) goto L_0x003d;
    L_0x001d:
        r4 = a;
        if (r3 == r4) goto L_0x003b;
    L_0x0021:
        r4 = c;
        if (r3 == r4) goto L_0x0039;
    L_0x0025:
        r4 = d;
        if (r3 == r4) goto L_0x0039;
    L_0x0029:
        r4 = e;
        if (r3 == r4) goto L_0x0039;
    L_0x002d:
        r4 = f;
        if (r3 == r4) goto L_0x0039;
    L_0x0031:
        r4 = g;
        if (r3 != r4) goto L_0x0037;
    L_0x0035:
        r12 = 4;
        goto L_0x003e;
    L_0x0037:
        r12 = -1;
        goto L_0x003e;
    L_0x0039:
        r12 = 3;
        goto L_0x003e;
    L_0x003b:
        r12 = 2;
        goto L_0x003e;
    L_0x003d:
        r12 = 1;
    L_0x003e:
        if (r12 == r6) goto L_0x08d3;
    L_0x0040:
        r4 = defpackage.ogy.ab;
        r4 = r0.d(r4);
        r4 = r4.bg;
        r10 = 8;
        r4.c(r10);
        r11 = r4.k();
        r11 = defpackage.ogy.a(r11);
        r13 = 16;
        if (r11 != 0) goto L_0x005c;
    L_0x0059:
        r14 = 8;
        goto L_0x005e;
    L_0x005c:
        r14 = 16;
    L_0x005e:
        r4.d(r14);
        r14 = r4.k();
        r4.d(r5);
        r15 = r4.b;
        if (r11 != 0) goto L_0x006e;
    L_0x006c:
        r3 = 4;
        goto L_0x0070;
    L_0x006e:
        r3 = 8;
    L_0x0070:
        r9 = 0;
    L_0x0071:
        r18 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        if (r9 >= r3) goto L_0x0097;
    L_0x0078:
        r7 = r4.a;
        r21 = r15 + r9;
        r7 = r7[r21];
        if (r7 != r6) goto L_0x0083;
    L_0x0080:
        r9 = r9 + 1;
        goto L_0x0071;
    L_0x0083:
        if (r11 == 0) goto L_0x008a;
    L_0x0085:
        r21 = r4.q();
        goto L_0x008e;
    L_0x008a:
        r21 = r4.i();
    L_0x008e:
        r23 = 0;
        r3 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1));
        if (r3 == 0) goto L_0x009a;
    L_0x0094:
        r6 = r21;
        goto L_0x009c;
    L_0x0097:
        r4.d(r3);
    L_0x009a:
        r6 = r18;
    L_0x009c:
        r4.d(r13);
        r9 = r4.k();
        r11 = r4.k();
        r4.d(r5);
        r15 = r4.k();
        r4 = r4.k();
        r3 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        if (r9 != 0) goto L_0x00c1;
    L_0x00b6:
        r5 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r11 != r5) goto L_0x00c1;
    L_0x00ba:
        if (r15 != r3) goto L_0x00c1;
    L_0x00bc:
        if (r4 != 0) goto L_0x00c1;
    L_0x00be:
        r3 = 90;
        goto L_0x00dc;
    L_0x00c1:
        if (r9 != 0) goto L_0x00cf;
    L_0x00c3:
        if (r11 != r3) goto L_0x00cf;
    L_0x00c5:
        r5 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r15 != r5) goto L_0x00cf;
    L_0x00c9:
        if (r4 == 0) goto L_0x00cc;
    L_0x00cb:
        goto L_0x00cf;
    L_0x00cc:
        r3 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x00dc;
    L_0x00cf:
        if (r9 != r3) goto L_0x00db;
    L_0x00d1:
        if (r11 != 0) goto L_0x00db;
    L_0x00d3:
        if (r15 != 0) goto L_0x00db;
    L_0x00d5:
        if (r4 == r3) goto L_0x00d8;
    L_0x00d7:
        goto L_0x00db;
    L_0x00d8:
        r3 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        goto L_0x00dc;
    L_0x00db:
        r3 = 0;
    L_0x00dc:
        r4 = new ohj;
        r4.<init>(r14, r6, r3);
        r3 = (r45 > r18 ? 1 : (r45 == r18 ? 0 : -1));
        if (r3 != 0) goto L_0x00ec;
    L_0x00e5:
        r5 = r4.b;
        r3 = r44;
        r23 = r5;
        goto L_0x00f0;
    L_0x00ec:
        r3 = r44;
        r23 = r45;
    L_0x00f0:
        r3 = r3.bg;
        r3.c(r10);
        r5 = r3.k();
        r5 = defpackage.ogy.a(r5);
        if (r5 != 0) goto L_0x0102;
    L_0x00ff:
        r5 = 8;
        goto L_0x0104;
    L_0x0102:
        r5 = 16;
    L_0x0104:
        r3.d(r5);
        r5 = r3.i();
        r3 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1));
        if (r3 == 0) goto L_0x011a;
    L_0x010f:
        r25 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r27 = r5;
        r14 = defpackage.ozp.b(r23, r25, r27);
        r18 = r14;
    L_0x011a:
        r3 = defpackage.ogy.U;
        r3 = r2.e(r3);
        r7 = defpackage.ogy.V;
        r3 = r3.e(r7);
        r7 = defpackage.ogy.ae;
        r2 = r2.d(r7);
        r2 = r2.bg;
        r2.c(r10);
        r7 = r2.k();
        r7 = defpackage.ogy.a(r7);
        if (r7 != 0) goto L_0x013e;
    L_0x013b:
        r9 = 8;
        goto L_0x0140;
    L_0x013e:
        r9 = 16;
    L_0x0140:
        r2.d(r9);
        r14 = r2.i();
        if (r7 != 0) goto L_0x014b;
    L_0x0149:
        r7 = 4;
        goto L_0x014d;
    L_0x014b:
        r7 = 8;
    L_0x014d:
        r2.d(r7);
        r2 = r2.e();
        r7 = new java.lang.StringBuilder;
        r7.<init>(r8);
        r9 = r2 >> 10;
        r9 = r9 & 31;
        r9 = r9 + 96;
        r9 = (char) r9;
        r7.append(r9);
        r9 = r2 >> 5;
        r9 = r9 & 31;
        r9 = r9 + 96;
        r9 = (char) r9;
        r7.append(r9);
        r2 = r2 & 31;
        r2 = r2 + 96;
        r2 = (char) r2;
        r7.append(r2);
        r2 = r7.toString();
        r7 = java.lang.Long.valueOf(r14);
        r2 = android.util.Pair.create(r7, r2);
        r7 = defpackage.ogy.ag;
        r3 = r3.d(r7);
        r3 = r3.bg;
        r7 = r4.a;
        r9 = r4.c;
        r11 = r2.second;
        r11 = (java.lang.String) r11;
        r14 = 12;
        r3.c(r14);
        r14 = r3.k();
        r15 = new ohe;
        r15.<init>(r14);
        r8 = 0;
    L_0x01a0:
        if (r8 >= r14) goto L_0x080f;
    L_0x01a2:
        r13 = r3.b;
        r10 = r3.k();
        if (r10 <= 0) goto L_0x01b0;
    L_0x01aa:
        r45 = r5;
        r44 = r14;
        r14 = 1;
        goto L_0x01b5;
    L_0x01b0:
        r45 = r5;
        r44 = r14;
        r14 = 0;
    L_0x01b5:
        r5 = "childAtomSize should be positive";
        defpackage.oxz.a(r14, r5);
        r6 = r3.k();
        r14 = defpackage.ogy.b;
        if (r6 == r14) goto L_0x05b1;
    L_0x01c2:
        r14 = defpackage.ogy.c;
        if (r6 == r14) goto L_0x05b1;
    L_0x01c6:
        r14 = defpackage.ogy.am;
        if (r6 == r14) goto L_0x05b1;
    L_0x01ca:
        r14 = defpackage.ogy.ax;
        if (r6 == r14) goto L_0x05b1;
    L_0x01ce:
        r14 = defpackage.ogy.e;
        if (r6 == r14) goto L_0x05b1;
    L_0x01d2:
        r14 = defpackage.ogy.f;
        if (r6 == r14) goto L_0x05b1;
    L_0x01d6:
        r14 = defpackage.ogy.s;
        if (r6 == r14) goto L_0x05b1;
    L_0x01da:
        r14 = defpackage.ogy.h;
        if (r6 == r14) goto L_0x05b1;
    L_0x01de:
        r14 = defpackage.ogy.i;
        if (r6 == r14) goto L_0x05b1;
    L_0x01e2:
        r14 = defpackage.ogy.k;
        if (r6 == r14) goto L_0x05b1;
    L_0x01e6:
        r14 = defpackage.ogy.m;
        if (r6 == r14) goto L_0x05b1;
    L_0x01ea:
        r14 = defpackage.ogy.n;
        if (r6 == r14) goto L_0x05b1;
    L_0x01ee:
        r14 = defpackage.ogy.o;
        if (r6 == r14) goto L_0x05b1;
    L_0x01f2:
        r14 = defpackage.ogy.p;
        if (r6 == r14) goto L_0x05b1;
    L_0x01f6:
        r14 = defpackage.ogy.v;
        if (r6 == r14) goto L_0x02dc;
    L_0x01fa:
        r14 = defpackage.ogy.an;
        if (r6 == r14) goto L_0x02dc;
    L_0x01fe:
        r14 = defpackage.ogy.A;
        if (r6 == r14) goto L_0x02dc;
    L_0x0202:
        r14 = defpackage.ogy.C;
        if (r6 == r14) goto L_0x02dc;
    L_0x0206:
        r14 = defpackage.ogy.E;
        if (r6 == r14) goto L_0x02dc;
    L_0x020a:
        r14 = defpackage.ogy.G;
        if (r6 == r14) goto L_0x02dc;
    L_0x020e:
        r14 = defpackage.ogy.J;
        if (r6 == r14) goto L_0x02dc;
    L_0x0212:
        r14 = defpackage.ogy.H;
        if (r6 == r14) goto L_0x02dc;
    L_0x0216:
        r14 = defpackage.ogy.I;
        if (r6 == r14) goto L_0x02dc;
    L_0x021a:
        r14 = defpackage.ogy.aK;
        if (r6 == r14) goto L_0x02dc;
    L_0x021e:
        r14 = defpackage.ogy.aL;
        if (r6 == r14) goto L_0x02dc;
    L_0x0222:
        r14 = defpackage.ogy.y;
        if (r6 == r14) goto L_0x02dc;
    L_0x0226:
        r14 = defpackage.ogy.z;
        if (r6 == r14) goto L_0x02dc;
    L_0x022a:
        r14 = defpackage.ogy.w;
        if (r6 == r14) goto L_0x02dc;
    L_0x022e:
        r14 = defpackage.ogy.aY;
        if (r6 == r14) goto L_0x02dc;
    L_0x0232:
        r14 = defpackage.ogy.aZ;
        if (r6 == r14) goto L_0x02dc;
    L_0x0236:
        r14 = defpackage.ogy.ba;
        if (r6 == r14) goto L_0x02dc;
    L_0x023a:
        r14 = defpackage.ogy.bb;
        if (r6 == r14) goto L_0x02dc;
    L_0x023e:
        r14 = defpackage.ogy.bd;
        if (r6 == r14) goto L_0x02dc;
    L_0x0242:
        r5 = defpackage.ogy.aw;
        if (r6 == r5) goto L_0x0267;
    L_0x0246:
        r5 = defpackage.ogy.aG;
        if (r6 == r5) goto L_0x0267;
    L_0x024a:
        r5 = defpackage.ogy.aH;
        if (r6 == r5) goto L_0x0267;
    L_0x024e:
        r5 = defpackage.ogy.aI;
        if (r6 == r5) goto L_0x0267;
    L_0x0252:
        r5 = defpackage.ogy.aJ;
        if (r6 == r5) goto L_0x0267;
    L_0x0256:
        r5 = defpackage.ogy.aX;
        if (r6 != r5) goto L_0x02c9;
    L_0x025a:
        r5 = java.lang.Integer.toString(r7);
        r6 = "application/x-camera-motion";
        r5 = defpackage.nzw.a(r5, r6);
        r15.b = r5;
        goto L_0x02c9;
    L_0x0267:
        r5 = r13 + 16;
        r3.c(r5);
        r5 = defpackage.ogy.aw;
        r23 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        if (r6 != r5) goto L_0x027e;
    L_0x0275:
        r5 = "application/ttml+xml";
    L_0x0277:
        r29 = r23;
        r31 = 0;
        r24 = r5;
        goto L_0x02b7;
    L_0x027e:
        r5 = defpackage.ogy.aG;
        if (r6 != r5) goto L_0x0297;
    L_0x0282:
        r5 = r10 + -16;
        r6 = new byte[r5];
        r14 = 0;
        r3.a(r6, r14, r5);
        r5 = java.util.Collections.singletonList(r6);
        r6 = "application/x-quicktime-tx3g";
        r31 = r5;
        r29 = r23;
        r24 = r6;
        goto L_0x02b7;
    L_0x0297:
        r5 = defpackage.ogy.aH;
        if (r6 != r5) goto L_0x029e;
    L_0x029b:
        r5 = "application/x-mp4-vtt";
        goto L_0x0277;
    L_0x029e:
        r5 = defpackage.ogy.aI;
        if (r6 != r5) goto L_0x02ad;
    L_0x02a2:
        r5 = 0;
        r14 = "application/ttml+xml";
        r29 = r5;
        r24 = r14;
        r31 = 0;
        goto L_0x02b7;
    L_0x02ad:
        r5 = defpackage.ogy.aJ;
        if (r6 != r5) goto L_0x02d6;
    L_0x02b1:
        r5 = 1;
        r15.d = r5;
        r5 = "application/x-mp4-cea-608";
        goto L_0x0277;
    L_0x02b7:
        r23 = java.lang.Integer.toString(r7);
        r25 = 0;
        r27 = -1;
        r28 = 0;
        r26 = r11;
        r5 = defpackage.nzw.a(r23, r24, r25, r26, r27, r28, r29, r31);
        r15.b = r5;
    L_0x02c9:
        r38 = r2;
        r39 = r4;
        r41 = r8;
        r40 = r9;
        r4 = r10;
        r8 = r11;
        r36 = r12;
        goto L_0x0331;
    L_0x02d6:
        r0 = new java.lang.IllegalStateException;
        r0.<init>();
        throw r0;
    L_0x02dc:
        r14 = r13 + 16;
        r3.c(r14);
        if (r49 == 0) goto L_0x02f0;
    L_0x02e3:
        r14 = r3.e();
        r23 = r14;
        r14 = 6;
        r3.d(r14);
        r14 = r23;
        goto L_0x02f6;
    L_0x02f0:
        r14 = 8;
        r3.d(r14);
        r14 = 0;
    L_0x02f6:
        if (r14 != 0) goto L_0x02fd;
    L_0x02f8:
        r37 = r11;
        r36 = r12;
        goto L_0x0337;
    L_0x02fd:
        r36 = r12;
        r12 = 1;
        if (r14 == r12) goto L_0x0335;
    L_0x0302:
        r12 = 2;
        if (r14 != r12) goto L_0x0327;
    L_0x0305:
        r12 = 16;
        r3.d(r12);
        r23 = r3.m();
        r23 = java.lang.Double.longBitsToDouble(r23);
        r37 = r11;
        r11 = java.lang.Math.round(r23);
        r12 = (int) r11;
        r11 = r3.o();
        r14 = 20;
        r3.d(r14);
        r38 = r2;
        r39 = r4;
        goto L_0x036d;
    L_0x0327:
        r38 = r2;
        r39 = r4;
        r41 = r8;
        r40 = r9;
        r4 = r10;
        r8 = r11;
    L_0x0331:
        r2 = r13;
        r11 = r1;
        goto L_0x07f1;
    L_0x0335:
        r37 = r11;
    L_0x0337:
        r11 = r3.e();
        r12 = 6;
        r3.d(r12);
        r12 = r3.a;
        r23 = r11;
        r11 = r3.b;
        r38 = r2;
        r2 = r11 + 1;
        r3.b = r2;
        r11 = r12[r11];
        r39 = r4;
        r4 = r2 + 1;
        r3.b = r4;
        r11 = r11 & 255;
        r24 = 8;
        r11 = r11 << 8;
        r2 = r12[r2];
        r2 = r2 & 255;
        r12 = r11 | r2;
        r2 = 2;
        r4 = r4 + r2;
        r3.b = r4;
        r2 = 1;
        if (r14 != r2) goto L_0x036b;
    L_0x0366:
        r2 = 16;
        r3.d(r2);
    L_0x036b:
        r11 = r23;
    L_0x036d:
        r2 = r3.b;
        r4 = defpackage.ogy.an;
        if (r6 != r4) goto L_0x03a3;
    L_0x0373:
        r4 = defpackage.ohd.a(r3, r13, r10);
        if (r4 == 0) goto L_0x039e;
    L_0x0379:
        r6 = r4.first;
        r6 = (java.lang.Integer) r6;
        r6 = r6.intValue();
        if (r1 == 0) goto L_0x0390;
    L_0x0383:
        r14 = r4.second;
        r14 = (defpackage.ohw) r14;
        r14 = r14.b;
        r14 = r1.a(r14);
        r23 = r6;
        goto L_0x0393;
    L_0x0390:
        r23 = r6;
        r14 = 0;
    L_0x0393:
        r6 = r15.a;
        r4 = r4.second;
        r4 = (defpackage.ohw) r4;
        r6[r8] = r4;
        r6 = r23;
        goto L_0x039f;
    L_0x039e:
        r14 = r1;
    L_0x039f:
        r3.c(r2);
        goto L_0x03a4;
    L_0x03a3:
        r14 = r1;
    L_0x03a4:
        r4 = defpackage.ogy.A;
        if (r6 != r4) goto L_0x03ac;
    L_0x03a8:
        r4 = "audio/ac3";
        goto L_0x041c;
    L_0x03ac:
        r4 = defpackage.ogy.C;
        if (r6 != r4) goto L_0x03b4;
    L_0x03b0:
        r4 = "audio/eac3";
        goto L_0x041c;
    L_0x03b4:
        r4 = defpackage.ogy.E;
        if (r6 != r4) goto L_0x03bc;
    L_0x03b8:
        r4 = "audio/ac4";
        goto L_0x041c;
    L_0x03bc:
        r4 = defpackage.ogy.G;
        if (r6 != r4) goto L_0x03c4;
    L_0x03c0:
        r4 = "audio/vnd.dts";
        goto L_0x041c;
    L_0x03c4:
        r4 = defpackage.ogy.H;
        if (r6 != r4) goto L_0x03c9;
    L_0x03c8:
        goto L_0x041a;
    L_0x03c9:
        r4 = defpackage.ogy.I;
        if (r6 == r4) goto L_0x041a;
    L_0x03cd:
        r4 = defpackage.ogy.J;
        if (r6 != r4) goto L_0x03d4;
    L_0x03d1:
        r4 = "audio/vnd.dts.hd;profile=lbr";
        goto L_0x041c;
    L_0x03d4:
        r4 = defpackage.ogy.aK;
        if (r6 != r4) goto L_0x03db;
    L_0x03d8:
        r4 = "audio/3gpp";
        goto L_0x041c;
    L_0x03db:
        r4 = defpackage.ogy.aL;
        if (r6 != r4) goto L_0x03e2;
    L_0x03df:
        r4 = "audio/amr-wb";
        goto L_0x041c;
    L_0x03e2:
        r4 = defpackage.ogy.y;
        if (r6 != r4) goto L_0x03e7;
    L_0x03e6:
        goto L_0x0417;
    L_0x03e7:
        r4 = defpackage.ogy.z;
        if (r6 == r4) goto L_0x0417;
    L_0x03eb:
        r4 = defpackage.ogy.w;
        if (r6 != r4) goto L_0x03f2;
    L_0x03ef:
        r4 = "audio/mpeg";
        goto L_0x041c;
    L_0x03f2:
        r4 = defpackage.ogy.aY;
        if (r6 != r4) goto L_0x03f9;
    L_0x03f6:
        r4 = "audio/alac";
        goto L_0x041c;
    L_0x03f9:
        r4 = defpackage.ogy.aZ;
        if (r6 != r4) goto L_0x0400;
    L_0x03fd:
        r4 = "audio/g711-alaw";
        goto L_0x041c;
    L_0x0400:
        r4 = defpackage.ogy.ba;
        if (r6 != r4) goto L_0x0407;
    L_0x0404:
        r4 = "audio/g711-mlaw";
        goto L_0x041c;
    L_0x0407:
        r4 = defpackage.ogy.bb;
        if (r6 != r4) goto L_0x040e;
    L_0x040b:
        r4 = "audio/opus";
        goto L_0x041c;
    L_0x040e:
        r4 = defpackage.ogy.bd;
        if (r6 != r4) goto L_0x0415;
    L_0x0412:
        r4 = "audio/flac";
        goto L_0x041c;
    L_0x0415:
        r4 = 0;
        goto L_0x041c;
    L_0x0417:
        r4 = "audio/raw";
        goto L_0x041c;
    L_0x041a:
        r4 = "audio/vnd.dts.hd";
    L_0x041c:
        r6 = r2;
        r2 = 0;
    L_0x041e:
        r0 = r6 - r13;
        if (r0 >= r10) goto L_0x0566;
    L_0x0422:
        r3.c(r6);
        r0 = r3.k();
        if (r0 <= 0) goto L_0x042f;
    L_0x042b:
        r40 = r9;
        r9 = 1;
        goto L_0x0432;
    L_0x042f:
        r40 = r9;
        r9 = 0;
    L_0x0432:
        defpackage.oxz.a(r9, r5);
        r9 = r3.k();
        r41 = r8;
        r8 = defpackage.ogy.W;
        if (r9 != r8) goto L_0x0448;
    L_0x043f:
        r42 = r13;
        r8 = r37;
        r37 = r10;
        r10 = 0;
        goto L_0x0501;
    L_0x0448:
        if (r49 != 0) goto L_0x044b;
    L_0x044a:
        goto L_0x044f;
    L_0x044b:
        r8 = defpackage.ogy.x;
        if (r9 == r8) goto L_0x043f;
    L_0x044f:
        r8 = defpackage.ogy.B;
        if (r9 != r8) goto L_0x046c;
    L_0x0453:
        r8 = r6 + 8;
        r3.c(r8);
        r8 = java.lang.Integer.toString(r7);
        r9 = r37;
        r8 = defpackage.obe.a(r3, r8, r9, r14);
        r15.b = r8;
        r8 = r9;
    L_0x0465:
        r37 = r10;
        r42 = r13;
    L_0x0469:
        r10 = 0;
        goto L_0x04ff;
    L_0x046c:
        r8 = r37;
        r1 = defpackage.ogy.D;
        if (r9 != r1) goto L_0x0482;
    L_0x0472:
        r1 = r6 + 8;
        r3.c(r1);
        r1 = java.lang.Integer.toString(r7);
        r1 = defpackage.obe.b(r3, r1, r8, r14);
        r15.b = r1;
        goto L_0x0465;
    L_0x0482:
        r1 = defpackage.ogy.F;
        if (r9 != r1) goto L_0x0496;
    L_0x0486:
        r1 = r6 + 8;
        r3.c(r1);
        r1 = java.lang.Integer.toString(r7);
        r1 = defpackage.obg.a(r3, r1, r8, r14);
        r15.b = r1;
        goto L_0x0465;
    L_0x0496:
        r1 = defpackage.ogy.K;
        if (r9 != r1) goto L_0x04b5;
    L_0x049a:
        r23 = java.lang.Integer.toString(r7);
        r25 = -1;
        r26 = -1;
        r29 = 0;
        r24 = r4;
        r27 = r11;
        r28 = r12;
        r30 = r14;
        r31 = r8;
        r1 = defpackage.nzw.a(r23, r24, r25, r26, r27, r28, r29, r30, r31);
        r15.b = r1;
        goto L_0x0465;
    L_0x04b5:
        r1 = defpackage.ogy.aY;
        if (r9 != r1) goto L_0x04c8;
    L_0x04b9:
        r1 = new byte[r0];
        r3.c(r6);
        r2 = 0;
        r3.a(r1, r2, r0);
        r2 = r1;
        r37 = r10;
        r42 = r13;
        goto L_0x04ff;
    L_0x04c8:
        r1 = defpackage.ogy.bc;
        if (r9 != r1) goto L_0x04ea;
    L_0x04cc:
        r1 = r0 + -8;
        r2 = i;
        r9 = r2.length;
        r9 = r9 + r1;
        r9 = new byte[r9];
        r37 = r10;
        r10 = r2.length;
        r42 = r13;
        r13 = 0;
        java.lang.System.arraycopy(r2, r13, r9, r13, r10);
        r2 = r6 + 8;
        r3.c(r2);
        r2 = i;
        r2 = r2.length;
        r3.a(r9, r2, r1);
        r2 = r9;
        goto L_0x04ff;
    L_0x04ea:
        r37 = r10;
        r42 = r13;
        r1 = defpackage.ogy.be;
        if (r0 != r1) goto L_0x0469;
    L_0x04f2:
        r1 = r0 + -12;
        r2 = new byte[r1];
        r9 = r6 + 12;
        r3.c(r9);
        r10 = 0;
        r3.a(r2, r10, r1);
    L_0x04ff:
        r9 = -1;
        goto L_0x0557;
    L_0x0501:
        r1 = defpackage.ogy.W;
        if (r9 != r1) goto L_0x0508;
    L_0x0505:
        r1 = r6;
    L_0x0506:
        r9 = -1;
        goto L_0x052a;
    L_0x0508:
        r1 = r3.b;
    L_0x050a:
        r9 = r1 - r6;
        if (r9 >= r0) goto L_0x0528;
    L_0x050e:
        r3.c(r1);
        r9 = r3.k();
        if (r9 <= 0) goto L_0x0519;
    L_0x0517:
        r13 = 1;
        goto L_0x051a;
    L_0x0519:
        r13 = 0;
    L_0x051a:
        defpackage.oxz.a(r13, r5);
        r13 = r3.k();
        r10 = defpackage.ogy.W;
        if (r13 == r10) goto L_0x0506;
    L_0x0525:
        r1 = r1 + r9;
        r10 = 0;
        goto L_0x050a;
    L_0x0528:
        r1 = -1;
        goto L_0x0506;
    L_0x052a:
        if (r1 != r9) goto L_0x052d;
    L_0x052c:
        goto L_0x0557;
    L_0x052d:
        r1 = defpackage.ohd.a(r3, r1);
        r2 = r1.first;
        r4 = r2;
        r4 = (java.lang.String) r4;
        r1 = r1.second;
        r2 = r1;
        r2 = (byte[]) r2;
        r1 = "audio/mp4a-latm";
        r1 = r1.equals(r4);
        if (r1 == 0) goto L_0x0557;
    L_0x0543:
        r1 = defpackage.oyd.a(r2);
        r10 = r1.first;
        r10 = (java.lang.Integer) r10;
        r12 = r10.intValue();
        r1 = r1.second;
        r1 = (java.lang.Integer) r1;
        r11 = r1.intValue();
    L_0x0557:
        r6 = r6 + r0;
        r1 = r47;
        r10 = r37;
        r9 = r40;
        r13 = r42;
        r37 = r8;
        r8 = r41;
        goto L_0x041e;
    L_0x0566:
        r41 = r8;
        r40 = r9;
        r42 = r13;
        r8 = r37;
        r9 = -1;
        r37 = r10;
        r0 = r15.b;
        if (r0 != 0) goto L_0x05a9;
    L_0x0575:
        if (r4 == 0) goto L_0x05a9;
    L_0x0577:
        r0 = "audio/raw";
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x0582;
    L_0x057f:
        r29 = -1;
        goto L_0x0584;
    L_0x0582:
        r29 = 2;
    L_0x0584:
        r23 = java.lang.Integer.toString(r7);
        if (r2 == 0) goto L_0x0591;
    L_0x058a:
        r0 = java.util.Collections.singletonList(r2);
        r30 = r0;
        goto L_0x0593;
    L_0x0591:
        r30 = 0;
    L_0x0593:
        r25 = -1;
        r26 = -1;
        r32 = 0;
        r24 = r4;
        r27 = r11;
        r28 = r12;
        r31 = r14;
        r33 = r8;
        r0 = defpackage.nzw.a(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33);
        r15.b = r0;
    L_0x05a9:
        r11 = r47;
        r4 = r37;
        r2 = r42;
        goto L_0x07f1;
    L_0x05b1:
        r38 = r2;
        r39 = r4;
        r41 = r8;
        r40 = r9;
        r37 = r10;
        r8 = r11;
        r36 = r12;
        r42 = r13;
        r9 = -1;
        r13 = r42 + 16;
        r3.c(r13);
        r0 = 16;
        r3.d(r0);
        r27 = r3.e();
        r28 = r3.e();
        r1 = 50;
        r3.d(r1);
        r1 = r3.b;
        r2 = defpackage.ogy.am;
        if (r6 != r2) goto L_0x0612;
    L_0x05de:
        r4 = r37;
        r2 = r42;
        r10 = defpackage.ohd.a(r3, r2, r4);
        if (r10 == 0) goto L_0x0609;
    L_0x05e8:
        r6 = r10.first;
        r6 = (java.lang.Integer) r6;
        r6 = r6.intValue();
        r11 = r47;
        if (r11 == 0) goto L_0x05ff;
    L_0x05f4:
        r12 = r10.second;
        r12 = (defpackage.ohw) r12;
        r12 = r12.b;
        r12 = r11.a(r12);
        goto L_0x0600;
    L_0x05ff:
        r12 = 0;
    L_0x0600:
        r13 = r15.a;
        r10 = r10.second;
        r10 = (defpackage.ohw) r10;
        r13[r41] = r10;
        goto L_0x060c;
    L_0x0609:
        r11 = r47;
        r12 = r11;
    L_0x060c:
        r3.c(r1);
        r35 = r12;
        goto L_0x061a;
    L_0x0612:
        r11 = r47;
        r4 = r37;
        r2 = r42;
        r35 = r11;
    L_0x061a:
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r10 = 0;
        r24 = 0;
        r25 = 0;
        r29 = 0;
        r31 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r32 = 0;
        r33 = -1;
    L_0x0629:
        r12 = r1 - r2;
        if (r12 >= r4) goto L_0x07df;
    L_0x062d:
        r3.c(r1);
        r12 = r3.b;
        r13 = r3.k();
        if (r13 != 0) goto L_0x063d;
    L_0x0638:
        r14 = r3.b;
        r14 = r14 - r2;
        if (r14 == r4) goto L_0x07df;
    L_0x063d:
        if (r13 <= 0) goto L_0x0641;
    L_0x063f:
        r14 = 1;
        goto L_0x0642;
    L_0x0641:
        r14 = 0;
    L_0x0642:
        defpackage.oxz.a(r14, r5);
        r14 = r3.k();
        r0 = defpackage.ogy.d;
        if (r14 == r0) goto L_0x07b5;
    L_0x064d:
        r0 = defpackage.ogy.g;
        if (r14 == r0) goto L_0x0795;
    L_0x0651:
        r0 = defpackage.ogy.q;
        if (r14 == r0) goto L_0x0733;
    L_0x0655:
        r0 = defpackage.ogy.r;
        if (r14 == r0) goto L_0x0733;
    L_0x0659:
        r0 = defpackage.ogy.j;
        if (r14 == r0) goto L_0x071f;
    L_0x065d:
        r0 = defpackage.ogy.l;
        if (r14 == r0) goto L_0x070f;
    L_0x0661:
        r0 = defpackage.ogy.t;
        if (r14 == r0) goto L_0x0702;
    L_0x0665:
        r0 = defpackage.ogy.W;
        if (r14 == r0) goto L_0x06e2;
    L_0x0669:
        r0 = defpackage.ogy.av;
        if (r14 == r0) goto L_0x06cc;
    L_0x066d:
        r0 = defpackage.ogy.aV;
        if (r14 != r0) goto L_0x069c;
    L_0x0671:
        r0 = r12 + 8;
    L_0x0673:
        r14 = r0 - r12;
        if (r14 >= r13) goto L_0x0695;
    L_0x0677:
        r3.c(r0);
        r14 = r3.k();
        r9 = r3.k();
        r23 = r5;
        r5 = defpackage.ogy.aW;
        if (r9 != r5) goto L_0x0690;
    L_0x0688:
        r5 = r3.a;
        r14 = r14 + r0;
        r0 = java.util.Arrays.copyOfRange(r5, r0, r14);
        goto L_0x0698;
    L_0x0690:
        r0 = r0 + r14;
        r5 = r23;
        r9 = -1;
        goto L_0x0673;
    L_0x0695:
        r23 = r5;
        r0 = 0;
    L_0x0698:
        r32 = r0;
        goto L_0x07d7;
    L_0x069c:
        r23 = r5;
        r0 = defpackage.ogy.aU;
        if (r14 != r0) goto L_0x07d7;
    L_0x06a2:
        r0 = r3.d();
        r5 = 3;
        r3.d(r5);
        if (r0 != 0) goto L_0x07d7;
    L_0x06ac:
        r0 = r3.d();
        if (r0 == 0) goto L_0x06c8;
    L_0x06b2:
        r9 = 1;
        if (r0 == r9) goto L_0x06c4;
    L_0x06b5:
        r9 = 2;
        if (r0 == r9) goto L_0x06c0;
    L_0x06b8:
        if (r0 == r5) goto L_0x06bc;
    L_0x06ba:
        goto L_0x07d7;
    L_0x06bc:
        r33 = 3;
        goto L_0x07d7;
    L_0x06c0:
        r33 = 2;
        goto L_0x07d7;
    L_0x06c4:
        r33 = 1;
        goto L_0x07d7;
    L_0x06c8:
        r33 = 0;
        goto L_0x07d7;
    L_0x06cc:
        r23 = r5;
        r12 = r12 + 8;
        r3.c(r12);
        r0 = r3.o();
        r0 = (float) r0;
        r5 = r3.o();
        r5 = (float) r5;
        r31 = r0 / r5;
        r10 = 1;
        goto L_0x07d7;
    L_0x06e2:
        r23 = r5;
        if (r24 != 0) goto L_0x06e8;
    L_0x06e6:
        r0 = 1;
        goto L_0x06e9;
    L_0x06e8:
        r0 = 0;
    L_0x06e9:
        defpackage.oxz.b(r0);
        r0 = defpackage.ohd.a(r3, r12);
        r5 = r0.first;
        r5 = (java.lang.String) r5;
        r0 = r0.second;
        r0 = (byte[]) r0;
        r0 = java.util.Collections.singletonList(r0);
        r29 = r0;
        r24 = r5;
        goto L_0x07d7;
    L_0x0702:
        r23 = r5;
        if (r24 != 0) goto L_0x0708;
    L_0x0706:
        r0 = 1;
        goto L_0x0709;
    L_0x0708:
        r0 = 0;
    L_0x0709:
        defpackage.oxz.b(r0);
        r0 = "video/3gpp";
        goto L_0x071b;
    L_0x070f:
        r23 = r5;
        if (r24 != 0) goto L_0x0715;
    L_0x0713:
        r0 = 1;
        goto L_0x0716;
    L_0x0715:
        r0 = 0;
    L_0x0716:
        defpackage.oxz.b(r0);
        r0 = "video/av01";
    L_0x071b:
        r24 = r0;
        goto L_0x07d7;
    L_0x071f:
        r23 = r5;
        if (r24 != 0) goto L_0x0725;
    L_0x0723:
        r0 = 1;
        goto L_0x0726;
    L_0x0725:
        r0 = 0;
    L_0x0726:
        defpackage.oxz.b(r0);
        r0 = defpackage.ogy.h;
        if (r6 == r0) goto L_0x0730;
    L_0x072d:
        r0 = "video/x-vnd.on2.vp9";
        goto L_0x071b;
    L_0x0730:
        r0 = "video/x-vnd.on2.vp8";
        goto L_0x071b;
    L_0x0733:
        r23 = r5;
        r0 = 2;
        r3.d(r0);
        r0 = r3.d();
        r5 = r0 >> 1;
        r9 = 1;
        r0 = r0 & r9;
        r0 = r0 << 5;
        r9 = r3.d();
        r14 = 3;
        r9 = r9 >> r14;
        r9 = r9 & 31;
        r0 = r0 | r9;
        r9 = 4;
        if (r5 != r9) goto L_0x0750;
    L_0x074f:
        goto L_0x0763;
    L_0x0750:
        r12 = 5;
        if (r5 == r12) goto L_0x0763;
    L_0x0753:
        r12 = 8;
        if (r5 != r12) goto L_0x075a;
    L_0x0757:
        r12 = "hev1";
        goto L_0x0765;
    L_0x075a:
        r12 = 9;
        if (r5 != r12) goto L_0x0761;
    L_0x075e:
        r12 = "avc3";
        goto L_0x0765;
    L_0x0761:
        r5 = 0;
        goto L_0x078c;
    L_0x0763:
        r12 = "dvhe";
    L_0x0765:
        r22 = r12.length();
        r9 = new java.lang.StringBuilder;
        r14 = r22 + 26;
        r9.<init>(r14);
        r9.append(r12);
        r12 = ".0";
        r9.append(r12);
        r9.append(r5);
        r5 = ".0";
        r9.append(r5);
        r9.append(r0);
        r0 = r9.toString();
        r5 = new ozv;
        r5.<init>(r0);
    L_0x078c:
        if (r5 == 0) goto L_0x07d7;
    L_0x078e:
        r0 = r5.a;
        r24 = "video/dolby-vision";
        r25 = r0;
        goto L_0x07d7;
    L_0x0795:
        r23 = r5;
        if (r24 != 0) goto L_0x079b;
    L_0x0799:
        r0 = 1;
        goto L_0x079c;
    L_0x079b:
        r0 = 0;
    L_0x079c:
        defpackage.oxz.b(r0);
        r12 = r12 + 8;
        r3.c(r12);
        r0 = defpackage.paa.a(r3);
        r5 = r0.a;
        r0 = r0.b;
        r15.c = r0;
        r0 = "video/hevc";
    L_0x07b0:
        r24 = r0;
        r29 = r5;
        goto L_0x07d7;
    L_0x07b5:
        r23 = r5;
        if (r24 != 0) goto L_0x07bb;
    L_0x07b9:
        r0 = 1;
        goto L_0x07bc;
    L_0x07bb:
        r0 = 0;
    L_0x07bc:
        defpackage.oxz.b(r0);
        r12 = r12 + 8;
        r3.c(r12);
        r0 = defpackage.ozu.a(r3);
        r5 = r0.a;
        r9 = r0.b;
        r15.c = r9;
        if (r10 != 0) goto L_0x07d4;
    L_0x07d0:
        r0 = r0.e;
        r31 = r0;
    L_0x07d4:
        r0 = "video/avc";
        goto L_0x07b0;
    L_0x07d7:
        r1 = r1 + r13;
        r5 = r23;
        r0 = 16;
        r9 = -1;
        goto L_0x0629;
    L_0x07df:
        if (r24 == 0) goto L_0x07f1;
    L_0x07e1:
        r23 = java.lang.Integer.toString(r7);
        r26 = -1;
        r34 = 0;
        r30 = r40;
        r0 = defpackage.nzw.a(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35);
        r15.b = r0;
    L_0x07f1:
        r13 = r2 + r4;
        r3.c(r13);
        r0 = r41 + 1;
        r10 = 8;
        r13 = 16;
        r14 = r44;
        r5 = r45;
        r1 = r11;
        r12 = r36;
        r2 = r38;
        r4 = r39;
        r9 = r40;
        r11 = r8;
        r8 = r0;
        r0 = r43;
        goto L_0x01a0;
    L_0x080f:
        r38 = r2;
        r39 = r4;
        r45 = r5;
        r36 = r12;
        r0 = defpackage.ogy.ac;
        r1 = r43;
        r0 = r1.e(r0);
        if (r0 == 0) goto L_0x0890;
    L_0x0821:
        r1 = defpackage.ogy.ad;
        r0 = r0.d(r1);
        if (r0 != 0) goto L_0x082a;
    L_0x0829:
        goto L_0x0890;
    L_0x082a:
        r0 = r0.bg;
        r1 = 8;
        r0.c(r1);
        r1 = r0.k();
        r1 = defpackage.ogy.a(r1);
        r2 = r0.o();
        r3 = new long[r2];
        r4 = new long[r2];
        r5 = 0;
    L_0x0842:
        if (r5 < r2) goto L_0x0849;
    L_0x0844:
        r0 = android.util.Pair.create(r3, r4);
        goto L_0x0896;
    L_0x0849:
        r6 = 1;
        if (r1 == r6) goto L_0x0851;
    L_0x084c:
        r7 = r0.i();
        goto L_0x0855;
    L_0x0851:
        r7 = r0.q();
    L_0x0855:
        r3[r5] = r7;
        if (r1 == r6) goto L_0x085f;
    L_0x0859:
        r6 = r0.k();
        r6 = (long) r6;
        goto L_0x0863;
    L_0x085f:
        r6 = r0.m();
    L_0x0863:
        r4[r5] = r6;
        r6 = r0.a;
        r7 = r0.b;
        r8 = r7 + 1;
        r0.b = r8;
        r7 = r6[r7];
        r9 = r8 + 1;
        r0.b = r9;
        r7 = r7 & 255;
        r9 = 8;
        r7 = r7 << r9;
        r6 = r6[r8];
        r6 = r6 & 255;
        r6 = r6 | r7;
        r6 = (short) r6;
        r7 = 1;
        if (r6 != r7) goto L_0x0888;
    L_0x0881:
        r6 = 2;
        r0.d(r6);
        r5 = r5 + 1;
        goto L_0x0842;
    L_0x0888:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Unsupported media rate.";
        r0.<init>(r1);
        throw r0;
    L_0x0890:
        r0 = 0;
        r1 = android.util.Pair.create(r0, r0);
        r0 = r1;
    L_0x0896:
        r1 = r0.first;
        r23 = r1;
        r23 = (long[]) r23;
        r0 = r0.second;
        r24 = r0;
        r24 = (long[]) r24;
        r0 = r15.b;
        if (r0 == 0) goto L_0x08d1;
    L_0x08a6:
        r0 = new ohx;
        r1 = r39;
        r11 = r1.a;
        r1 = r38;
        r1 = r1.first;
        r1 = (java.lang.Long) r1;
        r13 = r1.longValue();
        r1 = r15.b;
        r2 = r15.d;
        r3 = r15.a;
        r4 = r15.c;
        r10 = r0;
        r12 = r36;
        r15 = r45;
        r17 = r18;
        r19 = r1;
        r20 = r2;
        r21 = r3;
        r22 = r4;
        r10.<init>(r11, r12, r13, r15, r17, r19, r20, r21, r22, r23, r24);
        return r0;
    L_0x08d1:
        r0 = 0;
        return r0;
    L_0x08d3:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohd.a(ohb, oha, long, odq, boolean, boolean):ohx");
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03d8 A:{SYNTHETIC, EDGE_INSN: B:226:0x03d8->B:148:0x03d8 ?: BREAK  , EDGE_INSN: B:226:0x03d8->B:148:0x03d8 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x01a8 A:{SYNTHETIC, EDGE_INSN: B:218:0x01a8->B:58:0x01a8 ?: BREAK  , EDGE_INSN: B:218:0x01a8->B:58:0x01a8 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0274  */
    public static defpackage.ohy a(defpackage.ohx r37, defpackage.ohb r38, defpackage.ofq r39) {
        /*
        r1 = r37;
        r0 = r38;
        r2 = r39;
        r3 = defpackage.ogy.aC;
        r3 = r0.d(r3);
        if (r3 == 0) goto L_0x0014;
    L_0x000e:
        r4 = new ohh;
        r4.<init>(r3);
        goto L_0x0021;
    L_0x0014:
        r3 = defpackage.ogy.aD;
        r3 = r0.d(r3);
        if (r3 == 0) goto L_0x0557;
    L_0x001c:
        r4 = new ohg;
        r4.<init>(r3);
    L_0x0021:
        r3 = r4.a();
        r5 = 0;
        if (r3 != 0) goto L_0x0042;
    L_0x0028:
        r9 = new ohy;
        r2 = new long[r5];
        r3 = new int[r5];
        r4 = 0;
        r6 = new long[r5];
        r7 = new int[r5];
        r10 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r0 = r9;
        r1 = r37;
        r5 = r6;
        r6 = r7;
        r7 = r10;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        return r9;
    L_0x0042:
        r6 = defpackage.ogy.aE;
        r6 = r0.d(r6);
        if (r6 != 0) goto L_0x0052;
    L_0x004a:
        r6 = defpackage.ogy.aF;
        r6 = r0.d(r6);
        r8 = 1;
        goto L_0x0053;
    L_0x0052:
        r8 = 0;
    L_0x0053:
        r6 = r6.bg;
        r9 = defpackage.ogy.aB;
        r9 = r0.d(r9);
        r9 = r9.bg;
        r10 = defpackage.ogy.ay;
        r10 = r0.d(r10);
        r10 = r10.bg;
        r11 = defpackage.ogy.az;
        r11 = r0.d(r11);
        r12 = 0;
        if (r11 == 0) goto L_0x0071;
    L_0x006e:
        r11 = r11.bg;
        goto L_0x0072;
    L_0x0071:
        r11 = r12;
    L_0x0072:
        r13 = defpackage.ogy.aA;
        r0 = r0.d(r13);
        if (r0 == 0) goto L_0x007d;
    L_0x007a:
        r0 = r0.bg;
        goto L_0x007e;
    L_0x007d:
        r0 = r12;
    L_0x007e:
        r13 = new ohc;
        r13.<init>(r9, r6, r8);
        r6 = 12;
        r10.c(r6);
        r8 = r10.o();
        r9 = -1;
        r8 = r8 + r9;
        r14 = r10.o();
        r15 = r10.o();
        if (r0 == 0) goto L_0x00a0;
    L_0x0098:
        r0.c(r6);
        r16 = r0.o();
        goto L_0x00a2;
    L_0x00a0:
        r16 = 0;
    L_0x00a2:
        if (r11 == 0) goto L_0x00b5;
    L_0x00a4:
        r11.c(r6);
        r6 = r11.o();
        if (r6 <= 0) goto L_0x00b3;
    L_0x00ad:
        r12 = r11.o();
        r12 = r12 + r9;
        goto L_0x00b7;
    L_0x00b3:
        r11 = r12;
        goto L_0x00b6;
    L_0x00b5:
        r6 = 0;
    L_0x00b6:
        r12 = -1;
    L_0x00b7:
        r17 = r4.c();
        r18 = 0;
        if (r17 == 0) goto L_0x017f;
    L_0x00bf:
        r9 = r1.f;
        r9 = r9.i;
        r5 = "audio/raw";
        r5 = r5.equals(r9);
        if (r5 != 0) goto L_0x00cd;
    L_0x00cb:
        goto L_0x017f;
    L_0x00cd:
        if (r8 != 0) goto L_0x017f;
    L_0x00cf:
        if (r16 != 0) goto L_0x017f;
    L_0x00d1:
        if (r6 != 0) goto L_0x017f;
    L_0x00d3:
        r0 = r13.a;
        r4 = new long[r0];
        r0 = new int[r0];
    L_0x00d9:
        r5 = r13.a();
        if (r5 == 0) goto L_0x00ea;
    L_0x00df:
        r5 = r13.b;
        r8 = r13.d;
        r4[r5] = r8;
        r6 = r13.c;
        r0[r5] = r6;
        goto L_0x00d9;
    L_0x00ea:
        r5 = r1.f;
        r6 = r5.x;
        r5 = r5.v;
        r5 = defpackage.ozp.b(r6, r5);
        r8 = (long) r15;
        r6 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r6 = r6 / r5;
        r10 = r0.length;
        r11 = 0;
        r12 = 0;
    L_0x00fb:
        if (r11 >= r10) goto L_0x0107;
    L_0x00fd:
        r13 = r0[r11];
        r13 = defpackage.ozp.a(r13, r6);
        r12 = r12 + r13;
        r11 = r11 + 1;
        goto L_0x00fb;
    L_0x0107:
        r10 = new long[r12];
        r11 = new int[r12];
        r13 = new long[r12];
        r12 = new int[r12];
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r23 = 0;
    L_0x0115:
        r7 = r0.length;
        if (r14 >= r7) goto L_0x0159;
    L_0x0118:
        r7 = r0[r14];
        r20 = r4[r14];
        r21 = r20;
        r20 = r0;
        r0 = r23;
    L_0x0122:
        if (r7 <= 0) goto L_0x014e;
    L_0x0124:
        r23 = java.lang.Math.min(r6, r7);
        r10[r16] = r21;
        r24 = r4;
        r4 = r5 * r23;
        r11[r16] = r4;
        r0 = java.lang.Math.max(r0, r4);
        r38 = r5;
        r4 = (long) r15;
        r4 = r4 * r8;
        r13[r16] = r4;
        r4 = 1;
        r12[r16] = r4;
        r4 = r11[r16];
        r4 = (long) r4;
        r21 = r21 + r4;
        r15 = r15 + r23;
        r7 = r7 - r23;
        r16 = r16 + 1;
        r5 = r38;
        r4 = r24;
        goto L_0x0122;
    L_0x014e:
        r24 = r4;
        r38 = r5;
        r14 = r14 + 1;
        r23 = r0;
        r0 = r20;
        goto L_0x0115;
    L_0x0159:
        r0 = new ohl;
        r4 = (long) r15;
        r26 = r8 * r4;
        r20 = r0;
        r21 = r10;
        r22 = r11;
        r24 = r13;
        r25 = r12;
        r20.<init>(r21, r22, r23, r24, r25, r26);
        r4 = r0.a;
        r5 = r0.b;
        r6 = r0.c;
        r7 = r0.d;
        r8 = r0.e;
        r9 = r0.f;
        r0 = r3;
        r2 = r4;
        r3 = r5;
        r4 = r6;
        r5 = r7;
        r6 = r8;
        goto L_0x0263;
    L_0x017f:
        r5 = new long[r3];
        r7 = new int[r3];
        r9 = new long[r3];
        r20 = r6;
        r6 = new int[r3];
        r31 = r4;
        r25 = r10;
        r26 = r11;
        r29 = r12;
        r10 = r14;
        r30 = r15;
        r22 = r16;
        r23 = r18;
        r15 = r20;
        r12 = 0;
        r14 = 0;
        r16 = 0;
        r27 = 0;
        r11 = r8;
        r20 = r23;
        r8 = 0;
    L_0x01a4:
        r4 = "AtomParsers";
        if (r8 < r3) goto L_0x01ab;
    L_0x01a8:
        r2 = r16;
        goto L_0x01e2;
    L_0x01ab:
        r32 = r23;
        r23 = 1;
    L_0x01af:
        if (r16 == 0) goto L_0x01b4;
    L_0x01b1:
        r24 = r3;
        goto L_0x01c9;
    L_0x01b4:
        r23 = r13.a();
        if (r23 == 0) goto L_0x01b1;
    L_0x01ba:
        r24 = r3;
        r2 = r13.d;
        r32 = r2;
        r2 = r13.c;
        r16 = r2;
        r3 = r24;
        r2 = r39;
        goto L_0x01af;
    L_0x01c9:
        if (r23 != 0) goto L_0x04d9;
    L_0x01cb:
        r2 = "Unexpected end of chunk data";
        defpackage.oyp.a(r4, r2);
        r5 = java.util.Arrays.copyOf(r5, r8);
        r7 = java.util.Arrays.copyOf(r7, r8);
        r9 = java.util.Arrays.copyOf(r9, r8);
        r6 = java.util.Arrays.copyOf(r6, r8);
        r3 = r8;
        goto L_0x01a8;
    L_0x01e2:
        r12 = (long) r12;
        r12 = r20 + r12;
    L_0x01e5:
        if (r22 <= 0) goto L_0x01f5;
    L_0x01e7:
        r8 = r0.o();
        if (r8 != 0) goto L_0x01f3;
    L_0x01ed:
        r0.k();
        r22 = r22 + -1;
        goto L_0x01e5;
    L_0x01f3:
        r0 = 0;
        goto L_0x01f6;
    L_0x01f5:
        r0 = 1;
    L_0x01f6:
        if (r15 == 0) goto L_0x01f9;
    L_0x01f8:
        goto L_0x0208;
    L_0x01f9:
        if (r10 != 0) goto L_0x0208;
    L_0x01fb:
        if (r2 != 0) goto L_0x0208;
    L_0x01fd:
        if (r11 != 0) goto L_0x0208;
    L_0x01ff:
        if (r14 != 0) goto L_0x0208;
    L_0x0201:
        if (r0 == 0) goto L_0x0208;
    L_0x0203:
        r38 = r3;
        r16 = r5;
        goto L_0x025a;
    L_0x0208:
        r8 = r1.a;
        if (r0 == 0) goto L_0x020f;
    L_0x020c:
        r0 = "";
        goto L_0x0211;
    L_0x020f:
        r0 = ", ctts invalid";
    L_0x0211:
        r38 = r3;
        r3 = r0.length();
        r16 = r5;
        r5 = new java.lang.StringBuilder;
        r3 = r3 + 262;
        r5.<init>(r3);
        r3 = "Inconsistent stbl box for track ";
        r5.append(r3);
        r5.append(r8);
        r3 = ": remainingSynchronizationSamples ";
        r5.append(r3);
        r5.append(r15);
        r3 = ", remainingSamplesAtTimestampDelta ";
        r5.append(r3);
        r5.append(r10);
        r3 = ", remainingSamplesInChunk ";
        r5.append(r3);
        r5.append(r2);
        r2 = ", remainingTimestampDeltaChanges ";
        r5.append(r2);
        r5.append(r11);
        r2 = ", remainingSamplesAtTimestampOffset ";
        r5.append(r2);
        r5.append(r14);
        r5.append(r0);
        r0 = r5.toString();
        defpackage.oyp.a(r4, r0);
    L_0x025a:
        r0 = r38;
        r3 = r7;
        r5 = r9;
        r9 = r12;
        r2 = r16;
        r4 = r27;
    L_0x0263:
        r22 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r7 = r1.c;
        r20 = r9;
        r24 = r7;
        r7 = defpackage.ozp.b(r20, r22, r24);
        r11 = r1.h;
        if (r11 == 0) goto L_0x04b7;
    L_0x0274:
        r11 = r39.a();
        if (r11 == 0) goto L_0x027c;
    L_0x027a:
        goto L_0x04b7;
    L_0x027c:
        r7 = r1.h;
        r8 = r7.length;
        r11 = 1;
        if (r8 != r11) goto L_0x0323;
    L_0x0282:
        r8 = r1.b;
        if (r8 != r11) goto L_0x0323;
    L_0x0286:
        r8 = r5.length;
        r11 = 2;
        if (r8 < r11) goto L_0x0323;
    L_0x028a:
        r11 = r1.i;
        r12 = 0;
        r13 = r11[r12];
        r20 = r7[r12];
        r15 = r13;
        r12 = r1.c;
        r38 = r6;
        r6 = r1.d;
        r22 = r12;
        r24 = r6;
        r6 = defpackage.ozp.b(r20, r22, r24);
        r13 = r15 + r6;
        r6 = r8 + -1;
        r7 = 4;
        r11 = 0;
        r7 = defpackage.ozp.a(r7, r11, r6);
        r8 = r8 + -4;
        r6 = defpackage.ozp.a(r8, r11, r6);
        r20 = r5[r11];
        r8 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1));
        if (r8 > 0) goto L_0x0325;
    L_0x02b6:
        r7 = r5[r7];
        r11 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1));
        if (r11 >= 0) goto L_0x0325;
    L_0x02bc:
        r6 = r5[r6];
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 >= 0) goto L_0x0325;
    L_0x02c2:
        r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1));
        if (r6 > 0) goto L_0x0325;
    L_0x02c6:
        r22 = r15 - r20;
        r6 = r1.f;
        r6 = r6.w;
        r6 = (long) r6;
        r11 = r1.c;
        r24 = r6;
        r26 = r11;
        r6 = defpackage.ozp.b(r22, r24, r26);
        r20 = r9 - r13;
        r8 = r1.f;
        r8 = r8.w;
        r11 = (long) r8;
        r13 = r1.c;
        r22 = r11;
        r24 = r13;
        r11 = defpackage.ozp.b(r20, r22, r24);
        r8 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1));
        if (r8 == 0) goto L_0x02ed;
    L_0x02ec:
        goto L_0x02f1;
    L_0x02ed:
        r8 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1));
        if (r8 == 0) goto L_0x0325;
    L_0x02f1:
        r13 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r8 > 0) goto L_0x0325;
    L_0x02f8:
        r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r8 <= 0) goto L_0x02fd;
    L_0x02fc:
        goto L_0x0325;
    L_0x02fd:
        r0 = (int) r6;
        r6 = r39;
        r6.a = r0;
        r0 = (int) r11;
        r6.b = r0;
        r6 = r1.c;
        defpackage.ozp.a(r5, r6);
        r0 = r1.h;
        r6 = 0;
        r7 = r0[r6];
        r11 = r1.d;
        r9 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r7 = defpackage.ozp.b(r7, r9, r11);
        r9 = new ohy;
        r0 = r9;
        r1 = r37;
        r6 = r38;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        return r9;
    L_0x0323:
        r38 = r6;
    L_0x0325:
        r6 = r1.h;
        r7 = r6.length;
        r8 = 1;
        if (r7 != r8) goto L_0x0367;
    L_0x032b:
        r8 = 0;
        r11 = r6[r8];
        r6 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1));
        if (r6 != 0) goto L_0x0367;
    L_0x0332:
        r0 = r1.i;
        r6 = r0[r8];
        r0 = 0;
    L_0x0337:
        r8 = r5.length;
        if (r0 >= r8) goto L_0x034e;
    L_0x033a:
        r11 = r5[r0];
        r13 = r11 - r6;
        r15 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r11 = r1.c;
        r17 = r11;
        r11 = defpackage.ozp.b(r13, r15, r17);
        r5[r0] = r11;
        r0 = r0 + 1;
        goto L_0x0337;
    L_0x034e:
        r13 = r1.c;
        r11 = r9 - r6;
        r6 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r8 = r13;
        r13 = r6;
        r15 = r8;
        r7 = defpackage.ozp.b(r11, r13, r15);
        r9 = new ohy;
        r0 = r9;
        r1 = r37;
        r6 = r38;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        return r9;
    L_0x0367:
        r6 = r1.b;
        r8 = 1;
        if (r6 != r8) goto L_0x036e;
    L_0x036c:
        r6 = 1;
        goto L_0x036f;
    L_0x036e:
        r6 = 0;
    L_0x036f:
        r8 = new int[r7];
        r7 = new int[r7];
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
    L_0x0377:
        r13 = r1.h;
        r14 = r13.length;
        if (r9 >= r14) goto L_0x03d8;
    L_0x037c:
        r14 = r1.i;
        r15 = r3;
        r16 = r4;
        r3 = r14[r9];
        r20 = -1;
        r14 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1));
        if (r14 == 0) goto L_0x03ca;
    L_0x0389:
        r20 = r13[r9];
        r13 = r1.c;
        r26 = r11;
        r39 = r12;
        r11 = r1.d;
        r22 = r13;
        r24 = r11;
        r11 = defpackage.ozp.b(r20, r22, r24);
        r13 = 1;
        r14 = defpackage.ozp.a(r5, r3, r13, r13);
        r8[r9] = r14;
        r3 = r3 + r11;
        r11 = 0;
        r3 = defpackage.ozp.a(r5, r3, r6, r11);
        r7[r9] = r3;
    L_0x03aa:
        r3 = r8[r9];
        r4 = r7[r9];
        if (r3 >= r4) goto L_0x03bc;
    L_0x03b0:
        r12 = r38[r3];
        r12 = r12 & r13;
        if (r12 == 0) goto L_0x03b6;
    L_0x03b5:
        goto L_0x03bc;
    L_0x03b6:
        r3 = r3 + 1;
        r8[r9] = r3;
        r13 = 1;
        goto L_0x03aa;
    L_0x03bc:
        r12 = r4 - r3;
        r10 = r10 + r12;
        r12 = r26;
        if (r12 == r3) goto L_0x03c5;
    L_0x03c3:
        r3 = 1;
        goto L_0x03c6;
    L_0x03c5:
        r3 = 0;
    L_0x03c6:
        r3 = r39 | r3;
        r12 = r3;
        goto L_0x03d1;
    L_0x03ca:
        r39 = r12;
        r12 = r11;
        r11 = 0;
        r4 = r12;
        r12 = r39;
    L_0x03d1:
        r9 = r9 + 1;
        r11 = r4;
        r3 = r15;
        r4 = r16;
        goto L_0x0377;
    L_0x03d8:
        r15 = r3;
        r16 = r4;
        r39 = r12;
        r11 = 0;
        if (r10 == r0) goto L_0x03e3;
    L_0x03e0:
        r28 = 1;
        goto L_0x03e5;
    L_0x03e3:
        r28 = 0;
    L_0x03e5:
        r0 = r39 | r28;
        if (r0 == 0) goto L_0x03ec;
    L_0x03e9:
        r3 = new long[r10];
        goto L_0x03ed;
    L_0x03ec:
        r3 = r2;
    L_0x03ed:
        if (r0 == 0) goto L_0x03f2;
    L_0x03ef:
        r4 = new int[r10];
        goto L_0x03f3;
    L_0x03f2:
        r4 = r15;
    L_0x03f3:
        if (r0 != 0) goto L_0x03f6;
    L_0x03f5:
        goto L_0x03f8;
    L_0x03f6:
        r16 = 0;
    L_0x03f8:
        if (r0 == 0) goto L_0x03fd;
    L_0x03fa:
        r6 = new int[r10];
        goto L_0x03ff;
    L_0x03fd:
        r6 = r38;
    L_0x03ff:
        r9 = new long[r10];
        r39 = r15;
        r10 = r16;
        r12 = r18;
        r14 = 0;
    L_0x0408:
        r15 = r1.h;
        r15 = r15.length;
        if (r11 >= r15) goto L_0x0496;
    L_0x040d:
        r15 = r1.i;
        r22 = r15[r11];
        r15 = r8[r11];
        r24 = r8;
        r8 = r7[r11];
        if (r0 == 0) goto L_0x042f;
    L_0x0419:
        r25 = r7;
        r7 = r8 - r15;
        java.lang.System.arraycopy(r2, r15, r3, r14, r7);
        r26 = r2;
        r2 = r39;
        java.lang.System.arraycopy(r2, r15, r4, r14, r7);
        r39 = r10;
        r10 = r38;
        java.lang.System.arraycopy(r10, r15, r6, r14, r7);
        goto L_0x0439;
    L_0x042f:
        r26 = r2;
        r25 = r7;
        r2 = r39;
        r39 = r10;
        r10 = r38;
    L_0x0439:
        r7 = r39;
    L_0x043b:
        if (r15 >= r8) goto L_0x047a;
    L_0x043d:
        r18 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r38 = r10;
        r27 = r11;
        r10 = r1.d;
        r16 = r12;
        r20 = r10;
        r10 = defpackage.ozp.b(r16, r18, r20);
        r16 = r5[r15];
        r28 = r16 - r22;
        r30 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r17 = r5;
        r34 = r6;
        r5 = r1.c;
        r32 = r5;
        r5 = defpackage.ozp.b(r28, r30, r32);
        r10 = r10 + r5;
        r9[r14] = r10;
        if (r0 == 0) goto L_0x046d;
    L_0x0466:
        r5 = r4[r14];
        if (r5 <= r7) goto L_0x046d;
    L_0x046a:
        r5 = r2[r15];
        r7 = r5;
    L_0x046d:
        r14 = r14 + 1;
        r15 = r15 + 1;
        r10 = r38;
        r5 = r17;
        r11 = r27;
        r6 = r34;
        goto L_0x043b;
    L_0x047a:
        r17 = r5;
        r34 = r6;
        r38 = r10;
        r27 = r11;
        r5 = r1.h;
        r10 = r5[r27];
        r12 = r12 + r10;
        r11 = r27 + 1;
        r39 = r2;
        r10 = r7;
        r5 = r17;
        r8 = r24;
        r7 = r25;
        r2 = r26;
        goto L_0x0408;
    L_0x0496:
        r34 = r6;
        r39 = r10;
        r5 = r1.d;
        r18 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r16 = r12;
        r20 = r5;
        r7 = defpackage.ozp.b(r16, r18, r20);
        r10 = new ohy;
        r0 = r10;
        r1 = r37;
        r2 = r3;
        r3 = r4;
        r4 = r39;
        r5 = r9;
        r6 = r34;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        return r10;
    L_0x04b7:
        r26 = r2;
        r2 = r3;
        r16 = r4;
        r17 = r5;
        r38 = r6;
        r3 = r1.c;
        r9 = r17;
        defpackage.ozp.a(r9, r3);
        r10 = new ohy;
        r0 = r10;
        r1 = r37;
        r5 = r2;
        r2 = r26;
        r3 = r5;
        r4 = r16;
        r5 = r9;
        r6 = r38;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        return r10;
    L_0x04d9:
        r2 = 0;
        if (r0 == 0) goto L_0x04ee;
    L_0x04dc:
        if (r14 == 0) goto L_0x04df;
    L_0x04de:
        goto L_0x04ec;
    L_0x04df:
        if (r22 <= 0) goto L_0x04ec;
    L_0x04e1:
        r14 = r0.o();
        r12 = r0.k();
        r22 = r22 + -1;
        goto L_0x04dc;
    L_0x04ec:
        r14 = r14 + -1;
    L_0x04ee:
        r5[r8] = r32;
        r3 = r31.b();
        r7[r8] = r3;
        r4 = r27;
        if (r3 <= r4) goto L_0x04fd;
    L_0x04fa:
        r27 = r3;
        goto L_0x04ff;
    L_0x04fd:
        r27 = r4;
    L_0x04ff:
        r3 = (long) r12;
        r3 = r20 + r3;
        r9[r8] = r3;
        if (r26 != 0) goto L_0x0508;
    L_0x0506:
        r3 = 1;
        goto L_0x0509;
    L_0x0508:
        r3 = 0;
    L_0x0509:
        r6[r8] = r3;
        r3 = r29;
        if (r8 != r3) goto L_0x051f;
    L_0x050f:
        r4 = 1;
        r6[r8] = r4;
        r15 = r15 + -1;
        if (r15 <= 0) goto L_0x0520;
    L_0x0516:
        r3 = r26.o();
        r17 = -1;
        r3 = r3 + -1;
        goto L_0x0522;
    L_0x051f:
        r4 = 1;
    L_0x0520:
        r17 = -1;
    L_0x0522:
        r29 = r3;
        r23 = r15;
        r15 = r30;
        r2 = (long) r15;
        r20 = r20 + r2;
        r10 = r10 + -1;
        if (r10 == 0) goto L_0x0530;
    L_0x052f:
        goto L_0x0540;
    L_0x0530:
        if (r11 <= 0) goto L_0x0540;
    L_0x0532:
        r2 = r25.o();
        r3 = r25.k();
        r11 = r11 + -1;
        r10 = r2;
        r30 = r3;
        goto L_0x0542;
    L_0x0540:
        r30 = r15;
    L_0x0542:
        r2 = r7[r8];
        r2 = (long) r2;
        r2 = r32 + r2;
        r16 = r16 + -1;
        r8 = r8 + 1;
        r15 = r23;
        r35 = r2;
        r2 = r39;
        r3 = r24;
        r23 = r35;
        goto L_0x01a4;
    L_0x0557:
        r0 = new oae;
        r1 = "Track has no sample table size information";
        r0.<init>(r1);
        goto L_0x0560;
    L_0x055f:
        throw r0;
    L_0x0560:
        goto L_0x055f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohd.a(ohx, ohb, ofq):ohy");
    }

    public static olj a(oha oha, boolean z) {
        if (!z) {
            oza oza = oha.bg;
            oza.c(8);
            while (oza.b() >= 8) {
                int i = oza.b;
                int k = oza.k();
                if (oza.k() == ogy.aN) {
                    oza.c(i);
                    i += k;
                    oza.d(12);
                    while (true) {
                        k = oza.b;
                        if (k >= i) {
                            break;
                        }
                        int k2 = oza.k();
                        if (oza.k() == ogy.aP) {
                            oza.c(k);
                            k += k2;
                            oza.d(8);
                            List arrayList = new ArrayList();
                            while (oza.b < k) {
                                oll a = ohr.a(oza);
                                if (a != null) {
                                    arrayList.add(a);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                return new olj(arrayList);
                            }
                        } else {
                            oza.c(k + k2);
                        }
                    }
                    return null;
                }
                oza.c(i + k);
            }
        }
        return null;
    }

    public static olj a(ohb ohb) {
        oha d = ohb.d(ogy.af);
        oha d2 = ohb.d(ogy.aO);
        oha d3 = ohb.d(ogy.aP);
        if (d == null || d2 == null || d3 == null || ohd.a(d.bg) != h) {
            return null;
        }
        int i;
        int k;
        oza oza = d2.bg;
        oza.c(12);
        int k2 = oza.k();
        String[] strArr = new String[k2];
        for (i = 0; i < k2; i++) {
            k = oza.k();
            oza.d(4);
            strArr[i] = oza.e(k - 8);
        }
        oza oza2 = d3.bg;
        oza2.c(8);
        List arrayList = new ArrayList();
        while (oza2.b() > 8) {
            i = oza2.b;
            k = oza2.k();
            int k3 = oza2.k() - 1;
            if (k3 < 0 || k3 >= strArr.length) {
                StringBuilder stringBuilder = new StringBuilder(52);
                stringBuilder.append("Skipped metadata with unknown key index: ");
                stringBuilder.append(k3);
                oyp.a("AtomParsers", stringBuilder.toString());
            } else {
                ohp a = ohr.a(oza2, i + k, strArr[k3]);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            oza2.c(i + k);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new olj(arrayList);
    }

    private static int a(oza oza) {
        oza.c(16);
        return oza.k();
    }

    private static Pair a(oza oza, int i) {
        oza.c(i + 12);
        oza.d(1);
        ohd.b(oza);
        oza.d(2);
        int d = oza.d();
        if ((d & 128) != 0) {
            oza.d(2);
        }
        if ((d & 64) != 0) {
            oza.d(oza.e());
        }
        if ((d & 32) != 0) {
            oza.d(2);
        }
        oza.d(1);
        ohd.b(oza);
        String a = oyu.a(oza.d());
        if ("audio/mpeg".equals(a) || "audio/vnd.dts".equals(a) || "audio/vnd.dts.hd".equals(a)) {
            return Pair.create(a, null);
        }
        oza.d(12);
        oza.d(1);
        i = ohd.b(oza);
        byte[] bArr = new byte[i];
        oza.a(bArr, 0, i);
        return Pair.create(a, bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0101  */
    private static android.util.Pair a(defpackage.oza r17, int r18, int r19) {
        /*
        r0 = r17;
        r1 = r0.b;
    L_0x0004:
        r2 = r1 - r18;
        r4 = r19;
        if (r2 >= r4) goto L_0x0114;
    L_0x000a:
        r0.c(r1);
        r2 = r17.k();
        r5 = 1;
        r6 = 0;
        if (r2 <= 0) goto L_0x0017;
    L_0x0015:
        r7 = 1;
        goto L_0x0018;
    L_0x0017:
        r7 = 0;
    L_0x0018:
        r8 = "childAtomSize should be positive";
        defpackage.oxz.a(r7, r8);
        r7 = r17.k();
        r8 = defpackage.ogy.ai;
        if (r7 != r8) goto L_0x0111;
    L_0x0025:
        r7 = r1 + 8;
        r8 = -1;
        r9 = -1;
        r10 = 0;
        r11 = 0;
        r15 = 0;
    L_0x002c:
        r12 = r7 - r1;
        r13 = 4;
        if (r12 >= r2) goto L_0x0060;
    L_0x0031:
        r0.c(r7);
        r12 = r17.k();
        r14 = r17.k();
        r3 = defpackage.ogy.ao;
        if (r14 != r3) goto L_0x004a;
    L_0x0040:
        r3 = r17.k();
        r3 = java.lang.Integer.valueOf(r3);
        r15 = r3;
        goto L_0x005e;
    L_0x004a:
        r3 = defpackage.ogy.aj;
        if (r14 != r3) goto L_0x0057;
    L_0x004e:
        r0.d(r13);
        r3 = r0.e(r13);
        r11 = r3;
        goto L_0x005e;
    L_0x0057:
        r3 = defpackage.ogy.ak;
        if (r14 == r3) goto L_0x005c;
    L_0x005b:
        goto L_0x005e;
    L_0x005c:
        r9 = r7;
        r10 = r12;
    L_0x005e:
        r7 = r7 + r12;
        goto L_0x002c;
    L_0x0060:
        r3 = "cenc";
        r3 = r3.equals(r11);
        if (r3 != 0) goto L_0x0084;
    L_0x0068:
        r3 = "cbc1";
        r3 = r3.equals(r11);
        if (r3 != 0) goto L_0x0084;
    L_0x0070:
        r3 = "cens";
        r3 = r3.equals(r11);
        if (r3 != 0) goto L_0x0084;
    L_0x0078:
        r3 = "cbcs";
        r3 = r3.equals(r11);
        if (r3 != 0) goto L_0x0084;
    L_0x0080:
        r16 = 0;
        goto L_0x010d;
    L_0x0084:
        if (r15 == 0) goto L_0x0088;
    L_0x0086:
        r3 = 1;
        goto L_0x0089;
    L_0x0088:
        r3 = 0;
    L_0x0089:
        r7 = "frma atom is mandatory";
        defpackage.oxz.a(r3, r7);
        if (r9 == r8) goto L_0x0092;
    L_0x0090:
        r3 = 1;
        goto L_0x0093;
    L_0x0092:
        r3 = 0;
    L_0x0093:
        r7 = "schi atom is mandatory";
        defpackage.oxz.a(r3, r7);
        r3 = r9 + 8;
    L_0x009a:
        r7 = r3 - r9;
        if (r7 >= r10) goto L_0x00fc;
    L_0x009e:
        r0.c(r3);
        r7 = r17.k();
        r8 = r17.k();
        r12 = defpackage.ogy.al;
        if (r8 != r12) goto L_0x00f9;
    L_0x00ad:
        r3 = r17.k();
        r3 = defpackage.ogy.a(r3);
        r0.d(r5);
        if (r3 != 0) goto L_0x00c0;
    L_0x00ba:
        r0.d(r5);
        r3 = 0;
        r14 = 0;
        goto L_0x00ca;
    L_0x00c0:
        r3 = r17.d();
        r7 = r3 & 240;
        r7 = r7 >> r13;
        r3 = r3 & 15;
        r14 = r7;
    L_0x00ca:
        r7 = r17.d();
        if (r7 != r5) goto L_0x00d2;
    L_0x00d0:
        r10 = 1;
        goto L_0x00d3;
    L_0x00d2:
        r10 = 0;
    L_0x00d3:
        r12 = r17.d();
        r7 = 16;
        r13 = new byte[r7];
        r0.a(r13, r6, r7);
        if (r10 != 0) goto L_0x00e3;
    L_0x00e0:
        r16 = 0;
        goto L_0x00f0;
    L_0x00e3:
        if (r12 != 0) goto L_0x00e0;
    L_0x00e5:
        r7 = r17.d();
        r8 = new byte[r7];
        r0.a(r8, r6, r7);
        r16 = r8;
    L_0x00f0:
        r7 = new ohw;
        r9 = r7;
        r8 = r15;
        r15 = r3;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16);
        goto L_0x00fe;
    L_0x00f9:
        r8 = r15;
        r3 = r3 + r7;
        goto L_0x009a;
    L_0x00fc:
        r8 = r15;
        r7 = 0;
    L_0x00fe:
        if (r7 == 0) goto L_0x0101;
    L_0x0100:
        goto L_0x0102;
    L_0x0101:
        r5 = 0;
    L_0x0102:
        r3 = "tenc atom is mandatory";
        defpackage.oxz.a(r5, r3);
        r3 = android.util.Pair.create(r8, r7);
        r16 = r3;
    L_0x010d:
        if (r16 != 0) goto L_0x0110;
    L_0x010f:
        goto L_0x0111;
    L_0x0110:
        return r16;
    L_0x0111:
        r1 = r1 + r2;
        goto L_0x0004;
    L_0x0114:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohd.a(oza, int, int):android.util.Pair");
    }

    private static int b(oza oza) {
        int d = oza.d();
        int i = d & 127;
        while ((d & 128) == 128) {
            d = oza.d();
            i = (i << 7) | (d & 127);
        }
        return i;
    }
}
