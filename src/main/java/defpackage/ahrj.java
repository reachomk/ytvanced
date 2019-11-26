package defpackage;

/* renamed from: ahrj */
public final class ahrj implements ahmr {
    public float[] a;
    private final ahqb b;
    private final ahmo c = new ahmo();
    private final float[] d;

    public ahrj(ahqb ahqb, float[] fArr, float[] fArr2) {
        this.b = (ahqb) amqw.a((Object) ahqb);
        this.d = fArr;
        this.a = fArr2;
    }

    public final void a(boolean z, long j) {
        float a = this.c.a();
        this.c.a(z, j);
        float a2 = this.c.a() - a;
        ahqb ahqb = this.b;
        float[] fArr = this.a;
        float f = fArr[0];
        float f2 = 1.0f - a2;
        float[] fArr2 = this.d;
        ahqb.b((f * a2) + (fArr2[0] * f2), (fArr[1] * a2) + (fArr2[1] * f2), (a2 * fArr[2]) + (f2 * fArr2[2]));
    }
}
