package defpackage;

import java.nio.charset.Charset;

/* renamed from: nrz */
final class nrz {
    private static final int a = nxf.c("ID3");
    private static final Charset[] b = new Charset[]{Charset.forName("ISO-8859-1"), Charset.forName("UTF-16LE"), Charset.forName("UTF-16BE"), Charset.forName("UTF-8")};

    /* JADX WARNING: Removed duplicated region for block: B:137:0x01d3 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01d3 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01d3 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01d3 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARNING: Missing block: B:56:0x00d5, code skipped:
            if (r14.b() >= r4) goto L_0x00d7;
     */
    /* JADX WARNING: Missing block: B:99:0x0175, code skipped:
            if ((r12 & 12) != 0) goto L_0x0135;
     */
    /* JADX WARNING: Missing block: B:102:0x017b, code skipped:
            if ((r12 & 192) != 0) goto L_0x0135;
     */
    /* JADX WARNING: Missing block: B:104:0x0183, code skipped:
            if (r4.equals("COMM") == false) goto L_0x0135;
     */
    public static defpackage.nrj a(defpackage.nrb r16) {
        /*
        r0 = r16;
        r1 = new nwz;
        r2 = 10;
        r1.<init>(r2);
        r3 = 0;
        r5 = 0;
        r6 = 0;
    L_0x000c:
        r7 = r1.a;
        r0.c(r7, r3, r2);
        r1.c(r3);
        r7 = r1.g();
        r8 = a;
        if (r7 != r8) goto L_0x01df;
    L_0x001c:
        r7 = r1.d();
        r8 = r1.d();
        r9 = r1.d();
        r10 = r1.m();
        if (r6 == 0) goto L_0x0032;
    L_0x002e:
        r9 = 10;
        goto L_0x01d5;
    L_0x0032:
        r11 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r8 == r11) goto L_0x002e;
    L_0x0036:
        r8 = 2;
        if (r7 < r8) goto L_0x002e;
    L_0x0039:
        r12 = 4;
        if (r7 > r12) goto L_0x002e;
    L_0x003c:
        r13 = 3145728; // 0x300000 float:4.408104E-39 double:1.554196E-317;
        if (r10 > r13) goto L_0x002e;
    L_0x0040:
        if (r7 != r8) goto L_0x004a;
    L_0x0042:
        r13 = r9 & 63;
        if (r13 != 0) goto L_0x002e;
    L_0x0046:
        r13 = r9 & 64;
        if (r13 != 0) goto L_0x002e;
    L_0x004a:
        r13 = 3;
        if (r7 != r13) goto L_0x0051;
    L_0x004d:
        r14 = r9 & 31;
        if (r14 != 0) goto L_0x002e;
    L_0x0051:
        if (r7 == r12) goto L_0x0054;
    L_0x0053:
        goto L_0x0058;
    L_0x0054:
        r14 = r9 & 15;
        if (r14 != 0) goto L_0x002e;
    L_0x0058:
        r6 = new byte[r10];
        r0.c(r6, r3, r10);
        r14 = new nwz;
        r14.<init>(r6);
        r6 = 1;
        if (r7 == r12) goto L_0x008f;
    L_0x0065:
        r15 = r9 & 128;
        if (r15 != 0) goto L_0x006a;
    L_0x0069:
        goto L_0x00a2;
    L_0x006a:
        r15 = r14.a;
        r4 = r15.length;
        r2 = r4;
        r4 = 0;
    L_0x006f:
        r8 = r4 + 1;
        if (r8 >= r2) goto L_0x008b;
    L_0x0073:
        r12 = r15[r4];
        r12 = r12 & r11;
        if (r12 != r11) goto L_0x0087;
    L_0x0078:
        r12 = r15[r8];
        if (r12 != 0) goto L_0x0087;
    L_0x007c:
        r12 = r4 + 2;
        r4 = r2 - r4;
        r4 = r4 + -2;
        java.lang.System.arraycopy(r15, r12, r15, r8, r4);
        r2 = r2 + -1;
    L_0x0087:
        r4 = r8;
        r8 = 2;
        r12 = 4;
        goto L_0x006f;
    L_0x008b:
        r14.b(r2);
        goto L_0x00a2;
    L_0x008f:
        r2 = defpackage.nrz.a(r14, r3);
        if (r2 == 0) goto L_0x0099;
    L_0x0095:
        defpackage.nrz.b(r14, r3);
        goto L_0x00a2;
    L_0x0099:
        r2 = defpackage.nrz.a(r14, r6);
        if (r2 == 0) goto L_0x00a2;
    L_0x009f:
        defpackage.nrz.b(r14, r6);
    L_0x00a2:
        r14.c(r3);
        r2 = 6;
        if (r7 != r13) goto L_0x00e0;
    L_0x00a8:
        r4 = r9 & 64;
        if (r4 != 0) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00fd;
    L_0x00ad:
        r4 = r14.b();
        r8 = 4;
        if (r4 < r8) goto L_0x00db;
    L_0x00b4:
        r4 = r14.n();
        r9 = r14.b();
        if (r4 > r9) goto L_0x00db;
    L_0x00be:
        if (r4 < r2) goto L_0x00d7;
    L_0x00c0:
        r9 = 2;
        r14.d(r9);
        r9 = r14.n();
        r14.c(r8);
        r8 = r14.c;
        r8 = r8 - r9;
        r14.b(r8);
        r8 = r14.b();
        if (r8 < r4) goto L_0x00db;
    L_0x00d7:
        r14.d(r4);
        goto L_0x00fd;
    L_0x00db:
        r6 = 0;
        r9 = 10;
        goto L_0x01d8;
    L_0x00e0:
        r4 = 4;
        if (r7 != r4) goto L_0x00fd;
    L_0x00e3:
        r8 = r9 & 64;
        if (r8 == 0) goto L_0x00fd;
    L_0x00e7:
        r8 = r14.b();
        if (r8 < r4) goto L_0x00db;
    L_0x00ed:
        r8 = r14.m();
        if (r8 < r2) goto L_0x00db;
    L_0x00f3:
        r9 = r14.b();
        r9 = r9 + r4;
        if (r8 > r9) goto L_0x00db;
    L_0x00fa:
        r14.c(r8);
    L_0x00fd:
        r4 = "US-ASCII";
        r8 = 2;
        if (r7 != r8) goto L_0x013f;
    L_0x0102:
        r8 = r14.b();
        if (r8 < r2) goto L_0x0138;
    L_0x0108:
        r4 = java.nio.charset.Charset.forName(r4);
        r4 = r14.a(r13, r4);
        r8 = "\u0000\u0000\u0000";
        r8 = r4.equals(r8);
        if (r8 != 0) goto L_0x0138;
    L_0x0118:
        r8 = r14.g();
        if (r8 == 0) goto L_0x0138;
    L_0x011e:
        r9 = r14.b();
        if (r8 > r9) goto L_0x0138;
    L_0x0124:
        r9 = "COM";
        r4 = r4.equals(r9);
        if (r4 == 0) goto L_0x0131;
    L_0x012c:
        r11 = r8;
        r8 = 4;
        r9 = 10;
        goto L_0x0185;
    L_0x0131:
        r11 = r8;
        r8 = 4;
        r9 = 10;
    L_0x0135:
        r12 = 2;
        goto L_0x01ab;
    L_0x0138:
        r4 = 0;
        r8 = 4;
        r9 = 10;
        r12 = 2;
        goto L_0x01b3;
    L_0x013f:
        r8 = r14.b();
        r9 = 10;
        if (r8 < r9) goto L_0x01b0;
    L_0x0147:
        r4 = java.nio.charset.Charset.forName(r4);
        r8 = 4;
        r4 = r14.a(r8, r4);
        r11 = "\u0000\u0000\u0000\u0000";
        r11 = r4.equals(r11);
        if (r11 != 0) goto L_0x01b1;
    L_0x0158:
        if (r7 == r8) goto L_0x015f;
    L_0x015a:
        r11 = r14.n();
        goto L_0x0163;
    L_0x015f:
        r11 = r14.m();
    L_0x0163:
        if (r11 == 0) goto L_0x01b1;
    L_0x0165:
        r12 = r14.b();
        r12 = r12 + -2;
        if (r11 > r12) goto L_0x01b1;
    L_0x016d:
        r12 = r14.e();
        if (r7 != r8) goto L_0x0177;
    L_0x0173:
        r15 = r12 & 12;
        if (r15 != 0) goto L_0x0135;
    L_0x0177:
        if (r7 != r13) goto L_0x017d;
    L_0x0179:
        r12 = r12 & 192;
        if (r12 != 0) goto L_0x0135;
    L_0x017d:
        r12 = "COMM";
        r4 = r4.equals(r12);
        if (r4 == 0) goto L_0x0135;
    L_0x0185:
        r4 = r14.d();
        if (r4 < 0) goto L_0x01b1;
    L_0x018b:
        r12 = b;
        r15 = r12.length;
        if (r4 >= r15) goto L_0x01b1;
    L_0x0190:
        r11 = r11 + -1;
        r4 = r12[r4];
        r4 = r14.a(r11, r4);
        r11 = "\u0000";
        r4 = r4.split(r11);
        r11 = r4.length;
        r12 = 2;
        if (r11 != r12) goto L_0x01b2;
    L_0x01a2:
        r11 = r4[r3];
        r4 = r4[r6];
        r4 = android.util.Pair.create(r11, r4);
        goto L_0x01b3;
    L_0x01ab:
        r14.d(r11);
        goto L_0x00fd;
    L_0x01b0:
        r8 = 4;
    L_0x01b1:
        r12 = 2;
    L_0x01b2:
        r4 = 0;
    L_0x01b3:
        if (r4 == 0) goto L_0x01d3;
    L_0x01b5:
        r11 = r4.first;
        r11 = (java.lang.String) r11;
        r11 = r11.length();
        if (r11 <= r13) goto L_0x00fd;
    L_0x01bf:
        r11 = r4.first;
        r11 = (java.lang.String) r11;
        r11 = r11.substring(r13);
        r4 = r4.second;
        r4 = (java.lang.String) r4;
        r4 = defpackage.nrj.a(r11, r4);
        if (r4 == 0) goto L_0x00fd;
    L_0x01d1:
        r6 = r4;
        goto L_0x01d8;
    L_0x01d3:
        r6 = 0;
        goto L_0x01d8;
    L_0x01d5:
        r0.b(r10);
    L_0x01d8:
        r10 = r10 + 10;
        r5 = r5 + r10;
        r2 = 10;
        goto L_0x000c;
    L_0x01df:
        r16.a();
        r0.b(r5);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrz.a(nrb):nrj");
    }

    private static boolean a(nwz nwz, boolean z) {
        nwz.c(0);
        while (nwz.b() >= 10 && nwz.j() != 0) {
            long h = nwz.h();
            if (!z) {
                if ((8421504 & h) != 0) {
                    return false;
                }
                h = (((h >> 24) & 127) << 21) | (((h & 127) | (((h >> 8) & 127) << 7)) | (((h >> 16) & 127) << 14));
            }
            if (h > ((long) (nwz.b() - 2))) {
                return false;
            }
            if ((1 & nwz.e()) != 0 && nwz.b() < 4) {
                return false;
            }
            nwz.d((int) h);
        }
        return true;
    }

    private static void b(nwz nwz, boolean z) {
        nwz.c(0);
        byte[] bArr = nwz.a;
        while (nwz.b() >= 10 && nwz.j() != 0) {
            int n;
            int i;
            if (z) {
                n = nwz.n();
            } else {
                n = nwz.m();
            }
            int e = nwz.e();
            if ((e & 1) == 0) {
                i = e;
            } else {
                i = nwz.b;
                System.arraycopy(bArr, i + 4, bArr, i, nwz.b() - 4);
                n -= 4;
                i = e & -2;
                nwz.b(nwz.c - 4);
            }
            if ((i & 2) != 0) {
                int i2 = nwz.b + 1;
                int i3 = i2;
                int i4 = n;
                n = 0;
                while (true) {
                    n++;
                    if (n >= i4) {
                        break;
                    }
                    if ((bArr[i2 - 1] & 255) == 255 && bArr[i2] == (byte) 0) {
                        i2++;
                        i4--;
                    }
                    int i5 = i3 + 1;
                    int i6 = i2 + 1;
                    bArr[i3] = bArr[i2];
                    i3 = i5;
                    i2 = i6;
                }
                nwz.b(nwz.c - (i2 - i3));
                System.arraycopy(bArr, i2, bArr, i3, nwz.b() - i2);
                i &= -3;
                n = i4;
            }
            if (i != e || z) {
                e = nwz.b - 6;
                bArr[e] = (byte) ((n >> 21) & 127);
                bArr[e + 1] = (byte) ((n >> 14) & 127);
                bArr[e + 2] = (byte) ((n >> 7) & 127);
                bArr[e + 3] = (byte) (n & 127);
                bArr[e + 4] = (byte) (i >> 8);
                bArr[e + 5] = (byte) i;
            }
            nwz.d(n);
        }
    }
}
