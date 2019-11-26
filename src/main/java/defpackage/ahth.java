package defpackage;

/* renamed from: ahth */
public final class ahth {
    public final ahtj a;
    public final ahtj b;
    public float c;

    ahth(float f, float f2, float f3, float f4, int i, float[] fArr) {
        int i2 = 0;
        if (f3 < f4) {
            this.c = 0.0f;
            ahti ahti = new ahti(new float[]{0.0f, 10.0f, Math.max(10.0f, f3)}, new float[]{0.0f, 17.0f, f4});
            this.b = ahti;
            this.a = ahti;
            return;
        }
        float f5 = f * f4;
        this.c = f5;
        f2 *= f4;
        if (i <= 0) {
            this.c = Math.max(f5, 10.0f);
            f = Math.max(f2, 17.0f);
            this.a = new ahti(new float[]{0.0f, 10.0f, this.c}, new float[]{0.0f, 17.0f, f});
            f2 = this.c;
            this.b = new ahtl(new float[]{f2, ((f3 - f2) * 0.5f) + f2, f3}, new float[]{f, f + ((f4 - f2) * 0.75f), f4});
            return;
        }
        this.c = f * f3;
        this.a = new ahti(new float[]{0.0f, r0}, new float[]{0.0f, f2});
        int i3 = i + 2;
        float[] fArr2 = new float[i3];
        float[] fArr3 = new float[i3];
        fArr2[0] = this.c;
        fArr3[0] = f2;
        int i4 = i + 1;
        float f6 = (1.0f - f) / ((float) i4);
        f += f6;
        while (i2 < i) {
            int i5 = i2 + 1;
            fArr2[i5] = f * f3;
            fArr3[i5] = fArr[i2] * f4;
            f += f6;
            i2 = i5;
        }
        fArr2[i4] = f3;
        fArr3[i4] = f4;
        this.b = new ahtl(fArr2, fArr3);
    }
}
