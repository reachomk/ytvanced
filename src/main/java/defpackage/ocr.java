package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ocr */
public final class ocr {
    public static final int[] a = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = new int[]{64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static int a(byte[] bArr) {
        int i;
        int i2;
        byte b = bArr[0];
        if (b != (byte) -2) {
            if (b == (byte) -1) {
                i = (bArr[4] & 7) << 4;
                i2 = bArr[7];
            } else if (b != (byte) 31) {
                i = (bArr[4] & 1) << 6;
                i2 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                i2 = bArr[6];
            }
            i2 &= 60;
            return (((i2 >> 2) | i) + 1) << 5;
        }
        i = (bArr[5] & 1) << 6;
        i2 = bArr[4];
        i2 &= 252;
        return (((i2 >> 2) | i) + 1) << 5;
    }

    public static boolean a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int position = byteBuffer.position();
        byte b = byteBuffer.get(position);
        if (b != (byte) -2) {
            if (b == (byte) -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                i2 = byteBuffer.get(position + 7);
            } else if (b != (byte) 31) {
                i = (byteBuffer.get(position + 4) & 1) << 6;
                i2 = byteBuffer.get(position + 5);
            } else {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                i2 = byteBuffer.get(position + 6);
            }
            i2 &= 60;
            return (((i2 >> 2) | i) + 1) << 5;
        }
        i = (byteBuffer.get(position + 5) & 1) << 6;
        i2 = byteBuffer.get(position + 4);
        i2 &= 252;
        return (((i2 >> 2) | i) + 1) << 5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    public static int b(byte[] r7) {
        /*
        r0 = 0;
        r1 = r7[r0];
        r2 = -2;
        r3 = 7;
        r4 = 6;
        r5 = 1;
        r6 = 4;
        if (r1 == r2) goto L_0x004f;
    L_0x000a:
        r2 = -1;
        if (r1 == r2) goto L_0x0037;
    L_0x000d:
        r2 = 31;
        if (r1 == r2) goto L_0x0026;
    L_0x0011:
        r1 = 5;
        r1 = r7[r1];
        r1 = r1 & 3;
        r1 = r1 << 12;
        r2 = r7[r4];
        r2 = r2 & 255;
        r2 = r2 << r6;
        r1 = r1 | r2;
        r7 = r7[r3];
    L_0x0020:
        r7 = r7 & 240;
        r7 = r7 >> r6;
        r7 = r7 | r1;
        r7 = r7 + r5;
        goto L_0x005e;
    L_0x0026:
        r0 = r7[r4];
        r0 = r0 & 3;
        r0 = r0 << 12;
        r1 = r7[r3];
        r1 = r1 & 255;
        r1 = r1 << r6;
        r0 = r0 | r1;
        r1 = 8;
        r7 = r7[r1];
        goto L_0x0047;
    L_0x0037:
        r0 = r7[r3];
        r0 = r0 & 3;
        r0 = r0 << 12;
        r1 = r7[r4];
        r1 = r1 & 255;
        r1 = r1 << r6;
        r0 = r0 | r1;
        r1 = 9;
        r7 = r7[r1];
    L_0x0047:
        r7 = r7 & 60;
        r7 = r7 >> 2;
        r7 = r7 | r0;
        r7 = r7 + r5;
        r0 = 1;
        goto L_0x005e;
    L_0x004f:
        r1 = r7[r6];
        r1 = r1 & 3;
        r1 = r1 << 12;
        r2 = r7[r3];
        r2 = r2 & 255;
        r2 = r2 << r6;
        r1 = r1 | r2;
        r7 = r7[r4];
        goto L_0x0020;
    L_0x005e:
        if (r0 == 0) goto L_0x0063;
    L_0x0060:
        r7 = r7 << r6;
        r7 = r7 / 14;
    L_0x0063:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocr.b(byte[]):int");
    }
}
