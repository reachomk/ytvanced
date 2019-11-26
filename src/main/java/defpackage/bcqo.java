package defpackage;

import java.util.Locale;

/* renamed from: bcqo */
final class bcqo extends bcru {
    bcqo() {
        super(bcpm.m, bcqp.r, bcqp.s);
    }

    public final String a(int i, Locale locale) {
        return bcrb.a(locale).f[i];
    }

    public final long a(long j, String str, Locale locale) {
        String[] strArr = bcrb.a(locale).f;
        int length = strArr.length;
        while (true) {
            length--;
            if (length < 0) {
                throw new bcpy(bcpm.m, str);
            } else if (strArr[length].equalsIgnoreCase(str)) {
                return b(j, length);
            }
        }
    }

    public final int a(Locale locale) {
        return bcrb.a(locale).m;
    }
}
