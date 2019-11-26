package defpackage;

/* renamed from: bcrv */
public final class bcrv extends bcrm {
    private final int a;
    private final int d;
    private final int e;

    public bcrv(bcpn bcpn) {
        this(bcpn, bcpn != null ? bcpn.a() : null, 99);
    }

    public bcrv(bcpn bcpn, bcpm bcpm) {
        this(bcpn, bcpm, 1);
    }

    private bcrv(bcpn bcpn, bcpm bcpm, int i) {
        super(bcpn, bcpm);
        this.a = i;
        if (bcpn.g() + i > aocf.UNSET_ENUM_VALUE) {
            this.d = bcpn.g() + i;
        } else {
            this.d = aocf.UNSET_ENUM_VALUE;
        }
        if (bcpn.h() + i < Integer.MAX_VALUE) {
            this.e = bcpn.h() + i;
        } else {
            this.e = Integer.MAX_VALUE;
        }
    }

    public final int a(long j) {
        return this.c.a(j) + this.a;
    }

    public final long a(long j, int i) {
        j = super.a(j, i);
        bcrr.a(this, a(j), this.d, this.e);
        return j;
    }

    public final long b(long j, int i) {
        bcrr.a(this, i, this.d, this.e);
        return super.b(j, i - this.a);
    }

    public final boolean b(long j) {
        return this.c.b(j);
    }

    public final bcpx f() {
        return this.c.f();
    }

    public final int g() {
        return this.d;
    }

    public final int h() {
        return this.e;
    }

    public final long c(long j) {
        return this.c.c(j);
    }

    public final long d(long j) {
        return this.c.d(j);
    }
}
