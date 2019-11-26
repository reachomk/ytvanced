package defpackage;

/* renamed from: ahtg */
public final class ahtg {
    public final float[] a;

    public ahtg() {
        this.a = new float[9];
    }

    public ahtg(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = new float[9];
        float[] fArr = this.a;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    private final void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float[] fArr = this.a;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    private final float a(int i, int i2) {
        return this.a[(i * 3) + i2];
    }

    public static void a(ahtg ahtg, ahtg ahtg2, ahtg ahtg3) {
        float[] fArr = ahtg.a;
        float f = fArr[0];
        float[] fArr2 = ahtg2.a;
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[3];
        float f5 = fArr[2];
        float f6 = fArr2[6];
        float f7 = fArr2[1];
        float f8 = fArr2[4];
        float f9 = fArr2[7];
        float f10 = fArr2[2];
        float f11 = fArr2[5];
        float f12 = fArr2[8];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        ahtg3.a(((f * f2) + (f3 * f4)) + (f5 * f6), ((f * f7) + (f3 * f8)) + (f5 * f9), ((f * f10) + (f3 * f11)) + (f5 * f12), ((f13 * f2) + (f14 * f4)) + (f15 * f6), ((f13 * f7) + (f14 * f8)) + (f15 * f9), ((f13 * f10) + (f14 * f11)) + (f15 * f12), ((f2 * f16) + (f4 * f17)) + (f6 * f18), ((f7 * f16) + (f8 * f17)) + (f9 * f18), ((f16 * f10) + (f17 * f11)) + (f18 * f12));
    }

    public final boolean a(ahtg ahtg) {
        float a = ((a(0, 0) * ((a(1, 1) * a(2, 2)) - (a(2, 1) * a(1, 2)))) - (a(0, 1) * ((a(1, 0) * a(2, 2)) - (a(1, 2) * a(2, 0))))) + (a(0, 2) * ((a(1, 0) * a(2, 1)) - (a(1, 1) * a(2, 0))));
        if (((double) a) == 0.0d) {
            return false;
        }
        float f = 1.0f / a;
        float[] fArr = this.a;
        float f2 = fArr[4];
        float f3 = fArr[8];
        float f4 = fArr[7];
        float f5 = fArr[5];
        float f6 = fArr[1];
        float f7 = fArr[2];
        float f8 = fArr[3];
        float f9 = fArr[6];
        float f10 = fArr[0];
        ahtg.a(((f2 * f3) - (f4 * f5)) * f, (-((f6 * f3) - (f7 * f4))) * f, ((f6 * f5) - (f7 * f2)) * f, (-((f8 * f3) - (f5 * f9))) * f, ((f3 * f10) - (f7 * f9)) * f, (-((f5 * f10) - (f7 * f8))) * f, ((f8 * f4) - (f9 * f2)) * f, (-((f4 * f10) - (f9 * f6))) * f, ((f10 * f2) - (f8 * f6)) * f);
        return true;
    }
}
