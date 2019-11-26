package defpackage;

import java.util.Locale;
import java.util.Map;

/* renamed from: bcsr */
public final class bcsr implements bcsv, bcsz {
    private final int a;

    public bcsr(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a == 1 ? 4 : 20;
    }

    public final void a(StringBuffer stringBuffer, long j, bcpl bcpl, int i, bcpt bcpt, Locale locale) {
        j -= (long) i;
        String str = "";
        if (bcpt != null) {
            i = this.a;
            bctl bctl;
            String[] a;
            if (i == 0) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                str = bcpt.a(j);
                if (str == null) {
                    str = bcpt.d;
                } else {
                    bctl = bcpt.b;
                    if (bctl instanceof bctj) {
                        a = ((bctj) bctl).a(locale, bcpt.d, bcpt.d(j));
                        str = a != null ? a[1] : null;
                    } else {
                        str = bctl.b(locale, bcpt.d, str);
                    }
                    if (str == null) {
                        str = bcpt.a(bcpt.b(j));
                    }
                }
            } else if (i == 1) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                str = bcpt.a(j);
                if (str == null) {
                    str = bcpt.d;
                } else {
                    bctl = bcpt.b;
                    if (bctl instanceof bctj) {
                        a = ((bctj) bctl).a(locale, bcpt.d, bcpt.d(j));
                        str = a != null ? a[0] : null;
                    } else {
                        str = bctl.a(locale, bcpt.d, str);
                    }
                    if (str == null) {
                        str = bcpt.a(bcpt.b(j));
                    }
                }
            }
        }
        stringBuffer.append(str);
    }

    public final int b() {
        return this.a == 1 ? 4 : 20;
    }

    public final int a(bcsu bcsu, String str, int i) {
        Map map = bcpo.a;
        str = str.substring(i);
        String str2 = null;
        for (String str3 : map.keySet()) {
            if (str.startsWith(str3)) {
                if (str2 == null || str3.length() > str2.length()) {
                    str2 = str3;
                }
            }
        }
        if (str2 == null) {
            return i ^ -1;
        }
        bcsu.a((bcpt) map.get(str2));
        return i + str2.length();
    }
}
