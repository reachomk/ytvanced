package defpackage;

import java.io.EOFException;

/* renamed from: ntf */
final class ntf {
    private static final int a = nxf.c("OggS");

    public static int a(byte b, int i) {
        return (b >> 1) & (255 >>> (8 - i));
    }

    public static void a(nrb nrb) {
        int i = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i2;
            nqx nqx = (nqx) nrb;
            long j = nqx.b;
            if (j != -1) {
                long j2 = nqx.c;
                if (((long) i) + j2 > j) {
                    i = (int) (j - j2);
                    if (i < 4) {
                        throw new EOFException();
                    }
                }
            }
            int i3 = 0;
            nrb.b(bArr, 0, i, false);
            while (true) {
                i2 = i - 3;
                if (i3 >= i2) {
                    break;
                } else if (bArr[i3] == (byte) 79 && bArr[i3 + 1] == (byte) 103 && bArr[i3 + 2] == (byte) 103 && bArr[i3 + 3] == (byte) 83) {
                    nrb.a(i3);
                    return;
                } else {
                    i3++;
                }
            }
            nrb.a(i2);
        }
    }

    public static boolean a(nrb nrb, nth nth, nwz nwz, boolean z) {
        nrb nrb2 = nrb;
        nth nth2 = nth;
        nwz nwz2 = nwz;
        nwz.a();
        nth.a();
        long j = ((nqx) nrb2).b;
        int i = 0;
        if ((j != -1 && j - nrb.b() < 27) || !nrb2.b(nwz2.a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (nwz.h() == ((long) a)) {
            int d = nwz.d();
            nth2.a = d;
            if (d == 0) {
                nth2.b = nwz.d();
                byte[] bArr = nwz2.a;
                int i2 = nwz2.b;
                int i3 = i2 + 1;
                nwz2.b = i3;
                byte b = bArr[i2];
                int i4 = i3 + 1;
                nwz2.b = i4;
                byte b2 = bArr[i3];
                int i5 = i4 + 1;
                nwz2.b = i5;
                byte b3 = bArr[i4];
                int i6 = i5 + 1;
                nwz2.b = i6;
                byte b4 = bArr[i5];
                int i7 = i6 + 1;
                nwz2.b = i7;
                byte b5 = bArr[i6];
                int i8 = i7 + 1;
                nwz2.b = i8;
                byte b6 = bArr[i7];
                int i9 = i8 + 1;
                nwz2.b = i9;
                byte b7 = bArr[i8];
                nwz2.b = i9 + 1;
                nth2.c = ((((((((((long) b2) & 255) << 8) | (((long) b) & 255)) | ((((long) b3) & 255) << 16)) | ((((long) b4) & 255) << 24)) | ((((long) b5) & 255) << 32)) | ((((long) b6) & 255) << 40)) | ((((long) b7) & 255) << 48)) | ((((long) bArr[i9]) & 255) << 56);
                nth2.d = nwz.i();
                nth2.e = nwz.i();
                nth2.f = nwz.i();
                nth2.g = nwz.d();
                nwz.a();
                d = nth2.g;
                nth2.h = d + 27;
                nrb2.c(nwz2.a, 0, d);
                while (i < nth2.g) {
                    nth2.j[i] = nwz.d();
                    nth2.i += nth2.j[i];
                    i++;
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new nnc("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new nnc("expected OggS capture pattern at begin of page");
        }
    }

    public static void a(nth nth, int i, nti nti) {
        nti.b = 0;
        nti.a = 0;
        int i2;
        do {
            i2 = nti.b;
            int i3 = i + i2;
            if (i3 < nth.g) {
                int[] iArr = nth.j;
                nti.b = i2 + 1;
                i2 = iArr[i3];
                nti.a += i2;
            } else {
                return;
            }
        } while (i2 == 255);
    }
}
