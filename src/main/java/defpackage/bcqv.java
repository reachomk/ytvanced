package defpackage;

/* renamed from: bcqv */
class bcqv extends bcrq {
    private final bcqp c;
    private final int d = 12;
    private final int e = 2;

    bcqv(bcqp bcqp) {
        super(bcpm.g, 2629746000L);
        this.c = bcqp;
    }

    public final int g() {
        return 1;
    }

    public final int a(long j) {
        bcqp bcqp = this.c;
        return bcqp.a(j, bcqp.a(j));
    }

    public final long a(long j, int i) {
        if (i == 0) {
            return j;
        }
        int i2;
        long e = (long) bcqp.e(j);
        int a = this.c.a(j);
        int a2 = this.c.a(j, a);
        int i3 = (a2 - 1) + i;
        int i4;
        if (i3 >= 0) {
            i4 = this.d;
            i2 = (i3 / i4) + a;
            i3 = (i3 % i4) + 1;
        } else {
            i2 = ((i3 / this.d) + a) - 1;
            i3 = Math.abs(i3);
            i4 = this.d;
            i3 %= i4;
            if (i3 == 0) {
                i3 = i4;
            }
            i3 = (i4 - i3) + 1;
            if (i3 == 1) {
                i2++;
            }
        }
        int a3 = this.c.a(j, a, a2);
        int a4 = this.c.a(i2, i3);
        if (a3 > a4) {
            a3 = a4;
        }
        return this.c.a(i2, i3, a3) + e;
    }

    public final long a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        int i = (int) j4;
        if (((long) i) == j4) {
            return a(j3, i);
        }
        long j5;
        int i2;
        long e = (long) bcqp.e(j);
        int a = this.c.a(j3);
        int a2 = this.c.a(j3, a);
        long j6 = ((long) (a2 - 1)) + j4;
        if (j6 >= 0) {
            long j7 = (long) this.d;
            j5 = ((long) a) + (j6 / j7);
            j6 = (j6 % j7) + 1;
        } else {
            j5 = -1 + (((long) a) + (j6 / ((long) this.d)));
            j6 = Math.abs(j6);
            int i3 = this.d;
            i2 = (int) (j6 % ((long) i3));
            if (i2 == 0) {
                i2 = i3;
            }
            j6 = (long) ((i3 - i2) + 1);
            if (j6 == 1) {
                j5++;
            }
        }
        this.c.M();
        if (j5 >= -292275054) {
            this.c.N();
            if (j5 <= 292278993) {
                i2 = (int) j5;
                int i4 = (int) j6;
                int a3 = this.c.a(j3, a, a2);
                int a4 = this.c.a(i2, i4);
                if (a3 > a4) {
                    a3 = a4;
                }
                return this.c.a(i2, i4, a3) + e;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(58);
        stringBuilder.append("Magnitude of add amount is too large: ");
        stringBuilder.append(j2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final long b(long j, int i) {
        bcrr.a(this, i, 1, this.d);
        int a = this.c.a(j);
        bcqp bcqp = this.c;
        int a2 = bcqp.a(j, a, bcqp.a(j, a));
        int a3 = this.c.a(a, i);
        if (a2 > a3) {
            a2 = a3;
        }
        return this.c.a(a, i, a2) + ((long) bcqp.e(j));
    }

    public final bcpx e() {
        return this.c.g;
    }

    public final boolean b(long j) {
        int a = this.c.a(j);
        if (this.c.c(a) && this.c.a(j, a) == this.e) {
            return true;
        }
        return false;
    }

    public final bcpx f() {
        return this.c.c;
    }

    public final int h() {
        return this.d;
    }

    public final long c(long j) {
        int a = this.c.a(j);
        int a2 = this.c.a(j, a);
        bcqp bcqp = this.c;
        return bcqp.b(a) + bcqp.b(a, a2);
    }

    public final long d(long j) {
        return j - c(j);
    }
}
