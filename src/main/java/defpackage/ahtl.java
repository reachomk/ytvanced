package defpackage;

/* renamed from: ahtl */
public final class ahtl extends ahtj {
    private final float[] a;
    private final float[] b;
    private final float[] c;

    public ahtl(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        if (length != fArr2.length || length < 2) {
            throw new IllegalArgumentException("There must be at least two control points and the arrays must be of equal length.");
        }
        int i;
        float f;
        int i2 = length - 1;
        float[] fArr3 = new float[i2];
        float[] fArr4 = new float[length];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            i = i4 + 1;
            f = fArr[i] - fArr[i4];
            if (f > 0.0f) {
                fArr3[i4] = (fArr2[i] - fArr2[i4]) / f;
                i4 = i;
            } else {
                throw new IllegalArgumentException("The control points must all have strictly increasing X values.");
            }
        }
        fArr4[0] = fArr3[0];
        for (i4 = 1; i4 < i2; i4++) {
            fArr4[i4] = (fArr3[i4 - 1] + fArr3[i4]) * 0.5f;
        }
        fArr4[i2] = fArr3[length - 2];
        while (i3 < i2) {
            float f2 = fArr3[i3];
            if (f2 == 0.0f) {
                fArr4[i3] = 0.0f;
                fArr4[i3 + 1] = 0.0f;
            } else {
                float f3 = fArr4[i3] / f2;
                i = i3 + 1;
                f = fArr4[i] / f2;
                if (f3 < 0.0f || f < 0.0f) {
                    throw new IllegalArgumentException("The control points must have monotonic Y values.");
                }
                f2 = (float) Math.hypot((double) f3, (double) f);
                if (f2 > 3.0f) {
                    f3 = 3.0f / f2;
                    fArr4[i3] = fArr4[i3] * f3;
                    fArr4[i] = fArr4[i] * f3;
                }
            }
            i3++;
        }
        this.a = fArr;
        this.b = fArr2;
        this.c = fArr4;
    }

    public final float a(float f) {
        int length = this.a.length;
        if (!Float.isNaN(f)) {
            float[] fArr = this.a;
            int i = 0;
            if (f > fArr[0]) {
                length--;
                if (f >= fArr[length]) {
                    return this.b[length];
                }
                while (true) {
                    float[] fArr2 = this.a;
                    int i2 = i + 1;
                    float f2 = fArr2[i2];
                    if (f < f2) {
                        float f3 = fArr2[i];
                        f2 -= f3;
                        f = (f - f3) / f2;
                        fArr2 = this.b;
                        float f4 = fArr2[i];
                        float f5 = f + f;
                        float[] fArr3 = this.c;
                        float f6 = 1.0f - f;
                        return ((((f4 * (1.0f + f5)) + ((fArr3[i] * f2) * f)) * f6) * f6) + ((((fArr2[i2] * (3.0f - f5)) + ((f2 * fArr3[i2]) * (-1.0f + f))) * f) * f);
                    } else if (f == f2) {
                        return this.b[i2];
                    } else {
                        i = i2;
                    }
                }
            } else {
                f = this.b[0];
            }
        }
        return f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int length = this.a.length;
        stringBuilder.append("MonotoneCubicSpline{[");
        for (int i = 0; i < length; i++) {
            String str = ", ";
            if (i != 0) {
                stringBuilder.append(str);
            }
            stringBuilder.append("(");
            stringBuilder.append(this.a[i]);
            stringBuilder.append(str);
            stringBuilder.append(this.b[i]);
            stringBuilder.append(": ");
            stringBuilder.append(this.c[i]);
            stringBuilder.append(")");
        }
        stringBuilder.append("]}");
        return stringBuilder.toString();
    }
}
