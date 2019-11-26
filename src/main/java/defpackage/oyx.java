package defpackage;

/* renamed from: oyx */
public final class oyx {
    public byte[] a;
    public int b;
    public int c;
    private int d;

    public oyx() {
        this.a = ozp.f;
    }

    public oyx(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public oyx(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public final void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public final void a(byte[] bArr, int i) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public final int a() {
        return ((this.d - this.b) << 3) - this.c;
    }

    public final int b() {
        return (this.b << 3) + this.c;
    }

    public final int c() {
        oxz.b(this.c == 0);
        return this.b;
    }

    public final void a(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 << 3);
        g();
    }

    public final void d() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        g();
    }

    public final void b(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.c + (i - (i2 << 3));
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        g();
    }

    public final boolean e() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        d();
        return z;
    }

    public final int c(int i) {
        if (i == 0) {
            return 0;
        }
        int i2;
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            i2 -= 8;
            this.c = i2;
            byte[] bArr = this.a;
            int i4 = this.b;
            this.b = i4 + 1;
            i3 |= (bArr[i4] & 255) << i2;
        }
        byte[] bArr2 = this.a;
        int i5 = this.b;
        i = (-1 >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i5 + 1;
        }
        g();
        return i;
    }

    public final void b(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4 = i >> 3;
        for (i2 = 0; i2 < i4; i2++) {
            byte[] bArr2 = this.a;
            int i5 = this.b;
            i3 = i5 + 1;
            this.b = i3;
            byte b = bArr2[i5];
            int i6 = this.c;
            b = (byte) (b << i6);
            bArr[i2] = b;
            bArr[i2] = (byte) (((255 & bArr2[i3]) >> (8 - i6)) | b);
        }
        i &= 7;
        if (i != 0) {
            byte[] bArr3;
            i2 = (byte) (bArr[i4] & (255 >> i));
            bArr[i4] = i2;
            int i7 = this.c;
            if (i7 + i > 8) {
                bArr3 = this.a;
                i3 = this.b;
                this.b = i3 + 1;
                i2 = (byte) (i2 | ((bArr3[i3] & 255) << i7));
                bArr[i4] = i2;
                i7 -= 8;
                this.c = i7;
            }
            i7 += i;
            this.c = i7;
            bArr3 = this.a;
            i3 = this.b;
            bArr[i4] = (byte) (((byte) (((255 & bArr3[i3]) >> (8 - i7)) << (8 - i))) | i2);
            if (i7 == 8) {
                this.c = 0;
                this.b = i3 + 1;
            }
            g();
        }
    }

    public final void f() {
        if (this.c != 0) {
            this.c = 0;
            this.b++;
            g();
        }
    }

    public final void c(byte[] bArr, int i) {
        oxz.b(this.c == 0);
        System.arraycopy(this.a, this.b, bArr, 0, i);
        this.b += i;
        g();
    }

    public final void g() {
        int i = this.b;
        boolean z = false;
        if (i >= 0) {
            int i2 = this.d;
            if (i < i2 || (i == i2 && this.c == 0)) {
                z = true;
            }
        }
        oxz.b(z);
    }
}
