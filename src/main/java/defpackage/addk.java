package defpackage;

import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: addk */
final class addk {
    private final HashMap a = new HashMap();

    addk() {
    }

    public final boolean a(String str, String str2) {
        if ((str != null && str.length() > 100) || (str2 != null && str2.length() > 200)) {
            return false;
        }
        if (str2 == null || str2.length() == 0 || str2.equals(".*")) {
            return true;
        }
        if (str == null) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        Pattern pattern = (Pattern) this.a.get(str2);
        if (pattern == null) {
            try {
                pattern = Pattern.compile(str2);
                this.a.put(str2, pattern);
            } catch (PatternSyntaxException unused) {
                return false;
            }
        }
        return pattern.matcher(str).matches();
    }
}
