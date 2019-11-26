package defpackage;

import java.util.Locale;

/* renamed from: bcsh */
final class bcsh implements bcsv, bcsz {
    private final char a;

    bcsh(char c) {
        this.a = c;
    }

    public final int a() {
        return 1;
    }

    public final int b() {
        return 1;
    }

    public final void a(StringBuffer stringBuffer, long j, bcpl bcpl, int i, bcpt bcpt, Locale locale) {
        stringBuffer.append(this.a);
    }

    public final int a(bcsu bcsu, String str, int i) {
        if (i >= str.length()) {
            return i ^ -1;
        }
        char charAt = str.charAt(i);
        char c = this.a;
        if (charAt != c) {
            charAt = Character.toUpperCase(charAt);
            c = Character.toUpperCase(c);
            if (!(charAt == c || Character.toLowerCase(charAt) == Character.toLowerCase(c))) {
                return i ^ -1;
            }
        }
        return i + 1;
    }
}
