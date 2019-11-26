package defpackage;

import java.util.Locale;
import java.util.logging.Logger;

/* renamed from: amqu */
public final class amqu {
    private static final amqr a = new amqt();

    private amqu() {
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    static long a() {
        return System.nanoTime();
    }

    static String a(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    public static boolean a(String str) {
        return str == null || str.isEmpty();
    }

    public static ampx c(String str) {
        amqw.a((Object) str);
        return a.a(str);
    }

    static {
        Logger.getLogger(amqu.class.getName());
    }
}
