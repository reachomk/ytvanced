package defpackage;

/* renamed from: ahss */
public final class ahss {
    public static final float[] a = new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f, 0.3127f, 0.329f};
    public static final float[] b = new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f, 0.3127f, 0.329f};
    public static final float[] c = new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f, 0.3127f, 0.329f};
    public final ahtg d;
    public final ahtg e = new ahtg();

    public ahss(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[2];
        float f3 = fArr[4];
        float f4 = fArr[1];
        float f5 = fArr[3];
        float f6 = fArr[5];
        ahtg ahtg = new ahtg(f, f2, f3, f4, f5, f6, (1.0f - f) - f4, (1.0f - f2) - f5, (1.0f - f3) - f6);
        f2 = fArr[6];
        f4 = fArr[7];
        ahtk ahtk = new ahtk(f2 / f4, ((1.0f - f2) - f4) / f4);
        ahtg ahtg2 = new ahtg();
        ahtk ahtk2 = new ahtk();
        ahtg.a(ahtg2);
        float[] fArr2 = ahtg2.a;
        f5 = fArr2[0];
        f6 = ahtk.a;
        float f7 = fArr2[1];
        float f8 = ahtk.b;
        float f9 = fArr2[2];
        float f10 = ahtk.c;
        f5 = ((f5 * f6) + (f7 * f8)) + (f9 * f10);
        f7 = ((fArr2[3] * f6) + (fArr2[4] * f8)) + (fArr2[5] * f10);
        f10 = ((fArr2[6] * f6) + (fArr2[7] * f8)) + (fArr2[8] * f10);
        ahtk2.a = f5;
        ahtk2.b = f7;
        ahtk2.c = f10;
        this.d = new ahtg(f5, 0.0f, 0.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, f10);
        ahtg = this.d;
        ahtg.a(ahtg, ahtg, ahtg);
        this.d.a(this.e);
    }
}
