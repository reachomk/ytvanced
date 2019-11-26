package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ofq */
public final class ofq {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(olj olj) {
        for (int i = 0; i < olj.a(); i++) {
            oll a = olj.a(i);
            String str = "iTunSMPB";
            if (a instanceof omg) {
                omg omg = (omg) a;
                if (str.equals(omg.a) && a(omg.b)) {
                    return true;
                }
            } else if (a instanceof omo) {
                omo omo = (omo) a;
                if ("com.apple.iTunes".equals(omo.a) && str.equals(omo.b) && a(omo.c)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt <= 0) {
                    if (parseInt2 <= 0) {
                    }
                }
                this.a = parseInt;
                this.b = parseInt2;
                return true;
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }
}
