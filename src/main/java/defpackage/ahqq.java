package defpackage;

/* renamed from: ahqq */
public final /* synthetic */ class ahqq implements ahrf {
    private final ahre a;
    private final float b = 2.0f;
    private final ahqr c;
    private final ahre d;
    private final ahre e;

    public ahqq(ahre ahre, ahqr ahqr, ahre ahre2, ahre ahre3) {
        this.a = ahre;
        this.c = ahqr;
        this.d = ahre2;
        this.e = ahre3;
    }

    public final void a(float f, float f2) {
        ahre ahre = this.a;
        float f3 = this.b;
        ahqr ahqr = this.c;
        ahre ahre2 = this.d;
        ahre ahre3 = this.e;
        f *= 0.9f;
        ahre.a(f, 1.0f, 1.0f);
        float f4 = (f + f3) / 2.0f;
        float f5 = f4 - ahqr.i;
        ahre2.b(-f5, 0.0f, 0.0f);
        ahre3.b(f5, 0.0f, 0.0f);
        ahqr.i = f4;
        ahqr.b((f3 + f3) + f, f2);
        float[] fArr = new float[]{f, 1.0f, 1.0f};
        float[] fArr2 = new float[]{f * 1.1f, 1.1f, 1.1f};
        ahpz ahpz = ahqr.f;
        ahpz.a = fArr;
        ahpz.b = fArr2;
        f = ((f * 0.100000024f) + (f3 * 0.100000024f)) / 2.0f;
        ahqr.g.a = new float[]{-f, 0.0f, 0.0f};
        ahqr.h.a = new float[]{f, 0.0f, 0.0f};
    }
}
