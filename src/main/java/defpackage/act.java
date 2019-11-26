package defpackage;

/* renamed from: act */
final class act {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e = Long.MIN_VALUE;
    public long f = 0;
    public int g = 0;
    public int h = 0;
    public long i = -1;
    public float j;
    public int k;

    act() {
    }

    public final float a(long j) {
        long j2 = this.e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.i;
        if (j3 < 0 || j < j3) {
            return acq.a(((float) (j - j2)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
        }
        float f = this.j;
        return (1.0f - f) + (f * acq.a(((float) (j - j3)) / ((float) this.k), 0.0f, 1.0f));
    }
}
