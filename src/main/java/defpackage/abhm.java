package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: abhm */
public final class abhm {
    public static aoxs a(SharedPreferences sharedPreferences) {
        String str = "attribution_data";
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        aoxs aoxs;
        sharedPreferences.edit().remove(str).apply();
        try {
            aoxs = (aoxs) anxl.parseFrom(aoxs.b, Base64.decode(string, 0), anxa.c());
        } catch (anyg unused) {
            aoxs = null;
        }
        if (aoxs == null) {
            aoxs = null;
        } else if (aoxs.a.size() > 0) {
            return aoxs;
        } else {
            return null;
        }
        return aoxs;
    }
}
