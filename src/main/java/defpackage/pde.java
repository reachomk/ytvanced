package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: pde */
public final class pde {
    public SharedPreferences a;

    public pde(Context context) {
        try {
            context = psl.c(context);
            this.a = context != null ? context.getSharedPreferences("google_ads_flags", 0) : null;
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.a = null;
        }
    }

    public final boolean a(String str) {
        try {
            SharedPreferences sharedPreferences = this.a;
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(str, false);
            }
            return false;
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
