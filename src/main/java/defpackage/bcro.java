package defpackage;

/* renamed from: bcro */
public final class bcro extends bcrm {
    public final int a;
    public final bcpx d;
    private final int e;
    private final int f;

    public bcro(bcpn bcpn, bcpm bcpm) {
        super(bcpn, bcpm);
        bcpx d = bcpn.d();
        if (d == null) {
            this.d = null;
        } else {
            this.d = new bcry(d, bcpm.a());
        }
        this.a = 100;
        int g = bcpn.g();
        if (g < 0) {
            g = ((g + 1) / 100) - 1;
        } else {
            g /= 100;
        }
        int h = bcpn.h();
        if (h < 0) {
            h = ((h + 1) / 100) - 1;
        } else {
            h /= 100;
        }
        this.e = g;
        this.f = h;
    }

    public final int a(long j) {
        int a = this.c.a(j);
        if (a < 0) {
            return ((a + 1) / this.a) - 1;
        }
        return a / this.a;
    }

    public final long a(long j, int i) {
        return this.c.a(j, i * this.a);
    }

    public final long b(long j, int i) {
        bcrr.a(this, i, this.e, this.f);
        int a = this.c.a(j);
        if (a >= 0) {
            a %= this.a;
        } else {
            int i2 = this.a;
            a = ((a + 1) % i2) + (i2 - 1);
        }
        return this.c.b(j, (i * this.a) + a);
    }

    public final bcpx d() {
        return this.d;
    }

    public final int g() {
        return this.e;
    }

    public final int h() {
        return this.f;
    }

    public final long c(long j) {
        bcpn bcpn = this.c;
        return bcpn.c(bcpn.b(j, a(j) * this.a));
    }

    public final long d(long j) {
        return b(j, a(this.c.d(j)));
    }
}
