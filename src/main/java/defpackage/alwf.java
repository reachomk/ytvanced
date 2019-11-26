package defpackage;

import java.util.regex.Pattern;

/* renamed from: alwf */
final class alwf extends alwc {
    alwf(Pattern pattern, String str) {
        super(pattern, str);
    }

    /* Access modifiers changed, original: final */
    public final String a(String str) {
        if (!this.a.matcher(str).find()) {
            return null;
        }
        boolean contains = str.contains("owc=yes");
        boolean contains2 = str.contains("itag=0");
        if (!contains) {
            return this.b;
        }
        if (contains2) {
            return String.valueOf(this.b).concat("-prewarm-itag0");
        }
        return String.valueOf(this.b).concat("-prewarm");
    }
}
