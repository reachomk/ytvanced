package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: ebl */
public final class ebl {
    public static String a(String str) {
        str = String.valueOf(str);
        String str2 = "com.google.android.apps.youtube.app.";
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, ebl.a("WatchWhileActivity")).setFlags(335544320).setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
    }

    public static Intent b(Context context) {
        return new Intent().setClassName(context, ebl.a("honeycomb.Shell$HomeActivity"));
    }

    public static Intent c(Context context) {
        return new Intent().setClassName(context, ebl.a("settings.SettingsActivity")).putExtra(":android:show_fragment", ebl.a("settings.OfflinePrefsFragment")).setFlags(335544320);
    }

    public static Intent d(Context context) {
        return new Intent().setClassName(context, ebl.a("settings.SettingsActivity")).putExtra(":android:show_fragment", ebl.a("settings.GeneralPrefsFragment")).setFlags(335544320);
    }
}
