package defpackage;

import android.os.Build.VERSION;

/* renamed from: xy */
public final class xy {
    @Deprecated
    public static boolean a() {
        return VERSION.SDK_INT >= 24;
    }

    @Deprecated
    public static boolean b() {
        return VERSION.SDK_INT >= 26;
    }

    public static boolean c() {
        return VERSION.CODENAME.length() == 1 && VERSION.CODENAME.charAt(0) >= 'Q' && VERSION.CODENAME.charAt(0) <= 'Z';
    }
}
