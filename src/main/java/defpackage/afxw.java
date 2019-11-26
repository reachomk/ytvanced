package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: afxw */
public final class afxw {
    public static boolean a(Context context) {
        return qk.a(context).a();
    }

    public static void a(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().remove("com.google.android.libraries.youtube.notification.pref.last_notification_registration_time").apply();
    }

    public static int a(Context context, afve afve) {
        if (!afve.a(context)) {
            return 3;
        }
        if (afve.b(context)) {
            return afve.a() ? 2 : 4;
        } else {
            return 5;
        }
    }
}
