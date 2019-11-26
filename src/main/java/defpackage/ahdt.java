package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* renamed from: ahdt */
final class ahdt implements ahdr, Serializable {
    private static final int[] a = new int[]{1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private final byte[] k = new byte[64];
    private final boolean l;

    ahdt(boolean z) {
        a();
        this.l = z;
    }

    private static int a(int i, int i2) {
        int i3 = (1 << i2) - 1;
        return ((i & (i3 ^ -1)) >>> i2) | ((i & i3) << (32 - i2));
    }

    public final void a() {
        this.b = 1779033703;
        this.c = -1150833019;
        this.d = 1013904242;
        this.e = -1521486534;
        this.f = 1359893119;
        this.g = -1694144372;
        this.h = 528734635;
        this.i = 1541459225;
        this.j = 0;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.j == 0 && i2 > 0) {
            System.arraycopy(ahdp.a, 0, this.k, 0, ahdp.a.length);
            this.j = ahdp.a.length;
        }
        int i3 = i2;
        while (i3 > 0) {
            int i4 = this.j % 64;
            int min = Math.min(64 - i4, i3);
            System.arraycopy(bArr, (i + i2) - i3, this.k, i4, min);
            this.j += min;
            i3 -= min;
            if (i4 + min == 64) {
                int i5;
                int a;
                int i6;
                int[] iArr = new int[a.length];
                ByteBuffer wrap = ByteBuffer.wrap(this.k);
                int i7 = 0;
                while (true) {
                    i5 = 16;
                    if (i7 >= 16) {
                        break;
                    }
                    iArr[i7] = wrap.getInt();
                    i7++;
                }
                while (i5 < 64) {
                    min = i5 - 15;
                    i7 = ahdt.a(iArr[min], 7);
                    a = ahdt.a(iArr[min], 18);
                    min = iArr[min];
                    i6 = i5 - 2;
                    min >>>= 3;
                    iArr[i5] = ((iArr[i5 - 16] + (min ^ (i7 ^ a))) + iArr[i5 - 7]) + ((ahdt.a(iArr[i6], 17) ^ ahdt.a(iArr[i6], 19)) ^ (iArr[i6] >>> 10));
                    i5++;
                }
                min = this.b;
                i7 = this.c;
                i5 = this.d;
                a = this.e;
                i6 = this.f;
                int i8 = this.g;
                int i9 = this.h;
                int i10 = this.i;
                int i11 = i9;
                i9 = i8;
                i8 = i6;
                i6 = a;
                a = i5;
                i5 = i7;
                i7 = min;
                min = 0;
                while (min < 64) {
                    i10 = (((i10 + ((ahdt.a(i8, 11) ^ ahdt.a(i8, 6)) ^ ahdt.a(i8, 25))) + ((i8 & i9) ^ ((i8 ^ -1) & i11))) + a[min]) + iArr[min];
                    int i12 = i6 + i10;
                    i6 = (((ahdt.a(i7, 2) ^ ahdt.a(i7, 13)) ^ ahdt.a(i7, 22)) + (((i7 & i5) ^ (i7 & a)) ^ (i5 & a))) + i10;
                    min++;
                    i10 = i11;
                    i11 = i9;
                    i9 = i8;
                    i8 = i12;
                    int i13 = i5;
                    i5 = i7;
                    i7 = i6;
                    i6 = a;
                    a = i13;
                }
                this.b += i7;
                this.c += i5;
                this.d += a;
                this.e += i6;
                this.f += i8;
                this.g += i9;
                this.h += i11;
                this.i += i10;
            }
        }
    }

    public final int b() {
        int i = this.j;
        return i > 0 ? i - ahdp.a.length : 0;
    }

    public final byte[] c() {
        int i = 64 - (this.j % 64);
        if (i < 9) {
            i += 64;
        }
        byte[] bArr = new byte[i];
        bArr[0] = Byte.MIN_VALUE;
        int length = bArr.length;
        ByteBuffer.wrap(bArr).putLong(length - 8, (long) (this.j << 3));
        a(bArr, 0, length);
        if (this.l) {
            bArr = new byte[10];
            ByteBuffer.wrap(bArr).putInt(this.b).putInt(this.c).putShort((short) (this.d >> 16));
            return bArr;
        }
        bArr = new byte[32];
        ByteBuffer.wrap(bArr).putInt(this.b).putInt(this.c).putInt(this.d).putInt(this.e).putInt(this.f).putInt(this.g).putInt(this.h).putInt(this.i);
        return bArr;
    }
}
