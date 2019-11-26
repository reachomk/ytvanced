package defpackage;

/* renamed from: nxa */
public final class nxa {
    public byte[] a;
    public int b;
    public int c;
    private int d;

    public nxa(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public nxa(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
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

    public final void a(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 << 3);
        f();
    }

    public final void b(int i) {
        int i2 = this.b + (i / 8);
        this.b = i2;
        int i3 = this.c + (i % 8);
        this.c = i3;
        if (i3 > 7) {
            this.b = i2 + 1;
            this.c = i3 - 8;
        }
        f();
    }

    public final boolean b() {
        return c(1) == 1;
    }

    public final int c(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3;
        int i4 = i / 8;
        int i5 = 0;
        while (i2 < i4) {
            int i6;
            i3 = this.c;
            if (i3 != 0) {
                byte[] bArr = this.a;
                int i7 = this.b;
                i6 = ((bArr[i7 + 1] & 255) >>> (8 - i3)) | ((bArr[i7] & 255) << i3);
            } else {
                i6 = this.a[this.b];
            }
            i -= 8;
            i5 |= (255 & i6) << i;
            this.b++;
            i2++;
        }
        if (i > 0) {
            i2 = this.c + i;
            byte b = (byte) (255 >> (8 - i));
            byte[] bArr2;
            if (i2 > 8) {
                bArr2 = this.a;
                i3 = this.b;
                int i8 = i3 + 1;
                i = (b & (((bArr2[i8] & 255) >> (16 - i2)) | ((bArr2[i3] & 255) << (i2 - 8)))) | i5;
                this.b = i8;
            } else {
                bArr2 = this.a;
                i3 = this.b;
                i = (b & ((bArr2[i3] & 255) >> (8 - i2))) | i5;
                if (i2 == 8) {
                    this.b = i3 + 1;
                }
            }
            i5 = i;
            this.c = i2 % 8;
        }
        f();
        return i5;
    }

    public final boolean c() {
        int i = this.b;
        int i2 = this.c;
        int i3 = 0;
        while (this.b < this.d && !b()) {
            i3++;
        }
        int i4 = this.b;
        int i5 = this.d;
        this.b = i;
        this.c = i2;
        if (i4 == i5 || a() < (i3 + i3) + 1) {
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

    private final void f() {
        int i = this.b;
        boolean z = false;
        if (i >= 0) {
            int i2 = this.c;
            if (i2 >= 0 && i2 < 8) {
                int i3 = this.d;
                if (i < i3 || (i == i3 && i2 == 0)) {
                    z = true;
                }
            }
        }
        nwf.b(z);
    }
}
