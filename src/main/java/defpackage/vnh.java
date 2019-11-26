package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: vnh */
public final class vnh implements tba {
    public final String a;
    public final boolean b;
    public final long c;
    public final String d;
    public boolean e;

    private vnh(String str, boolean z, long j, String str2) {
        this.a = str;
        this.b = z;
        this.c = j;
        this.d = str2;
    }

    static vnh a(String str, boolean z, long j, String str2) {
        return (TextUtils.isEmpty(str) || j <= 0) ? null : new vnh(str, z, j, str2);
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    static void a(SharedPreferences sharedPreferences, vnh vnh) {
        String str = "last_ad_signals_identity";
        String str2 = "last_ad_signals_timestamp";
        String str3 = "last_ad_signals_lat";
        String str4 = "last_ad_signals_adid";
        if (vnh == null) {
            sharedPreferences.edit().remove(str4).remove(str3).remove(str2).remove(str).apply();
        } else if (!vnh.e) {
            sharedPreferences.edit().putString(str4, vnh.a).putBoolean(str3, vnh.b).putLong(str2, vnh.c).putString(str, vnh.d).apply();
            vnh.e = true;
        }
    }
}
