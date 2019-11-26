package defpackage;

/* renamed from: ahrh */
public final class ahrh {
    public final float[] a;
    public final long b;

    public ahrh(float[] fArr, long j) {
        amqw.a((Object) fArr);
        amqw.a(true);
        this.a = fArr;
        fArr = this.a;
        float a = ahrh.a(fArr);
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = fArr[i] / a;
        }
        this.b = j;
    }

    public final byte[] a() {
        byte[] bArr = new byte[2];
        float[] fArr = new float[2];
        float[] fArr2 = this.a;
        amqw.a(fArr2.length >= 3);
        amqw.a(true);
        r4 = new float[3];
        float abs = (Math.abs(fArr2[0]) + Math.abs(fArr2[1])) + Math.abs(fArr2[2]);
        r4[0] = fArr2[0] / abs;
        r4[1] = (-fArr2[1]) / abs;
        float f = (-fArr2[2]) / abs;
        r4[2] = f;
        double d = (double) f;
        f = 0.0f;
        if (d < 0.0d) {
            float[] fArr3 = new float[2];
            float f2 = 1.0f;
            abs = 1.0f - Math.abs(r4[1]);
            float f3 = r4[0];
            fArr3[0] = abs * (f3 > 0.0f ? 1.0f : -1.0f);
            abs = 1.0f - Math.abs(f3);
            if (r4[1] <= 0.0f) {
                f2 = -1.0f;
            }
            abs *= f2;
            fArr3[1] = abs;
            r4[0] = fArr3[0];
            r4[1] = abs;
        }
        fArr[0] = (r4[0] * 0.5f) + 0.5f;
        fArr[1] = (r4[1] * 0.5f) + 0.5f;
        if (Float.isNaN(fArr[0]) || Float.isNaN(fArr[1])) {
            xtl.d("One or both of the oct16 vectors components is NaN. Setting to zero.");
            fArr[0] = !Float.isNaN(fArr[0]) ? fArr[0] : 0.0f;
            if (!Float.isNaN(fArr[1])) {
                f = fArr[1];
            }
            fArr[1] = f;
        }
        int i = (int) (fArr[0] * 256.0f);
        int i2 = (int) (fArr[1] * 256.0f);
        byte b = (byte) i;
        byte b2 = (byte) i2;
        if (i >= 256) {
            b = (byte) -1;
        }
        if (i2 >= 256) {
            b2 = (byte) -1;
        }
        bArr[0] = b;
        bArr[1] = b2;
        return bArr;
    }

    static float a(float[] fArr, float[] fArr2) {
        amqw.a(fArr.length == fArr2.length);
        float f = 0.0f;
        for (int i = 0; i < fArr.length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    static float a(float[] fArr) {
        return (float) Math.sqrt((double) ahrh.a(fArr, fArr));
    }
}
