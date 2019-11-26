package defpackage;

import java.util.Locale;

/* renamed from: bcqy */
final class bcqy extends bcrk {
    private final bcqp a;

    bcqy(bcqp bcqp) {
        super(bcpm.a);
        this.a = bcqp;
    }

    public final bcpx e() {
        return null;
    }

    public final int g() {
        return 0;
    }

    public final int h() {
        return 1;
    }

    public final int a(long j) {
        return this.a.a(j) > 0 ? 1 : 0;
    }

    public final String a(int i, Locale locale) {
        return bcrb.a(locale).a[i];
    }

    public final long b(long j, int i) {
        bcrr.a(this, i, 0, 1);
        if (a(j) == i) {
            return j;
        }
        return this.a.d(j, -this.a.a(j));
    }

    public final long a(long j, String str, Locale locale) {
        Integer num = (Integer) bcrb.a(locale).g.get(str);
        if (num != null) {
            return b(j, num.intValue());
        }
        throw new bcpy(bcpm.a, str);
    }

    public final long c(long j) {
        return a(j) == 1 ? this.a.d(0, 1) : Long.MIN_VALUE;
    }

    public final bcpx d() {
        return bcsa.a(bcpw.a);
    }

    public final int a(Locale locale) {
        return bcrb.a(locale).j;
    }
}
