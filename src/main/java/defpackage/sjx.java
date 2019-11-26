package defpackage;

import android.os.Build.VERSION;
import android.os.UserManager;

/* renamed from: sjx */
public final class sjx {
    public static UserManager a;
    public static volatile boolean b = (sjx.a() ^ 1);

    private sjx() {
    }

    public static boolean a() {
        return VERSION.SDK_INT >= 24;
    }
}
