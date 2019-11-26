package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: alwc */
class alwc {
    public final Pattern a;
    public final String b;

    alwc(Pattern pattern, String str) {
        this.a = pattern;
        this.b = str;
    }

    /* Access modifiers changed, original: 0000 */
    public String a(String str) {
        Matcher matcher = this.a.matcher(str);
        if (!matcher.find() || matcher.groupCount() != 2) {
            return null;
        }
        String group = matcher.group(1);
        str = matcher.group(2);
        String str2 = this.b;
        String str3 = "-";
        str = str.replace("/", str3);
        int length = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 2) + String.valueOf(group).length()) + String.valueOf(str).length());
        stringBuilder.append(str2);
        stringBuilder.append(str3);
        stringBuilder.append(group);
        stringBuilder.append(str3);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
