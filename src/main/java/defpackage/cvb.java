package defpackage;

/* renamed from: cvb */
public final class cvb extends cvd implements cuz {
    private final long e;
    private long f = Long.MIN_VALUE;
    private long g = Long.MIN_VALUE;
    private long h = Long.MIN_VALUE;

    public cvb(int i) {
        this.e = (long) i;
    }

    public final float a(long j) {
        if (this.h == Long.MIN_VALUE) {
            this.f = j;
            this.h = j;
            this.g = j + (this.e * 1000000);
            return 0.0f;
        }
        long j2 = this.g;
        if (j >= j2) {
            this.h = j;
            return 1.0f;
        }
        this.h = j;
        long j3 = this.f;
        return ((float) (j - j3)) / ((float) (j2 - j3));
    }

    public final boolean a() {
        return this.h >= this.g;
    }
}
