package defpackage;

import java.nio.ByteBuffer;

/* renamed from: nwg */
public final class nwg {
    private static final int[] a = new int[]{1, 2, 3, 6};
    private static final int[] b = new int[]{48000, 44100, 32000};
    private static final int[] c = new int[]{24000, 22050, 16000};
    private static final int[] d = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a() {
        return 1536;
    }

    public static nmx a(nwz nwz, String str, long j, String str2) {
        int i = b[(nwz.d() & 192) >> 6];
        int d = nwz.d();
        int i2 = d[(d & 56) >> 3];
        if ((d & 4) != 0) {
            i2++;
        }
        return nmx.a(str, "audio/ac3", -1, -1, j, i2, i, null, str2);
    }

    public static nmx b(nwz nwz, String str, long j, String str2) {
        nwz nwz2 = nwz;
        nwz.d(2);
        int i = b[(nwz.d() & 192) >> 6];
        int d = nwz.d();
        int i2 = d[(d & 14) >> 1];
        if ((d & 1) != 0) {
            i2++;
        }
        return nmx.a(str, "audio/eac3", -1, -1, j, i2, i, null, str2);
    }

    public static nmx a(nxa nxa) {
        nxa.b(32);
        int c = nxa.c(2);
        nxa.b(14);
        int c2 = nxa.c(3);
        if (!((c2 & 1) == 0 || c2 == 1)) {
            nxa.b(2);
        }
        if ((c2 & 4) != 0) {
            nxa.b(2);
        }
        if (c2 == 2) {
            nxa.b(2);
        }
        return nmx.a(null, "audio/ac3", -1, -1, -1, d[c2] + nxa.b(), b[c], null, null);
    }

    public static nmx b(nxa nxa) {
        int i;
        nxa.b(32);
        int c = nxa.c(2);
        if (c == 3) {
            i = c[nxa.c(2)];
        } else {
            nxa.b(2);
            i = b[c];
        }
        int i2 = i;
        i = nxa.c(3);
        return nmx.a(null, "audio/eac3", -1, -1, -1, d[i] + nxa.b(), i2, null, null);
    }

    public static int a(byte[] bArr) {
        byte b = bArr[4];
        int i = b & 63;
        int i2 = b[(b & 192) >> 6];
        if (i2 == 44100) {
            i2 = f[i >> 1] + (i & 1);
            return i2 + i2;
        }
        i = e[i >> 1];
        return i2 != 32000 ? i << 2 : i * 6;
    }

    public static int b(byte[] bArr) {
        int i = (((bArr[2] & 7) << 8) + (bArr[3] & 255)) + 1;
        return i + i;
    }

    public static int c(byte[] bArr) {
        int i = 6;
        if (((bArr[4] & 192) >> 6) != 3) {
            i = a[(bArr[4] & 48) >> 4];
        }
        return i << 8;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i << 8;
    }
}
