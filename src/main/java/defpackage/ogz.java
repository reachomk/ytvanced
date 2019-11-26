package defpackage;

/* renamed from: ogz */
final class ogz implements ogx {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    public ogz(long j, int i, long j2) {
        this(j, i, j2, -1, null);
    }

    public ogz(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        long j4 = -1;
        if (j3 != -1) {
            j4 = j + j3;
        }
        this.e = j4;
    }

    public final boolean aS_() {
        return this.f != null;
    }

    public final ofx a(long j) {
        if (!aS_()) {
            return new ofx(new ofz(0, this.a + ((long) this.b)));
        }
        j = ozp.a(j, 0, this.c);
        double d = (double) j;
        Double.isNaN(d);
        d *= 100.0d;
        double d2 = (double) this.c;
        Double.isNaN(d2);
        d /= d2;
        d2 = 0.0d;
        if (d > 0.0d) {
            if (d < 100.0d) {
                int i = (int) d;
                long[] jArr = (long[]) oxz.a(this.f);
                d2 = (double) jArr[i];
                double d3 = i != 99 ? (double) jArr[i + 1] : 256.0d;
                double d4 = (double) i;
                Double.isNaN(d4);
                d -= d4;
                Double.isNaN(d2);
                d *= d3 - d2;
                Double.isNaN(d2);
                d2 += d;
            } else {
                d2 = 256.0d;
            }
        }
        d2 /= 256.0d;
        d = (double) this.d;
        Double.isNaN(d);
        return new ofx(new ofz(j, this.a + ozp.a(Math.round(d2 * d), (long) this.b, this.d - 1)));
    }

    public final long b(long j) {
        j -= this.a;
        if (!aS_() || j <= ((long) this.b)) {
            return 0;
        }
        double d;
        long[] jArr = (long[]) oxz.a(this.f);
        double d2 = (double) j;
        Double.isNaN(d2);
        d2 *= 256.0d;
        double d3 = (double) this.d;
        Double.isNaN(d3);
        d2 /= d3;
        int a = ozp.a(jArr, (long) d2, true);
        long a2 = a(a);
        long j2 = jArr[a];
        int i = a + 1;
        long a3 = a(i);
        long j3 = a != 99 ? jArr[i] : 256;
        if (j2 != j3) {
            d = (double) j2;
            Double.isNaN(d);
            d2 -= d;
            d = (double) (j3 - j2);
            Double.isNaN(d);
            d2 /= d;
        } else {
            d2 = 0.0d;
        }
        d = (double) (a3 - a2);
        Double.isNaN(d);
        return a2 + Math.round(d2 * d);
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.e;
    }

    private final long a(int i) {
        return (this.c * ((long) i)) / 100;
    }
}
