package defpackage;

import java.util.Locale;
import java.util.Set;

/* renamed from: bcso */
public enum bcso implements bcsv, bcsz {
    ;
    
    private static final Set b = null;
    private static final int c = 0;

    private bcso(String str) {
    }

    public final int a() {
        return c;
    }

    public final void a(StringBuffer stringBuffer, long j, bcpl bcpl, int i, bcpt bcpt, Locale locale) {
        stringBuffer.append(bcpt == null ? "" : bcpt.d);
    }

    public final int b() {
        return c;
    }

    public final int a(bcsu bcsu, String str, int i) {
        str = str.substring(i);
        String str2 = null;
        for (String str3 : b) {
            if (str.startsWith(str3)) {
                if (str2 == null || str3.length() > str2.length()) {
                    str2 = str3;
                }
            }
        }
        if (str2 == null) {
            return i ^ -1;
        }
        bcsu.a(bcpt.a(str2));
        return i + str2.length();
    }

    static {
        int max;
        Set<String> set = bcpt.c;
        b = set;
        for (String length : set) {
            max = Math.max(max, length.length());
        }
        c = max;
    }
}
