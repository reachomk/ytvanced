package defpackage;

/* renamed from: bcqw */
final class bcqw extends bcrq {
    private final bcqp c;

    bcqw(bcqp bcqp) {
        super(bcpm.e, 31556952000L);
        this.c = bcqp;
    }

    public final bcpx e() {
        return null;
    }

    public final int a(long j) {
        return this.c.a(j);
    }

    public final long a(long j, int i) {
        if (i == 0) {
            return j;
        }
        int a = a(j);
        int i2 = a + i;
        if ((a ^ i2) >= 0 || (a ^ i) < 0) {
            return b(j, i2);
        }
        StringBuilder stringBuilder = new StringBuilder(61);
        stringBuilder.append("The calculation caused an overflow: ");
        stringBuilder.append(a);
        stringBuilder.append(" + ");
        stringBuilder.append(i);
        throw new ArithmeticException(stringBuilder.toString());
    }

    public final long a(long j, long j2) {
        return a(j, bcrr.a(j2));
    }

    public final long b(long j, int i) {
        bcrr.a(this, i, this.c.M(), this.c.N());
        return this.c.d(j, i);
    }

    public final boolean b(long j) {
        return this.c.c(a(j));
    }

    public final bcpx f() {
        return this.c.c;
    }

    public final int g() {
        return this.c.M();
    }

    public final int h() {
        return this.c.N();
    }

    public final long c(long j) {
        return this.c.b(a(j));
    }

    public final long d(long j) {
        return j - c(j);
    }
}
