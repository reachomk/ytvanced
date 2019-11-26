package defpackage;

/* renamed from: ahsm */
public final class ahsm {
    public static final float[] a = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] b = new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    public static final float[] c = new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    public final ahso d;
    public final ahso e;
    public final int f;
    public final int g;

    public ahsm(float[] fArr, float[] fArr2, int i) {
        amqw.a((Object) fArr);
        amqw.a((Object) fArr2);
        int length = fArr.length;
        boolean z = false;
        amqw.a(length % 3 == 0);
        int length2 = fArr2.length;
        amqw.a(((length2 & 1) ^ 1) != 0);
        length /= 3;
        if (length == (length2 >> 1)) {
            z = true;
        }
        amqw.a(z);
        this.f = length;
        this.g = i;
        this.d = new ahso(fArr, 3);
        this.e = new ahso(fArr2, 2);
    }

    public final void a() {
        this.d.a();
        this.e.a();
    }

    public static ahsm a(float f) {
        float[] fArr = new float[9600];
        float[] fArr2 = new float[6400];
        int i = 0;
        while (true) {
            int i2 = 40;
            if (i >= 40) {
                return new ahsm(fArr, fArr2, 5);
            }
            float f2 = ((float) i) / 40.0f;
            int i3 = i + 1;
            float f3 = ((float) i3) / 40.0f;
            float f4 = 3.1415927f;
            double d = (double) (f2 * 3.1415927f);
            float sin = ((float) Math.sin(d)) * f;
            double d2 = (double) (f3 * 3.1415927f);
            float sin2 = ((float) Math.sin(d2)) * f;
            float cos = ((float) Math.cos(d)) * f;
            float cos2 = ((float) Math.cos(d2)) * f;
            int i4 = i * 240;
            i *= 160;
            int i5 = 0;
            while (i5 < i2) {
                float f5 = ((float) i5) / 39.0f;
                int i6 = i5 + i5;
                int i7 = i4 + (i6 * 3);
                int i8 = i6 + 1;
                int i9 = i4 + (i8 * 3);
                int i10 = i3;
                double d3 = (double) ((f5 + f5) * f4);
                float f6 = f2;
                fArr[i7] = ((float) Math.sin(d3)) * sin;
                fArr[i9] = ((float) Math.sin(d3)) * sin2;
                fArr[i7 + 1] = cos;
                fArr[i9 + 1] = cos2;
                fArr[i7 + 2] = ((float) Math.cos(d3)) * sin;
                fArr[i9 + 2] = ((float) Math.cos(d3)) * sin2;
                i6 = i + (i6 + i6);
                i8 = i + (i8 + i8);
                f2 = 1.0f - f5;
                fArr2[i6] = f2;
                fArr2[i8] = f2;
                fArr2[i6 + 1] = 1.0f - f6;
                fArr2[i8 + 1] = 1.0f - f3;
                i5++;
                i3 = i10;
                f2 = f6;
                i2 = 40;
                f4 = 3.1415927f;
            }
            i = i3;
        }
    }

    public static ahsm a(float f, float f2, float f3) {
        float f4 = f;
        amqw.a(f4 > 0.0f);
        amqw.a(true);
        amqw.a(true);
        float[] fArr = new float[47880];
        float[] fArr2 = new float[31920];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < 399) {
            int i4 = i + 1;
            float f5 = ((float) i) / 399.0f;
            double d = (double) ((f5 - 8.0f) * f3);
            float f6 = -f4;
            float cos = ((float) Math.cos(d)) * f6;
            float f7 = ((float) i4) / 399.0f;
            double d2 = (double) ((-0.5f + f7) * f3);
            int i5 = i2;
            int i6 = i3;
            float cos2 = ((float) Math.cos(d2)) * f6;
            float sin = ((float) Math.sin(d)) * f6;
            f6 *= (float) Math.sin(d2);
            int i7 = i5;
            i5 = 0;
            while (i5 <= 19) {
                int i8;
                int i9;
                float f8 = (i % 2 == 0 ? (float) i5 : (float) (19 - i5)) / 19.0f;
                int i10 = i7 + 1;
                fArr2[i7] = f8;
                i7 = i10 + 1;
                fArr2[i10] = 1.0f - f5;
                i10 = i7 + 1;
                fArr2[i7] = f8;
                i7 = i10 + 1;
                fArr2[i10] = 1.0f - f7;
                double d3 = (double) ((0.5f - f8) * f2);
                float f9 = f5;
                int i11 = i4;
                f5 = ((float) Math.sin(d3)) * cos;
                float f10 = f7;
                float cos3 = (float) Math.cos(d3);
                if (i == 0) {
                    i8 = i6 + 1;
                    fArr[i6] = f5;
                    i9 = i8 + 1;
                    fArr[i8] = sin;
                    i8 = i9 + 1;
                    fArr[i9] = cos * cos3;
                    i9 = i8;
                } else {
                    i9 = i6 + 1;
                    i8 = ((i5 << 2) + 1) * 3;
                    fArr[i6] = fArr[i6 - i8];
                    i6 = i9 + 1;
                    fArr[i9] = fArr[i9 - i8];
                    i9 = i6 + 1;
                    fArr[i6] = fArr[i6 - i8];
                }
                i8 = i9 + 1;
                fArr[i9] = ((float) Math.sin(d3)) * cos2;
                i9 = i8 + 1;
                fArr[i8] = f6;
                i6 = i9 + 1;
                fArr[i9] = cos3 * cos2;
                i5++;
                i4 = i11;
                f5 = f9;
                f7 = f10;
            }
            i2 = i7;
            i = i4;
            i3 = i6;
        }
        return new ahsm(fArr, fArr2, 5);
    }

    public static ahsm a(float f, float[] fArr) {
        float f2 = f;
        amqw.a(true);
        amqw.a(true);
        float[] fArr2 = new float[1041];
        float f3 = f2 + f2;
        fArr2[0] = 0.0f;
        fArr2[1] = fArr[8];
        fArr2[2] = f3;
        fArr2[3] = f3;
        fArr2[4] = fArr[8];
        fArr2[5] = 0.0f;
        float f4 = -f3;
        fArr2[6] = f4;
        fArr2[7] = fArr[8];
        fArr2[8] = 0.0f;
        fArr2[9] = 0.0f;
        fArr2[10] = fArr[8];
        fArr2[11] = f4;
        fArr2[12] = 0.0f;
        fArr2[13] = fArr[8];
        fArr2[14] = f4;
        fArr2[15] = 0.0f;
        fArr2[16] = fArr[0];
        fArr2[17] = f4;
        fArr2[18] = 0.0f;
        fArr2[19] = fArr[0];
        fArr2[20] = f4;
        fArr2[21] = 0.0f;
        fArr2[22] = fArr[0];
        fArr2[23] = f4;
        fArr2[24] = f3;
        fArr2[25] = fArr[0];
        fArr2[26] = 0.0f;
        fArr2[27] = f4;
        fArr2[28] = fArr[0];
        fArr2[29] = 0.0f;
        fArr2[30] = 0.0f;
        fArr2[31] = fArr[0];
        fArr2[32] = f3;
        for (int i = 0; i < 21; i++) {
            float f5 = ((float) i) / 20.0f;
            double d = (double) f2;
            double d2 = (double) ((f5 + f5) * 3.1415927f);
            double sin = Math.sin(d2);
            Double.isNaN(d);
            float f6 = (float) (d * sin);
            d2 = Math.cos(d2);
            Double.isNaN(d);
            f5 = (float) (d * d2);
            int i2 = 0;
            while (i2 < 8) {
                int i3 = (((i2 * 21) + i) * 6) + 33;
                int i4 = i3 + 1;
                fArr2[i3] = f6;
                i3 = i4 + 1;
                fArr2[i4] = fArr[i2];
                i4 = i3 + 1;
                fArr2[i3] = f5;
                i3 = i4 + 1;
                fArr2[i4] = f6;
                i2++;
                fArr2[i3] = fArr[i2];
                fArr2[i3 + 1] = f5;
            }
        }
        return new ahsm(fArr2, new float[694], 5);
    }

    public static ahsm b(float f) {
        float[] fArr = new float[66];
        for (int i = 1; i < 21; i++) {
            float f2 = ((float) i) / 20.0f;
            int i2 = i * 3;
            int i3 = i2 + 1;
            double d = (double) f;
            double d2 = (double) ((f2 + f2) * 3.1415927f);
            double sin = Math.sin(d2);
            Double.isNaN(d);
            fArr[i2] = (float) (sin * d);
            double cos = Math.cos(d2);
            Double.isNaN(d);
            fArr[i3] = (float) (d * cos);
            fArr[i3 + 1] = 0.0f;
        }
        System.arraycopy(fArr, 3, fArr, 63, 3);
        return new ahsm(fArr, new float[44], 6);
    }

    public static float[] a(float[] fArr) {
        int i;
        int i2;
        float[] fArr2 = new float[1388];
        int i3 = 0;
        for (i = 0; i < 6; i++) {
            System.arraycopy(fArr, 32, fArr2, i << 2, 4);
        }
        for (i = 0; i < 5; i++) {
            System.arraycopy(fArr, 0, fArr2, (i + 6) << 2, 4);
        }
        i = 0;
        while (true) {
            i2 = 44;
            if (i >= 21) {
                break;
            }
            System.arraycopy(fArr, 0, fArr2, (i << 3) + 44, 4);
            i++;
        }
        for (i = 1; i < 8; i++) {
            int i4;
            for (i4 = 0; i4 < 21; i4++) {
                System.arraycopy(fArr, i << 2, fArr2, ((i4 << 3) + i2) + 4, 4);
            }
            i2 += 168;
            for (i4 = 0; i4 < 21; i4++) {
                System.arraycopy(fArr, i << 2, fArr2, (i4 << 3) + i2, 4);
            }
        }
        while (i3 < 21) {
            System.arraycopy(fArr, 32, fArr2, ((i3 << 3) + i2) + 4, 4);
            i3++;
        }
        return fArr2;
    }

    private static float[] a(float[] fArr, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        float[] fArr2 = new float[(((i6 + i6) * (i5 + 1)) * i4)];
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            int i9 = i8;
            i8 = 0;
            while (i8 <= i5) {
                int i10 = i9;
                i9 = 0;
                while (i9 < 2) {
                    float f = ((float) i8) / ((float) i5);
                    float f2 = (((float) i7) + ((float) i9)) / ((float) i6);
                    if (i7 % 2 == 1) {
                        f = 1.0f - f;
                    }
                    int i11 = i10;
                    for (i10 = 0; i10 < i4; i10++) {
                        float f3 = 1.0f - f;
                        float f4 = 1.0f - f2;
                        fArr2[i11] = ((((fArr[i10] * f3) * f4) + ((fArr[i4 + i10] * f3) * f2)) + ((fArr[(i4 + i4) + i10] * f) * f4)) + ((fArr[(i4 * 3) + i10] * f) * f2);
                        i11++;
                    }
                    i9++;
                    i10 = i11;
                }
                i8++;
                i9 = i10;
            }
            i7++;
            i8 = i9;
        }
        return fArr2;
    }

    public static ahsm a(float f, float f2, float[] fArr) {
        int max;
        int i;
        if (f > f2) {
            max = (int) Math.max(1.0f, (10.0f / f) * f2);
            i = 10;
        } else {
            i = (int) Math.max(1.0f, (10.0f / f2) * f);
            max = 10;
        }
        f /= 2.0f;
        f2 /= 2.0f;
        r3 = new float[12];
        float f3 = -f;
        r3[0] = f3;
        float f4 = -f2;
        r3[1] = f4;
        r3[2] = 0.0f;
        r3[3] = f3;
        r3[4] = f2;
        r3[5] = 0.0f;
        r3[6] = f;
        r3[7] = f4;
        r3[8] = 0.0f;
        r3[9] = f;
        r3[10] = f2;
        r3[11] = 0.0f;
        return new ahsm(ahsm.a(r3, 3, i, max), ahsm.a(fArr, 2, i, max), 5);
    }

    public static ahsm a(float f, float f2) {
        f /= 2.0f;
        f2 /= 2.0f;
        return new ahsm(new float[]{f, f2, 0.0f, 0.0f, -f2, 0.0f, -f, f2, 0.0f}, new float[]{1.0f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f}, 5);
    }
}
