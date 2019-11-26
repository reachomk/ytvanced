package defpackage;

/* renamed from: ofi */
public class ofi implements ofu {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public ofi(long j, long j2, int i, int i2) {
        this.a = j;
        this.b = j2;
        if (i2 == -1) {
            i2 = 1;
        }
        this.c = i2;
        this.e = i;
        if (j == -1) {
            this.d = -1;
            this.f = -9223372036854775807L;
            return;
        }
        this.d = j - j2;
        this.f = ofi.a(j, j2, i);
    }

    public final boolean aS_() {
        return this.d != -1;
    }

    public final ofx a(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            return new ofx(new ofz(0, this.b));
        }
        long j3 = (long) this.c;
        long a = this.b + ozp.a((((((long) this.e) * j) / 8000000) / j3) * j3, 0, j2 - j3);
        j2 = a_(a);
        ofz ofz = new ofz(j2, a);
        if (j2 < j) {
            a += (long) this.c;
            if (a < this.a) {
                return new ofx(ofz, new ofz(a_(a), a));
            }
        }
        return new ofx(ofz);
    }

    public final long b() {
        return this.f;
    }

    public final long a_(long j) {
        return ofi.a(j, this.b, this.e);
    }

    private static long a(long j, long j2, int i) {
        return (Math.max(0, j - j2) * 8000000) / ((long) i);
    }
}
