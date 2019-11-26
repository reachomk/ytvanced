package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: sde */
public final class sde {
    public final SharedPreferences a;

    public sde(Context context) {
        this.a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public final void a(String str, String str2) {
        if (str2 != null) {
            this.a.edit().putString(str, str2).apply();
        } else {
            this.a.edit().remove(str).apply();
        }
    }

    public final String a(String str) {
        return b(str, null);
    }

    public final String b(String str, String str2) {
        return this.a.getString(str, str2);
    }

    public final boolean b(String str) {
        return this.a.getBoolean(str, false);
    }
}
