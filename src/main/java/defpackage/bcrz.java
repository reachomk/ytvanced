package defpackage;

/* renamed from: bcrz */
public final class bcrz extends bcrm {
    private final int a;
    private final bcpx d;

    public bcrz(bcpn bcpn, bcpm bcpm) {
        super(bcpn, bcpm);
        bcpx d = bcpn.d();
        if (d == null) {
            this.d = null;
        } else {
            this.d = new bcry(d, bcpm.b());
        }
        this.a = 100;
    }

    public final int g() {
        return 0;
    }

    public bcrz(bcro bcro) {
        this(bcro, bcro.b);
    }

    public bcrz(bcro bcro, bcpm bcpm) {
        super(bcro.c, bcpm);
        this.a = bcro.a;
        this.d = bcro.d;
    }

    public final int a(long j) {
        int a = this.c.a(j);
        if (a >= 0) {
            return a % this.a;
        }
        int i = this.a;
        return (i - 1) + ((a + 1) % i);
    }

    public final long b(long j, int i) {
        bcrr.a(this, i, 0, this.a - 1);
        int a = this.c.a(j);
        if (a < 0) {
            a = ((a + 1) / this.a) - 1;
        } else {
            a /= this.a;
        }
        return this.c.b(j, (a * this.a) + i);
    }

    public final bcpx e() {
        return this.d;
    }

    public final int h() {
        return this.a - 1;
    }

    public final long c(long j) {
        return this.c.c(j);
    }

    public final long d(long j) {
        return this.c.d(j);
    }
}
