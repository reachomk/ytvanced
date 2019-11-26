package defpackage;

import android.opengl.Matrix;

/* renamed from: ahou */
public final class ahou {
    public final ahpn a;
    public float b;
    public float c;
    private final float[] d = new float[16];
    private final float[] e = new float[16];
    private final float[][] f = new float[6][];

    public ahou(ahpn ahpn, float f, float f2) {
        this.a = ahpn;
        a(f, f2);
        for (int i = 0; i < 6; i++) {
            this.f[i] = new float[4];
        }
    }

    public final void a(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final ahox a(ahnj ahnj) {
        amqw.a((Object) ahnj);
        float f = 0.0f;
        if (this.b == 0.0f || this.c == 0.0f) {
            return new ahox(this, new ahow(new float[]{0.0f, 0.0f}, 2));
        }
        Matrix.multiplyMM(this.e, 0, ahnj.a, 0, this.a.a, 0);
        Matrix.invertM(this.d, 0, this.e, 0);
        float[] fArr = this.f[0];
        fArr[2] = -1.0f;
        ahow ahow = new ahow(fArr, 4);
        ahow ahow2 = new ahow(this.f[1], 4);
        float[] fArr2 = this.d;
        if (ahow.b == 4) {
            Matrix.multiplyMV(ahow2.a, 0, fArr2, 0, ahow.a, 0);
            float[] fArr3 = this.f[2];
            float[] fArr4 = this.d;
            fArr3[0] = -fArr4[12];
            fArr3[1] = -fArr4[13];
            fArr3[2] = -fArr4[14];
            ahow ahow3 = new ahow(fArr3, 4);
            float a = ahow2.a(ahow);
            if (a != 0.0f) {
                f = ahow3.a(ahow) / a;
            }
            ahow = new ahow(this.f[3], 4);
            fArr3 = ahow.a;
            for (int i = 0; i < ahow2.b; i++) {
                fArr3[i] = ahow2.a[i] * f;
            }
            System.arraycopy(this.d, 12, this.f[4], 0, 3);
            ahow2 = new ahow(this.f[4], 4);
            ahow ahow4 = new ahow(this.f[5], 4);
            for (int i2 = 0; i2 < ahow.b; i2++) {
                ahow4.a[i2] = ahow.a[i2] + ahow2.a[i2];
            }
            r0 = new float[2];
            float[] fArr5 = ahow4.a;
            r0[0] = fArr5[0];
            r0[1] = fArr5[1];
            return new ahox(this, new ahow(r0, 2));
        }
        throw new RuntimeException("Cannot be multiplied by matrix unless the vector size is 4");
    }
}
