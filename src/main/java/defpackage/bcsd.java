package defpackage;

/* renamed from: bcsd */
public final class bcsd extends bcrm {
    public bcsd(bcpn bcpn, bcpm bcpm) {
        super(bcpn, bcpm);
        if (bcpn.g() != 0) {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        }
    }

    public final int g() {
        return 1;
    }

    public final int a(long j) {
        int a = this.c.a(j);
        return a == 0 ? h() : a;
    }

    public final long a(long j, int i) {
        return this.c.a(j, i);
    }

    public final long b(long j, int i) {
        int h = h();
        bcrr.a(this, i, 1, h);
        if (i == h) {
            i = 0;
        }
        return this.c.b(j, i);
    }

    public final boolean b(long j) {
        return this.c.b(j);
    }

    public final bcpx f() {
        return this.c.f();
    }

    public final int h() {
        return this.c.h() + 1;
    }

    public final long c(long j) {
        return this.c.c(j);
    }

    public final long d(long j) {
        return this.c.d(j);
    }
}
