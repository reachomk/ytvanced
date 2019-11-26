package defpackage;

import android.os.Build.VERSION;
import android.security.NetworkSecurityPolicy;

/* renamed from: bcit */
public final class bcit {
    public static bcit a = new bcit();

    public static boolean a() {
        return VERSION.SDK_INT >= 23 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : true;
    }
}
