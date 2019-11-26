package defpackage;

import java.util.Locale;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: xgz */
final class xgz {
    private static final Pattern b = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private static final Pattern c = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern d = Pattern.compile("\\s*([^\\s/=;\"]+)/([^\\s/=;\"]+)\\s*(;.*)?", 32);
    private static final Pattern e = Pattern.compile("\\s*;\\s*([^\\s/=;\"]+)=(\"([^\"]*)\"|[^\\s;\"]*)");
    public final SortedMap a = new TreeMap();
    private String f = "application";
    private String g = "octet-stream";
    private String h;

    public xgz(String str) {
        Matcher matcher = d.matcher(str);
        amqw.a(matcher.matches(), (Object) "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        amqw.a(b.matcher(group).matches(), (Object) "Type contains reserved characters");
        this.f = group;
        this.h = null;
        String group2 = matcher.group(2);
        amqw.a(b.matcher(group2).matches(), (Object) "Subtype contains reserved characters");
        this.g = group2;
        this.h = null;
        str = matcher.group(3);
        if (str != null) {
            matcher = e.matcher(str);
            while (matcher.find()) {
                String group3 = matcher.group(1);
                Object group4 = matcher.group(3);
                if (group4 == null) {
                    group4 = matcher.group(2);
                }
                if (group4 != null) {
                    amqw.a(c.matcher(group3).matches(), (Object) "Name contains reserved characters");
                    this.h = null;
                    this.a.put(group3.toLowerCase(Locale.ENGLISH), group4);
                } else {
                    this.h = null;
                    this.a.remove(group3.toLowerCase(Locale.ENGLISH));
                }
            }
        }
    }

    private final String a() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f);
        stringBuilder.append('/');
        stringBuilder.append(this.g);
        SortedMap sortedMap = this.a;
        if (sortedMap != null) {
            for (Entry entry : sortedMap.entrySet()) {
                String str2 = (String) entry.getValue();
                stringBuilder.append("; ");
                stringBuilder.append((String) entry.getKey());
                stringBuilder.append("=");
                if (!c.matcher(str2).matches()) {
                    String replace = str2.replace("\\", "\\\\");
                    str2 = "\"";
                    replace = replace.replace(str2, "\\\"");
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(replace).length() + 2);
                    stringBuilder2.append(str2);
                    stringBuilder2.append(replace);
                    stringBuilder2.append(str2);
                    str2 = stringBuilder2.toString();
                }
                stringBuilder.append(str2);
            }
        }
        this.h = stringBuilder.toString();
        return this.h;
    }

    public final String toString() {
        return a();
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xgz) {
            xgz xgz = (xgz) obj;
            if (xgz != null && this.f.equalsIgnoreCase(xgz.f) && this.g.equalsIgnoreCase(xgz.g) && this.a.equals(xgz.a)) {
                return true;
            }
        }
        return false;
    }

    static {
        String str = "[^\\s/=;\"]+";
        str.length();
        str.length();
        ";.*".length();
        "\"([^\"]*)\"".length();
        "[^\\s;\"]*".length();
        str.length();
        "\"([^\"]*)\"|[^\\s;\"]*".length();
    }
}
