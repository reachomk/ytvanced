package defpackage;

import java.util.Locale;

/* renamed from: bcrj */
final class bcrj extends bcrk {
    private final bcpn a;
    private final bcpt c;
    private final bcpx d;
    private final boolean e;
    private final bcpx f;
    private final bcpx g;

    bcrj(bcpn bcpn, bcpt bcpt, bcpx bcpx, bcpx bcpx2, bcpx bcpx3) {
        super(bcpn.a());
        if (bcpn.c()) {
            this.a = bcpn;
            this.c = bcpt;
            this.d = bcpx;
            this.e = bcrg.a(bcpx);
            this.f = bcpx2;
            this.g = bcpx3;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final int a(long j) {
        return this.a.a(this.c.f(j));
    }

    public final String a(long j, Locale locale) {
        return this.a.a(this.c.f(j), locale);
    }

    public final String b(long j, Locale locale) {
        return this.a.b(this.c.f(j), locale);
    }

    public final String a(int i, Locale locale) {
        return this.a.a(i, locale);
    }

    public final String b(int i, Locale locale) {
        return this.a.b(i, locale);
    }

    public final long a(long j, int i) {
        if (this.e) {
            long f = (long) f(j);
            return this.a.a(j + f, i) - f;
        }
        return this.c.a(this.a.a(this.c.f(j), i), j);
    }

    public final long b(long j, int i) {
        long b = this.a.b(this.c.f(j), i);
        j = this.c.a(b, j);
        if (a(j) == i) {
            return j;
        }
        bcqb bcqb = new bcqb(b, this.c.d);
        bcpy bcpy = new bcpy(this.a.a(), Integer.valueOf(i), bcqb.getMessage());
        bcpy.initCause(bcqb);
        throw bcpy;
    }

    public final long a(long j, String str, Locale locale) {
        return this.c.a(this.a.a(this.c.f(j), str, locale), j);
    }

    public final bcpx d() {
        return this.d;
    }

    public final bcpx e() {
        return this.f;
    }

    public final boolean b(long j) {
        return this.a.b(this.c.f(j));
    }

    public final bcpx f() {
        return this.g;
    }

    public final long c(long j) {
        if (this.e) {
            long f = (long) f(j);
            return this.a.c(j + f) - f;
        }
        return this.c.a(this.a.c(this.c.f(j)), j);
    }

    public final long d(long j) {
        return this.a.d(this.c.f(j));
    }

    public final int g() {
        return this.a.g();
    }

    public final int h() {
        return this.a.h();
    }

    public final int a(Locale locale) {
        return this.a.a(locale);
    }

    private final int f(long j) {
        int b = this.c.b(j);
        long j2 = (long) b;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return b;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }
}
