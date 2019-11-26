package defpackage;

/* renamed from: bcri */
final class bcri extends bcrn {
    public static final long serialVersionUID = -485345310999208286L;
    private final bcpx b;
    private final boolean c;
    private final bcpt d;

    bcri(bcpx bcpx, bcpt bcpt) {
        super(bcpx.a());
        if (bcpx.b()) {
            this.b = bcpx;
            this.c = bcrg.a(bcpx);
            this.d = bcpt;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean c() {
        boolean z = false;
        if (this.c) {
            z = this.b.c();
        } else if (this.b.c() && this.d.b()) {
            return true;
        }
        return z;
    }

    public final long d() {
        return this.b.d();
    }

    public final long a(long j, int i) {
        int a = a(j);
        j = this.b.a(j + ((long) a), i);
        if (!this.c) {
            a = b(j);
        }
        return j - ((long) a);
    }

    public final long a(long j, long j2) {
        int a = a(j);
        j = this.b.a(j + ((long) a), j2);
        if (!this.c) {
            a = b(j);
        }
        return j - ((long) a);
    }

    private final int a(long j) {
        int b = this.d.b(j);
        long j2 = (long) b;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return b;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    private final int b(long j) {
        int e = this.d.e(j);
        long j2 = (long) e;
        if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
            return e;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }
}
