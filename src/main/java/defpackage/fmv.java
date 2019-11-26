package defpackage;

import android.content.SharedPreferences;

/* renamed from: fmv */
public final class fmv {
    public static int a(SharedPreferences sharedPreferences) {
        return !sharedPreferences.getBoolean("app_theme_dark", false) ? 1 : 2;
    }

    public static boolean b(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains("auto_switch_theme_on_battery_saver_settings_toggle") ^ 1;
    }
}
