package defpackage;

import java.util.Arrays;

/* renamed from: bbkm */
final class bbkm {
    private static final char[] a;

    static void a(char[] cArr, int i) {
        bbkm.b(cArr, i);
        bbkm.b(cArr, i + 2);
        bbkm.b(cArr, i + 4);
        bbkm.b(cArr, i + 6);
        bbkm.b(cArr, i + 8);
        bbkm.b(cArr, i + 10);
        bbkm.b(cArr, i + 12);
        bbkm.b(cArr, i + 14);
    }

    private static void b(char[] cArr, int i) {
        char[] cArr2 = a;
        cArr[i] = cArr2[0];
        cArr[i + 1] = cArr2[256];
    }

    static {
        String str;
        char[] cArr = new char[512];
        int i = 0;
        while (true) {
            str = "0123456789abcdef";
            if (i >= 256) {
                break;
            }
            cArr[i] = str.charAt(i >>> 4);
            cArr[i | 256] = str.charAt(i & 15);
            i++;
        }
        a = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[str.charAt(i2)] = (byte) i2;
        }
    }
}
