package defpackage;

import android.util.Pair;

/* renamed from: nwh */
public final class nwh {
    public static final byte[] a = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
    private static final int[] b = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair a(byte[] bArr) {
        nxa nxa = new nxa(bArr);
        int c = nxa.c(5);
        int c2 = nxa.c(4);
        boolean z = true;
        if (c2 == 15) {
            c2 = nxa.c(24);
        } else {
            nwf.a(c2 < 13);
            c2 = b[c2];
        }
        int c3 = nxa.c(4);
        if (c == 5 || c == 29) {
            c = nxa.c(4);
            if (c == 15) {
                c = nxa.c(24);
            } else {
                nwf.a(c < 13);
                c = b[c];
            }
            c2 = c;
            if (nxa.c(5) == 22) {
                c3 = nxa.c(4);
            }
        }
        int i = c[c3];
        if (i == -1) {
            z = false;
        }
        nwf.a(z);
        return Pair.create(Integer.valueOf(c2), Integer.valueOf(i));
    }

    public static byte[] a(int i, int i2) {
        return new byte[]{(byte) (((i >> 1) & 7) | 16), (byte) (((i << 7) & 128) | ((i2 << 3) & 120))};
    }
}
