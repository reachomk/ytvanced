package defpackage;

import android.content.SharedPreferences;

/* renamed from: afjh */
public final class afjh {
    public String a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;

    public afjh(SharedPreferences sharedPreferences, String str) {
        this.a = sharedPreferences.getString("last_manual_quality_selection_cpn", null);
        this.b = sharedPreferences.getInt(afjh.a(str, "last_manual_video_quality_selection_max"), -1);
        this.c = sharedPreferences.getInt(afjh.a(str, "last_manual_video_quality_selection_min"), -1);
        this.d = sharedPreferences.getInt(afjh.a(str, "last_manual_video_quality_selection_direction"), -2);
        this.e = sharedPreferences.getLong(afjh.a(str, "last_manual_video_quality_selection_timestamp"), -1);
        this.f = sharedPreferences.getLong(afjh.a(str, "last_playback_start_timestamp"), -1);
    }

    private static String a(String str, String str2) {
        if (str.isEmpty()) {
            return str2;
        }
        str2 = String.valueOf(str2);
        return str2.length() == 0 ? new String(str) : str.concat(str2);
    }
}
