package defpackage;

import android.util.SparseArray;

/* renamed from: nui */
public final class nui implements nrc {
    private final nuk a = new nuk();
    private final SparseArray b = new SparseArray();
    private final nwz c = new nwz(4096);
    private boolean d;
    private boolean e;
    private boolean f;
    private nre g;

    public final void c() {
    }

    public final boolean a(nrb nrb) {
        byte[] bArr = new byte[14];
        nrb.c(bArr, 0, 14);
        if ((((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            nrb.b(bArr[13] & 7);
            nrb.c(bArr, 0, 3);
            if (((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    public final void a(nre nre) {
        this.g = nre;
        nre.a(nrq.f);
    }

    public final void b() {
        this.a.a();
        for (int i = 0; i < this.b.size(); i++) {
            nuh nuh = (nuh) this.b.valueAt(i);
            nuh.f = false;
            nuh.a.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf  */
    public final int a(defpackage.nrb r16, defpackage.nrm r17) {
        /*
        r15 = this;
        r0 = r15;
        r1 = r16;
        r2 = r0.c;
        r2 = r2.a;
        r3 = 4;
        r4 = 1;
        r5 = 0;
        r2 = r1.b(r2, r5, r3, r4);
        r6 = -1;
        if (r2 == 0) goto L_0x01fc;
    L_0x0011:
        r2 = r0.c;
        r2.c(r5);
        r2 = r0.c;
        r2 = r2.j();
        r7 = 441; // 0x1b9 float:6.18E-43 double:2.18E-321;
        if (r2 == r7) goto L_0x01fc;
    L_0x0020:
        r6 = 442; // 0x1ba float:6.2E-43 double:2.184E-321;
        if (r2 != r6) goto L_0x0047;
    L_0x0024:
        r2 = r0.c;
        r2 = r2.a;
        r3 = 10;
        r1.c(r2, r5, r3);
        r2 = r0.c;
        r2.c(r5);
        r2 = r0.c;
        r3 = 9;
        r2.d(r3);
        r2 = r0.c;
        r2 = r2.d();
        r2 = r2 & 7;
        r2 = r2 + 14;
        r1.a(r2);
        return r5;
    L_0x0047:
        r6 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r7 = 2;
        r8 = 6;
        if (r2 != r6) goto L_0x0064;
    L_0x004d:
        r2 = r0.c;
        r2 = r2.a;
        r1.c(r2, r5, r7);
        r2 = r0.c;
        r2.c(r5);
        r2 = r0.c;
        r2 = r2.e();
        r2 = r2 + r8;
        r1.a(r2);
        return r5;
    L_0x0064:
        r6 = r2 >> 8;
        if (r6 != r4) goto L_0x01f8;
    L_0x0068:
        r2 = r2 & 255;
        r6 = r0.b;
        r6 = r6.get(r2);
        r6 = (defpackage.nuh) r6;
        r9 = r0.d;
        if (r9 == 0) goto L_0x0078;
    L_0x0076:
        goto L_0x00e8;
    L_0x0078:
        if (r6 == 0) goto L_0x007b;
    L_0x007a:
        goto L_0x00cb;
    L_0x007b:
        r9 = r0.e;
        r10 = 0;
        if (r9 != 0) goto L_0x00a6;
    L_0x0080:
        r9 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        if (r2 != r9) goto L_0x0092;
    L_0x0084:
        r10 = new ntr;
        r11 = r0.g;
        r9 = r11.d_(r9);
        r10.<init>(r9, r5);
        r0.e = r4;
        goto L_0x00bd;
    L_0x0092:
        r9 = r2 & 224;
        r11 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        if (r9 != r11) goto L_0x00a6;
    L_0x0098:
        r10 = new nug;
        r9 = r0.g;
        r9 = r9.d_(r2);
        r10.<init>(r9);
        r0.e = r4;
        goto L_0x00bd;
    L_0x00a6:
        r9 = r0.f;
        if (r9 != 0) goto L_0x00bd;
    L_0x00aa:
        r9 = r2 & 240;
        r11 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        if (r9 != r11) goto L_0x00bd;
    L_0x00b0:
        r10 = new nty;
        r9 = r0.g;
        r9 = r9.d_(r2);
        r10.<init>(r9);
        r0.f = r4;
    L_0x00bd:
        if (r10 == 0) goto L_0x00cb;
    L_0x00bf:
        r6 = new nuh;
        r9 = r0.a;
        r6.<init>(r10, r9);
        r9 = r0.b;
        r9.put(r2, r6);
    L_0x00cb:
        r2 = r0.e;
        if (r2 == 0) goto L_0x00d4;
    L_0x00cf:
        r2 = r0.f;
        if (r2 == 0) goto L_0x00d4;
    L_0x00d3:
        goto L_0x00e1;
    L_0x00d4:
        r2 = r1;
        r2 = (defpackage.nqx) r2;
        r9 = r2.c;
        r11 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r2 > 0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00e8;
    L_0x00e1:
        r0.d = r4;
        r2 = r0.g;
        r2.a();
    L_0x00e8:
        r2 = r0.c;
        r2 = r2.a;
        r1.c(r2, r5, r7);
        r2 = r0.c;
        r2.c(r5);
        r2 = r0.c;
        r2 = r2.e();
        r2 = r2 + r8;
        if (r6 != 0) goto L_0x0102;
    L_0x00fd:
        r1.a(r2);
        goto L_0x01f7;
    L_0x0102:
        r7 = r0.c;
        r7 = r7.c();
        if (r7 >= r2) goto L_0x0111;
    L_0x010a:
        r7 = r0.c;
        r9 = new byte[r2];
        r7.a(r9, r2);
    L_0x0111:
        r7 = r0.c;
        r7 = r7.a;
        r1.b(r7, r5, r2);
        r1 = r0.c;
        r1.c(r8);
        r1 = r0.c;
        r1.b(r2);
        r1 = r0.c;
        r2 = r6.c;
        r2 = r2.a;
        r7 = 3;
        r1.a(r2, r5, r7);
        r2 = r6.c;
        r2.a(r5);
        r2 = r6.c;
        r9 = 8;
        r2.b(r9);
        r2 = r6.c;
        r2 = r2.b();
        r6.d = r2;
        r2 = r6.c;
        r2 = r2.b();
        r6.e = r2;
        r2 = r6.c;
        r2.b(r8);
        r2 = r6.c;
        r2 = r2.c(r9);
        r6.g = r2;
        r8 = r6.c;
        r8 = r8.a;
        r1.a(r8, r5, r2);
        r2 = r6.c;
        r2.a(r5);
        r8 = 0;
        r6.h = r8;
        r2 = r6.d;
        if (r2 == 0) goto L_0x01df;
    L_0x0169:
        r2 = r6.c;
        r2.b(r3);
        r2 = r6.c;
        r2 = r2.c(r7);
        r8 = r6.c;
        r8.b(r4);
        r8 = r6.c;
        r9 = 15;
        r8 = r8.c(r9);
        r10 = r6.c;
        r10.b(r4);
        r10 = (long) r2;
        r2 = 30;
        r10 = r10 << r2;
        r8 = r8 << r9;
        r12 = (long) r8;
        r10 = r10 | r12;
        r8 = r6.c;
        r8 = r8.c(r9);
        r12 = (long) r8;
        r10 = r10 | r12;
        r8 = r6.c;
        r8.b(r4);
        r8 = r6.f;
        if (r8 != 0) goto L_0x01d7;
    L_0x019e:
        r8 = r6.e;
        if (r8 == 0) goto L_0x01d7;
    L_0x01a2:
        r8 = r6.c;
        r8.b(r3);
        r3 = r6.c;
        r3 = r3.c(r7);
        r7 = r6.c;
        r7.b(r4);
        r7 = r6.c;
        r7 = r7.c(r9);
        r8 = r6.c;
        r8.b(r4);
        r8 = r6.c;
        r8 = r8.c(r9);
        r12 = r6.c;
        r12.b(r4);
        r12 = r6.b;
        r13 = (long) r3;
        r2 = r13 << r2;
        r7 = r7 << r9;
        r13 = (long) r7;
        r2 = r2 | r13;
        r7 = (long) r8;
        r2 = r2 | r7;
        r12.a(r2);
        r6.f = r4;
    L_0x01d7:
        r2 = r6.b;
        r8 = r2.a(r10);
        r6.h = r8;
    L_0x01df:
        r2 = r6.a;
        r2.a(r8, r4);
        r2 = r6.a;
        r2.a(r1);
        r1 = r6.a;
        r1.b();
        r1 = r0.c;
        r2 = r1.c();
        r1.b(r2);
    L_0x01f7:
        return r5;
    L_0x01f8:
        r1.a(r4);
        return r5;
    L_0x01fc:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nui.a(nrb, nrm):int");
    }
}
