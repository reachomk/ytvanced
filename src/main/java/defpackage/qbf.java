package defpackage;

import android.os.Build.VERSION;

/* renamed from: qbf */
public final class qbf {
    public static boolean a() {
        return VERSION.SDK_INT >= 20;
    }

    public static boolean b() {
        return VERSION.SDK_INT >= 21;
    }

    public static boolean c() {
        return VERSION.SDK_INT >= 26;
    }

    public static boolean d() {
        if (VERSION.SDK_INT < 28 && VERSION.SDK_INT < 28 && (VERSION.CODENAME.length() != 1 || VERSION.CODENAME.charAt(0) < 'P' || VERSION.CODENAME.charAt(0) > 'Z')) {
            return false;
        }
        return true;
    }
}
