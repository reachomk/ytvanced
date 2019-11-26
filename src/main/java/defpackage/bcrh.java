package defpackage;

/* renamed from: bcrh */
final class bcrh extends bcrm {
    public static final bcpn a = new bcrh();

    private bcrh() {
        super(bcrc.G.m, bcpm.b);
    }

    public final int g() {
        return 0;
    }

    public final int a(long j) {
        int a = this.c.a(j);
        return a < 0 ? -a : a;
    }

    public final long a(long j, int i) {
        return this.c.a(j, i);
    }

    public final long b(long j, int i) {
        bcrr.a(this, i, 0, h());
        if (this.c.a(j) < 0) {
            i = -i;
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
