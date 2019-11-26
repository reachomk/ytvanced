package defpackage;

import android.app.Application;

/* renamed from: ttg */
final class ttg {
    private static volatile boolean a = false;
    private static volatile boolean b = false;

    public static boolean a() {
        if (!a) {
            ttg.b();
        }
        return b;
    }

    private static void b() {
        try {
            Application.class.getField("__robo_data__");
            b = true;
        } catch (NoSuchFieldException unused) {
            b = false;
        }
        a = true;
    }
}
