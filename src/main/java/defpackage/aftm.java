package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aftm */
public final class aftm {
    private static final Pattern a = Pattern.compile("age=(\\d*)");
    private final xsc b;

    public aftm(xsc xsc) {
        this.b = (xsc) amqw.a((Object) xsc);
    }

    public final long a(String str) {
        long parseLong;
        long a = this.b.a();
        if (str != null) {
            if (str.contains("no-cache")) {
                return a;
            }
            Matcher matcher = a.matcher(str);
            if (matcher.find()) {
                try {
                    parseLong = Long.parseLong(matcher.group(1), 10) * 1000;
                } catch (NumberFormatException unused) {
                }
                return a + parseLong;
            }
        }
        parseLong = 604800000;
        return a + parseLong;
    }
}
