package defpackage;

import java.nio.charset.Charset;

/* renamed from: oza */
public final class oza {
    public byte[] a;
    public int b;
    public int c;

    public oza() {
        this.a = ozp.f;
    }

    public oza(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public oza(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public oza(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
    }

    public final void a(int i) {
        a(c() >= i ? this.a : new byte[i], i);
    }

    public final void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public final void a(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final int b() {
        return this.c - this.b;
    }

    public final void b(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        oxz.a(z);
        this.c = i;
    }

    public final int c() {
        return this.a.length;
    }

    public final void c(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        oxz.a(z);
        this.b = i;
    }

    public final void d(int i) {
        c(this.b + i);
    }

    public final void a(oyx oyx, int i) {
        a(oyx.a, 0, i);
        oyx.a(0);
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final int d() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int e() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    public final int f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    public final short g() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (b & 255));
    }

    public final int h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        this.b = i3 + 1;
        return (bArr[i3] & 255) | (((b & 255) << 16) | ((b2 & 255) << 8));
    }

    public final long i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24)) | ((((long) b3) & 255) << 8)) | (((long) bArr[i4]) & 255);
    }

    public final long j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((((((long) b2) & 255) << 8) | (((long) b) & 255)) | ((((long) b3) & 255) << 16)) | ((((long) bArr[i4]) & 255) << 24);
    }

    public final int k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return (bArr[i4] & 255) | ((((b & 255) << 24) | ((b2 & 255) << 16)) | ((b3 & 255) << 8));
    }

    public final int l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (((b & 255) | ((b2 & 255) << 8)) | ((b3 & 255) << 16));
    }

    public final long m() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.b = i8;
        byte b7 = bArr[i7];
        this.b = i8 + 1;
        return ((((((((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56)) | ((((long) b3) & 255) << 40)) | ((((long) b4) & 255) << 32)) | ((((long) b5) & 255) << 24)) | ((((long) b6) & 255) << 16)) | ((((long) b7) & 255) << 8)) | (((long) bArr[i8]) & 255);
    }

    public final int n() {
        return (((d() << 21) | (d() << 14)) | (d() << 7)) | d();
    }

    public final int o() {
        int k = k();
        if (k >= 0) {
            return k;
        }
        StringBuilder stringBuilder = new StringBuilder(29);
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(k);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final int p() {
        int l = l();
        if (l >= 0) {
            return l;
        }
        StringBuilder stringBuilder = new StringBuilder(29);
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(l);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final long q() {
        long m = m();
        if (m >= 0) {
            return m;
        }
        StringBuilder stringBuilder = new StringBuilder(38);
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(m);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final String e(int i) {
        return a(i, Charset.forName("UTF-8"));
    }

    public final String a(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final String f(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        i3 = (i3 >= this.c || this.a[i3] != (byte) 0) ? i : i - 1;
        String a = ozp.a(this.a, i2, i3);
        this.b += i;
        return a;
    }

    public final String r() {
        if (b() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != (byte) 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String a = ozp.a(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return a;
    }

    public final String s() {
        if (b() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && !ozp.a(this.a[i])) {
            i++;
        }
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == (byte) -17 && bArr[i2 + 1] == (byte) -69 && bArr[i2 + 2] == (byte) -65) {
                i2 += 3;
                this.b = i2;
            }
        }
        String a = ozp.a(this.a, i2, i - i2);
        this.b = i;
        int i3 = this.c;
        if (i != i3) {
            byte[] bArr2 = this.a;
            if (bArr2[i] == (byte) 13) {
                i++;
                this.b = i;
                if (i == i3) {
                    return a;
                }
            }
            if (bArr2[i] == (byte) 10) {
                this.b = i + 1;
            }
        }
        return a;
    }
}
