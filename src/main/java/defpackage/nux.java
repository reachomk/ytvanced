package defpackage;

/* renamed from: nux */
final class nux {
    public final nwz a = new nwz(8);
    public int b;

    public final long a(nrb nrb) {
        int i = 0;
        nrb.c(this.a.a, 0, 1);
        int i2 = this.a.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        i2 &= i3 ^ -1;
        nrb.c(this.a.a, 1, i4);
        while (i < i4) {
            i++;
            i2 = (this.a.a[i] & 255) + (i2 << 8);
        }
        this.b += i4 + 1;
        return (long) i2;
    }
}
