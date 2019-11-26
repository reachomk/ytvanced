package defpackage;

import java.nio.ByteBuffer;

/* renamed from: obg */
public final class obg {
    private static final int[] a = new int[]{2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static nzw a(oza oza, String str, String str2, odq odq) {
        oza.d(1);
        return nzw.a(str, "audio/ac4", -1, -1, 2, ((oza.d() & 32) >> 5) == 0 ? 44100 : 48000, null, odq, str2);
    }

    /* JADX WARNING: Missing block: B:36:0x0089, code skipped:
            if (r9 != 11) goto L_0x009a;
     */
    /* JADX WARNING: Missing block: B:38:0x008f, code skipped:
            if (r9 == 11) goto L_0x0098;
     */
    /* JADX WARNING: Missing block: B:40:0x0095, code skipped:
            if (r9 == 8) goto L_0x0098;
     */
    public static defpackage.obf a(defpackage.oyx r9) {
        /*
        r0 = 16;
        r1 = r9.c(r0);
        r0 = r9.c(r0);
        r2 = 4;
        r3 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r0 != r3) goto L_0x0018;
    L_0x0010:
        r0 = 24;
        r0 = r9.c(r0);
        r3 = 7;
        goto L_0x0019;
    L_0x0018:
        r3 = 4;
    L_0x0019:
        r0 = r0 + r3;
        r3 = 44097; // 0xac41 float:6.1793E-41 double:2.1787E-319;
        if (r1 != r3) goto L_0x0021;
    L_0x001f:
        r0 = r0 + 2;
    L_0x0021:
        r1 = 2;
        r3 = r9.c(r1);
        r4 = 3;
        if (r3 != r4) goto L_0x0032;
    L_0x0029:
        r9.c(r1);
        r3 = r9.e();
        if (r3 != 0) goto L_0x0029;
    L_0x0032:
        r3 = 10;
        r3 = r9.c(r3);
        r5 = r9.e();
        if (r5 == 0) goto L_0x0047;
    L_0x003e:
        r5 = r9.c(r4);
        if (r5 <= 0) goto L_0x0047;
    L_0x0044:
        r9.b(r1);
    L_0x0047:
        r5 = r9.e();
        r6 = 44100; // 0xac44 float:6.1797E-41 double:2.17883E-319;
        r7 = 48000; // 0xbb80 float:6.7262E-41 double:2.3715E-319;
        if (r5 != 0) goto L_0x0057;
    L_0x0053:
        r5 = 44100; // 0xac44 float:6.1797E-41 double:2.17883E-319;
        goto L_0x005a;
    L_0x0057:
        r5 = 48000; // 0xbb80 float:6.7262E-41 double:2.3715E-319;
    L_0x005a:
        r9 = r9.c(r2);
        r8 = 0;
        if (r5 != r6) goto L_0x006a;
    L_0x0061:
        r6 = 13;
        if (r9 != r6) goto L_0x006a;
    L_0x0065:
        r9 = a;
        r8 = r9[r6];
        goto L_0x009a;
    L_0x006a:
        if (r5 == r7) goto L_0x006d;
    L_0x006c:
        goto L_0x009a;
    L_0x006d:
        r6 = a;
        r7 = r6.length;
        if (r9 >= r7) goto L_0x009a;
    L_0x0072:
        r8 = r6[r9];
        r3 = r3 % 5;
        r6 = 8;
        r7 = 1;
        if (r3 == r7) goto L_0x0092;
    L_0x007b:
        r7 = 11;
        if (r3 == r1) goto L_0x008c;
    L_0x007f:
        if (r3 == r4) goto L_0x0092;
    L_0x0081:
        if (r3 == r2) goto L_0x0084;
    L_0x0083:
        goto L_0x009a;
    L_0x0084:
        if (r9 != r4) goto L_0x0087;
    L_0x0086:
        goto L_0x0098;
    L_0x0087:
        if (r9 == r6) goto L_0x0098;
    L_0x0089:
        if (r9 == r7) goto L_0x0098;
    L_0x008b:
        goto L_0x009a;
    L_0x008c:
        if (r9 != r6) goto L_0x008f;
    L_0x008e:
        goto L_0x0098;
    L_0x008f:
        if (r9 == r7) goto L_0x0098;
    L_0x0091:
        goto L_0x009a;
    L_0x0092:
        if (r9 != r4) goto L_0x0095;
    L_0x0094:
        goto L_0x0098;
    L_0x0095:
        if (r9 == r6) goto L_0x0098;
    L_0x0097:
        goto L_0x009a;
    L_0x0098:
        r8 = r8 + 1;
    L_0x009a:
        r9 = new obf;
        r9.<init>(r5, r0, r8);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obg.a(oyx):obf");
    }

    public static int a(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = (((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8)) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    public static int a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return obg.a(new oyx(bArr)).c;
    }

    public static void a(int i, oza oza) {
        oza.a(7);
        byte[] bArr = oza.a;
        bArr[0] = (byte) -84;
        bArr[1] = (byte) 64;
        bArr[2] = (byte) -1;
        bArr[3] = (byte) -1;
        bArr[4] = (byte) (i >> 16);
        bArr[5] = (byte) (i >> 8);
        bArr[6] = (byte) i;
    }
}
