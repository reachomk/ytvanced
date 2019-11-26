package defpackage;

/* renamed from: nuk */
public final class nuk {
    private long a;
    private volatile long b = Long.MIN_VALUE;

    public final void a() {
        this.b = Long.MIN_VALUE;
    }

    public final long a(long j) {
        long j2;
        if (this.b != Long.MIN_VALUE) {
            j2 = (this.b + 4294967296L) / 8589934592L;
            long j3 = ((-1 + j2) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - this.b) < Math.abs(j - this.b)) {
                j = j3;
            }
        }
        j2 = (1000000 * j) / 90000;
        if (this.b == Long.MIN_VALUE) {
            this.a = -j2;
        }
        this.b = j;
        return j2 + this.a;
    }
}
