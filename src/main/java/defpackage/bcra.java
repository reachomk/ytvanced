package defpackage;

import java.util.Locale;

/* renamed from: bcra */
final class bcra extends bcqv {
    bcra(bcqp bcqp) {
        super(bcqp);
    }

    public final String a(int i, Locale locale) {
        return bcrb.a(locale).d[i];
    }

    public final String b(int i, Locale locale) {
        return bcrb.a(locale).e[i];
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(String str, Locale locale) {
        Integer num = (Integer) bcrb.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new bcpy(bcpm.g, str);
    }

    public final int a(Locale locale) {
        return bcrb.a(locale).l;
    }
}
