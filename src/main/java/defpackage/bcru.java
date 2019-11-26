package defpackage;

/* renamed from: bcru */
public class bcru extends bcrx {
    private final int c;
    private final bcpx d;

    public bcru(bcpm bcpm, bcpx bcpx, bcpx bcpx2) {
        super(bcpm, bcpx);
        if (bcpx2.c()) {
            int d = (int) (bcpx2.d() / this.a);
            this.c = d;
            if (d >= 2) {
                this.d = bcpx2;
                return;
            }
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        throw new IllegalArgumentException("Range duration field must be precise");
    }

    public final int a(long j) {
        if (j >= 0) {
            return (int) ((j / this.a) % ((long) this.c));
        }
        int i = this.c;
        return (i - 1) + ((int) (((j + 1) / this.a) % ((long) i)));
    }

    public final long b(long j, int i) {
        bcrr.a(this, i, g(), h());
        return j + (((long) (i - a(j))) * this.a);
    }

    public final bcpx e() {
        return this.d;
    }

    public final int h() {
        return this.c - 1;
    }
}
