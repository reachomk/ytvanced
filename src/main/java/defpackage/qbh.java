package defpackage;

import java.util.regex.Pattern;

/* renamed from: qbh */
public final class qbh {
    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }

    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }
}
