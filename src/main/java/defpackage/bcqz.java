package defpackage;

import java.util.Locale;

/* renamed from: bcqz */
final class bcqz extends bcrx {
    private final bcqp c;

    bcqz(bcqp bcqp, bcpx bcpx) {
        super(bcpm.l, bcpx);
        this.c = bcqp;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 7;
    }

    public final int a(long j) {
        return bcqp.d(j);
    }

    public final String a(int i, Locale locale) {
        return bcrb.a(locale).b[i];
    }

    public final String b(int i, Locale locale) {
        return bcrb.a(locale).c[i];
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(String str, Locale locale) {
        Integer num = (Integer) bcrb.a(locale).h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new bcpy(bcpm.l, str);
    }

    public final bcpx e() {
        return this.c.d;
    }

    public final int a(Locale locale) {
        return bcrb.a(locale).k;
    }
}
