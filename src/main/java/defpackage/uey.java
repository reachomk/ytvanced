package defpackage;

import java.util.regex.Pattern;

/* renamed from: uey */
public final class uey {
    private final ufb a = new ufb();

    public final Pattern a(String str) {
        Pattern pattern = (Pattern) this.a.a(str);
        if (pattern != null) {
            return pattern;
        }
        pattern = Pattern.compile(str);
        this.a.a(str, pattern);
        return pattern;
    }
}
