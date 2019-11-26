package defpackage;

import java.util.regex.Pattern;

/* renamed from: ots */
public final class ots {
    public static void a(oza oza) {
        int i = oza.b;
        String s = oza.s();
        if (s == null || !s.startsWith("WEBVTT")) {
            oza.c(i);
            String valueOf = String.valueOf(oza.s());
            s = "Expected WEBVTT. Got ";
            throw new oae(valueOf.length() == 0 ? new String(s) : s.concat(valueOf));
        }
    }

    public static long a(String str) {
        String[] b = ozp.b(str, "\\.");
        int i = 0;
        String[] a = ozp.a(b[0], ":");
        long j = 0;
        while (i < a.length) {
            j = (j * 60) + Long.parseLong(a[i]);
            i++;
        }
        j *= 1000;
        if (b.length == 2) {
            j += Long.parseLong(b[1]);
        }
        return j * 1000;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    static {
        Pattern.compile("^NOTE(( |\t).*)?$");
    }
}
