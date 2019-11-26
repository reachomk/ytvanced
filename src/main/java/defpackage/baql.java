package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: baql */
public final class baql {
    private static final Pattern e = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    private static final Pattern f = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    private static final Pattern g = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public baql(String str) {
        this.a = str;
        String str2 = "";
        if (str != null) {
            this.b = baql.a(str, e, str2, 1);
            this.c = baql.a(str, f, null, 2);
        } else {
            this.b = str2;
            this.c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.b)) {
            this.d = baql.a(str, g, null, 2);
        } else {
            this.d = null;
        }
    }

    private static String a(String str, Pattern pattern, String str2, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(i) : str2;
    }

    public final String a() {
        String str = this.c;
        return str == null ? "US-ASCII" : str;
    }
}
