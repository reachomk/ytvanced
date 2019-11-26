package defpackage;

/* renamed from: bcrd */
final class bcrd extends bcrm {
    private final bcqp a;

    bcrd(bcpn bcpn, bcqp bcqp) {
        super(bcpn, bcpm.b);
        this.a = bcqp;
    }

    public final int g() {
        return 1;
    }

    public final int a(long j) {
        int a = this.c.a(j);
        return a <= 0 ? 1 - a : a;
    }

    public final long a(long j, int i) {
        return this.c.a(j, i);
    }

    public final long b(long j, int i) {
        bcrr.a(this, i, 1, h());
        if (this.a.a(j) <= 0) {
            i = 1 - i;
        }
        return super.b(j, i);
    }

    public final int h() {
        return this.c.h();
    }

    public final long c(long j) {
        return this.c.c(j);
    }

    public final long d(long j) {
        return this.c.d(j);
    }
}
