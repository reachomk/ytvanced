package defpackage;

/* renamed from: ntj */
final class ntj {
    private final byte[] a;
    private final int b;
    private int c;
    private int d;

    public ntj(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.b = length << 3;
    }

    public final boolean a() {
        return a(1) == 1;
    }

    public final int a(int i) {
        int i2 = 0;
        nwf.b(b() + i <= this.b);
        if (i == 0) {
            return 0;
        }
        int i3;
        int i4;
        int i5 = this.d;
        if (i5 != 0) {
            i5 = Math.min(i, 8 - i5);
            byte[] bArr = this.a;
            int i6 = this.c;
            byte b = bArr[i6];
            i3 = this.d;
            i4 = (b >>> i3) & (255 >>> (8 - i5));
            i3 += i5;
            this.d = i3;
            if (i3 == 8) {
                this.c = i6 + 1;
                this.d = 0;
            }
        } else {
            i5 = 0;
            i4 = 0;
        }
        int i7 = i - i5;
        if (i7 > 7) {
            i7 >>= 3;
            while (i2 < i7) {
                byte[] bArr2 = this.a;
                i3 = this.c;
                this.c = i3 + 1;
                i4 = (int) (((((long) bArr2[i3]) & 255) << i5) | ((long) i4));
                i5 += 8;
                i2++;
            }
        }
        if (i <= i5) {
            return i4;
        }
        i -= i5;
        byte b2 = this.a[this.c];
        this.d += i;
        return (((255 >>> (8 - i)) & b2) << i5) | i4;
    }

    public final void b(int i) {
        nwf.b(b() + i <= this.b);
        int i2 = this.c + (i / 8);
        this.c = i2;
        int i3 = this.d + (i % 8);
        this.d = i3;
        if (i3 > 7) {
            this.c = i2 + 1;
            this.d = i3 - 8;
        }
    }

    public final int b() {
        return (this.c << 3) + this.d;
    }
}
