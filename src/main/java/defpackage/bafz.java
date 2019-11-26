package defpackage;

import android.os.Build;

/* renamed from: bafz */
public final class bafz {
    public static boolean a() {
        if (!"goldfish".equals(Build.HARDWARE)) {
            if (!"ranchu".equals(Build.HARDWARE)) {
                return false;
            }
        }
        return true;
    }
}
