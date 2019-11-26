package defpackage;

/* renamed from: ahmo */
public final class ahmo {
    public int a = 200;
    private long b;
    private long c;
    private boolean d = false;

    public final void a(boolean z, long j) {
        this.c = j;
        if (this.d != z) {
            long j2 = this.b;
            if (j < j2) {
                this.b = ((((long) this.a) + j) + j) - j2;
            } else {
                this.b = j + ((long) this.a);
            }
        }
        this.d = z;
    }

    public final float a() {
        float f = ((float) (this.b - this.c)) / ((float) this.a);
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        return this.d ? 1.0f - f : f;
    }
}
