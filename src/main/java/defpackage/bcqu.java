package defpackage;

/* renamed from: bcqu */
final class bcqu extends bcrx {
    private final bcqp c;

    bcqu(bcqp bcqp, bcpx bcpx) {
        super(bcpm.k, bcpx);
        this.c = bcqp;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 53;
    }

    public final int a(long j) {
        return this.c.c(j);
    }

    public final bcpx e() {
        return this.c.e;
    }

    public final long c(long j) {
        return super.c(j + 259200000) - 259200000;
    }

    public final long d(long j) {
        return super.d(j + 259200000);
    }

    public final int e(long j) {
        return this.c.a(this.c.b(j));
    }

    /* Access modifiers changed, original: protected|final */
    public final int c(long j, int i) {
        return i > 52 ? e(j) : 52;
    }
}
