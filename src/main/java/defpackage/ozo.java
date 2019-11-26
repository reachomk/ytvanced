package defpackage;

/* renamed from: ozo */
public final class ozo {
    public long a;
    public long b;
    public volatile long c = -9223372036854775807L;

    public ozo(long j) {
        a(j);
    }

    public final synchronized void a(long j) {
        oxz.b(this.c == -9223372036854775807L);
        this.a = j;
    }

    public final long a() {
        long j = -9223372036854775807L;
        if (this.a == Long.MAX_VALUE) {
            j = 0;
        } else if (this.c != -9223372036854775807L) {
            return this.b;
        }
        return j;
    }

    public final void b() {
        this.c = -9223372036854775807L;
    }

    public final long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c != -9223372036854775807L) {
            long j2 = (this.c * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((-1 + j3) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return c((j * 1000000) / 90000);
    }

    public final long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c != -9223372036854775807L) {
            this.c = j;
        } else {
            long j2 = this.a;
            if (j2 != Long.MAX_VALUE) {
                this.b = j2 - j;
            }
            synchronized (this) {
                this.c = j;
                notifyAll();
            }
        }
        return j + this.b;
    }
}
