package defpackage;

import android.util.Pair;

/* renamed from: oyd */
public final class oyd {
    public static final byte[] a = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
    private static final int[] b = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair a(byte[] bArr) {
        return oyd.a(new oyx(bArr), false);
    }

    public static byte[] a(int i, int i2) {
        return new byte[]{(byte) (((i >> 1) & 7) | 16), (byte) (((i << 7) & 128) | ((i2 << 3) & 120))};
    }

    public static Pair a(oyx oyx, boolean z) {
        int c;
        int a = oyd.a(oyx);
        int b = oyd.b(oyx);
        int c2 = oyx.c(4);
        if (a == 5 || a == 29) {
            b = oyd.b(oyx);
            a = oyd.a(oyx);
            if (a == 22) {
                c2 = oyx.c(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(a == 1 || a == 2 || a == 3 || a == 4 || a == 6 || a == 7 || a == 17)) {
                switch (a) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder(42);
                        stringBuilder.append("Unsupported audio object type: ");
                        stringBuilder.append(a);
                        throw new oae(stringBuilder.toString());
                }
            }
            oyx.b(1);
            if (oyx.e()) {
                oyx.b(14);
            }
            boolean e = oyx.e();
            if (c2 != 0) {
                if (a == 6 || a == 20) {
                    oyx.b(3);
                }
                if (e) {
                    if (a == 22) {
                        oyx.b(16);
                    }
                    if (a == 17 || a == 19 || a == 20 || a == 23) {
                        oyx.b(3);
                    }
                    oyx.b(1);
                }
                switch (a) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        c = oyx.c(2);
                        if (c == 2 || c == 3) {
                            StringBuilder stringBuilder2 = new StringBuilder(33);
                            stringBuilder2.append("Unsupported epConfig: ");
                            stringBuilder2.append(c);
                            throw new oae(stringBuilder2.toString());
                        }
                }
            }
            throw new UnsupportedOperationException();
        }
        c = c[c2];
        if (c == -1) {
            z2 = false;
        }
        oxz.a(z2);
        return Pair.create(Integer.valueOf(b), Integer.valueOf(c));
    }

    public static String a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    private static int a(oyx oyx) {
        int c = oyx.c(5);
        return c == 31 ? oyx.c(6) + 32 : c;
    }

    private static int b(oyx oyx) {
        int c = oyx.c(4);
        if (c == 15) {
            return oyx.c(24);
        }
        oxz.a(c < 13);
        return b[c];
    }
}
