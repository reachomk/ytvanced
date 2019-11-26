package defpackage;

/* renamed from: nsd */
final class nsd implements nsb {
    private final long a;
    private final long b;
    private final long c;
    private final long[] d;
    private final long e;
    private final int g;

    public nsd(long j, long j2, long j3) {
        this(j, j2, j3, null, 0, 0);
    }

    public nsd(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
        this.e = j4;
        this.g = i;
    }

    public final boolean a() {
        return this.d != null;
    }

    public final long b(long j) {
        if (!a()) {
            return this.a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.b);
        float f2 = 256.0f;
        float f3 = 0.0f;
        if (f <= 0.0f) {
            f2 = 0.0f;
        } else if (f < 100.0f) {
            int i = (int) f;
            if (i != 0) {
                f3 = (float) this.d[i - 1];
            }
            if (i < 99) {
                f2 = (float) this.d[i];
            }
            f2 = ((f2 - f3) * (f - ((float) i))) + f3;
        }
        j = this.e;
        double d = (double) f2;
        Double.isNaN(d);
        d *= 0.00390625d;
        double d2 = (double) j;
        Double.isNaN(d2);
        j = Math.round(d * d2);
        long j2 = this.a;
        j += j2;
        long j3 = this.c;
        return Math.min(j, j3 == -1 ? ((j2 - ((long) this.g)) + this.e) - 1 : j3 - 1);
    }

    public final long a(long j) {
        long j2 = 0;
        if (a()) {
            long j3 = this.a;
            if (j >= j3) {
                double d = (double) (j - j3);
                Double.isNaN(d);
                d *= 256.0d;
                double d2 = (double) this.e;
                Double.isNaN(d2);
                d /= d2;
                int a = nxf.a(this.d, (long) d, false) + 1;
                j3 = a(a);
                long j4 = a != 0 ? this.d[a - 1] : 0;
                long j5 = a != 99 ? this.d[a] : 256;
                long a2 = a(a + 1);
                if (j5 != j4) {
                    double d3 = (double) (a2 - j3);
                    double d4 = (double) j4;
                    Double.isNaN(d4);
                    d -= d4;
                    Double.isNaN(d3);
                    d3 *= d;
                    d = (double) (j5 - j4);
                    Double.isNaN(d);
                    j2 = (long) (d3 / d);
                }
                return j3 + j2;
            }
        }
        return 0;
    }

    public final long b() {
        return this.b;
    }

    private final long a(int i) {
        return (this.b * ((long) i)) / 100;
    }
}
