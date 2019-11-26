package defpackage;

/* renamed from: ahti */
public final class ahti extends ahtj {
    private final float[] a;
    private final float[] b;
    private final float[] c;

    public ahti(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        if (length == fArr2.length) {
            length--;
            this.c = new float[length];
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                this.c[i] = (fArr2[i2] - fArr2[i]) / (fArr[i2] - fArr[i]);
                i = i2;
            }
            this.a = fArr;
            this.b = fArr2;
            return;
        }
        throw new IllegalArgumentException("There must be at least two control points and the arrays must be of equal length.");
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
                        return this.b[i] + (this.c[i] * (f - fArr2[i]));
                    }
                    if (f == f2) {
                        return this.b[i2];
                    }
                    i = i2;
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
        stringBuilder.append("LinearSpline{[");
        for (int i = 0; i < length; i++) {
            String str = ", ";
            if (i != 0) {
                stringBuilder.append(str);
            }
            stringBuilder.append("(");
            stringBuilder.append(this.a[i]);
            stringBuilder.append(str);
            stringBuilder.append(this.b[i]);
            if (i < length - 1) {
                stringBuilder.append(": ");
                stringBuilder.append(this.c[i]);
            }
            stringBuilder.append(")");
        }
        stringBuilder.append("]}");
        return stringBuilder.toString();
    }
}
