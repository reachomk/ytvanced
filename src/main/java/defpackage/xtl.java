package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: xtl */
public final class xtl {
    private static String a = "YT";

    private xtl() {
    }

    public static void a(String str) {
        a = xtl.a(str, false);
    }

    public static String b(String str) {
        return xtl.a(String.format("%s.%s", new Object[]{"YT", str}), true);
    }

    public static void a(String str, String str2) {
        xtl.a(str, 6, str2, null);
    }

    public static void c(String str) {
        xtl.a(6, str, null);
    }

    public static void a(String str, Object[] objArr) {
        xtl.c(String.format(Locale.US, str, objArr));
    }

    public static void a(String str, String str2, Throwable th) {
        xtl.a(str, 6, str2, th);
    }

    public static void a(String str, Throwable th) {
        xtl.a(6, str, th);
    }

    public static void b(String str, String str2) {
        xtl.a(str, 5, str2, null);
    }

    public static void d(String str) {
        xtl.a(5, str, null);
    }

    public static void b(String str, String str2, Throwable th) {
        xtl.a(str, 5, str2, th);
    }

    public static void b(String str, Throwable th) {
        xtl.a(5, str, th);
    }

    public static void c(String str, String str2) {
        xtl.a(str, 4, str2, null);
    }

    public static void e(String str) {
        xtl.a(4, str, null);
    }

    public static void c(String str, String str2, Throwable th) {
        xtl.a(str, 4, str2, th);
    }

    public static void c(String str, Throwable th) {
        xtl.a(4, str, th);
    }

    private static void a(String str, int i, String str2, Throwable th) {
        if (str2 == null) {
            str2 = "null";
        }
        if (i == 4) {
            return;
        }
        if (i != 5) {
            Log.e(str, str2, th);
        } else {
            Log.w(str, str2, th);
        }
    }

    private static void a(int i, String str, Throwable th) {
        xtl.a(a, i, str, th);
    }

    private static String a(String str, boolean z) {
        if (str.length() <= 23) {
            return str;
        }
        String substring = str.substring(0, 23);
        if (!z) {
            xtl.a(substring, 5, String.format("Tag [%s] is too long; truncated to [%s]", new Object[]{str, substring}), null);
        }
        return substring;
    }

    static {
        xtl.class.getName();
    }
}
