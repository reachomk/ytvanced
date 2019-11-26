package defpackage;

/* renamed from: bcrx */
public abstract class bcrx extends bcrk {
    public final long a;
    private final bcpx c;

    public bcrx(bcpm bcpm, bcpx bcpx) {
        super(bcpm);
        if (bcpx.c()) {
            long d = bcpx.d();
            this.a = d;
            if (d >= 1) {
                this.c = bcpx;
                return;
            }
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        throw new IllegalArgumentException("Unit duration field must be precise");
    }

    public int g() {
        return 0;
    }

    public long b(long j, int i) {
        bcrr.a(this, i, g(), c(j, i));
        return j + (((long) (i - a(j))) * this.a);
    }

    public long c(long j) {
        long j2;
        if (j < 0) {
            j++;
            j2 = this.a;
            j -= j % j2;
        } else {
            j2 = j % this.a;
        }
        return j - j2;
    }

    public long d(long j) {
        if (j >= 0) {
            return j % this.a;
        }
        long j2 = this.a;
        return (((j + 1) % j2) + j2) - 1;
    }

    public final bcpx d() {
        return this.c;
    }

    /* Access modifiers changed, original: protected */
    public int c(long j, int i) {
        return e(j);
    }
}
