package defpackage;

/* renamed from: bcqt */
final class bcqt extends bcrx {
    private final bcqp c;

    bcqt(bcqp bcqp, bcpx bcpx) {
        super(bcpm.f, bcpx);
        this.c = bcqp;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 366;
    }

    public final int a(long j) {
        bcqp bcqp = this.c;
        return bcqp.b(j, bcqp.a(j));
    }

    public final bcpx e() {
        return this.c.g;
    }

    public final int e(long j) {
        return !this.c.c(this.c.a(j)) ? 365 : 366;
    }

    /* Access modifiers changed, original: protected|final */
    public final int c(long j, int i) {
        return (i <= 365 && i > 0) ? 365 : e(j);
    }
}
