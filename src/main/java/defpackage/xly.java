package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: xly */
public final class xly {
    public static SharedPreferences a(Context context) {
        Context e = ra.e(context);
        if (e != null) {
            context = e;
        }
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}
