package defpackage;

/* renamed from: oyz */
public final class oyz {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public oyz(byte[] bArr, int i, int i2) {
        a(bArr, i, i2);
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        this.d = 0;
        f();
    }

    public final void a() {
        int i = 1;
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            i2 = this.c;
            if (d(i2 + 1)) {
                i = 2;
            }
            this.c = i2 + i;
        }
        f();
    }

    public final void a(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 << 3));
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                f();
                return;
            } else if (d(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }

    public final boolean b(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 << 3);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        boolean z = true;
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.b) {
                i2 = this.b;
            } else if (d(i2)) {
                i4++;
                i2 += 2;
            }
        }
        i2 = this.b;
        if (i4 >= i2) {
            if (i4 == i2) {
                return i5 == 0 ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final boolean b() {
        boolean z = (this.a[this.c] & (128 >> this.d)) != 0;
        a();
        return z;
    }

    public final int c(int i) {
        int i2;
        int i3;
        this.d += i;
        int i4 = 0;
        while (true) {
            i2 = this.d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            i2 -= 8;
            this.d = i2;
            byte[] bArr = this.a;
            int i5 = this.c;
            i4 |= (bArr[i5] & 255) << i2;
            if (!d(i5 + 1)) {
                i3 = 1;
            }
            this.c = i5 + i3;
        }
        byte[] bArr2 = this.a;
        int i6 = this.c;
        i = (-1 >>> (32 - i)) & (i4 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            if (!d(i6 + 1)) {
                i3 = 1;
            }
            this.c = i6 + i3;
        }
        f();
        return i;
    }

    public final boolean c() {
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.b && !b()) {
            i3++;
        }
        int i4 = this.c;
        int i5 = this.b;
        this.c = i;
        this.d = i2;
        if (i4 == i5 || !b((i3 + i3) + 1)) {
            return false;
        }
        return true;
    }

    public final int d() {
        int e = e();
        return (e % 2 == 0 ? -1 : 1) * ((e + 1) / 2);
    }

    public final int e() {
        int i = 0;
        int i2 = 0;
        while (!b()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = c(i2);
        }
        return i3 + i;
    }

    private final boolean d(int i) {
        if (i >= 2 && i < this.b) {
            byte[] bArr = this.a;
            if (bArr[i] == (byte) 3 && bArr[i - 2] == (byte) 0 && bArr[i - 1] == (byte) 0) {
                return true;
            }
        }
        return false;
    }

    private final void f() {
        int i = this.c;
        boolean z = false;
        if (i >= 0) {
            int i2 = this.b;
            if (i < i2 || (i == i2 && this.d == 0)) {
                z = true;
            }
        }
        oxz.b(z);
    }
}
