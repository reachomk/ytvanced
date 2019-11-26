package defpackage;

/* renamed from: bcqx */
final class bcqx extends bcrq {
    private final bcqp c;

    bcqx(bcqp bcqp) {
        super(bcpm.j, 31556952000L);
        this.c = bcqp;
    }

    public final bcpx e() {
        return null;
    }

    public final int a(long j) {
        return this.c.b(j);
    }

    public final long a(long j, int i) {
        return i != 0 ? b(j, a(j) + i) : j;
    }

    public final long a(long j, long j2) {
        return a(j, bcrr.a(j2));
    }

    public final long b(long j, int i) {
        bcrr.a(this, Math.abs(i), this.c.M(), this.c.N());
        int a = a(j);
        if (a == i) {
            return j;
        }
        int d = bcqp.d(j);
        a = this.c.a(a);
        int a2 = this.c.a(i);
        if (a2 < a) {
            a = a2;
        }
        a2 = this.c.c(j);
        if (a2 <= a) {
            a = a2;
        }
        j = this.c.d(j, i);
        a2 = a(j);
        if (a2 < i) {
            j += 604800000;
        } else if (a2 > i) {
            j -= 604800000;
        }
        return this.c.i.b(j + (((long) (a - this.c.c(j))) * 604800000), d);
    }

    public final boolean b(long j) {
        bcqp bcqp = this.c;
        return bcqp.a(bcqp.b(j)) > 52;
    }

    public final bcpx f() {
        return this.c.d;
    }

    public final int g() {
        return this.c.M();
    }

    public final int h() {
        return this.c.N();
    }

    public final long c(long j) {
        j = this.c.k.c(j);
        int c = this.c.c(j);
        return c > 1 ? j - (((long) (c - 1)) * 604800000) : j;
    }

    public final long d(long j) {
        return j - c(j);
    }
}
