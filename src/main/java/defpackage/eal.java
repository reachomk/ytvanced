package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: eal */
public final class eal {
    public static boolean a(Context context) {
        if (VERSION.SDK_INT >= 23) {
            return true;
        }
        if (VERSION.SDK_INT < 21 || context.checkCallingOrSelfPermission("android.permission.READ_CONTACTS") != 0) {
            return false;
        }
        return true;
    }
}
