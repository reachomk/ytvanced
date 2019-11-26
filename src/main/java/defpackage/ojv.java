package defpackage;

import android.util.SparseArray;

/* renamed from: ojv */
public final class ojv implements ofm {
    private final ozo a = new ozo(0);
    private final SparseArray b = new SparseArray();
    private final oza c = new oza(4096);
    private final ojs d = new ojs();
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private ojq i;
    private ofo j;
    private boolean k;

    public final void c() {
    }

    public final boolean a(ofp ofp) {
        byte[] bArr = new byte[14];
        ofp.c(bArr, 0, 14);
        if ((((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            ofp.b(bArr[13] & 7);
            ofp.c(bArr, 0, 3);
            if (((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    public final void a(ofo ofo) {
        this.j = ofo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039 A:{LOOP_END, LOOP:0: B:11:0x0031->B:13:0x0039} */
    /* JADX WARNING: Missing block: B:5:0x001c, code skipped:
            if (r4 == r6) goto L_0x0028;
     */
    public final void a(long r4, long r6) {
        /*
        r3 = this;
        r4 = r3.a;
        r4 = r4.a();
        r0 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 == 0) goto L_0x001e;
    L_0x000f:
        r4 = r3.a;
        r4 = r4.a;
        r0 = 0;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0028;
    L_0x001a:
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x0028;
    L_0x001e:
        r4 = r3.a;
        r4.b();
        r4 = r3.a;
        r4.a(r6);
    L_0x0028:
        r4 = r3.i;
        r5 = 0;
        if (r4 == 0) goto L_0x0030;
    L_0x002d:
        r4.a(r6);
    L_0x0030:
        r4 = 0;
    L_0x0031:
        r6 = r3.b;
        r6 = r6.size();
        if (r4 >= r6) goto L_0x004b;
    L_0x0039:
        r6 = r3.b;
        r6 = r6.valueAt(r4);
        r6 = (defpackage.oju) r6;
        r6.f = r5;
        r6 = r6.a;
        r6.a();
        r4 = r4 + 1;
        goto L_0x0031;
    L_0x004b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojv.a(long, long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016f  */
    public final int a(defpackage.ofp r18, defpackage.ofv r19) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r3 = r1;
        r3 = (defpackage.ofl) r3;
        r10 = r3.b;
        r15 = -1;
        r4 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r6 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1));
        if (r6 == 0) goto L_0x00f3;
    L_0x0016:
        r6 = r0.d;
        r7 = r6.c;
        if (r7 != 0) goto L_0x00f3;
    L_0x001c:
        r7 = r6.e;
        r8 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        if (r7 == 0) goto L_0x00a4;
    L_0x0022:
        r12 = r6.g;
        r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r7 != 0) goto L_0x002e;
    L_0x0028:
        r8 = r6.a(r1);
        goto L_0x00f2;
    L_0x002e:
        r7 = r6.d;
        if (r7 == 0) goto L_0x0055;
    L_0x0032:
        r2 = r6.f;
        r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r7 != 0) goto L_0x003e;
    L_0x0038:
        r8 = r6.a(r1);
        goto L_0x00f2;
    L_0x003e:
        r4 = r6.a;
        r2 = r4.b(r2);
        r4 = r6.a;
        r7 = r6.g;
        r4 = r4.b(r7);
        r4 = r4 - r2;
        r6.h = r4;
        r8 = r6.a(r1);
        goto L_0x00f2;
    L_0x0055:
        r7 = java.lang.Math.min(r8, r10);
        r8 = (int) r7;
        r9 = r3.c;
        r11 = 0;
        r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r3 != 0) goto L_0x009f;
    L_0x0062:
        r2 = r6.b;
        r2.a(r8);
        r18.a();
        r2 = r6.b;
        r2 = r2.a;
        r3 = 0;
        r1.c(r2, r3, r8);
        r1 = r6.b;
        r2 = r1.b;
        r3 = r1.c;
    L_0x0078:
        r7 = r3 + -3;
        if (r2 >= r7) goto L_0x0099;
    L_0x007c:
        r7 = r1.a;
        r7 = defpackage.ojs.a(r7, r2);
        r8 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        if (r7 != r8) goto L_0x0096;
    L_0x0086:
        r7 = r2 + 4;
        r1.c(r7);
        r7 = defpackage.ojs.a(r1);
        r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r9 != 0) goto L_0x0094;
    L_0x0093:
        goto L_0x0096;
    L_0x0094:
        r4 = r7;
        goto L_0x0099;
    L_0x0096:
        r2 = r2 + 1;
        goto L_0x0078;
    L_0x0099:
        r6.f = r4;
        r1 = 1;
        r6.d = r1;
        goto L_0x00f1;
    L_0x009f:
        r3 = 0;
        r2.a = r3;
        goto L_0x00b3;
    L_0x00a4:
        r7 = java.lang.Math.min(r8, r10);
        r8 = (int) r7;
        r12 = (long) r8;
        r10 = r10 - r12;
        r12 = r3.c;
        r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
        if (r3 == 0) goto L_0x00b5;
    L_0x00b1:
        r2.a = r10;
    L_0x00b3:
        r8 = 1;
        goto L_0x00f2;
    L_0x00b5:
        r2 = r6.b;
        r2.a(r8);
        r18.a();
        r2 = r6.b;
        r2 = r2.a;
        r3 = 0;
        r1.c(r2, r3, r8);
        r1 = r6.b;
        r2 = r1.b;
        r7 = r1.c;
        r7 = r7 + -4;
    L_0x00cd:
        if (r7 < r2) goto L_0x00ec;
    L_0x00cf:
        r8 = r1.a;
        r8 = defpackage.ojs.a(r8, r7);
        r9 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        if (r8 != r9) goto L_0x00e9;
    L_0x00d9:
        r8 = r7 + 4;
        r1.c(r8);
        r8 = defpackage.ojs.a(r1);
        r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r10 != 0) goto L_0x00e7;
    L_0x00e6:
        goto L_0x00e9;
    L_0x00e7:
        r4 = r8;
        goto L_0x00ec;
    L_0x00e9:
        r7 = r7 + -1;
        goto L_0x00cd;
    L_0x00ec:
        r6.g = r4;
        r8 = 1;
        r6.e = r8;
    L_0x00f1:
        r8 = 0;
    L_0x00f2:
        return r8;
    L_0x00f3:
        r3 = 0;
        r8 = 1;
        r6 = r0.k;
        if (r6 != 0) goto L_0x0126;
    L_0x00f9:
        r0.k = r8;
        r6 = r0.d;
        r12 = r6.h;
        r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r7 == 0) goto L_0x011a;
    L_0x0103:
        r14 = new ojq;
        r5 = r6.a;
        r4 = r14;
        r6 = r12;
        r12 = 1;
        r8 = r10;
        r4.<init>(r5, r6, r8);
        r0.i = r14;
        r4 = r0.j;
        r5 = r0.i;
        r5 = r5.a;
        r4.a(r5);
        goto L_0x0126;
    L_0x011a:
        r4 = 1;
        r5 = r0.j;
        r6 = new ofw;
        r6.<init>(r12);
        r5.a(r6);
        goto L_0x0127;
    L_0x0126:
        r4 = 1;
    L_0x0127:
        r5 = r0.i;
        if (r5 == 0) goto L_0x0139;
    L_0x012b:
        r5 = r5.a();
        if (r5 != 0) goto L_0x0132;
    L_0x0131:
        goto L_0x0139;
    L_0x0132:
        r3 = r0.i;
        r1 = r3.a(r1, r2);
        return r1;
    L_0x0139:
        r18.a();
        r2 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1));
        if (r2 == 0) goto L_0x0147;
    L_0x0140:
        r5 = r18.b();
        r5 = r10 - r5;
        goto L_0x0148;
    L_0x0147:
        r5 = r15;
    L_0x0148:
        r2 = -1;
        r7 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1));
        if (r7 != 0) goto L_0x014e;
    L_0x014d:
        goto L_0x0155;
    L_0x014e:
        r7 = 4;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 >= 0) goto L_0x0155;
    L_0x0154:
        return r2;
    L_0x0155:
        r5 = r0.c;
        r5 = r5.a;
        r6 = 4;
        r5 = r1.b(r5, r3, r6, r4);
        if (r5 == 0) goto L_0x0349;
    L_0x0160:
        r5 = r0.c;
        r5.c(r3);
        r5 = r0.c;
        r5 = r5.k();
        r7 = 441; // 0x1b9 float:6.18E-43 double:2.18E-321;
        if (r5 == r7) goto L_0x0349;
    L_0x016f:
        r7 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        if (r5 != r7) goto L_0x0191;
    L_0x0173:
        r2 = r0.c;
        r2 = r2.a;
        r4 = 10;
        r1.c(r2, r3, r4);
        r2 = r0.c;
        r4 = 9;
        r2.c(r4);
        r2 = r0.c;
        r2 = r2.d();
        r2 = r2 & 7;
        r2 = r2 + 14;
        r1.a(r2);
        return r3;
    L_0x0191:
        r2 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r7 = 2;
        r8 = 6;
        if (r5 != r2) goto L_0x01ae;
    L_0x0197:
        r2 = r0.c;
        r2 = r2.a;
        r1.c(r2, r3, r7);
        r2 = r0.c;
        r2.c(r3);
        r2 = r0.c;
        r2 = r2.e();
        r2 = r2 + r8;
        r1.a(r2);
        return r3;
    L_0x01ae:
        r2 = r5 >> 8;
        if (r2 != r4) goto L_0x0345;
    L_0x01b2:
        r2 = r5 & 255;
        r5 = r0.b;
        r5 = r5.get(r2);
        r5 = (defpackage.oju) r5;
        r9 = r0.e;
        if (r9 == 0) goto L_0x01c2;
    L_0x01c0:
        goto L_0x023e;
    L_0x01c2:
        if (r5 != 0) goto L_0x021c;
    L_0x01c4:
        r9 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        if (r2 == r9) goto L_0x01f4;
    L_0x01c8:
        r9 = r2 & 224;
        r10 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        if (r9 == r10) goto L_0x01e5;
    L_0x01ce:
        r9 = r2 & 240;
        r10 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        if (r9 != r10) goto L_0x01e3;
    L_0x01d4:
        r9 = new oje;
        r9.<init>();
        r0.g = r4;
        r10 = r1;
        r10 = (defpackage.ofl) r10;
        r10 = r10.c;
        r0.h = r10;
        goto L_0x0202;
    L_0x01e3:
        r9 = 0;
        goto L_0x0202;
    L_0x01e5:
        r9 = new ojp;
        r9.<init>();
        r0.f = r4;
        r10 = r1;
        r10 = (defpackage.ofl) r10;
        r10 = r10.c;
        r0.h = r10;
        goto L_0x0202;
    L_0x01f4:
        r9 = new oix;
        r9.<init>();
        r0.f = r4;
        r10 = r1;
        r10 = (defpackage.ofl) r10;
        r10 = r10.c;
        r0.h = r10;
    L_0x0202:
        if (r9 == 0) goto L_0x021c;
    L_0x0204:
        r5 = new okl;
        r10 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r5.<init>(r2, r10);
        r10 = r0.j;
        r9.a(r10, r5);
        r5 = new oju;
        r10 = r0.a;
        r5.<init>(r9, r10);
        r9 = r0.b;
        r9.put(r2, r5);
    L_0x021c:
        r2 = r0.f;
        if (r2 == 0) goto L_0x022a;
    L_0x0220:
        r2 = r0.g;
        if (r2 == 0) goto L_0x022a;
    L_0x0224:
        r9 = r0.h;
        r11 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r9 = r9 + r11;
        goto L_0x022d;
    L_0x022a:
        r9 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
    L_0x022d:
        r2 = r1;
        r2 = (defpackage.ofl) r2;
        r11 = r2.c;
        r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
        if (r2 > 0) goto L_0x0237;
    L_0x0236:
        goto L_0x023e;
    L_0x0237:
        r0.e = r4;
        r2 = r0.j;
        r2.a();
    L_0x023e:
        r2 = r0.c;
        r2 = r2.a;
        r1.c(r2, r3, r7);
        r2 = r0.c;
        r2.c(r3);
        r2 = r0.c;
        r2 = r2.e();
        r2 = r2 + r8;
        if (r5 != 0) goto L_0x0258;
    L_0x0253:
        r1.a(r2);
        goto L_0x0344;
    L_0x0258:
        r7 = r0.c;
        r7.a(r2);
        r7 = r0.c;
        r7 = r7.a;
        r1.b(r7, r3, r2);
        r1 = r0.c;
        r1.c(r8);
        r1 = r0.c;
        r2 = r5.c;
        r2 = r2.a;
        r7 = 3;
        r1.a(r2, r3, r7);
        r2 = r5.c;
        r2.a(r3);
        r2 = r5.c;
        r9 = 8;
        r2.b(r9);
        r2 = r5.c;
        r2 = r2.e();
        r5.d = r2;
        r2 = r5.c;
        r2 = r2.e();
        r5.e = r2;
        r2 = r5.c;
        r2.b(r8);
        r2 = r5.c;
        r2 = r2.c(r9);
        r5.g = r2;
        r8 = r5.c;
        r8 = r8.a;
        r1.a(r8, r3, r2);
        r2 = r5.c;
        r2.a(r3);
        r11 = 0;
        r5.h = r11;
        r2 = r5.d;
        if (r2 == 0) goto L_0x032a;
    L_0x02b0:
        r2 = r5.c;
        r2.b(r6);
        r2 = r5.c;
        r2 = r2.c(r7);
        r8 = r5.c;
        r8.b(r4);
        r8 = r5.c;
        r9 = 15;
        r8 = r8.c(r9);
        r10 = r5.c;
        r10.b(r4);
        r10 = (long) r2;
        r2 = 30;
        r10 = r10 << r2;
        r2 = r8 << 15;
        r12 = (long) r2;
        r10 = r10 | r12;
        r2 = r5.c;
        r2 = r2.c(r9);
        r12 = (long) r2;
        r10 = r10 | r12;
        r2 = r5.c;
        r2.b(r4);
        r2 = r5.f;
        if (r2 != 0) goto L_0x0321;
    L_0x02e6:
        r2 = r5.e;
        if (r2 == 0) goto L_0x0321;
    L_0x02ea:
        r2 = r5.c;
        r2.b(r6);
        r2 = r5.c;
        r2 = r2.c(r7);
        r7 = r5.c;
        r7.b(r4);
        r7 = r5.c;
        r7 = r7.c(r9);
        r8 = r5.c;
        r8.b(r4);
        r8 = r5.c;
        r8 = r8.c(r9);
        r12 = r5.c;
        r12.b(r4);
        r12 = r5.b;
        r13 = (long) r2;
        r2 = 30;
        r13 = r13 << r2;
        r2 = r7 << 15;
        r6 = (long) r2;
        r6 = r6 | r13;
        r8 = (long) r8;
        r6 = r6 | r8;
        r12.b(r6);
        r5.f = r4;
    L_0x0321:
        r2 = r5.b;
        r13 = r2.b(r10);
        r5.h = r13;
        goto L_0x032b;
    L_0x032a:
        r13 = r11;
    L_0x032b:
        r2 = r5.a;
        r4 = 4;
        r2.a(r13, r4);
        r2 = r5.a;
        r2.a(r1);
        r1 = r5.a;
        r1.b();
        r1 = r0.c;
        r2 = r1.c();
        r1.b(r2);
    L_0x0344:
        return r3;
    L_0x0345:
        r1.a(r4);
        return r3;
    L_0x0349:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojv.a(ofp, ofv):int");
    }
}
