package defpackage;

import java.util.regex.Pattern;

/* renamed from: nvd */
public final class nvd {
    static {
        Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
        Pattern.compile("^NOTE(( |\t).*)?$");
        Pattern.compile("(\\S+?):(\\S+)");
    }
}
