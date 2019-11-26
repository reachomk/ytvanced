package defpackage;

/* renamed from: bcqq */
final class bcqq extends bcrx {
    private final bcqp c;

    bcqq(bcqp bcqp, bcpx bcpx) {
        super(bcpm.h, bcpx);
        this.c = bcqp;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 31;
    }

    public final int a(long j) {
        bcqp bcqp = this.c;
        int a = bcqp.a(j);
        return bcqp.a(j, a, bcqp.a(j, a));
    }

    public final bcpx e() {
        return this.c.f;
    }

    public final int e(long j) {
        return this.c.f(j);
    }

    /* Access modifiers changed, original: protected|final */
    public final int c(long j, int i) {
        return this.c.c(j, i);
    }
}
