package defpackage;

/* renamed from: off */
public final class off {
    public final long a;
    public final long b;
    public long c = 0;
    public long d;
    public long e;
    public long f;
    public long g;
    private final long h;

    protected static long a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return ozp.a(((j4 + j7) - j6) - (j7 / 20), j4, -1 + j5);
    }

    protected off(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        long j6 = j2;
        this.b = j6;
        long j7 = j3;
        this.d = j7;
        this.e = 0;
        long j8 = j4;
        this.f = j8;
        long j9 = j5;
        this.h = j9;
        this.g = off.a(j6, 0, j7, 0, j8, j9);
    }

    public final void a() {
        this.g = off.a(this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
