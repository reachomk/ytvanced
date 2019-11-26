package defpackage;

import android.content.SharedPreferences;

/* renamed from: lxa */
public final class lxa {
    public static xwb a(SharedPreferences sharedPreferences, int i, int i2) {
        int a = fmv.a(sharedPreferences);
        if (a == 1) {
            return xwb.a(i2);
        }
        if (a == 2) {
            return xwb.a(i);
        }
        throw new AssertionError(String.format("Unrecognized theme type: %d", new Object[]{Integer.valueOf(a)}));
    }
}
