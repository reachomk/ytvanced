package defpackage;

import android.content.SharedPreferences;

/* renamed from: jrb */
public final class jrb {
    public static boolean a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(ebn.FEED_FILTER_BAR_ON_HOME_SETTING, true);
    }
}
