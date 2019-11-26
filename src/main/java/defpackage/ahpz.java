package defpackage;

/* renamed from: ahpz */
public final class ahpz implements ahmr {
    public float[] a;
    public float[] b;
    private final ahpy c;
    private final ahmo d = new ahmo();

    public ahpz(ahpy ahpy, float[] fArr, float[] fArr2) {
        this.c = ahpy;
        this.a = fArr;
        this.b = fArr2;
    }

    public static float[] a(float f) {
        return new float[]{f, f, f};
    }

    public final void a(boolean z, long j) {
        this.d.a(z, j);
        float a = this.d.a();
        ahpy ahpy = this.c;
        float[] fArr = this.b;
        float f = fArr[0];
        float f2 = 1.0f - a;
        float[] fArr2 = this.a;
        ahpy.a((f * a) + (fArr2[0] * f2), (fArr[1] * a) + (fArr2[1] * f2), (a * fArr[2]) + (f2 * fArr2[2]));
    }
}
