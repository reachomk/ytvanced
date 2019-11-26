package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: nrj */
public final class nrj {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public final int a;
    public final int b;

    public static nrj a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return null;
        }
        Matcher matcher = c.matcher(str2);
        if (!matcher.find()) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt == 0) {
                if (parseInt2 == 0) {
                    return null;
                }
            }
            return new nrj(parseInt, parseInt2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static nrj a(int i) {
        int i2 = i >> 12;
        i &= 4095;
        return (i2 == 0 && i == 0) ? null : new nrj(i2, i);
    }

    private nrj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
