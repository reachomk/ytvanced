package defpackage;

import java.util.regex.Pattern;

/* renamed from: alwd */
public final class alwd implements tzv {
    private static final Pattern a = Pattern.compile("^https://youtubei\\.googleapis\\.com/[^/]+/([^/]+)/([^?]+)");
    private static final Pattern b = Pattern.compile("^https://www\\.youtube\\.com/([a-zA-Z]+)_(204)\\?");
    private static final Pattern c = Pattern.compile("^https://youtubei\\.googleapis\\.com/([a-zA-Z]+)_(204)");
    private static final Pattern d = Pattern.compile("^https://.*\\.googlevideo\\.com/initplayback");
    private static final amul e = amul.a(new alwc(a, "rpc"), new alwc(c, "googleapis"), new alwc(b, "yt"), new alwf(d, "onesie-initplayback"));

    public final String a(String str) {
        amxn amxn = (amxn) e.listIterator();
        while (amxn.hasNext()) {
            String a = ((alwc) amxn.next()).a(str);
            if (a != null) {
                return a;
            }
        }
        return str;
    }
}
