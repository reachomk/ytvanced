package defpackage;

import android.content.SharedPreferences;

/* renamed from: ejr */
public final class ejr {
    public static boolean a(SharedPreferences sharedPreferences) {
        amqw.a((Object) sharedPreferences);
        return sharedPreferences.getBoolean("video_notifications_enabled", true);
    }
}
