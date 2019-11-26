package defpackage;

/* renamed from: oin */
final class oin {
    public int a;
    public int b;
    private final byte[] c;
    private final int d;

    public oin(byte[] bArr) {
        this.c = bArr;
        this.d = bArr.length;
    }

    public final boolean a() {
        byte b = this.c[this.a];
        int i = this.b;
        b(1);
        if ((((b & 255) >> i) & 1) == 0) {
            return false;
        }
        return true;
    }

    public final int a(int i) {
        int i2 = this.a;
        int min = Math.min(i, 8 - this.b);
        int i3 = i2 + 1;
        i2 = ((this.c[i2] & 255) >> this.b) & (255 >> (8 - min));
        while (min < i) {
            i2 |= (this.c[i3] & 255) << min;
            min += 8;
            i3++;
        }
        b(i);
        return (-1 >>> (32 - i)) & i2;
    }

    public final void b(int i) {
        int i2 = i / 8;
        int i3 = this.a + i2;
        this.a = i3;
        int i4 = this.b + (i - (i2 << 3));
        this.b = i4;
        if (i4 > 7) {
            i3++;
            this.a = i3;
            i4 -= 8;
            this.b = i4;
        }
        boolean z = false;
        if (i3 >= 0) {
            int i5 = this.d;
            if (i3 < i5 || (i3 == i5 && i4 == 0)) {
                z = true;
            }
        }
        oxz.b(z);
    }
}
