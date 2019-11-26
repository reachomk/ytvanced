package defpackage;

import java.util.Locale;

/* renamed from: bcsm */
final class bcsm implements bcsv, bcsz {
    private final String a;

    bcsm(String str) {
        this.a = str;
    }

    public final int a() {
        return this.a.length();
    }

    public final void a(StringBuffer stringBuffer, long j, bcpl bcpl, int i, bcpt bcpt, Locale locale) {
        stringBuffer.append(this.a);
    }

    public final int b() {
        return this.a.length();
    }

    public final int a(bcsu bcsu, String str, int i) {
        String str2 = this.a;
        return str.regionMatches(true, i, str2, 0, str2.length()) ? i + this.a.length() : i ^ -1;
    }
}
