package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aaja */
public final class aaja {
    public static final xto a = new aajc("Set<SupportedVideoMimeTypes>");
    private static final xto b = new aajd("LazyCodecs.Pattern");

    public static boolean a(String str) {
        return str.startsWith("video");
    }

    public static boolean b(String str) {
        return str.startsWith("audio");
    }

    public static String c(String str) {
        return str.split(";", 2)[0];
    }

    public static String d(String str) {
        Matcher matcher = ((Pattern) b.get()).matcher(str);
        return matcher.find() ? matcher.group(1) : null;
    }
}
