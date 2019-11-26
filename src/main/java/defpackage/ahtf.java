package defpackage;

/* renamed from: ahtf */
public final class ahtf {
    public final byte[] a;

    public ahtf(int i, ahte ahte) {
        int i2;
        double d;
        int i3;
        double d2;
        int i4 = i;
        ahte ahte2 = ahte;
        this.a = new byte[(i4 + i4)];
        double d3 = (double) (i4 - 1);
        int i5 = 0;
        double d4 = 0.0d;
        int i6 = 0;
        while (true) {
            i2 = i4 >> 2;
            d = 65279.0d;
            if (i5 >= i2) {
                break;
            }
            d4 = ahte2.a(i5, d3) * 65279.0d;
            byte[] bArr = this.a;
            i3 = i6 + 1;
            bArr[i6] = (byte) ((int) (d4 / 256.0d));
            i6 = i3 + 1;
            bArr[i3] = (byte) ((int) (d4 % 256.0d));
            i5++;
        }
        i2 += 3;
        while (i2 < i4) {
            double a = ((ahte2.a(i2, d3) * d) - d4) / 4.0d;
            d4 += a;
            byte[] bArr2 = this.a;
            int i7 = i6 + 1;
            bArr2[i6] = (byte) ((int) (d4 / 256.0d));
            i6 = i7 + 1;
            bArr2[i7] = (byte) ((int) (d4 % 256.0d));
            d4 += a;
            i3 = i6 + 1;
            d2 = d3;
            bArr2[i6] = (byte) ((int) (d4 / 256.0d));
            int i8 = i3 + 1;
            bArr2[i3] = (byte) ((int) (d4 % 256.0d));
            d4 += a;
            int i9 = i8 + 1;
            bArr2[i8] = (byte) ((int) (d4 / 256.0d));
            i8 = i9 + 1;
            bArr2[i9] = (byte) ((int) (d4 % 256.0d));
            d4 += a;
            i9 = i8 + 1;
            bArr2[i8] = (byte) ((int) (d4 / 256.0d));
            i6 = i9 + 1;
            bArr2[i9] = (byte) ((int) (d4 % 256.0d));
            i2 += 4;
            ahte2 = ahte;
            d3 = d2;
            d = 65279.0d;
        }
        d2 = d3;
        for (i2 -= 3; i2 < i4; i2++) {
            double a2 = ahte.a(i2, d2) * 65279.0d;
            byte[] bArr3 = this.a;
            int i10 = i6 + 1;
            bArr3[i6] = (byte) ((int) (a2 / 256.0d));
            i6 = i10 + 1;
            bArr3[i10] = (byte) ((int) (a2 % 256.0d));
        }
    }
}
